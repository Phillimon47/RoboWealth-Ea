package com.example.snipereambatha.fragments;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.fragment.FragmentKt;
import com.example.snipereambatha.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\u0016\u0010\u001a\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/example/snipereambatha/fragments/EAConverterFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "statusText", "Landroid/widget/TextView;", "progressIndicator", "Landroid/view/View;", "handler", "Landroid/os/Handler;", "currentStep", "", "loadingSteps", "", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "startLoadingSequence", "safeNavigate", "action", "Lkotlin/Function0;", "onDestroyView", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* compiled from: EAConverterFragment.kt */
public final class EAConverterFragment extends Fragment {
    /* access modifiers changed from: private */
    public int currentStep;
    /* access modifiers changed from: private */
    public final Handler handler = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public final List<String> loadingSteps = CollectionsKt.listOf("Initializing EA...", "Connecting to bridge server...", "Checking MT5 connection...", "Verifying account status...", "Loading market data...", "Checking selected symbols...", "Synchronizing with broker...", "Validating EA settings...", "Checking bot connectivity...", "Loading trading parameters...", "Verifying account balance...", "Checking margin requirements...", "Loading price feeds...", "Initializing trading engine...", "Preparing SNIPER EA MBATHA V.5...", "Final checks...", "Ready to trade!");
    private View progressIndicator;
    /* access modifiers changed from: private */
    public TextView statusText;

    public EAConverterFragment() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_ea_converter, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.statusText = (TextView) view.findViewById(R.id.statusText);
        this.progressIndicator = view.findViewById(R.id.progressIndicator);
        ((Button) view.findViewById(R.id.returnToTradeButton)).setOnClickListener(new EAConverterFragment$$ExternalSyntheticLambda2(this));
        startLoadingSequence();
    }

    /* access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(EAConverterFragment this$0, View it) {
        this$0.safeNavigate(new EAConverterFragment$$ExternalSyntheticLambda1(this$0));
    }

    /* access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1$lambda$0(EAConverterFragment this$0) {
        FragmentKt.findNavController(this$0).navigate(R.id.action_eaConverterFragment_to_eaConverterCountdownFragment);
        return Unit.INSTANCE;
    }

    private final void startLoadingSequence() {
        View view = this.progressIndicator;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressIndicator");
            view = null;
        }
        view.animate().rotation(360.0f).setDuration(2000).withEndAction(new EAConverterFragment$$ExternalSyntheticLambda0(this)).start();
        this.handler.post(new EAConverterFragment$startLoadingSequence$2(this));
    }

    /* access modifiers changed from: private */
    public static final void startLoadingSequence$lambda$2(EAConverterFragment this$0) {
        View view = this$0.progressIndicator;
        View view2 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressIndicator");
            view = null;
        }
        view.setRotation(0.0f);
        View view3 = this$0.progressIndicator;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressIndicator");
        } else {
            view2 = view3;
        }
        view2.animate().rotation(360.0f).setDuration(2000).start();
    }

    /* access modifiers changed from: private */
    public final void safeNavigate(Function0<Unit> action) {
        if (isAdded() && getView() != null) {
            try {
                action.invoke();
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    Boolean.valueOf(FragmentKt.findNavController(this).navigateUp());
                } catch (Exception e2) {
                    FragmentActivity activity = getActivity();
                    if (activity != null) {
                        activity.onBackPressed();
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        View view = null;
        this.handler.removeCallbacksAndMessages((Object) null);
        View view2 = this.progressIndicator;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressIndicator");
        } else {
            view = view2;
        }
        view.animate().cancel();
    }
}
