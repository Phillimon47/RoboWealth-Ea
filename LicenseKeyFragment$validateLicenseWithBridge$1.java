package com.example.snipereambatha.fragments;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.snipereambatha.fragments.LicenseKeyFragment$validateLicenseWithBridge$1", f = "LicenseKeyFragment.kt", i = {}, l = {182, 210}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: LicenseKeyFragment.kt */
final class LicenseKeyFragment$validateLicenseWithBridge$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $deviceId;
    final /* synthetic */ String $licenseKey;
    int label;
    final /* synthetic */ LicenseKeyFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LicenseKeyFragment$validateLicenseWithBridge$1(String str, String str2, LicenseKeyFragment licenseKeyFragment, Continuation<? super LicenseKeyFragment$validateLicenseWithBridge$1> continuation) {
        super(2, continuation);
        this.$licenseKey = str;
        this.$deviceId = str2;
        this.this$0 = licenseKeyFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LicenseKeyFragment$validateLicenseWithBridge$1(this.$licenseKey, this.$deviceId, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LicenseKeyFragment$validateLicenseWithBridge$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fe, code lost:
        if (r6 == null) goto L_0x0109;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r12.label
            r2 = 0
            switch(r0) {
                case 0: goto L_0x001f;
                case 1: goto L_0x0017;
                case 2: goto L_0x0012;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0012:
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0157
        L_0x0017:
            kotlin.ResultKt.throwOnFailure(r13)     // Catch:{ Exception -> 0x001c }
            goto L_0x0132
        L_0x001c:
            r0 = move-exception
            goto L_0x013b
        L_0x001f:
            kotlin.ResultKt.throwOnFailure(r13)
            java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x001c }
            java.lang.String r3 = "http://77.93.152.165:5000/validate_license"
            r0.<init>(r3)     // Catch:{ Exception -> 0x001c }
            java.net.URLConnection r3 = r0.openConnection()     // Catch:{ Exception -> 0x001c }
            java.lang.String r0 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r0)     // Catch:{ Exception -> 0x001c }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ Exception -> 0x001c }
            r0 = r3
            r4 = 0
            java.lang.String r5 = "POST"
            r0.setRequestMethod(r5)     // Catch:{ Exception -> 0x001c }
            java.lang.String r5 = "Content-Type"
            java.lang.String r6 = "application/json"
            r0.setRequestProperty(r5, r6)     // Catch:{ Exception -> 0x001c }
            r5 = 1
            r0.setDoOutput(r5)     // Catch:{ Exception -> 0x001c }
            r6 = 10000(0x2710, float:1.4013E-41)
            r0.setConnectTimeout(r6)     // Catch:{ Exception -> 0x001c }
            r0.setReadTimeout(r6)     // Catch:{ Exception -> 0x001c }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x001c }
            r0.<init>()     // Catch:{ Exception -> 0x001c }
            java.lang.String r4 = r12.$licenseKey     // Catch:{ Exception -> 0x001c }
            java.lang.String r6 = r12.$deviceId     // Catch:{ Exception -> 0x001c }
            r7 = r0
            r8 = 0
            java.lang.String r9 = "license_key"
            r7.put(r9, r4)     // Catch:{ Exception -> 0x001c }
            java.lang.String r4 = "device_id"
            r7.put(r4, r6)     // Catch:{ Exception -> 0x001c }
            java.io.OutputStream r4 = r3.getOutputStream()     // Catch:{ Exception -> 0x001c }
            java.io.Closeable r4 = (java.io.Closeable) r4     // Catch:{ Exception -> 0x001c }
            r6 = r4
            java.io.OutputStream r6 = (java.io.OutputStream) r6     // Catch:{ all -> 0x0133 }
            r7 = 0
            java.lang.String r8 = r0.toString()     // Catch:{ all -> 0x0133 }
            java.lang.String r9 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)     // Catch:{ all -> 0x0133 }
            java.nio.charset.Charset r9 = kotlin.text.Charsets.UTF_8     // Catch:{ all -> 0x0133 }
            byte[] r8 = r8.getBytes(r9)     // Catch:{ all -> 0x0133 }
            java.lang.String r9 = "getBytes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)     // Catch:{ all -> 0x0133 }
            r6.write(r8)     // Catch:{ all -> 0x0133 }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0133 }
            kotlin.io.CloseableKt.closeFinally(r4, r2)     // Catch:{ Exception -> 0x001c }
            int r0 = r3.getResponseCode()     // Catch:{ Exception -> 0x001c }
            r8 = r0
            r0 = 200(0xc8, float:2.8E-43)
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r8 != r0) goto L_0x00d2
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ Exception -> 0x001c }
            java.lang.String r6 = "getInputStream(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)     // Catch:{ Exception -> 0x001c }
            java.nio.charset.Charset r6 = kotlin.text.Charsets.UTF_8     // Catch:{ Exception -> 0x001c }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x001c }
            r7.<init>(r0, r6)     // Catch:{ Exception -> 0x001c }
            java.io.Reader r7 = (java.io.Reader) r7     // Catch:{ Exception -> 0x001c }
            boolean r0 = r7 instanceof java.io.BufferedReader     // Catch:{ Exception -> 0x001c }
            if (r0 == 0) goto L_0x00b3
            java.io.BufferedReader r7 = (java.io.BufferedReader) r7     // Catch:{ Exception -> 0x001c }
            goto L_0x00b9
        L_0x00b3:
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x001c }
            r0.<init>(r7, r4)     // Catch:{ Exception -> 0x001c }
            r7 = r0
        L_0x00b9:
            java.io.Closeable r7 = (java.io.Closeable) r7     // Catch:{ Exception -> 0x001c }
            r0 = r7
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0     // Catch:{ all -> 0x00ca }
            r4 = 0
            r6 = r0
            java.io.Reader r6 = (java.io.Reader) r6     // Catch:{ all -> 0x00ca }
            java.lang.String r6 = kotlin.io.TextStreamsKt.readText(r6)     // Catch:{ all -> 0x00ca }
            kotlin.io.CloseableKt.closeFinally(r7, r2)     // Catch:{ Exception -> 0x001c }
            goto L_0x010b
        L_0x00ca:
            r0 = move-exception
            r3 = r0
            throw r3     // Catch:{ all -> 0x00cd }
        L_0x00cd:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r7, r3)     // Catch:{ Exception -> 0x001c }
            throw r0     // Catch:{ Exception -> 0x001c }
        L_0x00d2:
            java.io.InputStream r0 = r3.getErrorStream()     // Catch:{ Exception -> 0x001c }
            if (r0 == 0) goto L_0x0109
            java.nio.charset.Charset r6 = kotlin.text.Charsets.UTF_8     // Catch:{ Exception -> 0x001c }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x001c }
            r7.<init>(r0, r6)     // Catch:{ Exception -> 0x001c }
            java.io.Reader r7 = (java.io.Reader) r7     // Catch:{ Exception -> 0x001c }
            boolean r0 = r7 instanceof java.io.BufferedReader     // Catch:{ Exception -> 0x001c }
            if (r0 == 0) goto L_0x00e8
            java.io.BufferedReader r7 = (java.io.BufferedReader) r7     // Catch:{ Exception -> 0x001c }
            goto L_0x00ee
        L_0x00e8:
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x001c }
            r0.<init>(r7, r4)     // Catch:{ Exception -> 0x001c }
            r7 = r0
        L_0x00ee:
            java.io.Closeable r7 = (java.io.Closeable) r7     // Catch:{ Exception -> 0x001c }
            r0 = r7
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0     // Catch:{ all -> 0x0101 }
            r4 = 0
            r6 = r0
            java.io.Reader r6 = (java.io.Reader) r6     // Catch:{ all -> 0x0101 }
            java.lang.String r6 = kotlin.io.TextStreamsKt.readText(r6)     // Catch:{ all -> 0x0101 }
            kotlin.io.CloseableKt.closeFinally(r7, r2)     // Catch:{ Exception -> 0x001c }
            if (r6 != 0) goto L_0x010b
            goto L_0x0109
        L_0x0101:
            r0 = move-exception
            r3 = r0
            throw r3     // Catch:{ all -> 0x0104 }
        L_0x0104:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r7, r3)     // Catch:{ Exception -> 0x001c }
            throw r0     // Catch:{ Exception -> 0x001c }
        L_0x0109:
            java.lang.String r6 = ""
        L_0x010b:
            r3.disconnect()     // Catch:{ Exception -> 0x001c }
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x001c }
            r9.<init>(r6)     // Catch:{ Exception -> 0x001c }
            kotlinx.coroutines.MainCoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getMain()     // Catch:{ Exception -> 0x001c }
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0     // Catch:{ Exception -> 0x001c }
            com.example.snipereambatha.fragments.LicenseKeyFragment$validateLicenseWithBridge$1$3 r6 = new com.example.snipereambatha.fragments.LicenseKeyFragment$validateLicenseWithBridge$1$3     // Catch:{ Exception -> 0x001c }
            com.example.snipereambatha.fragments.LicenseKeyFragment r7 = r12.this$0     // Catch:{ Exception -> 0x001c }
            java.lang.String r10 = r12.$licenseKey     // Catch:{ Exception -> 0x001c }
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x001c }
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6     // Catch:{ Exception -> 0x001c }
            r3 = r12
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3     // Catch:{ Exception -> 0x001c }
            r12.label = r5     // Catch:{ Exception -> 0x001c }
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r0, r6, r3)     // Catch:{ Exception -> 0x001c }
            if (r0 != r1) goto L_0x0132
            return r1
        L_0x0132:
            goto L_0x0158
        L_0x0133:
            r0 = move-exception
            r3 = r0
            throw r3     // Catch:{ all -> 0x0136 }
        L_0x0136:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r4, r3)     // Catch:{ Exception -> 0x001c }
            throw r0     // Catch:{ Exception -> 0x001c }
        L_0x013b:
            kotlinx.coroutines.MainCoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getMain()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.example.snipereambatha.fragments.LicenseKeyFragment$validateLicenseWithBridge$1$4 r4 = new com.example.snipereambatha.fragments.LicenseKeyFragment$validateLicenseWithBridge$1$4
            com.example.snipereambatha.fragments.LicenseKeyFragment r5 = r12.this$0
            r4.<init>(r5, r0, r2)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r2 = r12
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            r5 = 2
            r12.label = r5
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r2)
            if (r0 != r1) goto L_0x0157
            return r1
        L_0x0157:
        L_0x0158:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.snipereambatha.fragments.LicenseKeyFragment$validateLicenseWithBridge$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
