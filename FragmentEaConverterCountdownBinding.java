package com.example.snipereambatha.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.snipereambatha.R;

public final class FragmentEaConverterCountdownBinding implements ViewBinding {
    public final ImageView bullIcon;
    public final TextView converterTitle;
    public final Button copyLogButton;
    public final CardView countdownCard;
    public final TextView countdownText;
    public final ProgressBar executionProgress;
    public final CardView executionStatusCard;
    public final TextView executionStatusText;
    public final TextView mt5StatusText;
    public final ProgressBar progressBar;
    public final View pulseView;
    public final View radarView;
    private final ConstraintLayout rootView;
    public final LinearLayout signalContainer;
    public final TextView signalDetails;
    public final TextView signalHeader;
    public final ImageView statusIndicator;
    public final TextView tradeInfo1;
    public final TextView tradeInfo2;

    private FragmentEaConverterCountdownBinding(ConstraintLayout rootView2, ImageView bullIcon2, TextView converterTitle2, Button copyLogButton2, CardView countdownCard2, TextView countdownText2, ProgressBar executionProgress2, CardView executionStatusCard2, TextView executionStatusText2, TextView mt5StatusText2, ProgressBar progressBar2, View pulseView2, View radarView2, LinearLayout signalContainer2, TextView signalDetails2, TextView signalHeader2, ImageView statusIndicator2, TextView tradeInfo12, TextView tradeInfo22) {
        this.rootView = rootView2;
        this.bullIcon = bullIcon2;
        this.converterTitle = converterTitle2;
        this.copyLogButton = copyLogButton2;
        this.countdownCard = countdownCard2;
        this.countdownText = countdownText2;
        this.executionProgress = executionProgress2;
        this.executionStatusCard = executionStatusCard2;
        this.executionStatusText = executionStatusText2;
        this.mt5StatusText = mt5StatusText2;
        this.progressBar = progressBar2;
        this.pulseView = pulseView2;
        this.radarView = radarView2;
        this.signalContainer = signalContainer2;
        this.signalDetails = signalDetails2;
        this.signalHeader = signalHeader2;
        this.statusIndicator = statusIndicator2;
        this.tradeInfo1 = tradeInfo12;
        this.tradeInfo2 = tradeInfo22;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEaConverterCountdownBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static FragmentEaConverterCountdownBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.fragment_ea_converter_countdown, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r1 = com.example.snipereambatha.R.id.pulseView;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        r1 = com.example.snipereambatha.R.id.radarView;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.example.snipereambatha.databinding.FragmentEaConverterCountdownBinding bind(android.view.View r23) {
        /*
            r0 = r23
            int r1 = com.example.snipereambatha.R.id.bullIcon
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r5 = r2
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r5 == 0) goto L_0x00e2
            int r1 = com.example.snipereambatha.R.id.converterTitle
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r6 = r2
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L_0x00e1
            int r1 = com.example.snipereambatha.R.id.copyLogButton
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r7 = r2
            android.widget.Button r7 = (android.widget.Button) r7
            if (r7 == 0) goto L_0x00e0
            int r1 = com.example.snipereambatha.R.id.countdownCard
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r8 = r2
            androidx.cardview.widget.CardView r8 = (androidx.cardview.widget.CardView) r8
            if (r8 == 0) goto L_0x00df
            int r1 = com.example.snipereambatha.R.id.countdownText
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r9 = r2
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x00de
            int r1 = com.example.snipereambatha.R.id.executionProgress
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r10 = r2
            android.widget.ProgressBar r10 = (android.widget.ProgressBar) r10
            if (r10 == 0) goto L_0x00dd
            int r1 = com.example.snipereambatha.R.id.executionStatusCard
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r11 = r2
            androidx.cardview.widget.CardView r11 = (androidx.cardview.widget.CardView) r11
            if (r11 == 0) goto L_0x00dc
            int r1 = com.example.snipereambatha.R.id.executionStatusText
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r12 = r2
            android.widget.TextView r12 = (android.widget.TextView) r12
            if (r12 == 0) goto L_0x00db
            int r1 = com.example.snipereambatha.R.id.mt5StatusText
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r13 = r2
            android.widget.TextView r13 = (android.widget.TextView) r13
            if (r13 == 0) goto L_0x00da
            int r1 = com.example.snipereambatha.R.id.progressBar
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r14 = r2
            android.widget.ProgressBar r14 = (android.widget.ProgressBar) r14
            if (r14 == 0) goto L_0x00d9
            int r1 = com.example.snipereambatha.R.id.pulseView
            android.view.View r15 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            if (r15 == 0) goto L_0x00d8
            int r1 = com.example.snipereambatha.R.id.radarView
            android.view.View r16 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            if (r16 == 0) goto L_0x00d7
            int r1 = com.example.snipereambatha.R.id.signalContainer
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r17 = r2
            android.widget.LinearLayout r17 = (android.widget.LinearLayout) r17
            if (r17 == 0) goto L_0x00d6
            int r1 = com.example.snipereambatha.R.id.signalDetails
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r18 = r2
            android.widget.TextView r18 = (android.widget.TextView) r18
            if (r18 == 0) goto L_0x00d5
            int r1 = com.example.snipereambatha.R.id.signalHeader
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r19 = r2
            android.widget.TextView r19 = (android.widget.TextView) r19
            if (r19 == 0) goto L_0x00d4
            int r1 = com.example.snipereambatha.R.id.statusIndicator
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r20 = r2
            android.widget.ImageView r20 = (android.widget.ImageView) r20
            if (r20 == 0) goto L_0x00d3
            int r1 = com.example.snipereambatha.R.id.tradeInfo1
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r21 = r2
            android.widget.TextView r21 = (android.widget.TextView) r21
            if (r21 == 0) goto L_0x00d2
            int r1 = com.example.snipereambatha.R.id.tradeInfo2
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r0, r1)
            r22 = r2
            android.widget.TextView r22 = (android.widget.TextView) r22
            if (r22 == 0) goto L_0x00d1
            com.example.snipereambatha.databinding.FragmentEaConverterCountdownBinding r3 = new com.example.snipereambatha.databinding.FragmentEaConverterCountdownBinding
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r3
        L_0x00d1:
            goto L_0x00e3
        L_0x00d2:
            goto L_0x00e3
        L_0x00d3:
            goto L_0x00e3
        L_0x00d4:
            goto L_0x00e3
        L_0x00d5:
            goto L_0x00e3
        L_0x00d6:
            goto L_0x00e3
        L_0x00d7:
            goto L_0x00e3
        L_0x00d8:
            goto L_0x00e3
        L_0x00d9:
            goto L_0x00e3
        L_0x00da:
            goto L_0x00e3
        L_0x00db:
            goto L_0x00e3
        L_0x00dc:
            goto L_0x00e3
        L_0x00dd:
            goto L_0x00e3
        L_0x00de:
            goto L_0x00e3
        L_0x00df:
            goto L_0x00e3
        L_0x00e0:
            goto L_0x00e3
        L_0x00e1:
            goto L_0x00e3
        L_0x00e2:
        L_0x00e3:
            android.content.res.Resources r2 = r0.getResources()
            java.lang.String r2 = r2.getResourceName(r1)
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "Missing required view with ID: "
            java.lang.String r4 = r4.concat(r2)
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.snipereambatha.databinding.FragmentEaConverterCountdownBinding.bind(android.view.View):com.example.snipereambatha.databinding.FragmentEaConverterCountdownBinding");
    }
}
