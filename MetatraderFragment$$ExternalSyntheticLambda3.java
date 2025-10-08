package com.example.snipereambatha.fragments;

import org.json.JSONObject;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class MetatraderFragment$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ MetatraderFragment f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ JSONObject f$2;
    public final /* synthetic */ float f$3;
    public final /* synthetic */ String f$4;
    public final /* synthetic */ String f$5;
    public final /* synthetic */ String f$6;
    public final /* synthetic */ String f$7;

    public /* synthetic */ MetatraderFragment$$ExternalSyntheticLambda3(MetatraderFragment metatraderFragment, boolean z, JSONObject jSONObject, float f, String str, String str2, String str3, String str4) {
        this.f$0 = metatraderFragment;
        this.f$1 = z;
        this.f$2 = jSONObject;
        this.f$3 = f;
        this.f$4 = str;
        this.f$5 = str2;
        this.f$6 = str3;
        this.f$7 = str4;
    }

    public final void run() {
        MetatraderFragment.connectToServerWithSettings$lambda$33$lambda$28(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7);
    }
}
