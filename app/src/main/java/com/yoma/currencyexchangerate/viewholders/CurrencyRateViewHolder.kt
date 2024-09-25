package com.yoma.currencyexchangerate.viewholders

import android.view.View
import com.yoma.currencyexchangerate.databinding.ViewHolderCurrencyRateBinding
import com.yoma.currencyexchangerate.delegates.CurrencyDelegate
import com.yoma.currencyexchangerate.models.CurrencyRateVO


class CurrencyRateViewHolder(
    private val binding: ViewHolderCurrencyRateBinding,
    private var mDelegate : CurrencyDelegate) :
    BaseViewHolder<CurrencyRateVO>(binding.root) {

    private var mContext = binding.root.context
    override fun setData(data: CurrencyRateVO) {
        mData = data
        binding.apply {
            tvCurrencyName.text = data.name
            tvCurrencyRate.text = data.rate.toString()
            tvConvert.setOnClickListener {
                mDelegate.onTapConvert(data)
            }
        }
    }

    override fun onClick(p0: View?) {
        mData?.let { data ->

        }
    }

}