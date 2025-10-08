package com.example.snipereambatha.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.snipereambatha.R;

public final class ActivityMainBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final Button startFloatingWidget;

    private ActivityMainBinding(ConstraintLayout rootView2, Button startFloatingWidget2) {
        this.rootView = rootView2;
        this.startFloatingWidget = startFloatingWidget2;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityMainBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static ActivityMainBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_main, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityMainBinding bind(View rootView2) {
        int id = R.id.start_floating_widget;
        Button startFloatingWidget2 = (Button) ViewBindings.findChildViewById(rootView2, id);
        if (startFloatingWidget2 != null) {
            return new ActivityMainBinding((ConstraintLayout) rootView2, startFloatingWidget2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView2.getResources().getResourceName(id)));
    }
}
