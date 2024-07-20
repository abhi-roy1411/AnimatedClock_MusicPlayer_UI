package com.example.animatedclockmusicplayerui.ui.theme

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.util.Calendar
import kotlin.math.cos
import kotlin.math.sin

@Preview(showSystemUi = true)
@Composable
fun AnalogClock() {
    val calendar = Calendar.getInstance()
    val hours = calendar.get(Calendar.HOUR)
    val minutes = calendar.get(Calendar.MINUTE)
    val seconds = calendar.get(Calendar.SECOND)
    calendar.get(Calendar.MILLISECOND)
    calendar.time

    Box (contentAlignment = Alignment.Center, modifier = Modifier
        .fillMaxWidth()
        .background(Color.Transparent)){

        Canvas(modifier = Modifier.size(150.dp)) {
            val clockRadius = size.minDimension / 2
            drawCircle(color = Color.Red, radius = clockRadius, style = Stroke(1.dp.toPx()))

            val centerX = size.width / 2
            val centerY = size.height / 2

            val secondHandLength = clockRadius * 0.9f
            val secondAngle = Math.toRadians((seconds * 6 - 90).toDouble())
            drawLine(
                color = Color.Yellow,
                start = center,
                end = Offset(
                    centerX + secondHandLength * cos(secondAngle).toFloat(),
                    centerY + secondHandLength * sin(secondAngle).toFloat()
                ),
                strokeWidth = 1.dp.toPx()
            )

            val minuteHandLength = clockRadius * 0.7f
            val minuteAngle = Math.toRadians((minutes * 6 - 90).toDouble())
            drawLine(
                color = Color.Blue,
                start = center,
                end = Offset(
                    centerX + minuteHandLength * cos(minuteAngle).toFloat(),
                    centerY + minuteHandLength * sin(minuteAngle).toFloat()
                ),
                strokeWidth = 1.dp.toPx()
            )

            val hourHandLength = clockRadius * 0.5f
            val hourAngle = Math.toRadians((hours * 30 + minutes * 0.5 - 90))
            drawLine(
                color = Color.Red,
                start = center,
                end = Offset(
                    centerX + hourHandLength * cos(hourAngle).toFloat(),
                    centerY + hourHandLength * sin(hourAngle).toFloat()
                ),
                strokeWidth = 1.dp.toPx()
            )
        }
    }}
