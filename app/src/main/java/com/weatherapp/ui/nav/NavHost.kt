package com.weatherapp.ui.nav

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.weatherapp.db.fb.FBDatabase
import com.weatherapp.ui.HomePage
import com.weatherapp.ui.ListPage
import com.weatherapp.ui.MapPage
import com.weatherapp.view.MainViewModel

@Composable
fun MainNavHost(navController: NavHostController, viewModel: MainViewModel, context: Context, fbDB: FBDatabase) {
    NavHost(navController, startDestination = BottomNavItem.HomePage.route) {
        // composable (route = NOME DESTA DESTINAÇÃO) { UI DA DESTINAÇÃO }
        composable(route = BottomNavItem.HomePage.route) {
            HomePage(viewModel = viewModel, context = context, fbDB = fbDB)
        }
        composable(route = BottomNavItem.ListPage.route) {
            ListPage(viewModel = viewModel, context = context, fbDB = fbDB)
        }
        composable(route = BottomNavItem.MapPage.route) {
            MapPage(viewModel = viewModel, context = context, fbDB = fbDB)
        }
    }
}