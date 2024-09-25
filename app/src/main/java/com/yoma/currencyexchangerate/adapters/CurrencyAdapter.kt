package com.yoma.currencyexchangerate.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.yoma.currencyexchangerate.databinding.ViewHolderCurrencyBinding
import com.yoma.currencyexchangerate.delegates.CurrencyDelegate
import com.yoma.currencyexchangerate.viewholders.BaseViewHolder
import com.yoma.currencyexchangerate.viewholders.CurrencyViewHolder

class CurrencyAdapter(private val delegate: CurrencyDelegate) :
    BaseAdapter<CurrencyViewHolder, String>() {

    private var _binding: ViewHolderCurrencyBinding? = null
    private val binding get() = _binding!!


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<String> {
        _binding =
            ViewHolderCurrencyBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return CurrencyViewHolder(binding, delegate)
    }

}