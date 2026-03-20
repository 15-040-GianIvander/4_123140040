package com.example.tugas4_123140040.ui

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.tugas4_123140040.viewmodel.ProfileViewModel

@Composable
fun ProfileScreen(viewModel: ProfileViewModel = viewModel()) {
    val uiState by viewModel.uiState.collectAsState()

    val proBlue = Color(0xFF1976D2)
    val bgColor by animateColorAsState(if (uiState.isDarkMode) Color(0xFF121212) else Color(0xFFF1F5F9))
    val cardColor by animateColorAsState(if (uiState.isDarkMode) Color(0xFF1E1E1E) else Color.White)
    val textColor by animateColorAsState(if (uiState.isDarkMode) Color.White else Color.Black)

    MaterialTheme(colors = if (uiState.isDarkMode) darkColors() else lightColors()) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("Profile Dashboard", fontWeight = FontWeight.Bold) },
                    backgroundColor = proBlue,
                    contentColor = Color.White,
                    elevation = 4.dp,
                    actions = {
                        // PINDAH KE SINI: Toggle ditaruh di pojok kanan atas biar clean
                        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(end = 8.dp)) {
                            Icon(
                                imageVector = if (uiState.isDarkMode) Icons.Default.Brightness2 else Icons.Default.Brightness5,
                                contentDescription = null,
                                modifier = Modifier.size(20.dp)
                            )
                            Switch(
                                checked = uiState.isDarkMode,
                                onCheckedChange = { viewModel.toggleDarkMode(it) },
                                colors = SwitchDefaults.colors(
                                    checkedThumbColor = Color.White,
                                    uncheckedThumbColor = Color.LightGray
                                )
                            )
                        }
                    }
                )
            }
        ) { padding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(bgColor)
                    .padding(padding)
                    .verticalScroll(rememberScrollState())
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Header Avatar
                Box(
                    modifier = Modifier
                        .size(120.dp)
                        .clip(CircleShape)
                        .background(Brush.linearGradient(listOf(Color(0xFFBBDEFB), proBlue))),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(Icons.Default.Person, null, modifier = Modifier.size(80.dp), tint = Color.White)
                }

                Spacer(modifier = Modifier.height(16.dp))
                Text(uiState.name, fontSize = 28.sp, fontWeight = FontWeight.ExtraBold, color = textColor)
                Text("NIM: ${uiState.nim}", color = textColor.copy(alpha = 0.6f), fontSize = 16.sp)

                Spacer(modifier = Modifier.height(32.dp))

                // Card Info (Stateless)
                ProfileCard(
                    title = "About Me",
                    content = uiState.bio,
                    icon = Icons.Default.Info,
                    cardColor = cardColor,
                    textColor = textColor,
                    proBlue = proBlue
                )

                Spacer(modifier = Modifier.height(32.dp))

                // Section Edit
                Text("Edit Profile", fontWeight = FontWeight.Bold, color = proBlue, modifier = Modifier.fillMaxWidth())
                Spacer(modifier = Modifier.height(16.dp))

                ProInput(label = "Full Name", value = uiState.name, onValueChange = { viewModel.updateName(it) }, icon = Icons.Default.Face, proBlue = proBlue)
                Spacer(modifier = Modifier.height(16.dp))
                ProInput(label = "Bio Description", value = uiState.bio, onValueChange = { viewModel.updateBio(it) }, icon = Icons.Default.Edit, proBlue = proBlue)
            }
        }
    }
}

@Composable
fun ProfileCard(title: String, content: String, icon: ImageVector, cardColor: Color, textColor: Color, proBlue: Color) {
    Card(shape = RoundedCornerShape(16.dp), backgroundColor = cardColor, elevation = 2.dp, modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.padding(20.dp), verticalAlignment = Alignment.CenterVertically) {
            Icon(icon, null, tint = proBlue, modifier = Modifier.size(28.dp))
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(title, fontWeight = FontWeight.Bold, color = proBlue)
                Text(content, color = textColor)
            }
        }
    }
}

@Composable
fun ProInput(label: String, value: String, onValueChange: (String) -> Unit, icon: ImageVector, proBlue: Color) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(label) },
        leadingIcon = { Icon(icon, null, tint = proBlue) },
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = TextFieldDefaults.outlinedTextFieldColors(focusedBorderColor = proBlue, focusedLabelColor = proBlue)
    )
}