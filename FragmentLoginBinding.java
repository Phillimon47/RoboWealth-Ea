package com.example.snipereambatha.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.snipereambatha.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public final class FragmentLoginBinding implements ViewBinding {
    public final TextView appName;
    public final TextInputEditText emailInput;
    public final TextInputLayout emailLayout;
    public final TextView loginTitle;
    public final ImageView logo;
    public final TextInputEditText mentorIdInput;
    public final TextInputLayout mentorIdLayout;
    public final Button proceedButton;
    private final ConstraintLayout rootView;
    public final TextView subTitle;

    private FragmentLoginBinding(ConstraintLayout rootView2, TextView appName2, TextInputEditText emailInput2, TextInputLayout emailLayout2, TextView loginTitle2, ImageView logo2, TextInputEditText mentorIdInput2, TextInputLayout mentorIdLayout2, Button proceedButton2, TextView subTitle2) {
        this.rootView = rootView2;
        this.appName = appName2;
        this.emailInput = emailInput2;
        this.emailLayout = emailLayout2;
        this.loginTitle = loginTitle2;
        this.logo = logo2;
        this.mentorIdInput = mentorIdInput2;
        this.mentorIdLayout = mentorIdLayout2;
        this.proceedButton = proceedButton2;
        this.subTitle = subTitle2;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentLoginBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static FragmentLoginBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.fragment_login, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static FragmentLoginBinding bind(View rootView2) {
        int id = R.id.appName;
        TextView appName2 = (TextView) ViewBindings.findChildViewById(rootView2, id);
        if (appName2 != null) {
            id = R.id.emailInput;
            TextInputEditText emailInput2 = (TextInputEditText) ViewBindings.findChildViewById(rootView2, id);
            if (emailInput2 != null) {
                id = R.id.emailLayout;
                TextInputLayout emailLayout2 = (TextInputLayout) ViewBindings.findChildViewById(rootView2, id);
                if (emailLayout2 != null) {
                    id = R.id.loginTitle;
                    TextView loginTitle2 = (TextView) ViewBindings.findChildViewById(rootView2, id);
                    if (loginTitle2 != null) {
                        id = R.id.logo;
                        ImageView logo2 = (ImageView) ViewBindings.findChildViewById(rootView2, id);
                        if (logo2 != null) {
                            id = R.id.mentorIdInput;
                            TextInputEditText mentorIdInput2 = (TextInputEditText) ViewBindings.findChildViewById(rootView2, id);
                            if (mentorIdInput2 != null) {
                                id = R.id.mentorIdLayout;
                                TextInputLayout mentorIdLayout2 = (TextInputLayout) ViewBindings.findChildViewById(rootView2, id);
                                if (mentorIdLayout2 != null) {
                                    id = R.id.proceedButton;
                                    Button proceedButton2 = (Button) ViewBindings.findChildViewById(rootView2, id);
                                    if (proceedButton2 != null) {
                                        id = R.id.subTitle;
                                        TextView subTitle2 = (TextView) ViewBindings.findChildViewById(rootView2, id);
                                        if (subTitle2 != null) {
                                            return new FragmentLoginBinding((ConstraintLayout) rootView2, appName2, emailInput2, emailLayout2, loginTitle2, logo2, mentorIdInput2, mentorIdLayout2, proceedButton2, subTitle2);
                                        }
                                    }
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
