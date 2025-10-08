package com.example.snipereambatha.fragments;

import android.content.DialogInterface;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class LoginFragment$$ExternalSyntheticLambda0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ LoginFragment f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ LoginFragment$$ExternalSyntheticLambda0(LoginFragment loginFragment, String str) {
        this.f$0 = loginFragment;
        this.f$1 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        LoginFragment.showPaymentRequiredDialogAndAutoPay$lambda$1(this.f$0, this.f$1, dialogInterface, i);
    }
}
