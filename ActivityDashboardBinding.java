package com.example.snipereambatha.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.snipereambatha.R;

public final class ActivityDashboardBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final TextView tvActiveTrades;
    public final TextView tvTotalBalance;
    public final TextView tvTotalProfit;

    private ActivityDashboardBinding(LinearLayout rootView2, TextView tvActiveTrades2, TextView tvTotalBalance2, TextView tvTotalProfit2) {
        this.rootView = rootView2;
        this.tvActiveTrades = tvActiveTrades2;
        this.tvTotalBalance = tvTotalBalance2;
        this.tvTotalProfit = tvTotalProfit2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityDashboardBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static ActivityDashboardBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_dashboard, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityDashboardBinding bind(View rootView2) {
        int id = R.id.tv_active_trades;
        TextView tvActiveTrades2 = (TextView) ViewBindings.findChildViewById(rootView2, id);
        if (tvActiveTrades2 != null) {
            id = R.id.tv_total_balance;
            TextView tvTotalBalance2 = (TextView) ViewBindings.findChildViewById(rootView2, id);
            if (tvTotalBalance2 != null) {
                id = R.id.tv_total_profit;
                TextView tvTotalProfit2 = (TextView) ViewBindings.findChildViewById(rootView2, id);
                if (tvTotalProfit2 != null) {
                    return new ActivityDashboardBinding((LinearLayout) rootView2, tvActiveTrades2, tvTotalBalance2, tvTotalProfit2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView2.getResources().getResourceName(id)));
    }
}
