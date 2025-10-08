package com.example.snipereambatha.services;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.snipereambatha.services.TradingService", f = "TradingService.kt", i = {}, l = {27}, m = "executeTrade", n = {}, s = {})
/* compiled from: TradingService.kt */
final class TradingService$executeTrade$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TradingService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TradingService$executeTrade$1(TradingService tradingService, Continuation<? super TradingService$executeTrade$1> continuation) {
        super(continuation);
        this.this$0 = tradingService;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.executeTrade(this);
    }
}
