package com.example.snipereambatha.fragments;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/example/snipereambatha/fragments/EAConverterCountdownFragment$startSignalMonitoring$1", "Ljava/lang/Runnable;", "run", "", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* compiled from: EAConverterCountdownFragment.kt */
public final class EAConverterCountdownFragment$startSignalMonitoring$1 implements Runnable {
    final /* synthetic */ EAConverterCountdownFragment this$0;

    EAConverterCountdownFragment$startSignalMonitoring$1(EAConverterCountdownFragment $receiver) {
        this.this$0 = $receiver;
    }

    public void run() {
        if (this.this$0.isFragmentActive) {
            this.this$0.checkForEASignals();
            this.this$0.signalCheckHandler.postDelayed(this, 500);
        }
    }
}
