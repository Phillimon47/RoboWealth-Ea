package com.example.snipereambatha.fragments;

import android.content.SharedPreferences;
import java.util.Set;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class MetatraderFragment$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ Set f$0;
    public final /* synthetic */ SharedPreferences f$1;
    public final /* synthetic */ MetatraderFragment f$2;

    public /* synthetic */ MetatraderFragment$$ExternalSyntheticLambda1(Set set, SharedPreferences sharedPreferences, MetatraderFragment metatraderFragment) {
        this.f$0 = set;
        this.f$1 = sharedPreferences;
        this.f$2 = metatraderFragment;
    }

    public final void run() {
        MetatraderFragment.updateStudentSettingsOnBridge$lambda$1(this.f$0, this.f$1, this.f$2);
    }
}
