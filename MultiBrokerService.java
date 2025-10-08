package com.example.snipereambatha.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.Timer;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\"\u0010\r\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/example/snipereambatha/services/MultiBrokerService;", "Landroid/app/Service;", "<init>", "()V", "TAG", "", "timer", "Ljava/util/Timer;", "bridgeUrl", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onStartCommand", "", "flags", "startId", "startConnectionMaintenance", "", "sessionId", "account", "checkAccountStatus", "updateAccountInfo", "accountInfo", "Lorg/json/JSONObject;", "onDestroy", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* compiled from: MultiBrokerService.kt */
public final class MultiBrokerService extends Service {
    private final String TAG = "MultiBrokerService";
    private String bridgeUrl = "http://192.168.0.151:5000";
    private Timer timer;

    public IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r6, int r7, int r8) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0040
            r0 = r6
            r1 = 0
            java.lang.String r2 = r0.getAction()
            if (r2 == 0) goto L_0x003e
            int r3 = r2.hashCode()
            switch(r3) {
                case -528169454: goto L_0x0012;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x003e
        L_0x0012:
            java.lang.String r3 = "MAINTAIN_CONNECTION"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x003e
            java.lang.String r2 = "session_id"
            java.lang.String r2 = r0.getStringExtra(r2)
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x0025
            r2 = r3
        L_0x0025:
            java.lang.String r4 = "account"
            java.lang.String r4 = r0.getStringExtra(r4)
            if (r4 != 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r3 = r4
        L_0x002f:
            java.lang.String r4 = "bridge_url"
            java.lang.String r4 = r0.getStringExtra(r4)
            if (r4 != 0) goto L_0x0039
            java.lang.String r4 = r5.bridgeUrl
        L_0x0039:
            r5.bridgeUrl = r4
            r5.startConnectionMaintenance(r2, r3)
        L_0x003e:
        L_0x0040:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.snipereambatha.services.MultiBrokerService.onStartCommand(android.content.Intent, int, int):int");
    }

    private final void startConnectionMaintenance(String sessionId, String account) {
        Timer timer2 = this.timer;
        if (timer2 != null) {
            timer2.cancel();
        }
        this.timer = new Timer();
        Timer timer3 = this.timer;
        if (timer3 != null) {
            timer3.scheduleAtFixedRate(new MultiBrokerService$startConnectionMaintenance$1(this, sessionId, account), 0, 30000);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c1, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c5, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c8, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cc, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void checkAccountStatus(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x00cd }
            java.lang.String r1 = r8.bridgeUrl     // Catch:{ Exception -> 0x00cd }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00cd }
            r2.<init>()     // Catch:{ Exception -> 0x00cd }
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch:{ Exception -> 0x00cd }
            java.lang.String r2 = "/account_info"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Exception -> 0x00cd }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00cd }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00cd }
            java.net.URLConnection r1 = r0.openConnection()     // Catch:{ Exception -> 0x00cd }
            java.lang.String r2 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)     // Catch:{ Exception -> 0x00cd }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x00cd }
            java.lang.String r2 = "POST"
            r1.setRequestMethod(r2)     // Catch:{ Exception -> 0x00cd }
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = "application/json"
            r1.setRequestProperty(r2, r3)     // Catch:{ Exception -> 0x00cd }
            r2 = 1
            r1.setDoOutput(r2)     // Catch:{ Exception -> 0x00cd }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x00cd }
            r2.<init>()     // Catch:{ Exception -> 0x00cd }
            r3 = r2
            r4 = 0
            java.lang.String r5 = "session_id"
            r3.put(r5, r9)     // Catch:{ Exception -> 0x00cd }
            java.io.OutputStream r3 = r1.getOutputStream()     // Catch:{ Exception -> 0x00cd }
            java.io.Closeable r3 = (java.io.Closeable) r3     // Catch:{ Exception -> 0x00cd }
            r4 = r3
            java.io.OutputStream r4 = (java.io.OutputStream) r4     // Catch:{ all -> 0x00c6 }
            r5 = 0
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x00c6 }
            java.lang.String r7 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)     // Catch:{ all -> 0x00c6 }
            java.nio.charset.Charset r7 = kotlin.text.Charsets.UTF_8     // Catch:{ all -> 0x00c6 }
            byte[] r6 = r6.getBytes(r7)     // Catch:{ all -> 0x00c6 }
            java.lang.String r7 = "getBytes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)     // Catch:{ all -> 0x00c6 }
            r4.write(r6)     // Catch:{ all -> 0x00c6 }
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00c6 }
            r4 = 0
            kotlin.io.CloseableKt.closeFinally(r3, r4)     // Catch:{ Exception -> 0x00cd }
            int r3 = r1.getResponseCode()     // Catch:{ Exception -> 0x00cd }
            r5 = 200(0xc8, float:2.8E-43)
            if (r3 != r5) goto L_0x00ea
            java.io.InputStream r3 = r1.getInputStream()     // Catch:{ Exception -> 0x00cd }
            java.lang.String r5 = "getInputStream(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)     // Catch:{ Exception -> 0x00cd }
            java.nio.charset.Charset r5 = kotlin.text.Charsets.UTF_8     // Catch:{ Exception -> 0x00cd }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00cd }
            r6.<init>(r3, r5)     // Catch:{ Exception -> 0x00cd }
            java.io.Reader r6 = (java.io.Reader) r6     // Catch:{ Exception -> 0x00cd }
            boolean r3 = r6 instanceof java.io.BufferedReader     // Catch:{ Exception -> 0x00cd }
            if (r3 == 0) goto L_0x008d
            java.io.BufferedReader r6 = (java.io.BufferedReader) r6     // Catch:{ Exception -> 0x00cd }
            goto L_0x0095
        L_0x008d:
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00cd }
            r5 = 8192(0x2000, float:1.14794E-41)
            r3.<init>(r6, r5)     // Catch:{ Exception -> 0x00cd }
            r6 = r3
        L_0x0095:
            java.io.Closeable r6 = (java.io.Closeable) r6     // Catch:{ Exception -> 0x00cd }
            r3 = r6
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3     // Catch:{ all -> 0x00bf }
            r5 = 0
            r7 = r3
            java.io.Reader r7 = (java.io.Reader) r7     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = kotlin.io.TextStreamsKt.readText(r7)     // Catch:{ all -> 0x00bf }
            kotlin.io.CloseableKt.closeFinally(r6, r4)     // Catch:{ Exception -> 0x00cd }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x00cd }
            r3.<init>(r7)     // Catch:{ Exception -> 0x00cd }
            java.lang.String r4 = "success"
            boolean r4 = r3.getBoolean(r4)     // Catch:{ Exception -> 0x00cd }
            if (r4 == 0) goto L_0x00ea
            java.lang.String r4 = "account"
            org.json.JSONObject r4 = r3.getJSONObject(r4)     // Catch:{ Exception -> 0x00cd }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)     // Catch:{ Exception -> 0x00cd }
            r8.updateAccountInfo(r10, r4)     // Catch:{ Exception -> 0x00cd }
            goto L_0x00ea
        L_0x00bf:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r4 = move-exception
            kotlin.io.CloseableKt.closeFinally(r6, r3)     // Catch:{ Exception -> 0x00cd }
            throw r4     // Catch:{ Exception -> 0x00cd }
        L_0x00c6:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r5 = move-exception
            kotlin.io.CloseableKt.closeFinally(r3, r4)     // Catch:{ Exception -> 0x00cd }
            throw r5     // Catch:{ Exception -> 0x00cd }
        L_0x00cd:
            r0 = move-exception
            java.lang.String r1 = r8.TAG
            java.lang.String r2 = r0.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Error checking account status: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r1, r2)
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.snipereambatha.services.MultiBrokerService.checkAccountStatus(java.lang.String, java.lang.String):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void updateAccountInfo(java.lang.String r12, org.json.JSONObject r13) {
        /*
            r11 = this;
            java.lang.String r0 = "app_prefs"
            r1 = 0
            android.content.SharedPreferences r0 = r11.getSharedPreferences(r0, r1)
            java.lang.String r2 = "linked_accounts"
            java.util.Set r3 = kotlin.collections.SetsKt.emptySet()
            java.util.Set r2 = r0.getStringSet(r2, r3)
            if (r2 != 0) goto L_0x0017
            java.util.Set r2 = kotlin.collections.SetsKt.emptySet()
        L_0x0017:
            r3 = r2
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x001e:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x003e
            java.lang.Object r4 = r3.next()
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            r7 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            r8 = r6
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r9 = r12
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r10 = 2
            boolean r5 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r8, (java.lang.CharSequence) r9, (boolean) r1, (int) r10, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x001e
            r5 = r4
        L_0x003e:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x00c3
            r1 = 0
            android.content.SharedPreferences$Editor r3 = r0.edit()
            r4 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r5)
            java.lang.String r7 = "_balance"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "balance"
            double r7 = r13.getDouble(r7)
            float r7 = (float) r7
            r3.putFloat(r6, r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r5)
            java.lang.String r7 = "_equity"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "equity"
            double r7 = r13.getDouble(r7)
            float r7 = (float) r7
            r3.putFloat(r6, r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r5)
            java.lang.String r7 = "_margin"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "margin"
            double r7 = r13.getDouble(r7)
            float r7 = (float) r7
            r3.putFloat(r6, r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r5)
            java.lang.String r7 = "_profit"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "profit"
            double r7 = r13.getDouble(r7)
            float r7 = (float) r7
            r3.putFloat(r6, r7)
            r3.apply()
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.snipereambatha.services.MultiBrokerService.updateAccountInfo(java.lang.String, org.json.JSONObject):void");
    }

    public void onDestroy() {
        super.onDestroy();
        Timer timer2 = this.timer;
        if (timer2 != null) {
            timer2.cancel();
        }
    }
}
