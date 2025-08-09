package com.example.quizapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.quizapp.R
import kotlinx.coroutines.delay

@Composable
fun Splash_Screen(navController: NavController)
{
    LaunchedEffect(Unit) {
        delay(1500)
        navController.navigate(route = "login_screen")
    }
    Column (modifier = Modifier.fillMaxSize()
        .background(color = Color(0xFF540A8E))
        ,horizontalAlignment = Alignment.CenterHorizontally
        , verticalArrangement = Arrangement.Center
    ){
        Box(modifier = Modifier.size(260.dp)
            .clip(RoundedCornerShape(80.dp)))
        {
            Image(painter = painterResource(id = R.drawable.logo),"Logo")
        }
        Spacer(modifier = Modifier.padding(12.dp))
        Text("Quiz App", fontSize = 48.sp, color = Color.White, fontWeight = FontWeight.Normal)
    }
}