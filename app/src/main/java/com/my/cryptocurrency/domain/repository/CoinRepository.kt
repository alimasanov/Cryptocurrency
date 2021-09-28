package com.my.cryptocurrency.domain.repository

import com.my.cryptocurrency.data.remote.dto.CoinDetailDto
import com.my.cryptocurrency.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto
}