package com.example.quizapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.quizapp.R

@Composable
fun Login_Screen(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column (modifier = Modifier.fillMaxSize()
        .background(color = Color(0xFF540A8E))
        ,horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(modifier = Modifier.padding(50.dp))
        Box(modifier = Modifier.size(260.dp)
            .clip(RoundedCornerShape(80.dp)))
        {
            Image(painter = painterResource(id = R.drawable.logo),"Logo")
        }
        Spacer(modifier = Modifier.padding(12.dp))
        Text("Quiz App", fontSize = 48.sp, color = Color.White, fontWeight = FontWeight.Normal)
        Spacer(modifier = Modifier.padding(32.dp))

        OutlinedTextField(value = email, onValueChange = {email=it}, placeholder = {Text("Email", color = Color.Black)},singleLine = true, shape = RoundedCornerShape(32.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White,
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                focusedBorderColor = Color.White,
                unfocusedBorderColor = Color.White
            )
            )
        Spacer(modifier = Modifier.padding(8.dp))

        OutlinedTextField(value = password, onValueChange = {password=it}, placeholder = {Text("Password", color = Color.Black)},singleLine = true, shape = RoundedCornerShape(32.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White,
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                focusedBorderColor = Color.White,
                unfocusedBorderColor = Color.White
            )
        )
        Spacer(modifier = Modifier.padding(8.dp))

        Button(onClick = {

        }
        , colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xffF3FF6C),
        )
        ) {
            Text("Login", color = Color.Black, fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.padding(4.dp))

        TextButton(onClick = {navController.navigate(route="signup_screen")}) {
            Row {
                Text(
                    text = "Not a user?",
                    color = Color.White,
                    fontSize = 16.sp
                )
                Text(
                    text = " Register",
                    color = Color(0xffF3FF6C),
                    fontSize = 16.sp
                )
            }
        }
    }
}