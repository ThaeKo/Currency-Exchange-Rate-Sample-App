package com.yoma.currencyexchangerate.viewholders;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u001e\u0010\u0007\u001a\u0004\u0018\u00018\u0000X\u0084\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0013"}, d2 = {"Lcom/yoma/currencyexchangerate/viewholders/BaseViewHolder;", "W", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mData", "getMData", "()Ljava/lang/Object;", "setMData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "setData", "", "data", "setID", "mID", "", "app_demoDebug"})
public abstract class BaseViewHolder<W extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.Nullable
    private W mData;
    
    public BaseViewHolder(@org.jetbrains.annotations.NotNull
    android.view.View itemView) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable
    protected final W getMData() {
        return null;
    }
    
    protected final void setMData(@org.jetbrains.annotations.Nullable
    W p0) {
    }
    
    public abstract void setData(W data);
    
    public void setID(int mID) {
    }
}