package com.yoma.currencyexchangerate.localdb;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.yoma.currencyexchangerate.models.CurrencyRateListVO;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\'J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\'J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\'J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\'J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/yoma/currencyexchangerate/localdb/CurrencyDao;", "", "getCurrencyTable", "Lcom/yoma/currencyexchangerate/localdb/CurrencyTable;", "getExchangeRate", "Lcom/yoma/currencyexchangerate/localdb/ExchangeRateTable;", "code", "", "insertCurrency", "", "video", "insertCurrencyExchangeRate", "updateCurrency", "updateCurrencyExchangeRate", "app_demoDebug"})
@androidx.room.Dao
public abstract interface CurrencyDao {
    
    @androidx.room.Insert
    public abstract void insertCurrency(@org.jetbrains.annotations.NotNull
    com.yoma.currencyexchangerate.localdb.CurrencyTable video);
    
    @androidx.room.Insert
    public abstract void insertCurrencyExchangeRate(@org.jetbrains.annotations.NotNull
    com.yoma.currencyexchangerate.localdb.ExchangeRateTable video);
    
    @androidx.room.Update
    public abstract void updateCurrency(@org.jetbrains.annotations.NotNull
    com.yoma.currencyexchangerate.localdb.CurrencyTable video);
    
    @androidx.room.Update
    public abstract void updateCurrencyExchangeRate(@org.jetbrains.annotations.NotNull
    com.yoma.currencyexchangerate.localdb.ExchangeRateTable video);
    
    @androidx.room.Query(value = "SELECT * FROM CurrencyTable LIMIT 1")
    @org.jetbrains.annotations.Nullable
    public abstract com.yoma.currencyexchangerate.localdb.CurrencyTable getCurrencyTable();
    
    @androidx.room.Query(value = "SELECT * FROM ExchangeRateTable WHERE currency_name = :code")
    @org.jetbrains.annotations.Nullable
    public abstract com.yoma.currencyexchangerate.localdb.ExchangeRateTable getExchangeRate(@org.jetbrains.annotations.NotNull
    java.lang.String code);
}