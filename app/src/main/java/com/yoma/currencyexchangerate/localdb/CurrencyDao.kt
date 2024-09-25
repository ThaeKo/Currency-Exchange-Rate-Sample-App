package com.yoma.currencyexchangerate.localdb

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.yoma.currencyexchangerate.models.CurrencyRateListVO

@Dao
interface CurrencyDao {

    @Insert
    fun insertCurrency(video : CurrencyTable)

    @Insert
    fun insertCurrencyExchangeRate(video : ExchangeRateTable)

    @Update
    fun updateCurrency(video : CurrencyTable)

    @Update
    fun updateCurrencyExchangeRate(video : ExchangeRateTable)

    @Query("SELECT * FROM CurrencyTable LIMIT 1")
    fun getCurrencyTable(): CurrencyTable?

    @Query("SELECT * FROM ExchangeRateTable WHERE currency_name = :code")
    fun getExchangeRate(code : String): ExchangeRateTable?

}