package com.yoma.currencyexchangerate.activities

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.yoma.currencyexchangerate.localdb.CurrencyDao
import com.yoma.currencyexchangerate.localdb.CurrencyDatabase
import com.yoma.currencyexchangerate.models.CurrencyListVO
import java.util.concurrent.TimeUnit

abstract class BaseActivity : AppCompatActivity() {

    abstract fun showLoading()

    abstract fun hideLoading()

    var currencyDAO: CurrencyDao? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        currencyDAO = CurrencyDatabase.getInstance(this).currencyDAO
    }

    fun differentTimeCalculationFor30Minute(createTime : Long) : Boolean{
        var difMillisecond = System.currentTimeMillis() - createTime
        var result = TimeUnit.MILLISECONDS.toMinutes(difMillisecond)
        return result >= 30
    }

    fun showToastMsg(msg : String){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
    }
}