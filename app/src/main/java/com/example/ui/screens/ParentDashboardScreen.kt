package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.models.AntiFragilePrinciple
import com.example.data.repository.CurriculumRepository
import com.example.ui.viewmodel.MainUiState
import com.example.ui.viewmodel.MainViewModel

@Composable
fun ParentDashboardScreen(
    uiState: MainUiState,
    viewModel: MainViewModel,
    modifier: Modifier = Modifier
) {
    var selectedTab by remember { mutableIntStateOf(0) } // 0: Weekly Scorecard (Phase 10), 1: Anti-Fragile Design (Phase 11), 2: AI Architect Coach (Thinking Mode)

    // Form inputs for weekly scorecard
    var focusNote by remember { mutableStateOf("") }
    var kindnessNote by remember { mutableStateOf("") }
    var resilienceNote by remember { mutableStateOf("") }
    var curiosityNote by remember { mutableStateOf("") }
    var communicationNote by remember { mutableStateOf("") }
    var physicalNote by remember { mutableStateOf("") }
    var celebrationNote by remember { mutableStateOf("") }

    // Architect query
    var architectQuery by remember { mutableStateOf("") }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(top = 8.dp, bottom = 96.dp)
    ) {
        // Parent Header
        item {
            Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                Text(
                    text = "Parent Sanctuary & Architect Coach",
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )
                Text(
                    text = "Weekly observational progress, anti-fragile strategies, and AI child-development architect",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )

                TabRow(
                    selectedTabIndex = selectedTab,
                    containerColor = MaterialTheme.colorScheme.surfaceVariant,
                    modifier = Modifier.clip(RoundedCornerShape(16.dp))
                ) {
                    Tab(
                        selected = selectedTab == 0,
                        onClick = { selectedTab = 0 },
                        text = { Text("Scorecard", fontSize = 12.sp, fontWeight = FontWeight.SemiBold) }
                    )
                    Tab(
                        selected = selectedTab == 1,
                        onClick = { selectedTab = 1 },
                        text = { Text("Anti-Fragile", fontSize = 12.sp, fontWeight = FontWeight.SemiBold) }
                    )
                    Tab(
                        selected = selectedTab == 2,
                        onClick = { selectedTab = 2 },
                        text = { Text("Architect AI", fontSize = 12.sp, fontWeight = FontWeight.SemiBold) }
                    )
                }
            }
        }

        when (selectedTab) {
            0 -> {
                // PHASE 10: WEEKLY SCORECARD (PURELY OBSERVATIONAL, NO GRADES)
                item {
                    Card(
                        shape = RoundedCornerShape(20.dp),
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primaryContainer),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp),
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Text(
                                text = "Weekly Observational Journal (Phase 10)",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onPrimaryContainer
                            )
                            Text(
                                text = "Strict Principle: Pure observations only. No grades, no peer comparison. We notice the child's natural blossoming and intrinsic effort.",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onPrimaryContainer
                            )
                        }
                    }
                }

                item {
                    Card(
                        shape = RoundedCornerShape(20.dp),
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                        elevation = CardDefaults.cardElevation(2.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp),
                            verticalArrangement = Arrangement.spacedBy(12.dp)
                        ) {
                            Text(
                                text = "Log This Week's Noticings:",
                                style = MaterialTheme.typography.titleSmall,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.primary
                            )

                            OutlinedTextField(
                                value = focusNote,
                                onValueChange = { focusNote = it },
                                label = { Text("1. Focus (e.g. sustained attention on block puzzle for 10 min)") },
                                modifier = Modifier.fillMaxWidth(),
                                singleLine = false,
                                maxLines = 2
                            )

                            OutlinedTextField(
                                value = kindnessNote,
                                onValueChange = { kindnessNote = it },
                                label = { Text("2. Kindness (e.g. offered banana slice to younger sibling)") },
                                modifier = Modifier.fillMaxWidth(),
                                singleLine = false,
                                maxLines = 2
                            )

                            OutlinedTextField(
                                value = resilienceNote,
                                onValueChange = { resilienceNote = it },
                                label = { Text("3. Resilience (e.g. took deep breath after milk spill and cleaned)") },
                                modifier = Modifier.fillMaxWidth(),
                                singleLine = false,
                                maxLines = 2
                            )

                            OutlinedTextField(
                                value = curiosityNote,
                                onValueChange = { curiosityNote = it },
                                label = { Text("4. Curiosity (e.g. asked where ants sleep in the rain)") },
                                modifier = Modifier.fillMaxWidth(),
                                singleLine = false,
                                maxLines = 2
                            )

                            OutlinedTextField(
                                value = communicationNote,
                                onValueChange = { communicationNote = it },
                                label = { Text("5. Communication (e.g. named emotion 'I feel frustrated!')") },
                                modifier = Modifier.fillMaxWidth(),
                                singleLine = false,
                                maxLines = 2
                            )

                            OutlinedTextField(
                                value = physicalNote,
                                onValueChange = { physicalNote = it },
                                label = { Text("6. Physical Activity (e.g. balanced on park curb on one foot)") },
                                modifier = Modifier.fillMaxWidth(),
                                singleLine = false,
                                maxLines = 2
                            )

                            OutlinedTextField(
                                value = celebrationNote,
                                onValueChange = { celebrationNote = it },
                                label = { Text("✨ Golden Celebration Moment of the Week") },
                                modifier = Modifier.fillMaxWidth(),
                                singleLine = false,
                                maxLines = 2
                            )

                            Button(
                                onClick = {
                                    viewModel.saveWeeklyObservation(
                                        focus = focusNote,
                                        kindness = kindnessNote,
                                        resilience = resilienceNote,
                                        curiosity = curiosityNote,
                                        communication = communicationNote,
                                        physical = physicalNote,
                                        celebration = celebrationNote
                                    )
                                    focusNote = ""
                                    kindnessNote = ""
                                    resilienceNote = ""
                                    curiosityNote = ""
                                    communicationNote = ""
                                    physicalNote = ""
                                    celebrationNote = ""
                                },
                                modifier = Modifier.fillMaxWidth().testTag("save_observation_btn")
                            ) {
                                Text("Save Weekly Observational Journal")
                            }
                        }
                    }
                }

                if (uiState.weeklyObservations.isNotEmpty()) {
                    item {
                        Text(
                            text = "Past Weekly Journals:",
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.primary
                        )
                    }

                    items(uiState.weeklyObservations) { obs ->
                        Card(
                            shape = RoundedCornerShape(16.dp),
                            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Column(
                                modifier = Modifier.padding(14.dp),
                                verticalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                Text(
                                    text = "Week: ${obs.weekKey}",
                                    style = MaterialTheme.typography.labelMedium,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.primary
                                )
                                if (obs.celebrationMoment.isNotBlank()) {
                                    Text(
                                        text = "✨ ${obs.celebrationMoment}",
                                        style = MaterialTheme.typography.bodyMedium,
                                        fontWeight = FontWeight.SemiBold
                                    )
                                }
                                if (obs.focusNote.isNotBlank()) Text("• Focus: ${obs.focusNote}", style = MaterialTheme.typography.bodySmall)
                                if (obs.resilienceNote.isNotBlank()) Text("• Resilience: ${obs.resilienceNote}", style = MaterialTheme.typography.bodySmall)
                                if (obs.kindnessNote.isNotBlank()) Text("• Kindness: ${obs.kindnessNote}", style = MaterialTheme.typography.bodySmall)
                            }
                        }
                    }
                }
            }

            1 -> {
                // PHASE 11: ANTI-FRAGILE CHILD DESIGN
                item {
                    Text(
                        text = "Phase 11: Anti-Fragile Child Design",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Text(
                        text = "Building children who grow stronger through adversity, not shielded from life.",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }

                items(CurriculumRepository.antiFragilePrinciples) { af ->
                    AntiFragileCard(principle = af)
                }
            }

            2 -> {
                // AI CHILD-DEVELOPMENT ARCHITECT (GEMINI THINKING MODE)
                item {
                    Card(
                        shape = RoundedCornerShape(20.dp),
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primaryContainer),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp),
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Psychology,
                                    contentDescription = null,
                                    tint = MaterialTheme.colorScheme.primary
                                )
                                Text(
                                    text = "Architect AI (Thinking Mode)",
                                    style = MaterialTheme.typography.titleMedium,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onPrimaryContainer
                                )
                            }
                            Text(
                                text = "Powered by Gemini with High Thinking Level. Consult on any tantrum, milestone, routine, or focus challenge to receive personalized game mechanics.",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onPrimaryContainer
                            )
                        }
                    }
                }

                item {
                    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                        OutlinedTextField(
                            value = architectQuery,
                            onValueChange = { architectQuery = it },
                            label = { Text("Ask the Child-Development Architect...") },
                            placeholder = { Text("e.g., My child refuses to share wooden blocks at the park. What game can teach this?") },
                            modifier = Modifier.fillMaxWidth().testTag("architect_query_input"),
                            minLines = 2,
                            maxLines = 4
                        )

                        Button(
                            onClick = {
                                viewModel.askArchitect(architectQuery)
                                architectQuery = ""
                            },
                            enabled = !uiState.isArchitectThinking,
                            modifier = Modifier.fillMaxWidth().testTag("send_architect_btn")
                        ) {
                            if (uiState.isArchitectThinking) {
                                CircularProgressIndicator(modifier = Modifier.size(18.dp), color = Color.White)
                                Spacer(modifier = Modifier.width(8.dp))
                                Text("Architect is Contemplating & Thinking...")
                            } else {
                                Icon(Icons.Default.Send, contentDescription = null, modifier = Modifier.size(18.dp))
                                Spacer(modifier = Modifier.width(8.dp))
                                Text("Consult Architect (High Thinking)")
                            }
                        }
                    }
                }

                // Sample Quick Prompts
                item {
                    Text(
                        text = "Quick Architectural Prompts:",
                        style = MaterialTheme.typography.labelMedium,
                        fontWeight = FontWeight.Bold
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        listOf(
                            "Bedtime stalling routine",
                            "Tantrum after screen time",
                            "Biting or hitting in play"
                        ).forEach { quickPrompt ->
                            ElevatedFilterChip(
                                selected = false,
                                onClick = { viewModel.askArchitect(quickPrompt) },
                                label = { Text(quickPrompt, fontSize = 11.sp) }
                            )
                        }
                    }
                }

                // Architect Responses
                items(uiState.architectResponses.reversed()) { (query, response) ->
                    Card(
                        shape = RoundedCornerShape(18.dp),
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                        elevation = CardDefaults.cardElevation(3.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp),
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Text(
                                text = "❓ $query",
                                style = MaterialTheme.typography.titleSmall,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.primary
                            )
                            HorizontalDivider()
                            Text(
                                text = response,
                                style = MaterialTheme.typography.bodyMedium,
                                lineHeight = 22.sp
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AntiFragileCard(principle: AntiFragilePrinciple) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        elevation = CardDefaults.cardElevation(2.dp),
        modifier = Modifier
            .fillMaxWidth()
            .clickable { expanded = !expanded }
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Surface(
                        shape = RoundedCornerShape(6.dp),
                        color = MaterialTheme.colorScheme.primaryContainer
                    ) {
                        Text(
                            text = principle.challengeType,
                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp),
                            style = MaterialTheme.typography.labelSmall,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onPrimaryContainer
                        )
                    }
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = principle.title,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                }

                IconButton(onClick = { expanded = !expanded }) {
                    Icon(
                        imageVector = if (expanded) Icons.Default.ExpandLess else Icons.Default.ExpandMore,
                        contentDescription = "Expand Anti-Fragile"
                    )
                }
            }

            Text(
                text = "⚡ Scenario: ${principle.realLifeScenario}",
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Medium
            )

            AnimatedVisibility(visible = expanded) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp)
                        .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.4f), RoundedCornerShape(12.dp))
                        .padding(12.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(
                        text = "💬 Parent Script: ${principle.parentScript}",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.primary,
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(
                        text = "🌱 Child Action Step: ${principle.childActionStep}",
                        style = MaterialTheme.typography.bodySmall,
                        fontWeight = FontWeight.Medium
                    )
                    Text(
                        text = "📜 Ancient Anchor: ${principle.ancientAnchor}",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.secondary
                    )
                    Text(
                        text = "🔬 Scientific Insight: ${principle.scientificInsight}",
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }
    }
}
