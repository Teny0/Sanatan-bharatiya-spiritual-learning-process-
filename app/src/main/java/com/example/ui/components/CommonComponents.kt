package com.example.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.data.models.AgeStage
import com.example.data.models.HumanPillar
import com.example.ui.theme.*
import kotlinx.coroutines.delay

@Composable
fun TopChildProfileBar(
    childName: String,
    levelNumber: Int,
    levelTitle: String,
    avatarEmoji: String,
    onEditClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        shape = RoundedCornerShape(20.dp),
        color = MaterialTheme.colorScheme.surface,
        tonalElevation = 2.dp,
        shadowElevation = 2.dp
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 12.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                        .background(MaterialTheme.colorScheme.primaryContainer)
                        .clickable { onEditClick() },
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = avatarEmoji, fontSize = 24.sp)
                }

                Column {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = childName,
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Surface(
                            shape = RoundedCornerShape(8.dp),
                            color = MaterialTheme.colorScheme.secondaryContainer
                        ) {
                            Text(
                                text = "L$levelNumber: $levelTitle",
                                modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp),
                                style = MaterialTheme.typography.labelSmall,
                                fontWeight = FontWeight.SemiBold,
                                color = MaterialTheme.colorScheme.onSecondaryContainer
                            )
                        }
                    }
                    Text(
                        text = "Mastery Journey • Real-World Play",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }

            IconButton(
                onClick = onEditClick,
                modifier = Modifier.testTag("edit_profile_btn")
            ) {
                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = "Edit child profile",
                    tint = MaterialTheme.colorScheme.primary
                )
            }
        }
    }
}

@Composable
fun AgeStageChips(
    selectedStage: AgeStage,
    onStageSelected: (AgeStage) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyRow(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(AgeStage.entries.toTypedArray()) { stage ->
            val isSelected = stage == selectedStage
            FilterChip(
                selected = isSelected,
                onClick = { onStageSelected(stage) },
                label = {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = stage.title,
                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal
                        )
                        Text(
                            text = "L${stage.levelNumber}: ${stage.levelName}",
                            style = MaterialTheme.typography.labelSmall,
                            fontSize = 10.sp
                        )
                    }
                },
                colors = FilterChipDefaults.filterChipColors(
                    selectedContainerColor = MaterialTheme.colorScheme.primary,
                    selectedLabelColor = Color.White
                )
            )
        }
    }
}

@Composable
fun PillarFilterRow(
    selectedPillar: HumanPillar?,
    onPillarSelected: (HumanPillar?) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyRow(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item {
            FilterChip(
                selected = selectedPillar == null,
                onClick = { onPillarSelected(null) },
                label = { Text("All Pillars") },
                colors = FilterChipDefaults.filterChipColors(
                    selectedContainerColor = MaterialTheme.colorScheme.tertiary,
                    selectedLabelColor = Color.Black
                )
            )
        }
        items(HumanPillar.entries.toTypedArray()) { pillar ->
            val isSelected = pillar == selectedPillar
            FilterChip(
                selected = isSelected,
                onClick = { onPillarSelected(if (isSelected) null else pillar) },
                label = { Text(pillar.title) },
                colors = FilterChipDefaults.filterChipColors(
                    selectedContainerColor = MaterialTheme.colorScheme.secondary,
                    selectedLabelColor = Color.White
                )
            )
        }
    }
}

