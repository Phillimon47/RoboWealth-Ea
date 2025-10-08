package com.example.snipereambatha.fragments;

import android.widget.TextView;
import androidx.navigation.fragment.FragmentKt;
import com.example.snipereambatha.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/example/snipereambatha/fragments/EAConverterFragment$startLoadingSequence$2", "Ljava/lang/Runnable;", "run", "", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* compiled from: EAConverterFragment.kt */
public final class EAConverterFragment$startLoadingSequence$2 implements Runnable {
    final /* synthetic */ EAConverterFragment this$0;

    EAConverterFragment$startLoadingSequence$2(EAConverterFragment $receiver) {
        this.this$0 = $receiver;
    }

    public void run() {
        long delay;
        if (this.this$0.currentStep < this.this$0.loadingSteps.size()) {
            TextView access$getStatusText$p = this.this$0.statusText;
            if (access$getStatusText$p == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statusText");
                access$getStatusText$p = null;
            }
            access$getStatusText$p.setText((CharSequence) this.this$0.loadingSteps.get(this.this$0.currentStep));
            this.this$0.currentStep = this.this$0.currentStep + 1;
            switch (this.this$0.currentStep) {
                case 2:
                case 5:
                case 8:
                case 11:
                    delay = 1500;
                    break;
                default:
                    delay = 800;
                    break;
            }
            this.this$0.handler.postDelayed(this, delay);
            return;
        }
        this.this$0.handler.postDelayed(new EAConverterFragment$startLoadingSequence$2$$ExternalSyntheticLambda0(this.this$0), 500);
    }

    /* access modifiers changed from: private */
    public static final void run$lambda$1(EAConverterFragment this$02) {
        this$02.safeNavigate(new EAConverterFragment$startLoadingSequence$2$$ExternalSyntheticLambda1(this$02));
    }

    /* access modifiers changed from: private */
    public static final Unit run$lambda$1$lambda$0(EAConverterFragment this$02) {
        FragmentKt.findNavController(this$02).navigate(R.id.action_eaConverterFragment_to_eaConverterCountdownFragment);
        return Unit.INSTANCE;
    }
}
