package com.yoma.currencyexchangerate.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.yoma.currencyexchangerate.databinding.ViewHolderCurrencyRateBinding
import com.yoma.currencyexchangerate.delegates.CurrencyDelegate
import com.yoma.currencyexchangerate.models.CurrencyRateVO
import com.yoma.currencyexchangerate.viewholders.BaseViewHolder
import com.yoma.currencyexchangerate.viewholders.CurrencyRateViewHolder

class CurrencyRateAdapter(private val delegate: CurrencyDelegate) :
    BaseAdapter<CurrencyRateViewHolder, CurrencyRateVO>() {

    private var _binding: ViewHolderCurrencyRateBinding? = null
    private val binding get() = _binding!!


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<CurrencyRateVO> {
        _binding =
            ViewHolderCurrencyRateBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return CurrencyRateViewHolder(binding, delegate)
    }

}