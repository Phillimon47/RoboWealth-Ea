package com.example.snipereambatha;

import android.content.DialogInterface;
import android.content.SharedPreferences;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class MainActivity$$ExternalSyntheticLambda2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ SharedPreferences f$0;
    public final /* synthetic */ MainActivity f$1;

    public /* synthetic */ MainActivity$$ExternalSyntheticLambda2(SharedPreferences sharedPreferences, MainActivity mainActivity) {
        this.f$0 = sharedPreferences;
        this.f$1 = mainActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        MainActivity.checkLicenseValidity$lambda$4(this.f$0, this.f$1, dialogInterface, i);
    }
}
