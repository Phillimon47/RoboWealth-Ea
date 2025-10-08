package com.example.snipereambatha.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.snipereambatha.R;

public final class FragmentMetatraderBinding implements ViewBinding {
    public final LinearLayout accountTypeButtons;
    public final LinearLayout bottomNavigation;
    public final View bridgeStatusDot;
    public final LinearLayout connectedAccountsLayout;
    public final View connectionStatusDot;
    public final Button linkAccountButton;
    public final LinearLayout loginFieldsContainer;
    public final EditText loginInput;
    public final TextView loginTitle;
    public final Button mt4Button;
    public final Button mt5Button;
    public final ImageView mt5Logo;
    public final LinearLayout navHome;
    public final LinearLayout navMetatrader;
    public final EditText passwordInput;
    public final ImageView passwordToggle;
    private final ConstraintLayout rootView;
    public final EditText serverInput;
    public final LinearLayout statusIndicators;
    public final TextView statusTextView;

    private FragmentMetatraderBinding(ConstraintLayout rootView2, LinearLayout accountTypeButtons2, LinearLayout bottomNavigation2, View bridgeStatusDot2, LinearLayout connectedAccountsLayout2, View connectionStatusDot2, Button linkAccountButton2, LinearLayout loginFieldsContainer2, EditText loginInput2, TextView loginTitle2, Button mt4Button2, Button mt5Button2, ImageView mt5Logo2, LinearLayout navHome2, LinearLayout navMetatrader2, EditText passwordInput2, ImageView passwordToggle2, EditText serverInput2, LinearLayout statusIndicators2, TextView statusTextView2) {
        this.rootView = rootView2;
        this.accountTypeButtons = accountTypeButtons2;
        this.bottomNavigation = bottomNavigation2;
        this.bridgeStatusDot = bridgeStatusDot2;
        this.connectedAccountsLayout = connectedAccountsLayout2;
        this.connectionStatusDot = connectionStatusDot2;
        this.linkAccountButton = linkAccountButton2;
        this.loginFieldsContainer = loginFieldsContainer2;
        this.loginInput = loginInput2;
        this.loginTitle = loginTitle2;
        this.mt4Button = mt4Button2;
        this.mt5Button = mt5Button2;
        this.mt5Logo = mt5Logo2;
        this.navHome = navHome2;
        this.navMetatrader = navMetatrader2;
        this.passwordInput = passwordInput2;
        this.passwordToggle = passwordToggle2;
        this.serverInput = serverInput2;
        this.statusIndicators = statusIndicators2;
        this.statusTextView = statusTextView2;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMetatraderBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static FragmentMetatraderBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.fragment_metatrader, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r1 = com.example.snipereambatha.R.id.bridgeStatusDot;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        r1 = com.example.snipereambatha.R.id.connectionStatusDot;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.example.snipereambatha.databinding.FragmentMetatraderBinding bind(android.view.View r24) {
        /*
            r0 = r24
            int r1 = com.example.snipereambatha.R.id.accountTypeButtons
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r5 = r2
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            if (r5 == 0) goto L_0x00f0
            int r1 = com.example.snipereambatha.R.id.bottomNavigation
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r6 = r2
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            if (r6 == 0) goto L_0x00ef
            int r1 = com.example.snipereambatha.R.id.bridgeStatusDot
            android.view.View r7 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            if (r7 == 0) goto L_0x00ee
            int r1 = com.example.snipereambatha.R.id.connectedAccountsLayout
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r8 = r2
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            if (r8 == 0) goto L_0x00ed
            int r1 = com.example.snipereambatha.R.id.connectionStatusDot
            android.view.View r9 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            if (r9 == 0) goto L_0x00ec
            int r1 = com.example.snipereambatha.R.id.linkAccountButton
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r10 = r2
            android.widget.Button r10 = (android.widget.Button) r10
            if (r10 == 0) goto L_0x00eb
            int r1 = com.example.snipereambatha.R.id.loginFieldsContainer
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r11 = r2
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            if (r11 == 0) goto L_0x00ea
            int r1 = com.example.snipereambatha.R.id.loginInput
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r12 = r2
            android.widget.EditText r12 = (android.widget.EditText) r12
            if (r12 == 0) goto L_0x00e9
            int r1 = com.example.snipereambatha.R.id.loginTitle
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r13 = r2
            android.widget.TextView r13 = (android.widget.TextView) r13
            if (r13 == 0) goto L_0x00e8
            int r1 = com.example.snipereambatha.R.id.mt4Button
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r14 = r2
            android.widget.Button r14 = (android.widget.Button) r14
            if (r14 == 0) goto L_0x00e7
            int r1 = com.example.snipereambatha.R.id.mt5Button
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r15 = r2
            android.widget.Button r15 = (android.widget.Button) r15
            if (r15 == 0) goto L_0x00e6
            int r1 = com.example.snipereambatha.R.id.mt5Logo
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r16 = r2
            android.widget.ImageView r16 = (android.widget.ImageView) r16
            if (r16 == 0) goto L_0x00e5
            int r1 = com.example.snipereambatha.R.id.navHome
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r17 = r2
            android.widget.LinearLayout r17 = (android.widget.LinearLayout) r17
            if (r17 == 0) goto L_0x00e4
            int r1 = com.example.snipereambatha.R.id.navMetatrader
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r18 = r2
            android.widget.LinearLayout r18 = (android.widget.LinearLayout) r18
            if (r18 == 0) goto L_0x00e3
            int r1 = com.example.snipereambatha.R.id.passwordInput
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r19 = r2
            android.widget.EditText r19 = (android.widget.EditText) r19
            if (r19 == 0) goto L_0x00e2
            int r1 = com.example.snipereambatha.R.id.passwordToggle
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r20 = r2
            android.widget.ImageView r20 = (android.widget.ImageView) r20
            if (r20 == 0) goto L_0x00e1
            int r1 = com.example.snipereambatha.R.id.serverInput
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r21 = r2
            android.widget.EditText r21 = (android.widget.EditText) r21
            if (r21 == 0) goto L_0x00e0
            int r1 = com.example.snipereambatha.R.id.statusIndicators
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r22 = r2
            android.widget.LinearLayout r22 = (android.widget.LinearLayout) r22
            if (r22 == 0) goto L_0x00df
            int r1 = com.example.snipereambatha.R.id.statusTextView
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r23 = r2
            android.widget.TextView r23 = (android.widget.TextView) r23
            if (r23 == 0) goto L_0x00de
            com.example.snipereambatha.databinding.FragmentMetatraderBinding r3 = new com.example.snipereambatha.databinding.FragmentMetatraderBinding
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r3
        L_0x00de:
            goto L_0x00f1
        L_0x00df:
            goto L_0x00f1
        L_0x00e0:
            goto L_0x00f1
        L_0x00e1:
            goto L_0x00f1
        L_0x00e2:
            goto L_0x00f1
        L_0x00e3:
            goto L_0x00f1
        L_0x00e4:
            goto L_0x00f1
        L_0x00e5:
            goto L_0x00f1
        L_0x00e6:
            goto L_0x00f1
        L_0x00e7:
            goto L_0x00f1
        L_0x00e8:
            goto L_0x00f1
        L_0x00e9:
            goto L_0x00f1
        L_0x00ea:
            goto L_0x00f1
        L_0x00eb:
            goto L_0x00f1
        L_0x00ec:
            goto L_0x00f1
        L_0x00ed:
            goto L_0x00f1
        L_0x00ee:
            goto L_0x00f1
        L_0x00ef:
            goto L_0x00f1
        L_0x00f0:
        L_0x00f1:
            android.content.res.Resources r2 = r0.getResources()
            java.lang.String r2 = r2.getResourceName(r1)
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "Missing required view with ID: "
            java.lang.String r4 = r4.concat(r2)
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.snipereambatha.databinding.FragmentMetatraderBinding.bind(android.view.View):com.example.snipereambatha.databinding.FragmentMetatraderBinding");
    }
}
