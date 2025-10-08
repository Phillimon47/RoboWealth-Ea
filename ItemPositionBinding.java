package com.example.snipereambatha.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.example.snipereambatha.R;

public final class ItemPositionBinding implements ViewBinding {
    public final Button closeButton;
    public final TextView currentPriceText;
    public final TextView openPriceText;
    public final TextView profitText;
    private final CardView rootView;
    public final TextView slTpText;
    public final TextView symbolText;
    public final View typeIndicator;
    public final TextView typeText;
    public final TextView volumeText;

    private ItemPositionBinding(CardView rootView2, Button closeButton2, TextView currentPriceText2, TextView openPriceText2, TextView profitText2, TextView slTpText2, TextView symbolText2, View typeIndicator2, TextView typeText2, TextView volumeText2) {
        this.rootView = rootView2;
        this.closeButton = closeButton2;
        this.currentPriceText = currentPriceText2;
        this.openPriceText = openPriceText2;
        this.profitText = profitText2;
        this.slTpText = slTpText2;
        this.symbolText = symbolText2;
        this.typeIndicator = typeIndicator2;
        this.typeText = typeText2;
        this.volumeText = volumeText2;
    }

    public CardView getRoot() {
        return this.rootView;
    }

    public static ItemPositionBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static ItemPositionBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.item_position, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        r0 = com.example.snipereambatha.R.id.typeIndicator;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.example.snipereambatha.databinding.ItemPositionBinding bind(android.view.View r13) {
        /*
            int r0 = com.example.snipereambatha.R.id.closeButton
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r13, r0)
            r4 = r1
            android.widget.Button r4 = (android.widget.Button) r4
            if (r4 == 0) goto L_0x0071
            int r0 = com.example.snipereambatha.R.id.currentPriceText
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r13, r0)
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x0070
            int r0 = com.example.snipereambatha.R.id.openPriceText
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r13, r0)
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L_0x006f
            int r0 = com.example.snipereambatha.R.id.profitText
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r13, r0)
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x006e
            int r0 = com.example.snipereambatha.R.id.slTpText
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r13, r0)
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x006d
            int r0 = com.example.snipereambatha.R.id.symbolText
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r13, r0)
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x006c
            int r0 = com.example.snipereambatha.R.id.typeIndicator
            android.view.View r10 = androidx.viewbinding.ViewBindings.findChildViewById(r13, r0)
            if (r10 == 0) goto L_0x006b
            int r0 = com.example.snipereambatha.R.id.typeText
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r13, r0)
            r11 = r1
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto L_0x006a
            int r0 = com.example.snipereambatha.R.id.volumeText
            android.view.View r1 = androidx.viewbinding.ViewBindings.findChildViewById(r13, r0)
            r12 = r1
            android.widget.TextView r12 = (android.widget.TextView) r12
            if (r12 == 0) goto L_0x0069
            com.example.snipereambatha.databinding.ItemPositionBinding r2 = new com.example.snipereambatha.databinding.ItemPositionBinding
            r3 = r13
            androidx.cardview.widget.CardView r3 = (androidx.cardview.widget.CardView) r3
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r2
        L_0x0069:
            goto L_0x0072
        L_0x006a:
            goto L_0x0072
        L_0x006b:
            goto L_0x0072
        L_0x006c:
            goto L_0x0072
        L_0x006d:
            goto L_0x0072
        L_0x006e:
            goto L_0x0072
        L_0x006f:
            goto L_0x0072
        L_0x0070:
            goto L_0x0072
        L_0x0071:
        L_0x0072:
            android.content.res.Resources r1 = r13.getResources()
            java.lang.String r1 = r1.getResourceName(r0)
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "Missing required view with ID: "
            java.lang.String r3 = r3.concat(r1)
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.snipereambatha.databinding.ItemPositionBinding.bind(android.view.View):com.example.snipereambatha.databinding.ItemPositionBinding");
    }
}
