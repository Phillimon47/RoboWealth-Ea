package com.example.snipereambatha.services;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u0005H@¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u0005H@¢\u0006\u0002\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/example/snipereambatha/services/TradingService;", "", "<init>", "()V", "checkAccountStatus", "Lcom/example/snipereambatha/services/TradingStatus;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeTrade", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* compiled from: TradingService.kt */
public final class TradingService {
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object checkAccountStatus(kotlin.coroutines.Continuation<? super com.example.snipereambatha.services.TradingStatus> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.example.snipereambatha.services.TradingService$checkAccountStatus$1
            if (r0 == 0) goto L_0x0014
            r0 = r8
            com.example.snipereambatha.services.TradingService$checkAccountStatus$1 r0 = (com.example.snipereambatha.services.TradingService$checkAccountStatus$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0019
        L_0x0014:
            com.example.snipereambatha.services.TradingService$checkAccountStatus$1 r0 = new com.example.snipereambatha.services.TradingService$checkAccountStatus$1
            r0.<init>(r7, r8)
        L_0x0019:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L_0x0031;
                case 1: goto L_0x002d;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002d:
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x003f
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r1)
            r0.label = r4
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r3 = kotlinx.coroutines.DelayKt.delay(r5, r0)
            if (r3 != r2) goto L_0x003f
            return r2
        L_0x003f:
            com.example.snipereambatha.services.TradingStatus r2 = new com.example.snipereambatha.services.TradingStatus
            java.lang.String r3 = "SELL GOLD"
            java.lang.String r5 = "Analyzing market conditions..."
            r2.<init>(r3, r5, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.snipereambatha.services.TradingService.checkAccountStatus(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object executeTrade(kotlin.coroutines.Continuation<? super com.example.snipereambatha.services.TradingStatus> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.example.snipereambatha.services.TradingService$executeTrade$1
            if (r0 == 0) goto L_0x0014
            r0 = r8
            com.example.snipereambatha.services.TradingService$executeTrade$1 r0 = (com.example.snipereambatha.services.TradingService$executeTrade$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0019
        L_0x0014:
            com.example.snipereambatha.services.TradingService$executeTrade$1 r0 = new com.example.snipereambatha.services.TradingService$executeTrade$1
            r0.<init>(r7, r8)
        L_0x0019:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L_0x0031;
                case 1: goto L_0x002d;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002d:
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x003f
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r1)
            r0.label = r4
            r5 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r3 = kotlinx.coroutines.DelayKt.delay(r5, r0)
            if (r3 != r2) goto L_0x003f
            return r2
        L_0x003f:
            com.example.snipereambatha.services.TradingStatus r2 = new com.example.snipereambatha.services.TradingStatus
            java.lang.String r3 = "BUY EURUSD"
            java.lang.String r5 = "Trade executed successfully"
            r2.<init>(r3, r5, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.snipereambatha.services.TradingService.executeTrade(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
