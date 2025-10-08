package com.example.snipereambatha.services;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/example/snipereambatha/services/FloatingWidgetService$startDataUpdates$1", "Ljava/lang/Runnable;", "run", "", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* compiled from: FloatingWidgetService.kt */
public final class FloatingWidgetService$startDataUpdates$1 implements Runnable {
    final /* synthetic */ FloatingWidgetService this$0;

    FloatingWidgetService$startDataUpdates$1(FloatingWidgetService $receiver) {
        this.this$0 = $receiver;
    }

    public void run() {
        this.this$0.updateData();
        this.this$0.checkForNewSignals();
        this.this$0.checkBridgeStatus();
        this.this$0.handler.postDelayed(this, 2000);
    }
}
