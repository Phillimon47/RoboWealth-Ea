package com.example.snipereambatha.services;

import android.os.CountDownTimer;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/example/snipereambatha/services/FloatingWidgetService$startCountdown$1", "Landroid/os/CountDownTimer;", "onTick", "", "millisUntilFinished", "", "onFinish", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* compiled from: FloatingWidgetService.kt */
public final class FloatingWidgetService$startCountdown$1 extends CountDownTimer {
    final /* synthetic */ FloatingWidgetService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FloatingWidgetService$startCountdown$1(FloatingWidgetService $receiver, long $super_call_param$1) {
        super($super_call_param$1, 1000);
        this.this$0 = $receiver;
    }

    public void onTick(long millisUntilFinished) {
        this.this$0.updateCountdownDisplay((int) (millisUntilFinished / ((long) 1000)));
    }

    public void onFinish() {
        TextView access$getCountdownText$p = this.this$0.countdownText;
        if (access$getCountdownText$p != null) {
            access$getCountdownText$p.setText("00:00");
        }
        TextView access$getCountdownText$p2 = this.this$0.countdownText;
        if (access$getCountdownText$p2 != null) {
            access$getCountdownText$p2.setTextColor(SupportMenu.CATEGORY_MASK);
        }
        this.this$0.isCountdownActive = false;
    }
}
