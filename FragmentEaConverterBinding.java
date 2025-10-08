package com.example.snipereambatha.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.snipereambatha.R;

public final class FragmentEaConverterBinding implements ViewBinding {
    public final ImageView bullIcon;
    public final View progressIndicator;
    public final Button returnToTradeButton;
    private final ConstraintLayout rootView;
    public final TextView statusText;
    public final TextView title;

    private FragmentEaConverterBinding(ConstraintLayout rootView2, ImageView bullIcon2, View progressIndicator2, Button returnToTradeButton2, TextView statusText2, TextView title2) {
        this.rootView = rootView2;
        this.bullIcon = bullIcon2;
        this.progressIndicator = progressIndicator2;
        this.returnToTradeButton = returnToTradeButton2;
        this.statusText = statusText2;
        this.title = title2;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEaConverterBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static FragmentEaConverterBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.fragment_ea_converter, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = com.example.snipereambatha.R.id.progressIndicator;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.example.snipereambatha.databinding.FragmentEaConverterBinding bind(android.view.View r9) {
        /*
            int r0 = com.example.snipereambatha.R.id.bullIcon
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r9, r0)
            r4 = r1
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            if (r4 == 0) goto L_0x0041
            int r0 = com.example.snipereambatha.R.id.progressIndicator
            android.view.View r5 = androidx.viewbinding.ViewBindings.findChildViewById(r9, r0)
            if (r5 == 0) goto L_0x0040
            int r0 = com.example.snipereambatha.R.id.returnToTradeButton
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r9, r0)
            r6 = r1
            android.widget.Button r6 = (android.widget.Button) r6
            if (r6 == 0) goto L_0x003f
            int r0 = com.example.snipereambatha.R.id.statusText
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r9, r0)
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x003e
            int r0 = com.example.snipereambatha.R.id.title
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r9, r0)
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x003d
            com.example.snipereambatha.databinding.FragmentEaConverterBinding r2 = new com.example.snipereambatha.databinding.FragmentEaConverterBinding
            r3 = r9
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        L_0x003d:
            goto L_0x0042
        L_0x003e:
            goto L_0x0042
        L_0x003f:
            goto L_0x0042
        L_0x0040:
            goto L_0x0042
        L_0x0041:
        L_0x0042:
            android.content.res.Resources r1 = r9.getResources()
            java.lang.String r1 = r1.getResourceName(r0)
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "Missing required view with ID: "
            java.lang.String r3 = r3.concat(r1)
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.snipereambatha.databinding.FragmentEaConverterBinding.bind(android.view.View):com.example.snipereambatha.databinding.FragmentEaConverterBinding");
    }
}
