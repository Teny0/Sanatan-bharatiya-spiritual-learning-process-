package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.models.AgeStage
import com.example.ui.components.EditProfileDialog
import com.example.ui.components.TopChildProfileBar
import com.example.ui.screens.*
import com.example.ui.theme.MyApplicationTheme
import com.example.ui.viewmodel.MainViewModel

enum class BalVedaDestination(val title: String, val icon: ImageVector, val tag: String) {
    TODAY("Today", Icons.Default.CalendarToday, "nav_today"),
    ROADMAP("Roadmap", Icons.Default.Explore, "nav_roadmap"),
    STORIES("Stories", Icons.Default.AutoStories, "nav_stories"),
    GROWTH("EQ & Focus", Icons.Default.SelfImprovement, "nav_growth"),
    PARENT("Parent", Icons.Default.SupervisorAccount, "nav_parent")
}

class MainActivity : ComponentActivity() {
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                BalVedaMainApp(viewModel = viewModel)
            }
        }
    }
}

@Composable
fun BalVedaMainApp(viewModel: MainViewModel) {
    val uiState by viewModel.uiState.collectAsState()
    var currentDestination by remember { mutableStateOf(BalVedaDestination.TODAY) }
    var showEditProfileDialog by remember { mutableStateOf(false) }

    if (showEditProfileDialog) {
        EditProfileDialog(
            currentName = uiState.profile.childName,
            currentAgeMonths = uiState.profile.ageMonths,
            currentStage = uiState.profile.selectedStage,
            currentLevel = uiState.profile.currentLevel,
            currentAvatar = uiState.profile.avatarEmoji,
            onDismiss = { showEditProfileDialog = false },
            onSave = { name, ageMonths, stage, level, avatar ->
                viewModel.updateChildProfile(name, ageMonths, stage, level, avatar)
            }
        )
    }

    val stageData = AgeStage.entries.firstOrNull { it.stageId == uiState.profile.selectedStage }
        ?: AgeStage.STAGE_3_4

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopChildProfileBar(
                childName = uiState.profile.childName,
                levelNumber = uiState.profile.currentLevel,
                levelTitle = stageData.levelName,
                avatarEmoji = uiState.profile.avatarEmoji,
                onEditClick = { showEditProfileDialog = true }
            )
        },
        bottomBar = {
            NavigationBar(
                containerColor = MaterialTheme.colorScheme.surface,
                tonalElevation = 8.dp
            ) {
                BalVedaDestination.entries.forEach { dest ->
                    val isSelected = currentDestination == dest
                    NavigationBarItem(
                        selected = isSelected,
                        onClick = { currentDestination = dest },
                        icon = {
                            Icon(
                                imageVector = dest.icon,
                                contentDescription = dest.title
                            )
                        },
                        label = {
                            Text(
                                text = dest.title,
                                fontSize = 11.sp,
                                fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal
                            )
                        },
                        modifier = Modifier.testTag(dest.tag),
                        colors = NavigationBarItemDefaults.colors(
                            selectedIconColor = MaterialTheme.colorScheme.onPrimaryContainer,
                            selectedTextColor = MaterialTheme.colorScheme.primary,
                            indicatorColor = MaterialTheme.colorScheme.primaryContainer,
                            unselectedIconColor = MaterialTheme.colorScheme.onSurfaceVariant,
                            unselectedTextColor = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    )
                }
            }
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(MaterialTheme.colorScheme.background)
        ) {
            Crossfade(
                targetState = currentDestination,
                label = "nav_crossfade"
            ) { destination ->
                when (destination) {
                    BalVedaDestination.TODAY -> DailyRoutineScreen(uiState = uiState, viewModel = viewModel)
                    BalVedaDestination.ROADMAP -> CurriculumRoadmapScreen(uiState = uiState, viewModel = viewModel)
                    BalVedaDestination.STORIES -> StoryCurriculumScreen(uiState = uiState, viewModel = viewModel)
                    BalVedaDestination.GROWTH -> EmotionalAndFocusScreen(uiState = uiState, viewModel = viewModel)
                    BalVedaDestination.PARENT -> ParentDashboardScreen(uiState = uiState, viewModel = viewModel)
                }
            }
        }
    }
}
