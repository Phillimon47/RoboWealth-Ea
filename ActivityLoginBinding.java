package com.example.snipereambatha.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.Spinner;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.snipereambatha.R;

public final class ActivityLoginBinding implements ViewBinding {
    public final EditText accountNumberInput;
    public final Spinner brokerSpinner;
    public final Button connectButton;
    public final EditText passwordInput;
    public final ProgressBar progressBar;
    private final ScrollView rootView;
    public final EditText serverInput;

    private ActivityLoginBinding(ScrollView rootView2, EditText accountNumberInput2, Spinner brokerSpinner2, Button connectButton2, EditText passwordInput2, ProgressBar progressBar2, EditText serverInput2) {
        this.rootView = rootView2;
        this.accountNumberInput = accountNumberInput2;
        this.brokerSpinner = brokerSpinner2;
        this.connectButton = connectButton2;
        this.passwordInput = passwordInput2;
        this.progressBar = progressBar2;
        this.serverInput = serverInput2;
    }

    public ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityLoginBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static ActivityLoginBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_login, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityLoginBinding bind(View rootView2) {
        int id = R.id.account_number_input;
        EditText accountNumberInput2 = (EditText) ViewBindings.findChildViewById(rootView2, id);
        if (accountNumberInput2 != null) {
            id = R.id.broker_spinner;
            Spinner brokerSpinner2 = (Spinner) ViewBindings.findChildViewById(rootView2, id);
            if (brokerSpinner2 != null) {
                id = R.id.connect_button;
                Button connectButton2 = (Button) ViewBindings.findChildViewById(rootView2, id);
                if (connectButton2 != null) {
                    id = R.id.password_input;
                    EditText passwordInput2 = (EditText) ViewBindings.findChildViewById(rootView2, id);
                    if (passwordInput2 != null) {
                        id = R.id.progress_bar;
                        ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(rootView2, id);
                        if (progressBar2 != null) {
                            id = R.id.server_input;
                            EditText serverInput2 = (EditText) ViewBindings.findChildViewById(rootView2, id);
                            if (serverInput2 != null) {
                                return new ActivityLoginBinding((ScrollView) rootView2, accountNumberInput2, brokerSpinner2, connectButton2, passwordInput2, progressBar2, serverInput2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView2.getResources().getResourceName(id)));
    }
}
