package com.example.snipereambatha.fragments;

import com.example.snipereambatha.fragments.EAConverterCountdownFragment;
import org.json.JSONObject;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class EAConverterCountdownFragment$$ExternalSyntheticLambda25 implements Runnable {
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ EAConverterCountdownFragment f$1;
    public final /* synthetic */ EAConverterCountdownFragment.EASignal f$2;
    public final /* synthetic */ JSONObject f$3;
    public final /* synthetic */ JSONObject f$4;

    public /* synthetic */ EAConverterCountdownFragment$$ExternalSyntheticLambda25(boolean z, EAConverterCountdownFragment eAConverterCountdownFragment, EAConverterCountdownFragment.EASignal eASignal, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f$0 = z;
        this.f$1 = eAConverterCountdownFragment;
        this.f$2 = eASignal;
        this.f$3 = jSONObject;
        this.f$4 = jSONObject2;
    }

    public final void run() {
        EAConverterCountdownFragment.executeTradeSignal$lambda$32$lambda$29(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4);
    }
}
