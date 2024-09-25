// Generated by view binder compiler. Do not edit!
package com.yoma.currencyexchangerate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.yoma.currencyexchangerate.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewHolderCurrencyRateBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout lyRateHeader;

  @NonNull
  public final AppCompatTextView tvConvert;

  @NonNull
  public final AppCompatTextView tvCurrencyName;

  @NonNull
  public final AppCompatTextView tvCurrencyRate;

  private ViewHolderCurrencyRateBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout lyRateHeader, @NonNull AppCompatTextView tvConvert,
      @NonNull AppCompatTextView tvCurrencyName, @NonNull AppCompatTextView tvCurrencyRate) {
    this.rootView = rootView;
    this.lyRateHeader = lyRateHeader;
    this.tvConvert = tvConvert;
    this.tvCurrencyName = tvCurrencyName;
    this.tvCurrencyRate = tvCurrencyRate;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewHolderCurrencyRateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewHolderCurrencyRateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.view_holder_currency_rate, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewHolderCurrencyRateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.lyRateHeader;
      LinearLayout lyRateHeader = ViewBindings.findChildViewById(rootView, id);
      if (lyRateHeader == null) {
        break missingId;
      }

      id = R.id.tvConvert;
      AppCompatTextView tvConvert = ViewBindings.findChildViewById(rootView, id);
      if (tvConvert == null) {
        break missingId;
      }

      id = R.id.tvCurrencyName;
      AppCompatTextView tvCurrencyName = ViewBindings.findChildViewById(rootView, id);
      if (tvCurrencyName == null) {
        break missingId;
      }

      id = R.id.tvCurrencyRate;
      AppCompatTextView tvCurrencyRate = ViewBindings.findChildViewById(rootView, id);
      if (tvCurrencyRate == null) {
        break missingId;
      }

      return new ViewHolderCurrencyRateBinding((LinearLayout) rootView, lyRateHeader, tvConvert,
          tvCurrencyName, tvCurrencyRate);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
