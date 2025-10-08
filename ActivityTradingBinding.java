package com.example.snipereambatha.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.snipereambatha.R;

public final class ActivityTradingBinding implements ViewBinding {
    public final Button btnConnect;
    private final LinearLayout rootView;
    public final Spinner spinnerBroker;
    public final TextView tvAccountInfo;
    public final TextView tvStatus;

    private ActivityTradingBinding(LinearLayout rootView2, Button btnConnect2, Spinner spinnerBroker2, TextView tvAccountInfo2, TextView tvStatus2) {
        this.rootView = rootView2;
        this.btnConnect = btnConnect2;
        this.spinnerBroker = spinnerBroker2;
        this.tvAccountInfo = tvAccountInfo2;
        this.tvStatus = tvStatus2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityTradingBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static ActivityTradingBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_trading, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityTradingBinding bind(View rootView2) {
        int id = R.id.btn_connect;
        Button btnConnect2 = (Button) ViewBindings.findChildViewById(rootView2, id);
        if (btnConnect2 != null) {
            id = R.id.spinner_broker;
            Spinner spinnerBroker2 = (Spinner) ViewBindings.findChildViewById(rootView2, id);
            if (spinnerBroker2 != null) {
                id = R.id.tv_account_info;
                TextView tvAccountInfo2 = (TextView) ViewBindings.findChildViewById(rootView2, id);
                if (tvAccountInfo2 != null) {
                    id = R.id.tv_status;
                    TextView tvStatus2 = (TextView) ViewBindings.findChildViewById(rootView2, id);
                    if (tvStatus2 != null) {
                        return new ActivityTradingBinding((LinearLayout) rootView2, btnConnect2, spinnerBroker2, tvAccountInfo2, tvStatus2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView2.getResources().getResourceName(id)));
    }
}
