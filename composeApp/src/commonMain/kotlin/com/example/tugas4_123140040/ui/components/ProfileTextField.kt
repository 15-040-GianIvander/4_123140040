package com.example.tugas4_123140040.ui.components

// Folder: ui/components/ProfileTextField.kt
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun ProfileTextField(
    label: String,
    value: String,
    onValueChange: (String) -> Unit // Callback buat lempar data ke atas
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(label) }
    )
}