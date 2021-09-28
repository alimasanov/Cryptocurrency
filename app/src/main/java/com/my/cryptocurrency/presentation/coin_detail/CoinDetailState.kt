package com.my.cryptocurrency.presentation.coin_detail

import com.my.cryptocurrency.domain.model.Coin
import com.my.cryptocurrency.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
