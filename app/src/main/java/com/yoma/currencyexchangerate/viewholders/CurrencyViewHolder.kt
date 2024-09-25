package com.yoma.currencyexchangerate.viewholders

import android.view.View
import com.yoma.currencyexchangerate.databinding.ViewHolderCurrencyBinding
import com.yoma.currencyexchangerate.delegates.CurrencyDelegate


class CurrencyViewHolder(
    private val binding: ViewHolderCurrencyBinding,
    private var mDelegate : CurrencyDelegate) :
    BaseViewHolder<String>(binding.root) {

    private var mContext = binding.root.context
    override fun setData(data: String) {
        mData = data
        binding.apply {
            tvCurrency.text = data
        }
    }

    override fun onClick(p0: View?) {
        mData?.let { data ->
            mDelegate.onTapCurrency(data)
        }
    }

}