package com.example.snipereambatha.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.snipereambatha.R;

public final class WidgetBotStatusBinding implements ViewBinding {
    public final TextView modeButton;
    private final RelativeLayout rootView;
    public final TextView statusButton;
    public final ImageView widgetIcon;
    public final TextView widgetTitle;

    private WidgetBotStatusBinding(RelativeLayout rootView2, TextView modeButton2, TextView statusButton2, ImageView widgetIcon2, TextView widgetTitle2) {
        this.rootView = rootView2;
        this.modeButton = modeButton2;
        this.statusButton = statusButton2;
        this.widgetIcon = widgetIcon2;
        this.widgetTitle = widgetTitle2;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static WidgetBotStatusBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static WidgetBotStatusBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.widget_bot_status, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static WidgetBotStatusBinding bind(View rootView2) {
        int id = R.id.modeButton;
        TextView modeButton2 = (TextView) ViewBindings.findChildViewById(rootView2, id);
        if (modeButton2 != null) {
            id = R.id.statusButton;
            TextView statusButton2 = (TextView) ViewBindings.findChildViewById(rootView2, id);
            if (statusButton2 != null) {
                id = R.id.widgetIcon;
                ImageView widgetIcon2 = (ImageView) ViewBindings.findChildViewById(rootView2, id);
                if (widgetIcon2 != null) {
                    id = R.id.widgetTitle;
                    TextView widgetTitle2 = (TextView) ViewBindings.findChildViewById(rootView2, id);
                    if (widgetTitle2 != null) {
                        return new WidgetBotStatusBinding((RelativeLayout) rootView2, modeButton2, statusButton2, widgetIcon2, widgetTitle2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView2.getResources().getResourceName(id)));
    }
}
