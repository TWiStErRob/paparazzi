package app.cash.paparazzi.sample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.Test

class HelloComposeTest {
  @get:Rule
  val paparazzi = Paparazzi()

  @Test
  fun compose() {
    paparazzi.snapshot { HelloPaparazzi() }
  }
}

@Suppress("TestFunctionName")
@Composable
fun HelloPaparazzi() {
  Column(
    Modifier
      .background(Color.White)
      .fillMaxSize()
  ) {
    Box(
      Modifier
        .fillMaxSize()
        .padding(48.dp)
        .background(Color.Black.copy(alpha = 0.5f))
    ) {
    }
  }
}
