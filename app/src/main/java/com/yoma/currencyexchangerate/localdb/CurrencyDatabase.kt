package com.yoma.currencyexchangerate.localdb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [CurrencyTable::class,ExchangeRateTable::class], version = 1, exportSchema = false)
//@TypeConverters(CurrencyTypeConverter::class)
abstract class CurrencyDatabase : RoomDatabase() {

    abstract val currencyDAO : CurrencyDao

    companion object {
        @Volatile
        private var INSTANCE: CurrencyDatabase? = null
        fun getInstance(context: Context): CurrencyDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        CurrencyDatabase::class.java,
                        "currency_db_2024"
                    ).allowMainThreadQueries().build()
                }
                return instance
            }
        }
    }

}