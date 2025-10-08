package com.example.snipereambatha.fragments;

import android.os.CountDownTimer;
import android.widget.TextView;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/example/snipereambatha/fragments/EAConverterCountdownFragment$startCountdown$1", "Landroid/os/CountDownTimer;", "onTick", "", "millisUntilFinished", "", "onFinish", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* compiled from: EAConverterCountdownFragment.kt */
public final class EAConverterCountdownFragment$startCountdown$1 extends CountDownTimer {
    final /* synthetic */ EAConverterCountdownFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EAConverterCountdownFragment$startCountdown$1(EAConverterCountdownFragment $receiver) {
        super(120000, 1000);
        this.this$0 = $receiver;
    }

    public void onTick(long millisUntilFinished) {
        if (!this.this$0.isFragmentActive || !this.this$0.isAdded()) {
            cancel();
            return;
        }
        long seconds = millisUntilFinished / ((long) 1000);
        this.this$0.safeUpdateUI(new EAConverterCountdownFragment$startCountdown$1$$ExternalSyntheticLambda0(this.this$0, seconds));
        this.this$0.updateFloatingWidgetCountdown((int) seconds);
    }

    /* access modifiers changed from: private */
    public static final Unit onTick$lambda$0(EAConverterCountdownFragment this$02, long $seconds) {
        TextView access$getCountdownText$p = this$02.countdownText;
        if (access$getCountdownText$p == null) {
            Intrinsics.throwUninitializedPropertyAccessException("countdownText");
            access$getCountdownText$p = null;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        long j = (long) 60;
        String format = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf($seconds / j), Long.valueOf($seconds % j)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        access$getCountdownText$p.setText(format);
        return Unit.INSTANCE;
    }

    public void onFinish() {
        if (this.this$0.isFragmentActive && this.this$0.isAdded()) {
            this.this$0.safeUpdateUI(new EAConverterCountdownFragment$startCountdown$1$$ExternalSyntheticLambda1(this.this$0));
            if (this.this$0.currentEASignal == null) {
                this.this$0.startCountdown();
            } else {
                this.this$0.startCountdown();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final Unit onFinish$lambda$1(EAConverterCountdownFragment this$02) {
        TextView access$getCountdownText$p = this$02.countdownText;
        if (access$getCountdownText$p == null) {
            Intrinsics.throwUninitializedPropertyAccessException("countdownText");
            access$getCountdownText$p = null;
        }
        access$getCountdownText$p.setText("00:00");
        return Unit.INSTANCE;
    }
}
