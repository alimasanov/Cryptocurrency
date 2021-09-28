package com.my.cryptocurrency.presentation

sealed class Screen(val route: String) {
    object CoinListScreen: Screen("coin_list_screen")
    object CoinDetailScreen: Screen("coin_detail_screen")
    object AndroidViewScreen: Screen("android_view_screen")
}