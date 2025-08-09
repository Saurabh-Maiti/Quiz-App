package com.example.quizapp.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.quizapp.screens.Login_Screen
import com.example.quizapp.screens.Signup_Screen
import com.example.quizapp.screens.Splash_Screen

@Composable
fun My_App_Navigation()
{
    val navController= rememberNavController()
    NavHost(navController, startDestination = "splash_screen")
    {
        composable(route="splash_screen") {
            Splash_Screen(navController)
        }
        composable(route="login_screen") {
            Login_Screen(navController)
        }
        composable(route="signup_screen") {
            Signup_Screen(navController)
        }
    }
}