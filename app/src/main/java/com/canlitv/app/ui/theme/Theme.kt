package com.canlitv.app.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFFE50914),
    secondary = Color(0xFF221F1F),
    tertiary = Color(0xFF03DAC6),
    background = Color(0xFF000000),
    surface = Color(0xFF1A1A1A),
    error = Color(0xFFCF6679),
)

@Composable
fun CanliTVTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        content = content
    )
}
