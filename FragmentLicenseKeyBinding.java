package com.example.snipereambatha.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.snipereambatha.R;

public final class FragmentLicenseKeyBinding implements ViewBinding {
    public final Button authenticateButton;
    public final ImageView backButton;
    public final TextView description;
    public final TextView licenseInfoText;
    public final EditText licenseKeyInput;
    private final ConstraintLayout rootView;
    public final Button showLicenseTypesButton;
    public final TextView title;

    private FragmentLicenseKeyBinding(ConstraintLayout rootView2, Button authenticateButton2, ImageView backButton2, TextView description2, TextView licenseInfoText2, EditText licenseKeyInput2, Button showLicenseTypesButton2, TextView title2) {
        this.rootView = rootView2;
        this.authenticateButton = authenticateButton2;
        this.backButton = backButton2;
        this.description = description2;
        this.licenseInfoText = licenseInfoText2;
        this.licenseKeyInput = licenseKeyInput2;
        this.showLicenseTypesButton = showLicenseTypesButton2;
        this.title = title2;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentLicenseKeyBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static FragmentLicenseKeyBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.fragment_license_key, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static FragmentLicenseKeyBinding bind(View rootView2) {
        int id = R.id.authenticateButton;
        Button authenticateButton2 = (Button) ViewBindings.findChildViewById(rootView2, id);
        if (authenticateButton2 != null) {
            id = R.id.backButton;
            ImageView backButton2 = (ImageView) ViewBindings.findChildViewById(rootView2, id);
            if (backButton2 != null) {
                id = R.id.description;
                TextView description2 = (TextView) ViewBindings.findChildViewById(rootView2, id);
                if (description2 != null) {
                    id = R.id.licenseInfoText;
                    TextView licenseInfoText2 = (TextView) ViewBindings.findChildViewById(rootView2, id);
                    if (licenseInfoText2 != null) {
                        id = R.id.licenseKeyInput;
                        EditText licenseKeyInput2 = (EditText) ViewBindings.findChildViewById(rootView2, id);
                        if (licenseKeyInput2 != null) {
                            id = R.id.showLicenseTypesButton;
                            Button showLicenseTypesButton2 = (Button) ViewBindings.findChildViewById(rootView2, id);
                            if (showLicenseTypesButton2 != null) {
                                id = R.id.title;
                                TextView title2 = (TextView) ViewBindings.findChildViewById(rootView2, id);
                                if (title2 != null) {
                                    return new FragmentLicenseKeyBinding((ConstraintLayout) rootView2, authenticateButton2, backButton2, description2, licenseInfoText2, licenseKeyInput2, showLicenseTypesButton2, title2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView2.getResources().getResourceName(id)));
    }
}
