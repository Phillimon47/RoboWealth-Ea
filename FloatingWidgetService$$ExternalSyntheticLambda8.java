package com.example.snipereambatha.services;

import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import kotlin.jvm.internal.Ref;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class FloatingWidgetService$$ExternalSyntheticLambda8 implements View.OnTouchListener {
    public final /* synthetic */ Ref.IntRef f$0;
    public final /* synthetic */ WindowManager.LayoutParams f$1;
    public final /* synthetic */ Ref.IntRef f$2;
    public final /* synthetic */ Ref.FloatRef f$3;
    public final /* synthetic */ Ref.FloatRef f$4;
    public final /* synthetic */ FloatingWidgetService f$5;

    public /* synthetic */ FloatingWidgetService$$ExternalSyntheticLambda8(Ref.IntRef intRef, WindowManager.LayoutParams layoutParams, Ref.IntRef intRef2, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, FloatingWidgetService floatingWidgetService) {
        this.f$0 = intRef;
        this.f$1 = layoutParams;
        this.f$2 = intRef2;
        this.f$3 = floatRef;
        this.f$4 = floatRef2;
        this.f$5 = floatingWidgetService;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return FloatingWidgetService.setupTouchListener$lambda$21(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, view, motionEvent);
    }
}
