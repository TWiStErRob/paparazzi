package app.cash.paparazzi.sample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.Test

class HelloComposeTest {
  @get:Rule
  val paparazzi = Paparazzi()

  @Test
  fun compose() {
    paparazzi.snapshot {
      Box(
        modifier = Modifier.background(Color(0xFF000033))
      ) {
        Text("ExampleText", color = Color.White)
      }
    }
  }
}
