package com.example

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [36])
class ExampleRobolectricTest {

  @Test
  fun `read string from context`() {
    val context = ApplicationProvider.getApplicationContext<Context>()
    val appName = context.getString(R.string.app_name)
    assertEquals("BalVeda", appName)
  }

  @Test
  fun `curriculum repository has all 7 mastery levels and 6 scripture extracts`() {
    assertEquals(7, com.example.data.repository.CurriculumRepository.masteryLevels.size)
    assertEquals(6, com.example.data.repository.CurriculumRepository.scriptureExtracts.size)
    assertEquals(10, com.example.data.repository.CurriculumRepository.eqGames.size)
    assertEquals(6, com.example.data.repository.CurriculumRepository.focusTrainings.size)
    assertEquals(6, com.example.data.repository.CurriculumRepository.physicalMovements.size)
    assertEquals(6, com.example.data.repository.CurriculumRepository.antiFragilePrinciples.size)
  }
}
