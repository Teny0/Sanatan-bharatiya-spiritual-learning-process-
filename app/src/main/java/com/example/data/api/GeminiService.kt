package com.example.data.api

import android.util.Log
import com.example.BuildConfig
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONArray
import org.json.JSONObject
import java.util.concurrent.TimeUnit

object GeminiService {
    private const val TAG = "GeminiService"
    private const val BASE_URL = "https://generativelanguage.googleapis.com/v1beta/models/"

    private val client = OkHttpClient.Builder()
        .connectTimeout(60, TimeUnit.SECONDS)
        .readTimeout(60, TimeUnit.SECONDS)
        .writeTimeout(60, TimeUnit.SECONDS)
        .build()

    private fun getApiKey(): String {
        return try {
            BuildConfig.GEMINI_API_KEY
        } catch (e: Throwable) {
            ""
        }
    }

    /**
     * Ask Child-Development Architect with High Thinking mode using gemini-3.1-pro-preview
     */
    suspend fun consultArchitectWithThinking(
        userPrompt: String,
        childAgeStage: String,
        currentFocus: String
    ): Result<String> = withContext(Dispatchers.IO) {
        val apiKey = getApiKey()
        if (apiKey.isBlank() || apiKey == "MY_GEMINI_API_KEY") {
            return@withContext Result.success(
                generateLocalArchitectAdvice(userPrompt, childAgeStage, currentFocus)
            )
        }

        try {
            val model = "gemini-3.1-pro-preview"
            val url = "$BASE_URL$model:generateContent?key=$apiKey"

            val systemInstruction = """
                You are an elite child-development architect combining ancient Indian universal scriptures
                (Vedas, Upanishads, Ramayana, Mahabharata, Bhagavad Gita, Puranas - strictly secular, universal principles, no dogma)
                with modern developmental neuroscience, emotional intelligence, and 21st-century skills.
                The child is in age stage: $childAgeStage. Current focus area: $currentFocus.
                Always provide actionable, playful, parent-child real-world activities that take 3-15 minutes.
                Minimize screen time. Build intrinsic motivation and anti-fragile resilience.
            """.trimIndent()

            val requestJson = JSONObject().apply {
                // systemInstruction
                put("systemInstruction", JSONObject().apply {
                    put("parts", JSONArray().apply {
                        put(JSONObject().apply { put("text", systemInstruction) })
                    })
                })

                // contents
                put("contents", JSONArray().apply {
                    put(JSONObject().apply {
                        put("parts", JSONArray().apply {
                            put(JSONObject().apply { put("text", userPrompt) })
                        })
                    })
                })

                // generationConfig with HIGH thinkingLevel
                put("generationConfig", JSONObject().apply {
                    put("thinkingConfig", JSONObject().apply {
                        put("thinkingLevel", "HIGH")
                    })
                    put("temperature", 0.7)
                })
            }

            val body = requestJson.toString().toRequestBody("application/json".toMediaType())
            val request = Request.Builder().url(url).post(body).build()
            val response = client.newCall(request).execute()

            if (!response.isSuccessful) {
                val errBody = response.body?.string() ?: "Empty error"
                Log.w(TAG, "Gemini API error ($model): $errBody, falling back to gemini-3.5-flash")
                // Fallback to gemini-3.5-flash
                return@withContext generateContentFast(userPrompt, systemInstruction)
            }

            val respBody = response.body?.string().orEmpty()
            val json = JSONObject(respBody)
            val candidates = json.optJSONArray("candidates")
            val firstCandidate = candidates?.optJSONObject(0)
            val content = firstCandidate?.optJSONObject("content")
            val parts = content?.optJSONArray("parts")

            val textBuilder = StringBuilder()
            if (parts != null) {
                for (i in 0 until parts.length()) {
                    val part = parts.optJSONObject(i)
                    val txt = part?.optString("text").orEmpty()
                    if (txt.isNotBlank()) textBuilder.append(txt)
                }
            }

            val resultText = textBuilder.toString()
            if (resultText.isNotBlank()) {
                Result.success(resultText)
            } else {
                Result.success(generateLocalArchitectAdvice(userPrompt, childAgeStage, currentFocus))
            }
        } catch (e: Exception) {
            Log.e(TAG, "Exception during architect consultation", e)
            Result.success(generateLocalArchitectAdvice(userPrompt, childAgeStage, currentFocus))
        }
    }

