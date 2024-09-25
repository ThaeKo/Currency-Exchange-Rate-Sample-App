package com.yoma.currencyexchangerate.utils

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import java.text.SimpleDateFormat
import java.util.*

object Constants {
    //API
    const val API_SUCCESS_CODE: Boolean = true
    const val API_FAILED_CODE: Boolean = false
    const val API_FULL_USAGE_CODE = "104"

    const val CONNECTION_FAIL: String = "Please Check You Internet Connection"
    const val API_FAIL_MESSAGE = "Couldn't get data!"

    const val DATA_CARRY_CURRENCY = "data-carry_currency-key"

    const val SOURCE_USD = "USD"

}
