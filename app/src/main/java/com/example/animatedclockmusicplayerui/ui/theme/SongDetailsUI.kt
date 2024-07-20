package com.example.animatedclockmusicplayerui.ui.theme

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.SkipNext
import androidx.compose.material.icons.filled.SkipPrevious
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)
@Composable
fun SongDetailsUI() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 4.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        BasicText(
            text = "That Cool Song",
            style = MaterialTheme.typography.bodyLarge.copy(color = Pink90, fontSize = 18.sp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 72.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            IconButton(onClick = { /* Previous */ }) {
                Icon(Icons.Filled.SkipPrevious, contentDescription = "Previous", tint = Pink90)
            }
            IconButton(onClick = { /* Play */ }) {
                Icon(Icons.Filled.PlayArrow, contentDescription = "Play", tint = Pink90)
            }
            IconButton(onClick = { /* Next */ }) {
                Icon(Icons.Filled.SkipNext, contentDescription = "Next", tint = Pink90)
            }
        }
    }
    Column {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 32.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            BasicText(
                text = "It's Artist",
                style = MaterialTheme.typography.bodyMedium.copy(color = Pink90)
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 2.dp),
            contentAlignment = Alignment.Center
        ) {
            BasicText(
                text = "34%",
                style = MaterialTheme.typography.bodyMedium.copy(color = Pink90)
            )
        }
    }

}