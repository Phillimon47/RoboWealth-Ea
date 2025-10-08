package com.example.snipereambatha.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.FragmentKt;
import com.example.snipereambatha.R;
import com.example.snipereambatha.services.MultiBrokerService;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u001c\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010&\u001a\u00020$H\u0016J\b\u0010'\u001a\u00020$H\u0002J\b\u0010(\u001a\u00020$H\u0002J\u0010\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020\u0005H\u0002J\u0010\u0010+\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0018H\u0002J\b\u0010,\u001a\u00020\u0018H\u0002J\u0018\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u00020$H\u0002J\b\u00102\u001a\u00020$H\u0002J\b\u00103\u001a\u00020$H\u0002J\b\u00104\u001a\u00020$H\u0002J\b\u00105\u001a\u00020$H\u0002J\b\u00106\u001a\u00020$H\u0002J\b\u00107\u001a\u00020$H\u0002J\b\u00108\u001a\u00020\u0005H\u0002J\u0018\u00109\u001a\u00020$2\u0006\u0010:\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0005H\u0002J \u0010;\u001a\u00020$2\u0006\u0010*\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u0005H\u0002J0\u0010>\u001a\u00020$2\u0006\u0010*\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u00052\u0006\u0010?\u001a\u00020@H\u0002J\b\u0010A\u001a\u00020$H\u0002JJ\u0010B\u001a\u00020\u00182\u0006\u0010C\u001a\u00020\u00052\b\u0010D\u001a\u0004\u0018\u00010\u00052\b\u0010*\u001a\u0004\u0018\u00010\u00052\b\u0010E\u001a\u0004\u0018\u00010\u00052\b\u0010:\u001a\u0004\u0018\u00010\u00052\u0006\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010I\u001a\u00020$2\u0006\u0010C\u001a\u00020\u0005H\u0002J\b\u0010J\u001a\u00020$H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000¨\u0006K"}, d2 = {"Lcom/example/snipereambatha/fragments/MetatraderFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "selectedPlatform", "", "connectedSessions", "", "isBridgeConnected", "", "isPasswordVisible", "mt5Button", "Landroid/widget/Button;", "mt4Button", "loginInput", "Landroid/widget/EditText;", "passwordInput", "serverInput", "linkAccountButton", "statusTextView", "Landroid/widget/TextView;", "connectedAccountsLayout", "Landroid/widget/LinearLayout;", "connectionStatusDot", "Landroid/view/View;", "passwordToggle", "Landroid/widget/ImageView;", "loginTitle", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "onResume", "checkLicenseAndUpdateSettings", "updateStudentSettingsOnBridge", "updateStudentSettings", "login", "setupBottomNavigation", "createStatusDot", "setDotColor", "dot", "color", "", "updateStatusDots", "checkAllAccountConnections", "testBridgeConnection", "setupPlatformButtons", "updatePlatformButtonStates", "setupPasswordToggle", "setupLinkAccountButton", "getDeviceId", "registerForCopyTradingWithSettings", "sessionId", "connectToServerWithSettings", "password", "server", "saveAccountSession", "accountInfo", "Lorg/json/JSONObject;", "loadConnectedAccounts", "createAccountView", "accountKey", "brokerName", "platform", "userLotSize", "", "studentName", "removeAccount", "onDestroy", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* compiled from: MetatraderFragment.kt */
public final class MetatraderFragment extends Fragment {
    private LinearLayout connectedAccountsLayout;
    private Map<String, String> connectedSessions = new LinkedHashMap();
    private View connectionStatusDot;
    private boolean isBridgeConnected;
    private boolean isPasswordVisible;
    private Button linkAccountButton;
    private EditText loginInput;
    private TextView loginTitle;
    private Button mt4Button;
    private Button mt5Button;
    private EditText passwordInput;
    private ImageView passwordToggle;
    private String selectedPlatform = "MT5";
    private EditText serverInput;
    private TextView statusTextView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_metatrader, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.mt5Button = (Button) view.findViewById(R.id.mt5Button);
        this.mt4Button = (Button) view.findViewById(R.id.mt4Button);
        this.loginInput = (EditText) view.findViewById(R.id.loginInput);
        this.passwordInput = (EditText) view.findViewById(R.id.passwordInput);
        this.serverInput = (EditText) view.findViewById(R.id.serverInput);
        this.linkAccountButton = (Button) view.findViewById(R.id.linkAccountButton);
        this.statusTextView = (TextView) view.findViewById(R.id.statusTextView);
        this.connectedAccountsLayout = (LinearLayout) view.findViewById(R.id.connectedAccountsLayout);
        this.passwordToggle = (ImageView) view.findViewById(R.id.passwordToggle);
        this.loginTitle = (TextView) view.findViewById(R.id.loginTitle);
        View findViewById = view.findViewById(R.id.connectionStatusDot);
        if (findViewById == null) {
            findViewById = createStatusDot();
        }
        this.connectionStatusDot = findViewById;
        setupBottomNavigation(view);
        setupPlatformButtons();
        setupPasswordToggle();
        setupLinkAccountButton();
        loadConnectedAccounts();
        updateStatusDots();
        checkLicenseAndUpdateSettings();
    }

    public void onResume() {
        super.onResume();
        testBridgeConnection();
        checkAllAccountConnections();
        checkLicenseAndUpdateSettings();
    }

    private final void checkLicenseAndUpdateSettings() {
        SharedPreferences sharedPref = requireActivity().getSharedPreferences("app_prefs", 0);
        boolean hasLicense = sharedPref.getBoolean("license_validated", false);
        long expiryTime = sharedPref.getLong("license_expiry_date", 0);
        String string = sharedPref.getString("license_key", "");
        String studentName = sharedPref.getString("student_name", "");
        int remainingDays = sharedPref.getInt("remaining_days", 0);
        TextView textView = null;
        if (!hasLicense || expiryTime <= System.currentTimeMillis()) {
            TextView textView2 = this.statusTextView;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
                textView2 = null;
            }
            textView2.setText("⚠️ License required or expired");
            TextView textView3 = this.statusTextView;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
                textView3 = null;
            }
            textView3.setTextColor(InputDeviceCompat.SOURCE_ANY);
            TextView textView4 = this.statusTextView;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
            } else {
                textView = textView4;
            }
            textView.setVisibility(0);
            return;
        }
        TextView textView5 = this.statusTextView;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
            textView5 = null;
        }
        textView5.setText("✅ License Active: " + studentName + " (" + remainingDays + " days left)");
        TextView textView6 = this.statusTextView;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
            textView6 = null;
        }
        textView6.setTextColor(-16711936);
        TextView textView7 = this.statusTextView;
        if (textView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
        } else {
            textView = textView7;
        }
        textView.setVisibility(0);
        updateStudentSettingsOnBridge();
    }

    private final void updateStudentSettingsOnBridge() {
        SharedPreferences sharedPref = requireActivity().getSharedPreferences("app_prefs", 0);
        Set accounts = sharedPref.getStringSet("linked_accounts", SetsKt.emptySet());
        if (accounts == null) {
            accounts = SetsKt.emptySet();
        }
        if (!accounts.isEmpty()) {
            new Thread(new MetatraderFragment$$ExternalSyntheticLambda1(accounts, sharedPref, this)).start();
        }
    }

    /* access modifiers changed from: private */
    public static final void updateStudentSettingsOnBridge$lambda$1(Set $accounts, SharedPreferences $sharedPref, MetatraderFragment this$0) {
        Iterator it = $accounts.iterator();
        while (it.hasNext()) {
            String str = "";
            String string = $sharedPref.getString(((String) it.next()) + "_login", str);
            if (string != null) {
                str = string;
            }
            if (str.length() > 0) {
                this$0.updateStudentSettings(str);
            }
        }
    }

    private final void updateStudentSettings(String login) {
        String str = login;
        String licenseKey = "";
        try {
            SharedPreferences sharedPref = requireActivity().getSharedPreferences("app_prefs", 0);
            float lotSize = sharedPref.getFloat("lot_size", 0.01f);
            Set<String> stringSet = sharedPref.getStringSet("selected_symbols", SetsKt.emptySet());
            if (stringSet == null) {
                stringSet = SetsKt.emptySet();
            }
            String string = sharedPref.getString("license_key", licenseKey);
            if (string != null) {
                licenseKey = string;
            }
            String deviceId = getDeviceId();
            String studentName = sharedPref.getString("student_name", "Student_" + str);
            URL url = new URL("http://77.93.152.165:5000/update_student_settings");
            URLConnection openConnection = url.openConnection();
            Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection connection = (HttpURLConnection) openConnection;
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            JSONArray symbolsArray = new JSONArray();
            for (String put : stringSet) {
                symbolsArray.put(put);
            }
            JSONObject jsonData = new JSONObject();
            JSONObject jSONObject = jsonData;
            SharedPreferences sharedPreferences = sharedPref;
            Set<String> set = stringSet;
            jSONObject.put("login", Integer.parseInt(str));
            URL url2 = url;
            HttpURLConnection connection2 = connection;
            jSONObject.put("lot_size", (double) lotSize);
            jSONObject.put("symbols", symbolsArray);
            jSONObject.put("license_key", licenseKey);
            jSONObject.put("device_id", deviceId);
            jSONObject.put("student_name", studentName);
            jSONObject.put("auto_execute", true);
            OutputStreamWriter writer = new OutputStreamWriter(connection2.getOutputStream());
            writer.write(jsonData.toString());
            writer.flush();
            writer.close();
            if (connection2.getResponseCode() == 200) {
                System.out.println("Student settings updated for " + str);
            }
        } catch (Exception e) {
            System.out.println("Failed to update student settings: " + e.getMessage());
        }
    }

    private final void setupBottomNavigation(View view) {
        LinearLayout navHome = (LinearLayout) view.findViewById(R.id.navHome);
        LinearLayout navMetatrader = (LinearLayout) view.findViewById(R.id.navMetatrader);
        if (navHome != null) {
            navHome.setOnClickListener(new MetatraderFragment$$ExternalSyntheticLambda18(this));
        }
        if (navMetatrader != null) {
            navMetatrader.setOnClickListener(new MetatraderFragment$$ExternalSyntheticLambda19(this));
        }
    }

    /* access modifiers changed from: private */
    public static final void setupBottomNavigation$lambda$4(MetatraderFragment this$0, View it) {
        try {
            FragmentKt.findNavController(this$0).navigate(R.id.homeFragment);
        } catch (Exception e) {
        }
    }

    /* access modifiers changed from: private */
    public static final void setupBottomNavigation$lambda$5(MetatraderFragment this$0, View it) {
        Toast.makeText(this$0.getContext(), "Already on MetaTrader", 0).show();
    }

    private final View createStatusDot() {
        View dot = new View(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(24, 24);
        layoutParams.setMargins(8, 8, 8, 8);
        dot.setLayoutParams(layoutParams);
        setDotColor(dot, SupportMenu.CATEGORY_MASK);
        return dot;
    }

    private final void setDotColor(View dot, int color) {
        GradientDrawable drawable = new GradientDrawable();
        GradientDrawable gradientDrawable = drawable;
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(color);
        dot.setBackground(drawable);
    }

    private final void updateStatusDots() {
        if (this.connectionStatusDot != null) {
            boolean hasAnyConnection = !this.connectedSessions.isEmpty();
            View view = this.connectionStatusDot;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("connectionStatusDot");
                view = null;
            }
            setDotColor(view, hasAnyConnection ? -16711936 : SupportMenu.CATEGORY_MASK);
        }
    }

    private final void checkAllAccountConnections() {
        new Thread(new MetatraderFragment$$ExternalSyntheticLambda22(this)).start();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a A[Catch:{ Exception -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0025 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void checkAllAccountConnections$lambda$10(com.example.snipereambatha.fragments.MetatraderFragment r7) {
        /*
            androidx.fragment.app.FragmentActivity r0 = r7.requireActivity()     // Catch:{ Exception -> 0x006d }
            java.lang.String r1 = "app_prefs"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)     // Catch:{ Exception -> 0x006d }
            java.lang.String r1 = "linked_accounts"
            java.util.Set r3 = kotlin.collections.SetsKt.emptySet()     // Catch:{ Exception -> 0x006d }
            java.util.Set r1 = r0.getStringSet(r1, r3)     // Catch:{ Exception -> 0x006d }
            if (r1 != 0) goto L_0x001c
            java.util.Set r1 = kotlin.collections.SetsKt.emptySet()     // Catch:{ Exception -> 0x006d }
        L_0x001c:
            java.util.Map<java.lang.String, java.lang.String> r3 = r7.connectedSessions     // Catch:{ Exception -> 0x006d }
            r3.clear()     // Catch:{ Exception -> 0x006d }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ Exception -> 0x006d }
        L_0x0025:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x006d }
            if (r4 == 0) goto L_0x0060
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x006d }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x006d }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006d }
            r5.<init>()     // Catch:{ Exception -> 0x006d }
            java.lang.StringBuilder r5 = r5.append(r4)     // Catch:{ Exception -> 0x006d }
            java.lang.String r6 = "_session_id"
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch:{ Exception -> 0x006d }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x006d }
            r6 = 0
            java.lang.String r5 = r0.getString(r5, r6)     // Catch:{ Exception -> 0x006d }
            r6 = r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ Exception -> 0x006d }
            if (r6 == 0) goto L_0x0057
            int r6 = r6.length()     // Catch:{ Exception -> 0x006d }
            if (r6 != 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r6 = 0
            goto L_0x0058
        L_0x0057:
            r6 = 1
        L_0x0058:
            if (r6 != 0) goto L_0x0025
            java.util.Map<java.lang.String, java.lang.String> r6 = r7.connectedSessions     // Catch:{ Exception -> 0x006d }
            r6.put(r4, r5)     // Catch:{ Exception -> 0x006d }
            goto L_0x0025
        L_0x0060:
            androidx.fragment.app.FragmentActivity r2 = r7.requireActivity()     // Catch:{ Exception -> 0x006d }
            com.example.snipereambatha.fragments.MetatraderFragment$$ExternalSyntheticLambda12 r3 = new com.example.snipereambatha.fragments.MetatraderFragment$$ExternalSyntheticLambda12     // Catch:{ Exception -> 0x006d }
            r3.<init>(r7)     // Catch:{ Exception -> 0x006d }
            r2.runOnUiThread(r3)     // Catch:{ Exception -> 0x006d }
            goto L_0x0071
        L_0x006d:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.snipereambatha.fragments.MetatraderFragment.checkAllAccountConnections$lambda$10(com.example.snipereambatha.fragments.MetatraderFragment):void");
    }

    /* access modifiers changed from: private */
    public static final void checkAllAccountConnections$lambda$10$lambda$9(MetatraderFragment this$0) {
        this$0.updateStatusDots();
        this$0.loadConnectedAccounts();
    }

    private final void testBridgeConnection() {
        new Thread(new MetatraderFragment$$ExternalSyntheticLambda13(this)).start();
    }

    /* access modifiers changed from: private */
    public static final void testBridgeConnection$lambda$14(MetatraderFragment this$0) {
        try {
            URLConnection openConnection = new URL("http://77.93.152.165:5000/test").openConnection();
            Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection connection = (HttpURLConnection) openConnection;
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            connection.setRequestProperty("User-Agent", "SNIPER-EA-APP/1.0");
            if (connection.getResponseCode() == 200) {
                this$0.isBridgeConnected = true;
                this$0.requireActivity().runOnUiThread(new MetatraderFragment$$ExternalSyntheticLambda11(this$0));
                return;
            }
            this$0.isBridgeConnected = false;
            this$0.requireActivity().runOnUiThread(new MetatraderFragment$$ExternalSyntheticLambda16(this$0));
        } catch (Exception e) {
            this$0.isBridgeConnected = false;
            this$0.requireActivity().runOnUiThread(new MetatraderFragment$$ExternalSyntheticLambda17(this$0));
        }
    }

    /* access modifiers changed from: private */
    public static final void testBridgeConnection$lambda$14$lambda$11(MetatraderFragment this$0) {
        SharedPreferences sharedPref = this$0.requireActivity().getSharedPreferences("app_prefs", 0);
        TextView textView = null;
        if (!sharedPref.getBoolean("license_validated", false)) {
            TextView textView2 = this$0.statusTextView;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
                textView2 = null;
            }
            textView2.setText("Bridge connected ✓ - License required");
            TextView textView3 = this$0.statusTextView;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
                textView3 = null;
            }
            textView3.setTextColor(InputDeviceCompat.SOURCE_ANY);
        } else {
            String studentName = sharedPref.getString("student_name", "");
            int remainingDays = sharedPref.getInt("remaining_days", 0);
            TextView textView4 = this$0.statusTextView;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
                textView4 = null;
            }
            textView4.setText("✅ " + studentName + " | " + remainingDays + " days left | Bridge OK");
            TextView textView5 = this$0.statusTextView;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
                textView5 = null;
            }
            textView5.setTextColor(-16711936);
        }
        TextView textView6 = this$0.statusTextView;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
        } else {
            textView = textView6;
        }
        textView.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void testBridgeConnection$lambda$14$lambda$12(MetatraderFragment this$0) {
        TextView textView = this$0.statusTextView;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
            textView = null;
        }
        textView.setText("Bridge server not connected ✗");
        TextView textView3 = this$0.statusTextView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
            textView3 = null;
        }
        textView3.setTextColor(SupportMenu.CATEGORY_MASK);
        TextView textView4 = this$0.statusTextView;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
        } else {
            textView2 = textView4;
        }
        textView2.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void testBridgeConnection$lambda$14$lambda$13(MetatraderFragment this$0) {
        TextView textView = this$0.statusTextView;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
            textView = null;
        }
        textView.setText("Bridge server not connected ✗");
        TextView textView3 = this$0.statusTextView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
            textView3 = null;
        }
        textView3.setTextColor(SupportMenu.CATEGORY_MASK);
        TextView textView4 = this$0.statusTextView;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
        } else {
            textView2 = textView4;
        }
        textView2.setVisibility(0);
    }

    private final void setupPlatformButtons() {
        updatePlatformButtonStates();
        Button button = this.mt5Button;
        Button button2 = null;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mt5Button");
            button = null;
        }
        button.setOnClickListener(new MetatraderFragment$$ExternalSyntheticLambda20(this));
        Button button3 = this.mt4Button;
        if (button3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mt4Button");
        } else {
            button2 = button3;
        }
        button2.setOnClickListener(new MetatraderFragment$$ExternalSyntheticLambda21(this));
    }

    /* access modifiers changed from: private */
    public static final void setupPlatformButtons$lambda$15(MetatraderFragment this$0, View it) {
        this$0.selectedPlatform = "MT5";
        this$0.updatePlatformButtonStates();
        TextView textView = this$0.loginTitle;
        Button button = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginTitle");
            textView = null;
        }
        textView.setText("MT5 LOGIN DETAILS");
        Button button2 = this$0.linkAccountButton;
        if (button2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linkAccountButton");
        } else {
            button = button2;
        }
        button.setText("LINK MT5 ACCOUNT DETAILS");
        Toast.makeText(this$0.getContext(), "MT5 selected", 0).show();
    }

    /* access modifiers changed from: private */
    public static final void setupPlatformButtons$lambda$16(MetatraderFragment this$0, View it) {
        this$0.selectedPlatform = "MT4";
        this$0.updatePlatformButtonStates();
        TextView textView = this$0.loginTitle;
        Button button = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginTitle");
            textView = null;
        }
        textView.setText("MT4 LOGIN DETAILS");
        Button button2 = this$0.linkAccountButton;
        if (button2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linkAccountButton");
        } else {
            button = button2;
        }
        button.setText("LINK MT4 ACCOUNT DETAILS");
        Toast.makeText(this$0.getContext(), "MT4 selected", 0).show();
    }

    private final void updatePlatformButtonStates() {
        Button button = null;
        if (Intrinsics.areEqual((Object) this.selectedPlatform, (Object) "MT5")) {
            Button button2 = this.mt5Button;
            if (button2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mt5Button");
                button2 = null;
            }
            button2.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            Button button3 = this.mt4Button;
            if (button3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mt4Button");
            } else {
                button = button3;
            }
            button.setBackgroundColor(-7829368);
            return;
        }
        Button button4 = this.mt4Button;
        if (button4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mt4Button");
            button4 = null;
        }
        button4.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        Button button5 = this.mt5Button;
        if (button5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mt5Button");
        } else {
            button = button5;
        }
        button.setBackgroundColor(-7829368);
    }

    private final void setupPasswordToggle() {
        ImageView imageView = this.passwordToggle;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("passwordToggle");
            imageView = null;
        }
        imageView.setOnClickListener(new MetatraderFragment$$ExternalSyntheticLambda15(this));
    }

    /* access modifiers changed from: private */
    public static final void setupPasswordToggle$lambda$17(MetatraderFragment this$0, View it) {
        this$0.isPasswordVisible = !this$0.isPasswordVisible;
        EditText editText = null;
        if (this$0.isPasswordVisible) {
            EditText editText2 = this$0.passwordInput;
            if (editText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("passwordInput");
                editText2 = null;
            }
            editText2.setInputType(145);
            ImageView imageView = this$0.passwordToggle;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("passwordToggle");
                imageView = null;
            }
            imageView.setImageResource(R.drawable.ic_eye_off);
        } else {
            EditText editText3 = this$0.passwordInput;
            if (editText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("passwordInput");
                editText3 = null;
            }
            editText3.setInputType(129);
            ImageView imageView2 = this$0.passwordToggle;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("passwordToggle");
                imageView2 = null;
            }
            imageView2.setImageResource(R.drawable.ic_eye);
        }
        EditText editText4 = this$0.passwordInput;
        if (editText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("passwordInput");
            editText4 = null;
        }
        EditText editText5 = this$0.passwordInput;
        if (editText5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("passwordInput");
        } else {
            editText = editText5;
        }
        editText4.setSelection(editText.getText().length());
    }

    private final void setupLinkAccountButton() {
        Button button = this.linkAccountButton;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linkAccountButton");
            button = null;
        }
        button.setOnClickListener(new MetatraderFragment$$ExternalSyntheticLambda0(this));
    }

    /* access modifiers changed from: private */
    public static final void setupLinkAccountButton$lambda$18(MetatraderFragment this$0, View it) {
        EditText editText = this$0.loginInput;
        EditText editText2 = null;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginInput");
            editText = null;
        }
        String login = StringsKt.trim((CharSequence) editText.getText().toString()).toString();
        EditText editText3 = this$0.passwordInput;
        if (editText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("passwordInput");
            editText3 = null;
        }
        String password = StringsKt.trim((CharSequence) editText3.getText().toString()).toString();
        EditText editText4 = this$0.serverInput;
        if (editText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serverInput");
        } else {
            editText2 = editText4;
        }
        String server = StringsKt.trim((CharSequence) editText2.getText().toString()).toString();
        if (!(login.length() == 0)) {
            if (!(password.length() == 0)) {
                if (!(server.length() == 0)) {
                    SharedPreferences sharedPref = this$0.requireActivity().getSharedPreferences("app_prefs", 0);
                    boolean hasLicense = sharedPref.getBoolean("license_validated", false);
                    long expiryTime = sharedPref.getLong("license_expiry_date", 0);
                    if (!hasLicense || expiryTime <= System.currentTimeMillis()) {
                        Toast.makeText(this$0.getContext(), "Please activate a valid license first", 1).show();
                        try {
                            FragmentKt.findNavController(this$0).navigate(R.id.licenseKeyFragment);
                            return;
                        } catch (Exception e) {
                            return;
                        }
                    } else {
                        this$0.connectToServerWithSettings(login, password, server);
                        return;
                    }
                }
            }
        }
        Toast.makeText(this$0.getContext(), "Please fill all fields", 0).show();
    }

    private final String getDeviceId() {
        String string = Settings.Secure.getString(requireContext().getContentResolver(), "android_id");
        if (string == null) {
            return "unknown_device";
        }
        return string;
    }

    private final void registerForCopyTradingWithSettings(String sessionId, String login) {
        new Thread(new MetatraderFragment$$ExternalSyntheticLambda23(this, login, sessionId)).start();
    }

    /* access modifiers changed from: private */
    public static final void registerForCopyTradingWithSettings$lambda$24(MetatraderFragment this$0, String $login, String $sessionId) {
        MetatraderFragment metatraderFragment = this$0;
        String licenseKey = "";
        try {
            Thread.sleep(1000);
            SharedPreferences sharedPref = metatraderFragment.requireActivity().getSharedPreferences("app_prefs", 0);
            float lotSize = sharedPref.getFloat("lot_size", 0.01f);
            Set<String> symbols = sharedPref.getStringSet("selected_symbols", SetsKt.emptySet());
            if (symbols == null) {
                symbols = SetsKt.emptySet();
            }
            String string = sharedPref.getString("license_key", licenseKey);
            if (string != null) {
                licenseKey = string;
            }
            String studentName = sharedPref.getString("student_name", "Student_" + $login);
            URL url = new URL("http://77.93.152.165:5000/register_copy_client");
            URLConnection openConnection = url.openConnection();
            Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection connection = (HttpURLConnection) openConnection;
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("User-Agent", "SNIPER-EA-APP/1.0");
            connection.setDoOutput(true);
            connection.setConnectTimeout(10000);
            connection.setReadTimeout(10000);
            JSONArray symbolsArray = new JSONArray();
            for (String put : symbols) {
                symbolsArray.put(put);
                sharedPref = sharedPref;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            JSONObject jsonData = jSONObject;
            try {
                jSONObject2.put("session_id", $sessionId);
                jSONObject2.put("student_name", studentName);
                URL url2 = url;
                jSONObject2.put("lot_size", (double) lotSize);
                jSONObject2.put("symbols", symbolsArray);
                jSONObject2.put("license_key", licenseKey);
                System.out.println("REGISTERING FOR COPY TRADING WITH SETTINGS: " + studentName);
                OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
                writer.write(jsonData.toString());
                writer.flush();
                writer.close();
                int responseCode = connection.getResponseCode();
                if (responseCode == 200) {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    String response = TextStreamsKt.readText(reader);
                    reader.close();
                    System.out.println("COPY TRADING REGISTRATION RESPONSE: " + response);
                    metatraderFragment.requireActivity().runOnUiThread(new MetatraderFragment$$ExternalSyntheticLambda8(metatraderFragment, lotSize));
                    return;
                }
                System.out.println("COPY TRADING REGISTRATION FAILED: Code " + responseCode);
                metatraderFragment.requireActivity().runOnUiThread(new MetatraderFragment$$ExternalSyntheticLambda9(metatraderFragment));
            } catch (Exception e) {
                e = e;
                System.out.println("COPY TRADING REGISTRATION ERROR: " + e.getMessage());
                e.printStackTrace();
                metatraderFragment.requireActivity().runOnUiThread(new MetatraderFragment$$ExternalSyntheticLambda10(metatraderFragment));
            }
        } catch (Exception e2) {
            e = e2;
            String str = $sessionId;
            System.out.println("COPY TRADING REGISTRATION ERROR: " + e.getMessage());
            e.printStackTrace();
            metatraderFragment.requireActivity().runOnUiThread(new MetatraderFragment$$ExternalSyntheticLambda10(metatraderFragment));
        }
    }

    /* access modifiers changed from: private */
    public static final void registerForCopyTradingWithSettings$lambda$24$lambda$21(MetatraderFragment this$0, float $lotSize) {
        Context context = this$0.getContext();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf($lotSize)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        Toast.makeText(context, "✅ Copy trading active with YOUR lot: " + format, 1).show();
        TextView textView = this$0.statusTextView;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
            textView = null;
        }
        textView.setText("Connected! Your settings active ✅");
        TextView textView3 = this$0.statusTextView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
        } else {
            textView2 = textView3;
        }
        textView2.setTextColor(-16711936);
    }

    /* access modifiers changed from: private */
    public static final void registerForCopyTradingWithSettings$lambda$24$lambda$22(MetatraderFragment this$0) {
        Toast.makeText(this$0.getContext(), "⚠️ Copy trading registration failed", 1).show();
    }

    /* access modifiers changed from: private */
    public static final void registerForCopyTradingWithSettings$lambda$24$lambda$23(MetatraderFragment this$0) {
        Toast.makeText(this$0.getContext(), "Warning: Copy trading setup failed", 0).show();
    }

    private final void connectToServerWithSettings(String login, String password, String server) {
        TextView textView = this.statusTextView;
        Button button = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
            textView = null;
        }
        textView.setText("Connecting to " + this.selectedPlatform + " with your settings...");
        TextView textView2 = this.statusTextView;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
            textView2 = null;
        }
        textView2.setVisibility(0);
        Button button2 = this.linkAccountButton;
        if (button2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linkAccountButton");
        } else {
            button = button2;
        }
        button.setEnabled(false);
        new Thread(new MetatraderFragment$$ExternalSyntheticLambda14(this, login, password, server)).start();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0212, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0214, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0218, code lost:
        r2 = "No error details available";
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:30:0x01b7, B:37:0x01f4] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x018f A[Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x01d4 A[Catch:{ JSONException -> 0x0214, SocketTimeoutException -> 0x0212, Exception -> 0x0241 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0212 A[ExcHandler: SocketTimeoutException (e java.net.SocketTimeoutException), PHI: r1 
      PHI: (r1v23 com.example.snipereambatha.fragments.MetatraderFragment) = (r1v24 com.example.snipereambatha.fragments.MetatraderFragment), (r1v24 com.example.snipereambatha.fragments.MetatraderFragment), (r1v24 com.example.snipereambatha.fragments.MetatraderFragment), (r1v31 com.example.snipereambatha.fragments.MetatraderFragment) binds: [B:37:0x01f4, B:46:0x021b, B:47:?, B:30:0x01b7] A[DONT_GENERATE, DONT_INLINE], Splitter:B:30:0x01b7] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0214 A[ExcHandler: JSONException (e org.json.JSONException), PHI: r1 
      PHI: (r1v22 com.example.snipereambatha.fragments.MetatraderFragment) = (r1v24 com.example.snipereambatha.fragments.MetatraderFragment), (r1v24 com.example.snipereambatha.fragments.MetatraderFragment), (r1v24 com.example.snipereambatha.fragments.MetatraderFragment), (r1v31 com.example.snipereambatha.fragments.MetatraderFragment) binds: [B:37:0x01f4, B:46:0x021b, B:47:?, B:30:0x01b7] A[DONT_GENERATE, DONT_INLINE], Splitter:B:30:0x01b7] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void connectToServerWithSettings$lambda$33(com.example.snipereambatha.fragments.MetatraderFragment r22, java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            r5 = r23
            java.lang.String r0 = "success"
            java.lang.String r1 = "Student_"
            java.lang.String r2 = ""
            java.lang.String r3 = "license_key"
            java.lang.String r4 = "lot_size"
            androidx.fragment.app.FragmentActivity r6 = r22.requireActivity()     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.String r7 = "app_prefs"
            r8 = 0
            android.content.SharedPreferences r6 = r6.getSharedPreferences(r7, r8)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r9 = r6
            r6 = 1008981770(0x3c23d70a, float:0.01)
            float r6 = r9.getFloat(r4, r6)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.String r7 = "selected_symbols"
            java.util.Set r10 = kotlin.collections.SetsKt.emptySet()     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.util.Set r7 = r9.getStringSet(r7, r10)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            if (r7 != 0) goto L_0x002f
            java.util.Set r7 = kotlin.collections.SetsKt.emptySet()     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
        L_0x002f:
            r10 = r7
            java.lang.String r7 = r9.getString(r3, r2)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            if (r7 != 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r2 = r7
        L_0x0038:
            r11 = r2
            java.lang.String r2 = r22.getDeviceId()     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r12 = r2
            java.lang.String r2 = "student_name"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r7.<init>()     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.StringBuilder r7 = r7.append(r1)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.StringBuilder r7 = r7.append(r5)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.String r7 = r7.toString()     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.String r2 = r9.getString(r2, r7)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            if (r2 != 0) goto L_0x0068
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r2.<init>()     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.StringBuilder r1 = r1.append(r5)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.String r2 = r1.toString()     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
        L_0x0068:
            java.net.URL r1 = new java.net.URL     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.String r7 = "http://77.93.152.165:5000/login"
            r1.<init>(r7)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r13 = r1
            java.net.URLConnection r1 = r13.openConnection()     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.String r7 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r7)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r14 = r1
            java.lang.String r1 = "POST"
            r14.setRequestMethod(r1)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.String r1 = "Content-Type"
            java.lang.String r7 = "application/json"
            r14.setRequestProperty(r1, r7)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.String r1 = "User-Agent"
            java.lang.String r7 = "SNIPER-EA-APP/1.0"
            r14.setRequestProperty(r1, r7)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r1 = 1
            r14.setDoOutput(r1)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r7 = 10000(0x2710, float:1.4013E-41)
            r14.setConnectTimeout(r7)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r14.setReadTimeout(r7)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r7.<init>()     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r15 = r7
            r7 = r10
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r16 = 0
            java.util.Iterator r17 = r7.iterator()     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
        L_0x00aa:
            boolean r18 = r17.hasNext()     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            if (r18 == 0) goto L_0x00c4
            java.lang.Object r18 = r17.next()     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r19 = r18
            java.lang.String r19 = (java.lang.String) r19     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r20 = r19
            r19 = 0
            r1 = r20
            r15.put(r1)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r1 = 1
            goto L_0x00aa
        L_0x00c4:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r1.<init>()     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r7 = r1
            r16 = 0
            java.lang.String r8 = "login"
            r7.put(r8, r5)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.String r8 = "password"
            r18 = r1
            r1 = r24
            r7.put(r8, r1)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.String r8 = "server"
            r1 = r25
            r7.put(r8, r1)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r8 = r2
            double r1 = (double) r6     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r7.put(r4, r1)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.String r1 = "symbols"
            r7.put(r1, r15)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r7.put(r3, r11)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.String r1 = "device_id"
            r7.put(r1, r12)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r1 = r18
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r2.<init>()     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.String r3 = "Sending JSON with student settings: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.StringBuilder r2 = r2.append(r1)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.String r2 = r2.toString()     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.io.PrintStream r3 = java.lang.System.out     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r3.println(r2)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.io.OutputStream r3 = r14.getOutputStream()     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r2.<init>(r3)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.String r3 = r1.toString()     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r2.write(r3)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r2.flush()     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r2.close()     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            int r3 = r14.getResponseCode()     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r4.<init>()     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.String r7 = "Response Code: "
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.StringBuilder r4 = r4.append(r3)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.String r4 = r4.toString()     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.io.PrintStream r7 = java.lang.System.out     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r7.println(r4)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 != r4) goto L_0x01e8
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r16 = r1
            java.io.InputStream r1 = r14.getInputStream()     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r7.<init>(r1)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.io.Reader r7 = (java.io.Reader) r7     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r4.<init>(r7)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r18 = r4
            r1 = r18
            java.io.Reader r1 = (java.io.Reader) r1     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.String r1 = kotlin.io.TextStreamsKt.readText(r1)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r18.close()     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r4.<init>()     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.String r7 = "Server Response: "
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.StringBuilder r4 = r4.append(r1)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.lang.String r4 = r4.toString()     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            java.io.PrintStream r7 = java.lang.System.out     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r7.println(r4)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r4 = r1
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            if (r4 == 0) goto L_0x018b
            int r4 = r4.length()     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            if (r4 != 0) goto L_0x0188
            goto L_0x018b
        L_0x0188:
            r17 = 0
            goto L_0x018d
        L_0x018b:
            r17 = 1
        L_0x018d:
            if (r17 != 0) goto L_0x01d4
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r4.<init>(r1)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            boolean r7 = r4.has(r0)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            if (r7 == 0) goto L_0x01bf
            boolean r0 = r4.getBoolean(r0)     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            androidx.fragment.app.FragmentActivity r7 = r22.requireActivity()     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r17 = r2
            r2 = r0
            com.example.snipereambatha.fragments.MetatraderFragment$$ExternalSyntheticLambda3 r0 = new com.example.snipereambatha.fragments.MetatraderFragment$$ExternalSyntheticLambda3     // Catch:{ JSONException -> 0x029e, SocketTimeoutException -> 0x0272, Exception -> 0x0243 }
            r20 = r1
            r19 = r9
            r21 = r10
            r1 = r22
            r9 = r3
            r3 = r4
            r4 = r6
            r10 = r7
            r6 = r24
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ JSONException -> 0x0214, SocketTimeoutException -> 0x0212, Exception -> 0x0241 }
            r10.runOnUiThread(r0)     // Catch:{ JSONException -> 0x0214, SocketTimeoutException -> 0x0212, Exception -> 0x0241 }
            goto L_0x02cc
        L_0x01bf:
            r20 = r1
            r17 = r2
            r19 = r9
            r21 = r10
            r1 = r22
            r9 = r3
            r3 = r4
            r4 = r6
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ JSONException -> 0x0214, SocketTimeoutException -> 0x0212, Exception -> 0x0241 }
            java.lang.String r2 = "Invalid response format - missing 'success' field"
            r0.<init>(r2)     // Catch:{ JSONException -> 0x0214, SocketTimeoutException -> 0x0212, Exception -> 0x0241 }
            throw r0     // Catch:{ JSONException -> 0x0214, SocketTimeoutException -> 0x0212, Exception -> 0x0241 }
        L_0x01d4:
            r20 = r1
            r17 = r2
            r4 = r6
            r19 = r9
            r21 = r10
            r1 = r22
            r9 = r3
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ JSONException -> 0x0214, SocketTimeoutException -> 0x0212, Exception -> 0x0241 }
            java.lang.String r2 = "Empty response from server"
            r0.<init>(r2)     // Catch:{ JSONException -> 0x0214, SocketTimeoutException -> 0x0212, Exception -> 0x0241 }
            throw r0     // Catch:{ JSONException -> 0x0214, SocketTimeoutException -> 0x0212, Exception -> 0x0241 }
        L_0x01e8:
            r16 = r1
            r17 = r2
            r4 = r6
            r19 = r9
            r21 = r10
            r1 = r22
            r9 = r3
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0217, JSONException -> 0x0214, SocketTimeoutException -> 0x0212 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0217, JSONException -> 0x0214, SocketTimeoutException -> 0x0212 }
            java.io.InputStream r3 = r14.getErrorStream()     // Catch:{ Exception -> 0x0217, JSONException -> 0x0214, SocketTimeoutException -> 0x0212 }
            if (r3 != 0) goto L_0x0202
            java.io.InputStream r3 = r14.getInputStream()     // Catch:{ Exception -> 0x0217, JSONException -> 0x0214, SocketTimeoutException -> 0x0212 }
        L_0x0202:
            r2.<init>(r3)     // Catch:{ Exception -> 0x0217, JSONException -> 0x0214, SocketTimeoutException -> 0x0212 }
            java.io.Reader r2 = (java.io.Reader) r2     // Catch:{ Exception -> 0x0217, JSONException -> 0x0214, SocketTimeoutException -> 0x0212 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0217, JSONException -> 0x0214, SocketTimeoutException -> 0x0212 }
            r2 = r0
            java.io.Reader r2 = (java.io.Reader) r2     // Catch:{ Exception -> 0x0217, JSONException -> 0x0214, SocketTimeoutException -> 0x0212 }
            java.lang.String r2 = kotlin.io.TextStreamsKt.readText(r2)     // Catch:{ Exception -> 0x0217, JSONException -> 0x0214, SocketTimeoutException -> 0x0212 }
            goto L_0x021a
        L_0x0212:
            r0 = move-exception
            goto L_0x0275
        L_0x0214:
            r0 = move-exception
            goto L_0x02a1
        L_0x0217:
            r0 = move-exception
            java.lang.String r2 = "No error details available"
        L_0x021a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0214, SocketTimeoutException -> 0x0212, Exception -> 0x0241 }
            r0.<init>()     // Catch:{ JSONException -> 0x0214, SocketTimeoutException -> 0x0212, Exception -> 0x0241 }
            java.lang.String r3 = "Error Response: "
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch:{ JSONException -> 0x0214, SocketTimeoutException -> 0x0212, Exception -> 0x0241 }
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch:{ JSONException -> 0x0214, SocketTimeoutException -> 0x0212, Exception -> 0x0241 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0214, SocketTimeoutException -> 0x0212, Exception -> 0x0241 }
            java.io.PrintStream r3 = java.lang.System.out     // Catch:{ JSONException -> 0x0214, SocketTimeoutException -> 0x0212, Exception -> 0x0241 }
            r3.println(r0)     // Catch:{ JSONException -> 0x0214, SocketTimeoutException -> 0x0212, Exception -> 0x0241 }
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()     // Catch:{ JSONException -> 0x0214, SocketTimeoutException -> 0x0212, Exception -> 0x0241 }
            com.example.snipereambatha.fragments.MetatraderFragment$$ExternalSyntheticLambda4 r3 = new com.example.snipereambatha.fragments.MetatraderFragment$$ExternalSyntheticLambda4     // Catch:{ JSONException -> 0x0214, SocketTimeoutException -> 0x0212, Exception -> 0x0241 }
            r3.<init>(r1, r2, r9)     // Catch:{ JSONException -> 0x0214, SocketTimeoutException -> 0x0212, Exception -> 0x0241 }
            r0.runOnUiThread(r3)     // Catch:{ JSONException -> 0x0214, SocketTimeoutException -> 0x0212, Exception -> 0x0241 }
            goto L_0x02cc
        L_0x0241:
            r0 = move-exception
            goto L_0x0246
        L_0x0243:
            r0 = move-exception
            r1 = r22
        L_0x0246:
            java.lang.String r2 = r0.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "General Error: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            java.io.PrintStream r3 = java.lang.System.out
            r3.println(r2)
            r0.printStackTrace()
            androidx.fragment.app.FragmentActivity r2 = r1.requireActivity()
            com.example.snipereambatha.fragments.MetatraderFragment$$ExternalSyntheticLambda7 r3 = new com.example.snipereambatha.fragments.MetatraderFragment$$ExternalSyntheticLambda7
            r3.<init>(r1, r0)
            r2.runOnUiThread(r3)
            goto L_0x02cc
        L_0x0272:
            r0 = move-exception
            r1 = r22
        L_0x0275:
            java.lang.String r2 = r0.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Timeout Error: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            java.io.PrintStream r3 = java.lang.System.out
            r3.println(r2)
            androidx.fragment.app.FragmentActivity r2 = r1.requireActivity()
            com.example.snipereambatha.fragments.MetatraderFragment$$ExternalSyntheticLambda6 r3 = new com.example.snipereambatha.fragments.MetatraderFragment$$ExternalSyntheticLambda6
            r3.<init>(r1)
            r2.runOnUiThread(r3)
            goto L_0x02cc
        L_0x029e:
            r0 = move-exception
            r1 = r22
        L_0x02a1:
            java.lang.String r2 = r0.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "JSON Error: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            java.io.PrintStream r3 = java.lang.System.out
            r3.println(r2)
            r0.printStackTrace()
            androidx.fragment.app.FragmentActivity r2 = r1.requireActivity()
            com.example.snipereambatha.fragments.MetatraderFragment$$ExternalSyntheticLambda5 r3 = new com.example.snipereambatha.fragments.MetatraderFragment$$ExternalSyntheticLambda5
            r3.<init>(r1, r0)
            r2.runOnUiThread(r3)
        L_0x02cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.snipereambatha.fragments.MetatraderFragment.connectToServerWithSettings$lambda$33(com.example.snipereambatha.fragments.MetatraderFragment, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    public static final void connectToServerWithSettings$lambda$33$lambda$28(MetatraderFragment this$0, boolean $success, JSONObject $jsonResponse, float $lotSize, String $login, String $password, String $server, String $studentName) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        String str;
        double d;
        TextView textView6;
        MetatraderFragment metatraderFragment = this$0;
        JSONObject jSONObject = $jsonResponse;
        float f = $lotSize;
        String str2 = $login;
        Button button = metatraderFragment.linkAccountButton;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linkAccountButton");
            button = null;
        }
        button.setEnabled(true);
        if ($success) {
            if (!jSONObject.has("session_id")) {
                String str3 = $studentName;
            } else if (!jSONObject.has("account")) {
                String str4 = $studentName;
            } else {
                String str5 = "session_id";
                String sessionId = jSONObject.getString(str5);
                String str6 = "account";
                JSONObject accountInfo = jSONObject.getJSONObject(str6);
                JSONObject studentSettings = jSONObject.optJSONObject("student_settings");
                if (studentSettings != null) {
                    str = "%.2f";
                    d = studentSettings.optDouble("lot_size", (double) f);
                } else {
                    str = "%.2f";
                    d = (double) f;
                }
                double actualLotSize = d;
                for (String field : CollectionsKt.listOf("balance", "equity", "currency", "leverage")) {
                    if (!accountInfo.has(field)) {
                        TextView textView7 = metatraderFragment.statusTextView;
                        if (textView7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
                            textView7 = null;
                        }
                        textView7.setText("Error: Missing account field - " + field);
                        TextView textView8 = metatraderFragment.statusTextView;
                        if (textView8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
                            textView6 = null;
                        } else {
                            textView6 = textView8;
                        }
                        textView6.setTextColor(SupportMenu.CATEGORY_MASK);
                        return;
                    }
                }
                String accountKey = "direct_" + metatraderFragment.selectedPlatform + "_" + str2;
                metatraderFragment.connectedSessions.put(accountKey, sessionId);
                Intrinsics.checkNotNull(sessionId);
                Intrinsics.checkNotNull(accountInfo);
                String str7 = str;
                metatraderFragment.saveAccountSession(str2, $password, $server, sessionId, accountInfo);
                double balance = accountInfo.getDouble("balance");
                if (balance < 10.0d) {
                    TextView textView9 = metatraderFragment.statusTextView;
                    if (textView9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
                        textView9 = null;
                    }
                    String str8 = accountKey;
                    String format = String.format(str7, Arrays.copyOf(new Object[]{Double.valueOf(balance)}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    textView9.setText("⚠️ Low balance: $" + format + " (Min: $10)");
                    TextView textView10 = metatraderFragment.statusTextView;
                    if (textView10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
                        textView10 = null;
                    }
                    textView10.setTextColor(InputDeviceCompat.SOURCE_ANY);
                    String str9 = $studentName;
                    double d2 = balance;
                } else {
                    String accountKey2 = str7;
                    TextView textView11 = metatraderFragment.statusTextView;
                    if (textView11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
                        textView11 = null;
                    }
                    double d3 = balance;
                    String format2 = String.format(accountKey2, Arrays.copyOf(new Object[]{Double.valueOf(balance)}, 1));
                    Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                    String format3 = String.format(accountKey2, Arrays.copyOf(new Object[]{Double.valueOf(actualLotSize)}, 1));
                    Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
                    textView11.setText("✅ " + $studentName + " | Bal: $" + format2 + " | Your lot: " + format3);
                    TextView textView12 = metatraderFragment.statusTextView;
                    if (textView12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
                        textView12 = null;
                    }
                    textView12.setTextColor(-16711936);
                }
                metatraderFragment.updateStatusDots();
                metatraderFragment.updateStudentSettings(str2);
                metatraderFragment.registerForCopyTradingWithSettings(sessionId, str2);
                Intent intent = new Intent(metatraderFragment.requireContext(), MultiBrokerService.class);
                Intent intent2 = intent;
                intent2.setAction("MAINTAIN_CONNECTION");
                intent2.putExtra("broker_id", "direct");
                intent2.putExtra("broker_name", "Direct Connection");
                intent2.putExtra("platform", metatraderFragment.selectedPlatform);
                intent2.putExtra(str6, str2);
                intent2.putExtra(str5, sessionId);
                intent2.putExtra("bridge_url", "http://77.93.152.165:5000");
                metatraderFragment.requireActivity().startService(intent);
                return;
            }
            TextView textView13 = metatraderFragment.statusTextView;
            if (textView13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
                textView13 = null;
            }
            textView13.setText("Error: Invalid success response format");
            TextView textView14 = metatraderFragment.statusTextView;
            if (textView14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
                textView5 = null;
            } else {
                textView5 = textView14;
            }
            textView5.setTextColor(SupportMenu.CATEGORY_MASK);
            return;
        }
        String str10 = "%.2f";
        String error = jSONObject.optString("error", "Login failed - no error message");
        double balance2 = jSONObject.optDouble("balance", 0.0d);
        double minRequired = jSONObject.optDouble("minimum_required", 10.0d);
        Intrinsics.checkNotNull(error);
        if (StringsKt.contains((CharSequence) error, (CharSequence) "license", true) || StringsKt.contains((CharSequence) error, (CharSequence) "Invalid or expired", true)) {
            TextView textView15 = metatraderFragment.statusTextView;
            if (textView15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
                textView15 = null;
            }
            textView15.setText("License validation failed");
            TextView textView16 = metatraderFragment.statusTextView;
            if (textView16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
                textView = null;
            } else {
                textView = textView16;
            }
            textView.setTextColor(InputDeviceCompat.SOURCE_ANY);
            Toast.makeText(metatraderFragment.getContext(), "License invalid or expired. Please check your license", 1).show();
            try {
                FragmentKt.findNavController(metatraderFragment).navigate(R.id.licenseKeyFragment);
            } catch (Exception e) {
            }
        } else if (StringsKt.contains((CharSequence) error, (CharSequence) "balance", true) || StringsKt.contains((CharSequence) error, (CharSequence) "below minimum", true)) {
            TextView textView17 = metatraderFragment.statusTextView;
            if (textView17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
                textView17 = null;
            }
            String format4 = String.format(str10, Arrays.copyOf(new Object[]{Double.valueOf(balance2)}, 1));
            Intrinsics.checkNotNullExpressionValue(format4, "format(...)");
            String format5 = String.format(str10, Arrays.copyOf(new Object[]{Double.valueOf(minRequired)}, 1));
            Intrinsics.checkNotNullExpressionValue(format5, "format(...)");
            textView17.setText("Balance too low: $" + format4 + " (Min: $" + format5 + ")");
            TextView textView18 = metatraderFragment.statusTextView;
            if (textView18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
                textView2 = null;
            } else {
                textView2 = textView18;
            }
            textView2.setTextColor(InputDeviceCompat.SOURCE_ANY);
            Toast.makeText(metatraderFragment.getContext(), "Account balance below minimum requirement", 1).show();
        } else if (StringsKt.contains((CharSequence) error, (CharSequence) "credentials", true) || StringsKt.contains((CharSequence) error, (CharSequence) "Login failed", true)) {
            TextView textView19 = metatraderFragment.statusTextView;
            if (textView19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
                textView19 = null;
            }
            textView19.setText("Invalid login credentials");
            TextView textView20 = metatraderFragment.statusTextView;
            if (textView20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
                textView3 = null;
            } else {
                textView3 = textView20;
            }
            textView3.setTextColor(SupportMenu.CATEGORY_MASK);
            Toast.makeText(metatraderFragment.getContext(), "Please check your login details", 1).show();
        } else {
            TextView textView21 = metatraderFragment.statusTextView;
            if (textView21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
                textView21 = null;
            }
            textView21.setText("Error: " + error);
            TextView textView22 = metatraderFragment.statusTextView;
            if (textView22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
                textView4 = null;
            } else {
                textView4 = textView22;
            }
            textView4.setTextColor(SupportMenu.CATEGORY_MASK);
        }
    }

    /* access modifiers changed from: private */
    public static final void connectToServerWithSettings$lambda$33$lambda$29(MetatraderFragment this$0, String $errorResponse, int $responseCode) {
        Button button = this$0.linkAccountButton;
        TextView textView = null;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linkAccountButton");
            button = null;
        }
        button.setEnabled(true);
        try {
            JSONObject errorJson = new JSONObject($errorResponse);
            String errorMessage = errorJson.optString("message", errorJson.optString("error", "Connection failed"));
            TextView textView2 = this$0.statusTextView;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
                textView2 = null;
            }
            textView2.setText(errorMessage);
        } catch (Exception e) {
            TextView textView3 = this$0.statusTextView;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
                textView3 = null;
            }
            textView3.setText("Connection failed (Code: " + $responseCode + ")");
        }
        TextView textView4 = this$0.statusTextView;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
        } else {
            textView = textView4;
        }
        textView.setTextColor(SupportMenu.CATEGORY_MASK);
    }

    /* access modifiers changed from: private */
    public static final void connectToServerWithSettings$lambda$33$lambda$30(MetatraderFragment this$0, JSONException $e) {
        Button button = this$0.linkAccountButton;
        TextView textView = null;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linkAccountButton");
            button = null;
        }
        button.setEnabled(true);
        TextView textView2 = this$0.statusTextView;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
            textView2 = null;
        }
        textView2.setText("JSON parsing error: " + $e.getMessage());
        TextView textView3 = this$0.statusTextView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
        } else {
            textView = textView3;
        }
        textView.setTextColor(SupportMenu.CATEGORY_MASK);
        Toast.makeText(this$0.getContext(), "Server returned invalid data format", 1).show();
    }

    /* access modifiers changed from: private */
    public static final void connectToServerWithSettings$lambda$33$lambda$31(MetatraderFragment this$0) {
        Button button = this$0.linkAccountButton;
        TextView textView = null;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linkAccountButton");
            button = null;
        }
        button.setEnabled(true);
        TextView textView2 = this$0.statusTextView;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
            textView2 = null;
        }
        textView2.setText("Connection timeout");
        TextView textView3 = this$0.statusTextView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
        } else {
            textView = textView3;
        }
        textView.setTextColor(SupportMenu.CATEGORY_MASK);
        Toast.makeText(this$0.getContext(), "Server is taking too long to respond", 1).show();
    }

    /* access modifiers changed from: private */
    public static final void connectToServerWithSettings$lambda$33$lambda$32(MetatraderFragment this$0, Exception $e) {
        Button button = this$0.linkAccountButton;
        TextView textView = null;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linkAccountButton");
            button = null;
        }
        button.setEnabled(true);
        TextView textView2 = this$0.statusTextView;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
            textView2 = null;
        }
        textView2.setText("Error: " + $e.getMessage());
        TextView textView3 = this$0.statusTextView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusTextView");
        } else {
            textView = textView3;
        }
        textView.setTextColor(SupportMenu.CATEGORY_MASK);
        Toast.makeText(this$0.getContext(), "Connection error: " + $e.getMessage(), 1).show();
    }

    private final void saveAccountSession(String login, String password, String server, String sessionId, JSONObject accountInfo) {
        SharedPreferences sharedPref = requireActivity().getSharedPreferences("app_prefs", 0);
        String accountKey = "direct_" + this.selectedPlatform + "_" + login;
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.putString(accountKey + "_broker", "Direct Connection");
        edit.putString(accountKey + "_login", login);
        edit.putString(accountKey + "_password", password);
        edit.putString(accountKey + "_server", server);
        edit.putString(accountKey + "_platform", this.selectedPlatform);
        edit.putString(accountKey + "_session_id", sessionId);
        edit.putLong(accountKey + "_timestamp", System.currentTimeMillis());
        edit.putFloat(accountKey + "_balance", (float) accountInfo.getDouble("balance"));
        edit.putFloat(accountKey + "_equity", (float) accountInfo.getDouble("equity"));
        edit.putString(accountKey + "_currency", accountInfo.getString("currency"));
        edit.putInt(accountKey + "_leverage", accountInfo.getInt("leverage"));
        Set stringSet = sharedPref.getStringSet("linked_accounts", new LinkedHashSet());
        if (stringSet == null) {
            stringSet = new LinkedHashSet();
        }
        stringSet.add(accountKey);
        edit.putStringSet("linked_accounts", stringSet);
        edit.apply();
        EditText editText = this.loginInput;
        EditText editText2 = null;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginInput");
            editText = null;
        }
        editText.getText().clear();
        EditText editText3 = this.passwordInput;
        if (editText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("passwordInput");
            editText3 = null;
        }
        editText3.getText().clear();
        EditText editText4 = this.serverInput;
        if (editText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serverInput");
        } else {
            editText2 = editText4;
        }
        editText2.getText().clear();
        loadConnectedAccounts();
        float lotSize = sharedPref.getFloat("lot_size", 0.01f);
        String studentName = sharedPref.getString("student_name", "Student");
        Context context = getContext();
        String str = this.selectedPlatform;
        String format = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(lotSize)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        Toast.makeText(context, str + " linked! " + studentName + " using lot: " + format, 1).show();
    }

    private final void loadConnectedAccounts() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2 = this.connectedAccountsLayout;
        if (linearLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectedAccountsLayout");
            linearLayout2 = null;
        }
        linearLayout2.removeAllViews();
        SharedPreferences sharedPref = requireActivity().getSharedPreferences("app_prefs", 0);
        Set stringSet = sharedPref.getStringSet("linked_accounts", SetsKt.emptySet());
        if (stringSet == null) {
            stringSet = SetsKt.emptySet();
        }
        Set<String> accounts = stringSet;
        float userLotSize = sharedPref.getFloat("lot_size", 0.01f);
        String studentName = sharedPref.getString("student_name", "Student");
        if (accounts.isEmpty()) {
            TextView noAccountsText = new TextView(getContext());
            TextView textView = noAccountsText;
            textView.setText("No linked accounts");
            textView.setTextColor(-1);
            textView.setPadding(0, 16, 0, 16);
            LinearLayout linearLayout3 = this.connectedAccountsLayout;
            if (linearLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("connectedAccountsLayout");
                linearLayout = null;
            } else {
                linearLayout = linearLayout3;
            }
            linearLayout.addView(noAccountsText);
            return;
        }
        for (String str : accounts) {
            String string = sharedPref.getString(str + "_broker", "");
            String string2 = sharedPref.getString(str + "_login", "");
            String string3 = sharedPref.getString(str + "_platform", "");
            String string4 = sharedPref.getString(str + "_session_id", "");
            Intrinsics.checkNotNull(str);
            String str2 = string2;
            String str3 = string3;
            String str4 = string4;
            View createAccountView = createAccountView(str, string, str2, str3, str4, userLotSize, studentName);
            String str5 = str;
            LinearLayout linearLayout4 = this.connectedAccountsLayout;
            if (linearLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("connectedAccountsLayout");
                linearLayout4 = null;
            }
            linearLayout4.addView(createAccountView);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x035c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.view.View createAccountView(java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, float r36, java.lang.String r37) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            android.content.Context r3 = r0.getContext()
            r2.<init>(r3)
            r3 = r2
            r4 = 0
            r5 = 1
            r3.setOrientation(r5)
            r6 = 16
            r7 = 8
            r3.setPadding(r6, r7, r6, r7)
            java.lang.String r8 = "#33FFFFFF"
            int r8 = android.graphics.Color.parseColor(r8)
            r3.setBackgroundColor(r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r9 = -1
            r10 = -2
            r8.<init>(r9, r10)
            r11 = 0
            r8.setMargins(r11, r7, r11, r7)
            r12 = r8
            android.view.ViewGroup$LayoutParams r12 = (android.view.ViewGroup.LayoutParams) r12
            r3.setLayoutParams(r12)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            android.content.Context r4 = r0.getContext()
            r3.<init>(r4)
            r4 = r3
            r8 = 0
            r4.setOrientation(r11)
            android.view.View r4 = new android.view.View
            android.content.Context r8 = r0.getContext()
            r4.<init>(r8)
            r8 = r4
            r12 = 0
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r13.<init>(r6, r6)
            r6 = r13
            r14 = 0
            r15 = 4
            r6.setMargins(r11, r15, r7, r11)
            android.view.ViewGroup$LayoutParams r13 = (android.view.ViewGroup.LayoutParams) r13
            r8.setLayoutParams(r13)
            java.util.Map<java.lang.String, java.lang.String> r6 = r0.connectedSessions
            boolean r6 = r6.containsKey(r1)
            if (r6 == 0) goto L_0x0086
            java.util.Map<java.lang.String, java.lang.String> r6 = r0.connectedSessions
            java.lang.Object r6 = r6.get(r1)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x0081
            int r6 = r6.length()
            if (r6 != 0) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            r6 = 0
            goto L_0x0082
        L_0x0081:
            r6 = 1
        L_0x0082:
            if (r6 != 0) goto L_0x0086
            r6 = 1
            goto L_0x0087
        L_0x0086:
            r6 = 0
        L_0x0087:
            java.lang.String r7 = "#FFA500"
            if (r6 != 0) goto L_0x008f
            r13 = -65536(0xffffffffffff0000, float:NaN)
            goto L_0x009b
        L_0x008f:
            boolean r13 = r0.isBridgeConnected
            if (r13 != 0) goto L_0x0098
            int r13 = android.graphics.Color.parseColor(r7)
            goto L_0x009b
        L_0x0098:
            r13 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
        L_0x009b:
            r0.setDotColor(r4, r13)
            android.widget.TextView r14 = new android.widget.TextView
            android.content.Context r8 = r0.getContext()
            r14.<init>(r8)
            r8 = r14
            r17 = 0
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r5 = r34
            java.lang.StringBuilder r15 = r15.append(r5)
            java.lang.String r12 = ": "
            java.lang.StringBuilder r12 = r15.append(r12)
            r15 = r33
            java.lang.StringBuilder r12 = r12.append(r15)
            java.lang.String r12 = r12.toString()
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r8.setText(r12)
            r12 = 1098907648(0x41800000, float:16.0)
            r8.setTextSize(r12)
            r8.setTextColor(r9)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r9 = 1065353216(0x3f800000, float:1.0)
            r12.<init>(r11, r10, r9)
            android.view.ViewGroup$LayoutParams r12 = (android.view.ViewGroup.LayoutParams) r12
            r8.setLayoutParams(r12)
            android.widget.Button r8 = new android.widget.Button
            android.content.Context r9 = r0.getContext()
            r8.<init>(r9)
            r9 = r8
            r10 = 0
            java.lang.String r12 = "REMOVE"
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r9.setText(r12)
            r12 = 1094713344(0x41400000, float:12.0)
            r9.setTextSize(r12)
            r12 = -65536(0xffffffffffff0000, float:NaN)
            r9.setBackgroundColor(r12)
            r12 = -1
            r9.setTextColor(r12)
            com.example.snipereambatha.fragments.MetatraderFragment$$ExternalSyntheticLambda2 r12 = new com.example.snipereambatha.fragments.MetatraderFragment$$ExternalSyntheticLambda2
            r12.<init>(r0, r1)
            r9.setOnClickListener(r12)
            r3.addView(r4)
            r9 = r14
            android.view.View r9 = (android.view.View) r9
            r3.addView(r9)
            r9 = r8
            android.view.View r9 = (android.view.View) r9
            r3.addView(r9)
            r9 = r3
            android.view.View r9 = (android.view.View) r9
            r2.addView(r9)
            androidx.fragment.app.FragmentActivity r9 = r0.requireActivity()
            java.lang.String r10 = "app_prefs"
            android.content.SharedPreferences r9 = r9.getSharedPreferences(r10, r11)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.StringBuilder r10 = r10.append(r1)
            java.lang.String r12 = "_balance"
            java.lang.StringBuilder r10 = r10.append(r12)
            java.lang.String r10 = r10.toString()
            r12 = 0
            float r10 = r9.getFloat(r10, r12)
            r20 = 0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.StringBuilder r11 = r11.append(r1)
            java.lang.String r12 = "_equity"
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r11 = r11.toString()
            r12 = 0
            float r11 = r9.getFloat(r11, r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.StringBuilder r12 = r12.append(r1)
            java.lang.String r1 = "_currency"
            java.lang.StringBuilder r1 = r12.append(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r12 = "USD"
            java.lang.String r1 = r9.getString(r1, r12)
            java.lang.String r12 = "format(...)"
            r22 = r3
            java.lang.String r3 = "%.2f"
            r23 = 4621819117588971520(0x4024000000000000, double:10.0)
            r21 = 0
            int r21 = (r10 > r21 ? 1 : (r10 == r21 ? 0 : -1))
            if (r21 <= 0) goto L_0x024c
            r21 = r4
            android.widget.TextView r4 = new android.widget.TextView
            android.content.Context r5 = r0.getContext()
            r4.<init>(r5)
            r5 = r4
            r25 = 0
            r26 = r6
            r27 = r7
            double r6 = (double) r10
            int r28 = (r6 > r23 ? 1 : (r6 == r23 ? 0 : -1))
            if (r28 >= 0) goto L_0x019d
            r19 = -256(0xffffffffffffff00, float:NaN)
            goto L_0x019f
        L_0x019d:
            r19 = -1
        L_0x019f:
            r6 = r19
            java.lang.Float r7 = java.lang.Float.valueOf(r10)
            r19 = r4
            r18 = r7
            r4 = 1
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r7[r20] = r18
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r4)
            java.lang.String r7 = java.lang.String.format(r3, r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r12)
            java.lang.Float r18 = java.lang.Float.valueOf(r11)
            r28 = r8
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r8[r20] = r18
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r4)
            java.lang.String r4 = java.lang.String.format(r3, r8)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r12)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r29 = r11
            java.lang.String r11 = "Balance: "
            java.lang.StringBuilder r8 = r8.append(r11)
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.String r11 = " "
            java.lang.StringBuilder r8 = r8.append(r11)
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.String r8 = " | Equity: "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r1)
            java.lang.StringBuilder r7 = r7.append(r11)
            java.lang.StringBuilder r4 = r7.append(r4)
            java.lang.String r4 = r4.toString()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r5.setText(r4)
            r4 = 1096810496(0x41600000, float:14.0)
            r5.setTextSize(r4)
            r5.setTextColor(r6)
            r4 = 0
            r7 = 4
            r5.setPadding(r4, r7, r4, r4)
            r4 = r19
            android.view.View r4 = (android.view.View) r4
            r2.addView(r4)
            double r4 = (double) r10
            int r6 = (r4 > r23 ? 1 : (r4 == r23 ? 0 : -1))
            if (r6 >= 0) goto L_0x0249
            android.widget.TextView r4 = new android.widget.TextView
            android.content.Context r5 = r0.getContext()
            r4.<init>(r5)
            r5 = r4
            r6 = 0
            java.lang.String r7 = "⚠️ Balance below $10 minimum requirement"
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r5.setText(r7)
            r7 = 1094713344(0x41400000, float:12.0)
            r5.setTextSize(r7)
            r7 = -256(0xffffffffffffff00, float:NaN)
            r5.setTextColor(r7)
            r8 = 2
            r11 = 0
            r5.setPadding(r11, r8, r11, r11)
            r5 = r4
            android.view.View r5 = (android.view.View) r5
            r2.addView(r5)
            goto L_0x0258
        L_0x0249:
            r7 = -256(0xffffffffffffff00, float:NaN)
            goto L_0x0258
        L_0x024c:
            r21 = r4
            r26 = r6
            r27 = r7
            r28 = r8
            r29 = r11
            r7 = -256(0xffffffffffffff00, float:NaN)
        L_0x0258:
            android.widget.TextView r4 = new android.widget.TextView
            android.content.Context r5 = r0.getContext()
            r4.<init>(r5)
            r5 = r4
            r6 = 0
            java.lang.Float r8 = java.lang.Float.valueOf(r36)
            r11 = 1
            java.lang.Object[] r7 = new java.lang.Object[r11]
            r20 = 0
            r7[r20] = r8
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r11)
            java.lang.String r3 = java.lang.String.format(r3, r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r12)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "👤 "
            java.lang.StringBuilder r7 = r7.append(r8)
            r8 = r37
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r11 = " | 📊 Your Lot: "
            java.lang.StringBuilder r7 = r7.append(r11)
            java.lang.StringBuilder r3 = r7.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r5.setText(r3)
            r3 = 1096810496(0x41600000, float:14.0)
            r5.setTextSize(r3)
            r3 = -16711681(0xffffffffff00ffff, float:-1.714704E38)
            r5.setTextColor(r3)
            r7 = 4
            r11 = 0
            r5.setPadding(r11, r7, r11, r11)
            r3 = r4
            android.view.View r3 = (android.view.View) r3
            r2.addView(r3)
            if (r26 != 0) goto L_0x02bb
            java.lang.String r3 = "❌ Not configured"
            goto L_0x02cc
        L_0x02bb:
            boolean r3 = r0.isBridgeConnected
            if (r3 != 0) goto L_0x02c2
            java.lang.String r3 = "⚠️ Bridge offline - Waiting to reconnect"
            goto L_0x02cc
        L_0x02c2:
            double r5 = (double) r10
            int r3 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r3 >= 0) goto L_0x02ca
            java.lang.String r3 = "⚠️ Low balance - Trading may be restricted"
            goto L_0x02cc
        L_0x02ca:
            java.lang.String r3 = "✅ Copy Trading Active with YOUR settings"
        L_0x02cc:
            android.widget.TextView r5 = new android.widget.TextView
            android.content.Context r6 = r0.getContext()
            r5.<init>(r6)
            r6 = r5
            r7 = 0
            r11 = r3
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            r6.setText(r11)
            r11 = 1094713344(0x41400000, float:12.0)
            r6.setTextSize(r11)
            if (r26 != 0) goto L_0x02e9
            r11 = -65536(0xffffffffffff0000, float:NaN)
            goto L_0x02fd
        L_0x02e9:
            boolean r11 = r0.isBridgeConnected
            if (r11 != 0) goto L_0x02f2
            int r11 = android.graphics.Color.parseColor(r27)
            goto L_0x02fd
        L_0x02f2:
            double r11 = (double) r10
            int r18 = (r11 > r23 ? 1 : (r11 == r23 ? 0 : -1))
            if (r18 >= 0) goto L_0x02fa
            r11 = -256(0xffffffffffffff00, float:NaN)
            goto L_0x02fd
        L_0x02fa:
            r11 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
        L_0x02fd:
            r6.setTextColor(r11)
            r11 = 0
            r12 = 4
            r6.setPadding(r11, r12, r11, r11)
            r6 = r5
            android.view.View r6 = (android.view.View) r6
            r2.addView(r6)
            java.lang.String r6 = "remaining_days"
            int r6 = r9.getInt(r6, r11)
            if (r6 <= 0) goto L_0x035c
            android.widget.TextView r7 = new android.widget.TextView
            android.content.Context r11 = r0.getContext()
            r7.<init>(r11)
            r11 = r7
            r12 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r16 = r1
            java.lang.String r1 = "📅 License: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r1 = " days remaining"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r11.setText(r0)
            r0 = 1094713344(0x41400000, float:12.0)
            r11.setTextSize(r0)
            java.lang.String r0 = "#90EE90"
            int r0 = android.graphics.Color.parseColor(r0)
            r11.setTextColor(r0)
            r0 = 2
            r1 = 0
            r11.setPadding(r1, r0, r1, r1)
            r0 = r7
            android.view.View r0 = (android.view.View) r0
            r2.addView(r0)
            goto L_0x035e
        L_0x035c:
            r16 = r1
        L_0x035e:
            r0 = r2
            android.view.View r0 = (android.view.View) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.snipereambatha.fragments.MetatraderFragment.createAccountView(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, float, java.lang.String):android.view.View");
    }

    /* access modifiers changed from: private */
    public static final void createAccountView$lambda$43$lambda$42(MetatraderFragment this$0, String $accountKey, View it) {
        this$0.removeAccount($accountKey);
    }

    private final void removeAccount(String accountKey) {
        SharedPreferences sharedPref = requireActivity().getSharedPreferences("app_prefs", 0);
        this.connectedSessions.remove(accountKey);
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.remove(accountKey + "_broker");
        edit.remove(accountKey + "_login");
        edit.remove(accountKey + "_password");
        edit.remove(accountKey + "_server");
        edit.remove(accountKey + "_platform");
        edit.remove(accountKey + "_timestamp");
        edit.remove(accountKey + "_session_id");
        edit.remove(accountKey + "_balance");
        edit.remove(accountKey + "_equity");
        edit.remove(accountKey + "_currency");
        edit.remove(accountKey + "_leverage");
        Set stringSet = sharedPref.getStringSet("linked_accounts", new LinkedHashSet());
        if (stringSet == null) {
            stringSet = new LinkedHashSet();
        }
        stringSet.remove(accountKey);
        edit.putStringSet("linked_accounts", stringSet);
        edit.apply();
        updateStatusDots();
        loadConnectedAccounts();
        Toast.makeText(getContext(), "Account removed", 0).show();
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