@Composable
fun InteractiveBreathingDialog(
    onDismiss: () -> Unit
) {
    var breathPhase by remember { mutableStateOf("Breathe In (Smell the flower)") }
    var secondsLeft by remember { mutableIntStateOf(4) }
    var scaleTarget by remember { mutableFloatStateOf(1f) }

    val animatedScale by animateFloatAsState(
        targetValue = scaleTarget,
        animationSpec = tween(durationMillis = 4000, easing = LinearOutSlowInEasing),
        label = "breath_scale"
    )

    LaunchedEffect(Unit) {
        while (true) {
            // Phase 1: Inhale 4 sec
            breathPhase = "Inhale Deeply (Smell the Rose) 🌹"
            scaleTarget = 1.45f
            for (i in 4 downTo 1) {
                secondsLeft = i
                delay(1000)
            }
            // Phase 2: Hold 2 sec
            breathPhase = "Hold & Stillness (Like a Mountain) 🏔️"
            for (i in 2 downTo 1) {
                secondsLeft = i
                delay(1000)
            }
            // Phase 3: Exhale 6 sec
            breathPhase = "Exhale Gently (Blow the Soup / Bumblebee Hum) 🐝"
            scaleTarget = 1.0f
            for (i in 6 downTo 1) {
                secondsLeft = i
                delay(1000)
            }
        }
    }

    Dialog(onDismissRequest = onDismiss) {
        Surface(
            shape = RoundedCornerShape(28.dp),
            color = MaterialTheme.colorScheme.surface,
            tonalElevation = 6.dp,
            modifier = Modifier.padding(16.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(24.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Text(
                    text = "Pranayama Breath Play",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )

                Text(
                    text = "Sync your breaths together. Breathe in through your nose, soft and slow.",
                    style = MaterialTheme.typography.bodySmall,
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )

                Box(
                    modifier = Modifier
                        .size(180.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Box(
                        modifier = Modifier
                            .size(120.dp)
                            .scale(animatedScale)
                            .clip(CircleShape)
                            .background(
                                Brush.radialGradient(
                                    listOf(
                                        MaterialTheme.colorScheme.primaryContainer,
                                        MaterialTheme.colorScheme.secondary.copy(alpha = 0.5f)
                                    )
                                )
                            )
                            .border(3.dp, MaterialTheme.colorScheme.primary, CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "$secondsLeft",
                            style = MaterialTheme.typography.headlineLarge,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onPrimaryContainer
                        )
                    }
                }

                Text(
                    text = breathPhase,
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.primary
                )

                Button(
                    onClick = onDismiss,
                    modifier = Modifier.fillMaxWidth().testTag("close_breath_btn"),
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
                ) {
                    Text("Complete Breath Play")
                }
            }
        }
    }
}

@Composable
fun EditProfileDialog(
    currentName: String,
    currentAgeMonths: Int,
    currentStage: String,
    currentLevel: Int,
    currentAvatar: String,
    onDismiss: () -> Unit,
    onSave: (name: String, ageMonths: Int, stage: String, level: Int, avatar: String) -> Unit
) {
    var name by remember { mutableStateOf(currentName) }
    var ageMonths by remember { mutableIntStateOf(currentAgeMonths) }
    var selectedStage by remember { mutableStateOf(currentStage) }
    var selectedAvatar by remember { mutableStateOf(currentAvatar) }

    val avatars = listOf("🌱", "🦁", "🕊️", "⭐", "🏹", "🌊", "🌿", "🦋")

    Dialog(onDismissRequest = onDismiss) {
        Surface(
            shape = RoundedCornerShape(24.dp),
            color = MaterialTheme.colorScheme.surface,
            tonalElevation = 6.dp,
            modifier = Modifier.padding(12.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(14.dp)
            ) {
                Text(
                    text = "Child Profile & Journey",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )

                OutlinedTextField(
                    value = name,
                    onValueChange = { name = it },
                    label = { Text("Child's Name") },
                    modifier = Modifier.fillMaxWidth().testTag("child_name_input"),
                    singleLine = true
                )

                Column {
                    Text(
                        text = "Age in Months: $ageMonths (${ageMonths / 12} yrs ${ageMonths % 12} mo)",
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Medium
                    )
                    Slider(
                        value = ageMonths.toFloat(),
                        onValueChange = {
                            ageMonths = it.toInt()
                            selectedStage = when {
                                ageMonths <= 12 -> "0-1"
                                ageMonths <= 24 -> "1-2"
                                ageMonths <= 36 -> "2-3"
                                ageMonths <= 48 -> "3-4"
                                ageMonths <= 60 -> "4-5"
                                ageMonths <= 72 -> "5-6"
                                else -> "6-7"
                            }
                        },
                        valueRange = 1f..84f,
                        steps = 83
                    )
                }

                Text(
                    text = "Choose Guardian Avatar:",
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Medium
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    avatars.forEach { av ->
                        val isChosen = av == selectedAvatar
                        Box(
                            modifier = Modifier
                                .size(36.dp)
                                .clip(CircleShape)
                                .background(
                                    if (isChosen) MaterialTheme.colorScheme.primaryContainer
                                    else MaterialTheme.colorScheme.surfaceVariant
                                )
                                .border(
                                    if (isChosen) 2.dp else 0.dp,
                                    MaterialTheme.colorScheme.primary,
                                    CircleShape
                                )
                                .clickable { selectedAvatar = av },
                            contentAlignment = Alignment.Center
                        ) {
                            Text(av, fontSize = 20.sp)
                        }
                    }
                }

                val targetStageEnum = AgeStage.entries.firstOrNull { it.stageId == selectedStage }
                    ?: AgeStage.STAGE_3_4

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    TextButton(onClick = onDismiss) {
                        Text("Cancel")
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Button(
                        onClick = {
                            onSave(name, ageMonths, selectedStage, targetStageEnum.levelNumber, selectedAvatar)
                            onDismiss()
                        },
                        modifier = Modifier.testTag("save_profile_btn")
                    ) {
                        Text("Save Profile")
                    }
                }
            }
        }
    }
}
