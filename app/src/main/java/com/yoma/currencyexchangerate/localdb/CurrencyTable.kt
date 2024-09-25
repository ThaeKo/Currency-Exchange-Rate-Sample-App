package com.yoma.currencyexchangerate.localdb

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.yoma.currencyexchangerate.models.CurrencyListVO

@Entity
data class CurrencyTable(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id : Int,

    @ColumnInfo(name = "currency_name")
    var currency_name : String,

    @ColumnInfo(name = "created_time")
    var created_time : Long
)