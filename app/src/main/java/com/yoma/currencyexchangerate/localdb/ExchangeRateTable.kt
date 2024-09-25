package com.yoma.currencyexchangerate.localdb

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ExchangeRateTable(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id : Int,

    @ColumnInfo(name = "currency_name")
    var currency_name : String = "",

    @ColumnInfo(name = "exchange_rate")
    var exchange_rate : String,

    @ColumnInfo(name = "created_time")
    var created_time : Long
)