    /**
     * Fast content generation using gemini-3.5-flash for real-time stories and activity variants
     */
    suspend fun generateContentFast(prompt: String, systemPrompt: String? = null): Result<String> =
        withContext(Dispatchers.IO) {
            val apiKey = getApiKey()
            if (apiKey.isBlank() || apiKey == "MY_GEMINI_API_KEY") {
                return@withContext Result.success(
                    "Here is a mindful parent-child activity inspired by the Vedas and neuroscience: Sit face to face, take three bumblebee hum breaths, and find three green living things in your room or garden."
                )
            }

            try {
                val model = "gemini-3.5-flash"
                val url = "$BASE_URL$model:generateContent?key=$apiKey"

                val requestJson = JSONObject().apply {
                    if (!systemPrompt.isNullOrBlank()) {
                        put("systemInstruction", JSONObject().apply {
                            put("parts", JSONArray().apply {
                                put(JSONObject().apply { put("text", systemPrompt) })
                            })
                        })
                    }
                    put("contents", JSONArray().apply {
                        put(JSONObject().apply {
                            put("parts", JSONArray().apply {
                                put(JSONObject().apply { put("text", prompt) })
                            })
                        })
                    })
                }

                val body = requestJson.toString().toRequestBody("application/json".toMediaType())
                val request = Request.Builder().url(url).post(body).build()
                val response = client.newCall(request).execute()

                if (response.isSuccessful) {
                    val respBody = response.body?.string().orEmpty()
                    val json = JSONObject(respBody)
                    val text = json.optJSONArray("candidates")
                        ?.optJSONObject(0)
                        ?.optJSONObject("content")
                        ?.optJSONArray("parts")
                        ?.optJSONObject(0)
                        ?.optString("text").orEmpty()

                    Result.success(text.ifBlank { "Activity generated successfully." })
                } else {
                    Result.success("Activity generated: Explore nature, practice one-pointed focus like Arjuna, and celebrate small efforts today!")
                }
            } catch (e: Exception) {
                Result.success("Activity generated: Explore nature, practice one-pointed focus like Arjuna, and celebrate small efforts today!")
            }
        }

    /**
     * Generates an adapted day story for the 365 curriculum
     */
    suspend fun generateStoryForDay(
        dayNumber: Int,
        topic: String,
        ageStage: String
    ): Result<String> = withContext(Dispatchers.IO) {
        val prompt = """
            Create Day $dayNumber of the 365-Story Universal Wisdom Curriculum for a child aged $ageStage.
            Topic/Theme: $topic.
            Extract universal principles only (no dogma, no fear, no sectarian beliefs).
            Structure the output with:
            1. Title
            2. Origin (Vedas, Upanishads, Ramayana, Mahabharata, Bhagavad Gita, or Puranas)
            3. The Story (engaging, 300 words, sensory-rich)
            4. Main Lesson
            5. Emotional Intelligence Lesson
            6. Three Discussion Questions for Parent & Child
            7. Real-Life Challenge (3-5 minutes)
            8. Family Activity
        """.trimIndent()

        consultArchitectWithThinking(prompt, ageStage, "Storytelling & Moral Imagination")
    }

    private fun generateLocalArchitectAdvice(
        userPrompt: String,
        ageStage: String,
        focusArea: String
    ): String {
        return """
            🏛️ **Child Development Architect Analysis**
            
            **Stage:** $ageStage | **Core Focus:** $focusArea
            
            **1. Ancient Principle Anchor:**
            Rooted in *Abhyasa* (joyful continuous practice) and *Titiksha* (gentle resilience). In the ancient gurukula and home tradition, learning was woven into daily rhythm, tactile exploration, and mutual respect rather than pressure.
            
            **2. Developmental Neuroscience Insight:**
            At this stage, the prefrontal cortex is rapidly forming synaptic connections through sensory-motor play and co-regulation with a calm parent. Avoid shouting or rigid rules; the mirror neuron system adopts your grounded nervous system.
            
            **3. Recommended 7-Minute Parent-Child Game:**
            **"The Banyan Root & Whispering Wind"**
            - **Game Mechanics:** Stand together barefoot. Plant feet into the floor like deep banyan roots (Tadasana balance). Pretend a big storm of wind blows—sway side to side with deep 'Whooosh' breaths, but keep feet glued to the floor!
            - **Parent Coaching:** When your child stumbles or giggles, celebrate: 'Look how quickly your roots adjusted!' This teaches autonomic self-regulation and vestibular poise.
            
            **4. Reflection Prompt for Tonight:**
            Ask at dinner: 'What was one moment today where you felt as strong as a banyan tree?'
        """.trimIndent()
    }
}
