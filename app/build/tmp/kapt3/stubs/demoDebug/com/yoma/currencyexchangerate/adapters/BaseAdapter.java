package com.yoma.currencyexchangerate.adapters;

import androidx.recyclerview.widget.RecyclerView;
import com.yoma.currencyexchangerate.viewholders.BaseViewHolder;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bJ\u0013\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007J\u0006\u0010\u0016\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000bJ\u0015\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u001bH\u0016J\u001e\u0010\u001e\u001a\u00020\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0013\u0010 \u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0014J\u000e\u0010!\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bJ\u0014\u0010\"\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00078F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000e\u00a8\u0006#"}, d2 = {"Lcom/yoma/currencyexchangerate/adapters/BaseAdapter;", "T", "W", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/yoma/currencyexchangerate/viewholders/BaseViewHolder;", "()V", "items", "", "getItems", "()Ljava/util/List;", "mData", "", "getMData", "setMData", "(Ljava/util/List;)V", "addListData", "", "newData", "addNewData", "data", "(Ljava/lang/Object;)V", "appendNewData", "clearData", "dataRefresh", "getDataList", "getItemAt", "position", "", "(I)Ljava/lang/Object;", "getItemCount", "onBindViewHolder", "holder", "removeData", "removeList", "setNewData", "app_demoDebug"})
public abstract class BaseAdapter<T extends java.lang.Object, W extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.Adapter<com.yoma.currencyexchangerate.viewholders.BaseViewHolder<W>> {
    @org.jetbrains.annotations.Nullable
    private java.util.List<W> mData;
    
    public BaseAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    protected final java.util.List<W> getMData() {
        return null;
    }
    
    protected final void setMData(@org.jetbrains.annotations.Nullable
    java.util.List<W> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<W> getItems() {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.yoma.currencyexchangerate.viewholders.BaseViewHolder<W> holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void dataRefresh() {
    }
    
    public final void setNewData(@org.jetbrains.annotations.NotNull
    java.util.List<W> newData) {
    }
    
    public final void appendNewData(@org.jetbrains.annotations.NotNull
    java.util.List<? extends W> newData) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final W getItemAt(int position) {
        return null;
    }
    
    public final void removeData(W data) {
    }
    
    public final void addNewData(W data) {
    }
    
    public final void addListData(@org.jetbrains.annotations.NotNull
    java.util.List<W> newData) {
    }
    
    public final void clearData() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<W> getDataList() {
        return null;
    }
    
    public final void removeList(int position) {
    }
}