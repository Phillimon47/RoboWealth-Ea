package com.example.snipereambatha.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.snipereambatha.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public final class FragmentHomeBinding implements ViewBinding {
    public final Button addNewEaButton;
    public final BottomNavigationView bottomNavigation;
    public final TextView licenseText;
    private final ConstraintLayout rootView;

    private FragmentHomeBinding(ConstraintLayout rootView2, Button addNewEaButton2, BottomNavigationView bottomNavigation2, TextView licenseText2) {
        this.rootView = rootView2;
        this.addNewEaButton = addNewEaButton2;
        this.bottomNavigation = bottomNavigation2;
        this.licenseText = licenseText2;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentHomeBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static FragmentHomeBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.fragment_home, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static FragmentHomeBinding bind(View rootView2) {
        int id = R.id.addNewEaButton;
        Button addNewEaButton2 = (Button) ViewBindings.findChildViewById(rootView2, id);
        if (addNewEaButton2 != null) {
            id = R.id.bottomNavigation;
            BottomNavigationView bottomNavigation2 = (BottomNavigationView) ViewBindings.findChildViewById(rootView2, id);
            if (bottomNavigation2 != null) {
                id = R.id.licenseText;
                TextView licenseText2 = (TextView) ViewBindings.findChildViewById(rootView2, id);
                if (licenseText2 != null) {
                    return new FragmentHomeBinding((ConstraintLayout) rootView2, addNewEaButton2, bottomNavigation2, licenseText2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView2.getResources().getResourceName(id)));
    }
}
