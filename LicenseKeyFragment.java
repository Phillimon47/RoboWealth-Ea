package com.example.snipereambatha.fragments;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.fragment.FragmentKt;
import com.example.snipereambatha.R;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0019H\u0002J0\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0019H\u0002J\b\u0010#\u001a\u00020\u0016H\u0002J\b\u0010$\u001a\u00020\u0016H\u0002J\b\u0010%\u001a\u00020\u0016H\u0002J \u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0019H\u0002J\u0012\u0010(\u001a\u00020\u00162\b\b\u0002\u0010)\u001a\u00020\u0019H\u0002J\u0010\u0010*\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u0019H\u0002J\u0010\u0010+\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u0019H\u0002J\b\u0010,\u001a\u00020\u0016H\u0002J\b\u0010-\u001a\u00020\u0016H\u0002J\b\u0010.\u001a\u00020/H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/example/snipereambatha/fragments/LicenseKeyFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "licenseKeyInput", "Landroid/widget/EditText;", "authenticateButton", "Landroid/widget/Button;", "showLicenseTypesButton", "licenseInfoText", "Landroid/widget/TextView;", "backButton", "Landroid/widget/ImageView;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "getDeviceId", "", "showAlreadyUsedKeyDialog", "validateLicenseWithBridge", "licenseKey", "handleValidLicense", "expiresAt", "remainingDays", "", "studentName", "durationType", "checkExistingLicense", "checkMentorStatus", "applyMentorLicense", "showSuccessDialog", "licenseType", "showInvalidLicenseDialog", "message", "showDeviceBoundDialog", "showErrorDialog", "showLicenseTypesDialog", "navigateToBotDetails", "isDebugMode", "", "Companion", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* compiled from: LicenseKeyFragment.kt */
public final class LicenseKeyFragment extends Fragment {
    private static final String BRIDGE_URL = "http://77.93.152.165:5000";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String VALIDATE_LICENSE_ENDPOINT = "http://77.93.152.165:5000/validate_license";
    /* access modifiers changed from: private */
    public Button authenticateButton;
    private ImageView backButton;
    private TextView licenseInfoText;
    private EditText licenseKeyInput;
    private Button showLicenseTypesButton;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/example/snipereambatha/fragments/LicenseKeyFragment$Companion;", "", "<init>", "()V", "BRIDGE_URL", "", "VALIDATE_LICENSE_ENDPOINT", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* compiled from: LicenseKeyFragment.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_license_key, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.licenseKeyInput = (EditText) view.findViewById(R.id.licenseKeyInput);
        this.authenticateButton = (Button) view.findViewById(R.id.authenticateButton);
        this.showLicenseTypesButton = (Button) view.findViewById(R.id.showLicenseTypesButton);
        this.licenseInfoText = (TextView) view.findViewById(R.id.licenseInfoText);
        this.backButton = (ImageView) view.findViewById(R.id.backButton);
        checkExistingLicense();
        ImageView imageView = this.backButton;
        Button button = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backButton");
            imageView = null;
        }
        imageView.setOnClickListener(new LicenseKeyFragment$$ExternalSyntheticLambda3(this));
        Button button2 = this.authenticateButton;
        if (button2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("authenticateButton");
            button2 = null;
        }
        button2.setOnClickListener(new LicenseKeyFragment$$ExternalSyntheticLambda4(this));
        Button button3 = this.showLicenseTypesButton;
        if (button3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("showLicenseTypesButton");
        } else {
            button = button3;
        }
        button.setOnClickListener(new LicenseKeyFragment$$ExternalSyntheticLambda5(this));
        checkMentorStatus();
    }

    /* access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(LicenseKeyFragment this$0, View it) {
        SharedPreferences sharedPref = this$0.requireActivity().getSharedPreferences("app_prefs", 0);
        boolean hasValidLicense = sharedPref.getBoolean("license_validated", false);
        long expiryTime = sharedPref.getLong("license_expiry_date", 0);
        if (!hasValidLicense || expiryTime <= System.currentTimeMillis()) {
            try {
                Boolean.valueOf(FragmentKt.findNavController(this$0).navigateUp());
            } catch (Exception e) {
                FragmentActivity activity = this$0.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                    Unit unit = Unit.INSTANCE;
                }
            }
        } else {
            try {
                FragmentKt.findNavController(this$0).navigate(R.id.botDetailFragment);
                Unit unit2 = Unit.INSTANCE;
            } catch (Exception e2) {
                try {
                    Boolean.valueOf(FragmentKt.findNavController(this$0).navigateUp());
                } catch (Exception e3) {
                    FragmentActivity activity2 = this$0.getActivity();
                    if (activity2 != null) {
                        activity2.onBackPressed();
                        Unit unit3 = Unit.INSTANCE;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(LicenseKeyFragment this$0, View it) {
        EditText editText = this$0.licenseKeyInput;
        EditText editText2 = null;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("licenseKeyInput");
            editText = null;
        }
        String licenseKey = StringsKt.trim((CharSequence) editText.getText().toString()).toString();
        if (licenseKey.length() == 0) {
            EditText editText3 = this$0.licenseKeyInput;
            if (editText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("licenseKeyInput");
            } else {
                editText2 = editText3;
            }
            editText2.setError("Please enter a license key");
            return;
        }
        Set usedKeys = this$0.requireActivity().getSharedPreferences("app_prefs", 0).getStringSet("used_license_keys", new LinkedHashSet());
        if (usedKeys == null) {
            usedKeys = new LinkedHashSet();
        }
        if (usedKeys.contains(licenseKey)) {
            this$0.showAlreadyUsedKeyDialog();
        } else {
            this$0.validateLicenseWithBridge(licenseKey);
        }
    }

    /* access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(LicenseKeyFragment this$0, View it) {
        this$0.showLicenseTypesDialog();
    }

    private final String getDeviceId() {
        try {
            String string = Settings.Secure.getString(requireContext().getContentResolver(), "android_id");
            if (string == null) {
                return "unknown_device";
            }
            return string;
        } catch (Exception e) {
            return "unknown_device";
        }
    }

    private final void showAlreadyUsedKeyDialog() {
        new AlertDialog.Builder(requireContext()).setTitle((CharSequence) "⚠️ Key Already Used").setMessage((CharSequence) "This license key has already been used on this device. Each key can only be activated once per device.\n\nPlease use a different license key.").setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new LicenseKeyFragment$$ExternalSyntheticLambda0(this)).show();
    }

    /* access modifiers changed from: private */
    public static final void showAlreadyUsedKeyDialog$lambda$3(LicenseKeyFragment this$0, DialogInterface dialog, int i) {
        dialog.dismiss();
        EditText editText = this$0.licenseKeyInput;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("licenseKeyInput");
            editText = null;
        }
        editText.setText("");
    }

    private final void validateLicenseWithBridge(String licenseKey) {
        Button button = this.authenticateButton;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("authenticateButton");
            button = null;
        }
        button.setEnabled(false);
        Button button2 = this.authenticateButton;
        if (button2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("authenticateButton");
            button2 = null;
        }
        button2.setText("Validating...");
        Job unused = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), (CoroutineContext) null, (CoroutineStart) null, new LicenseKeyFragment$validateLicenseWithBridge$1(licenseKey, getDeviceId(), this, (Continuation<? super LicenseKeyFragment$validateLicenseWithBridge$1>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0121, code lost:
        if (r4.equals("LIFETIME") != false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x013c, code lost:
        if (r4.equals("1YEAR") == false) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0143, code lost:
        if (r4.equals("6MONTHS") == false) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0146, code lost:
        r5.putBoolean("all_features_unlocked", true);
        r5.putInt("max_accounts", 10);
        r5.putBoolean("advanced_modes_enabled", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0153, code lost:
        r5.putBoolean("all_features_unlocked", false);
        r5.putInt("max_accounts", 2);
        r5.putBoolean("advanced_modes_enabled", false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x015e, code lost:
        r5.apply();
        showSuccessDialog(r0, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0168, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleValidLicense(java.lang.String r20, java.lang.String r21, int r22, java.lang.String r23, java.lang.String r24) {
        /*
            r19 = this;
            r1 = r20
            r2 = r22
            r3 = r23
            r4 = r24
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r5 = "yyyy-MM-dd'T'HH:mm:ss"
            java.util.Locale r6 = java.util.Locale.getDefault()
            r0.<init>(r5, r6)
            r5 = r0
            r6 = 1000(0x3e8, double:4.94E-321)
            r8 = r21
            java.util.Date r0 = r5.parse(r8)     // Catch:{ Exception -> 0x0034 }
            if (r0 == 0) goto L_0x0024
            long r6 = r0.getTime()     // Catch:{ Exception -> 0x0034 }
            goto L_0x0044
        L_0x0024:
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0034 }
            int r0 = r2 * 24
            int r0 = r0 * 60
            int r0 = r0 * 60
            long r11 = (long) r0
            long r11 = r11 * r6
            long r6 = r9 + r11
            goto L_0x0044
        L_0x0034:
            r0 = move-exception
            long r9 = java.lang.System.currentTimeMillis()
            int r11 = r2 * 24
            int r11 = r11 * 60
            int r11 = r11 * 60
            long r11 = (long) r11
            long r11 = r11 * r6
            long r6 = r9 + r11
        L_0x0044:
            int r0 = r4.hashCode()
            java.lang.String r9 = "LIFETIME"
            java.lang.String r10 = "3MONTHS"
            java.lang.String r11 = "1YEAR"
            java.lang.String r12 = "6MONTHS"
            switch(r0) {
                case -1334599255: goto L_0x0097;
                case 47972334: goto L_0x008d;
                case 49190666: goto L_0x0081;
                case 52884750: goto L_0x0075;
                case 297856998: goto L_0x006b;
                case 1506506804: goto L_0x005f;
                case 1743197129: goto L_0x0055;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x00a1
        L_0x0055:
            boolean r0 = r4.equals(r9)
            if (r0 != 0) goto L_0x005c
            goto L_0x0054
        L_0x005c:
            java.lang.String r0 = "Lifetime"
            goto L_0x00a2
        L_0x005f:
            java.lang.String r0 = "30DAYS"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0068
            goto L_0x0054
        L_0x0068:
            java.lang.String r0 = "Monthly"
            goto L_0x00a2
        L_0x006b:
            boolean r0 = r4.equals(r10)
            if (r0 != 0) goto L_0x0072
            goto L_0x0054
        L_0x0072:
            java.lang.String r0 = "Quarterly"
            goto L_0x00a2
        L_0x0075:
            java.lang.String r0 = "7DAYS"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x007e
            goto L_0x0054
        L_0x007e:
            java.lang.String r0 = "Weekly"
            goto L_0x00a2
        L_0x0081:
            java.lang.String r0 = "3DAYS"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x008a
            goto L_0x0054
        L_0x008a:
            java.lang.String r0 = "Trial (3 Days)"
            goto L_0x00a2
        L_0x008d:
            boolean r0 = r4.equals(r11)
            if (r0 != 0) goto L_0x0094
            goto L_0x0054
        L_0x0094:
            java.lang.String r0 = "Annual"
            goto L_0x00a2
        L_0x0097:
            boolean r0 = r4.equals(r12)
            if (r0 != 0) goto L_0x009e
            goto L_0x0054
        L_0x009e:
            java.lang.String r0 = "Semi-Annual"
            goto L_0x00a2
        L_0x00a1:
            r0 = r4
        L_0x00a2:
            androidx.fragment.app.FragmentActivity r13 = r19.requireActivity()
            java.lang.String r14 = "app_prefs"
            r15 = 0
            android.content.SharedPreferences r13 = r13.getSharedPreferences(r14, r15)
            java.util.LinkedHashSet r14 = new java.util.LinkedHashSet
            r14.<init>()
            java.util.Set r14 = (java.util.Set) r14
            java.lang.String r15 = "used_license_keys"
            java.util.Set r14 = r13.getStringSet(r15, r14)
            if (r14 == 0) goto L_0x00c5
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.Set r14 = kotlin.collections.CollectionsKt.toMutableSet(r14)
            if (r14 != 0) goto L_0x00cc
        L_0x00c5:
            java.util.LinkedHashSet r14 = new java.util.LinkedHashSet
            r14.<init>()
            java.util.Set r14 = (java.util.Set) r14
        L_0x00cc:
            r14.add(r1)
            r16 = r5
            android.content.SharedPreferences$Editor r5 = r13.edit()
            r17 = 0
            java.lang.String r8 = "license_validated"
            r18 = r13
            r13 = 1
            r5.putBoolean(r8, r13)
            java.lang.String r8 = "license_type"
            r5.putString(r8, r0)
            java.lang.String r8 = "license_expiry_date"
            r5.putLong(r8, r6)
            java.lang.String r8 = "license_key"
            r5.putString(r8, r1)
            java.lang.String r8 = "student_name"
            r5.putString(r8, r3)
            java.lang.String r8 = "device_id"
            java.lang.String r13 = r19.getDeviceId()
            r5.putString(r8, r13)
            java.lang.String r8 = "has_active_bots"
            r13 = 1
            r5.putBoolean(r8, r13)
            java.lang.String r8 = "remaining_days"
            r5.putInt(r8, r2)
            r5.putStringSet(r15, r14)
            java.lang.String r8 = "license_permanent_active"
            r5.putBoolean(r8, r13)
            int r8 = r4.hashCode()
            java.lang.String r13 = "advanced_modes_enabled"
            java.lang.String r15 = "max_accounts"
            java.lang.String r1 = "all_features_unlocked"
            switch(r8) {
                case -1334599255: goto L_0x013f;
                case 47972334: goto L_0x0138;
                case 297856998: goto L_0x0124;
                case 1743197129: goto L_0x011d;
                default: goto L_0x011c;
            }
        L_0x011c:
            goto L_0x0153
        L_0x011d:
            boolean r8 = r4.equals(r9)
            if (r8 == 0) goto L_0x011c
            goto L_0x0146
        L_0x0124:
            boolean r8 = r4.equals(r10)
            if (r8 != 0) goto L_0x012b
            goto L_0x011c
        L_0x012b:
            r8 = 0
            r5.putBoolean(r1, r8)
            r1 = 5
            r5.putInt(r15, r1)
            r1 = 1
            r5.putBoolean(r13, r1)
            goto L_0x015e
        L_0x0138:
            boolean r8 = r4.equals(r11)
            if (r8 != 0) goto L_0x0146
            goto L_0x011c
        L_0x013f:
            boolean r8 = r4.equals(r12)
            if (r8 != 0) goto L_0x0146
            goto L_0x011c
        L_0x0146:
            r8 = 1
            r5.putBoolean(r1, r8)
            r1 = 10
            r5.putInt(r15, r1)
            r5.putBoolean(r13, r8)
            goto L_0x015e
        L_0x0153:
            r8 = 0
            r5.putBoolean(r1, r8)
            r1 = 2
            r5.putInt(r15, r1)
            r5.putBoolean(r13, r8)
        L_0x015e:
            r5.apply()
            r1 = r19
            r1.showSuccessDialog(r0, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.snipereambatha.fragments.LicenseKeyFragment.handleValidLicense(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String):void");
    }

    private final void checkExistingLicense() {
        Button button;
        boolean z = false;
        SharedPreferences sharedPref = requireActivity().getSharedPreferences("app_prefs", 0);
        boolean hasLicense = sharedPref.getBoolean("license_validated", false);
        long expiryDate = sharedPref.getLong("license_expiry_date", 0);
        String licenseType = sharedPref.getString("license_type", "");
        String studentName = sharedPref.getString("student_name", "");
        String string = sharedPref.getString("license_key", "");
        boolean isPermanentActive = sharedPref.getBoolean("license_permanent_active", false);
        if (hasLicense && expiryDate > System.currentTimeMillis()) {
            int daysRemaining = (int) ((expiryDate - System.currentTimeMillis()) / ((long) 86400000));
            TextView textView = this.licenseInfoText;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("licenseInfoText");
                textView = null;
            }
            textView.setVisibility(0);
            TextView textView2 = this.licenseInfoText;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("licenseInfoText");
                textView2 = null;
            }
            textView2.setText("✅ Active License: " + licenseType + "\n👤 " + studentName + "\n📅 " + daysRemaining + " days remaining\n🔒 Device locked");
            TextView textView3 = this.licenseInfoText;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("licenseInfoText");
                textView3 = null;
            }
            textView3.setTextColor(ContextCompat.getColor(requireContext(), R.color.green));
            EditText editText = this.licenseKeyInput;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("licenseKeyInput");
                editText = null;
            }
            editText.setVisibility(8);
            Button button2 = this.authenticateButton;
            if (button2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("authenticateButton");
                button2 = null;
            }
            button2.setVisibility(8);
            Button button3 = this.authenticateButton;
            if (button3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("authenticateButton");
                button3 = null;
            }
            button3.setVisibility(0);
            Button button4 = this.authenticateButton;
            if (button4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("authenticateButton");
                button4 = null;
            }
            button4.setText("Continue to Bot");
            Button button5 = this.authenticateButton;
            if (button5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("authenticateButton");
                button = null;
            } else {
                button = button5;
            }
            button.setOnClickListener(new LicenseKeyFragment$$ExternalSyntheticLambda2(this));
            if (isPermanentActive) {
                Bundle arguments = getArguments();
                if (arguments != null && arguments.getBoolean("auto_navigate", false)) {
                    z = true;
                }
                if (z) {
                    navigateToBotDetails();
                }
            }
        } else if (hasLicense && expiryDate <= System.currentTimeMillis()) {
            TextView textView4 = this.licenseInfoText;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("licenseInfoText");
                textView4 = null;
            }
            textView4.setVisibility(0);
            TextView textView5 = this.licenseInfoText;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("licenseInfoText");
                textView5 = null;
            }
            textView5.setText("❌ License expired. Please enter a new key.");
            TextView textView6 = this.licenseInfoText;
            if (textView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("licenseInfoText");
                textView6 = null;
            }
            textView6.setTextColor(ContextCompat.getColor(requireContext(), R.color.red));
            SharedPreferences.Editor edit = sharedPref.edit();
            edit.putBoolean("license_validated", false);
            edit.putBoolean("license_permanent_active", false);
            edit.remove("license_key");
            edit.apply();
        }
    }

    /* access modifiers changed from: private */
    public static final void checkExistingLicense$lambda$5(LicenseKeyFragment this$0, View it) {
        this$0.navigateToBotDetails();
    }

    private final void checkMentorStatus() {
        SharedPreferences sharedPref = requireActivity().getSharedPreferences("app_prefs", 0);
        String mentorId = sharedPref.getString("mentor_id", "");
        boolean isMentor2001 = sharedPref.getBoolean("is_mentor_2001", false);
        if (Intrinsics.areEqual((Object) mentorId, (Object) "2001") || isMentor2001) {
            TextView textView = this.licenseInfoText;
            TextView textView2 = null;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("licenseInfoText");
                textView = null;
            }
            textView.setVisibility(0);
            TextView textView3 = this.licenseInfoText;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("licenseInfoText");
                textView3 = null;
            }
            textView3.setText("👑 Mentor Status Active - Lifetime Access");
            TextView textView4 = this.licenseInfoText;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("licenseInfoText");
            } else {
                textView2 = textView4;
            }
            textView2.setTextColor(ContextCompat.getColor(requireContext(), R.color.gold));
            applyMentorLicense();
        }
    }

    private final void applyMentorLicense() {
        SharedPreferences.Editor edit = requireActivity().getSharedPreferences("app_prefs", 0).edit();
        edit.putBoolean("license_validated", true);
        edit.putString("license_type", "Mentor Lifetime");
        edit.putLong("license_expiry_date", System.currentTimeMillis() + 315360000000L);
        edit.putString("license_key", "MENTOR-2001-LIFETIME");
        edit.putBoolean("all_features_unlocked", true);
        edit.putBoolean("license_permanent_active", true);
        edit.apply();
    }

    private final void showSuccessDialog(String licenseType, int remainingDays, String studentName) {
        new AlertDialog.Builder(requireContext()).setTitle((CharSequence) "✅ License Activated!").setMessage((CharSequence) "Welcome, " + studentName + "!\n\nLicense Type: " + licenseType + "\nValid for: " + remainingDays + " days\n\n🔒 This license is now permanently bound to your device.\n\nYour SNIPER EA is now activated and ready to trade!").setPositiveButton((CharSequence) "Continue", (DialogInterface.OnClickListener) new LicenseKeyFragment$$ExternalSyntheticLambda1(this)).setCancelable(false).show();
    }

    /* access modifiers changed from: private */
    public static final void showSuccessDialog$lambda$8(LicenseKeyFragment this$0, DialogInterface dialogInterface, int i) {
        this$0.navigateToBotDetails();
    }

    static /* synthetic */ void showInvalidLicenseDialog$default(LicenseKeyFragment licenseKeyFragment, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "Invalid license key";
        }
        licenseKeyFragment.showInvalidLicenseDialog(str);
    }

    /* access modifiers changed from: private */
    public final void showInvalidLicenseDialog(String message) {
        new AlertDialog.Builder(requireContext()).setTitle((CharSequence) "❌ License Validation Failed").setMessage((CharSequence) message + "\n\nPlease check your key and try again, or contact your mentor for a valid license key.").setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new LicenseKeyFragment$$ExternalSyntheticLambda8(this)).setNegativeButton((CharSequence) "View License Types", (DialogInterface.OnClickListener) new LicenseKeyFragment$$ExternalSyntheticLambda9(this)).show();
    }

    /* access modifiers changed from: private */
    public static final void showInvalidLicenseDialog$lambda$9(LicenseKeyFragment this$0, DialogInterface dialog, int i) {
        dialog.dismiss();
        EditText editText = this$0.licenseKeyInput;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("licenseKeyInput");
            editText = null;
        }
        editText.setText("");
    }

    /* access modifiers changed from: private */
    public static final void showInvalidLicenseDialog$lambda$10(LicenseKeyFragment this$0, DialogInterface dialogInterface, int i) {
        this$0.showLicenseTypesDialog();
    }

    /* access modifiers changed from: private */
    public final void showDeviceBoundDialog(String message) {
        new AlertDialog.Builder(requireContext()).setTitle((CharSequence) "🔒 License Already Bound").setMessage((CharSequence) "This license key is already bound to another device.\n\nEach license can only be used on ONE device. If you need to use this license on a different device, please contact your mentor.\n\nDetails: " + message).setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) new LicenseKeyFragment$$ExternalSyntheticLambda6(this)).setNegativeButton((CharSequence) "Get New License", (DialogInterface.OnClickListener) new LicenseKeyFragment$$ExternalSyntheticLambda7(this)).show();
    }

    /* access modifiers changed from: private */
    public static final void showDeviceBoundDialog$lambda$11(LicenseKeyFragment this$0, DialogInterface dialog, int i) {
        dialog.dismiss();
        EditText editText = this$0.licenseKeyInput;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("licenseKeyInput");
            editText = null;
        }
        editText.setText("");
    }

    /* access modifiers changed from: private */
    public static final void showDeviceBoundDialog$lambda$12(LicenseKeyFragment this$0, DialogInterface dialogInterface, int i) {
        this$0.showLicenseTypesDialog();
    }

    /* access modifiers changed from: private */
    public final void showErrorDialog(String message) {
        new AlertDialog.Builder(requireContext()).setTitle((CharSequence) "⚠️ Error").setMessage((CharSequence) message).setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) null).show();
    }

    private final void showLicenseTypesDialog() {
        new AlertDialog.Builder(requireContext()).setTitle((CharSequence) "License Types").setMessage((CharSequence) "📋 AVAILABLE LICENSE TYPES:\n\n🟢 TRIAL (3 days)\n• Test the system\n• 2 MT5 accounts\n• Basic features\n\n🔵 WEEKLY (7 days)\n• Short-term trading\n• 2 MT5 accounts\n• Standard features\n\n🟡 MONTHLY (30 days)\n• 2 MT5 accounts\n• Standard trading modes\n• Basic support\n\n🟣 QUARTERLY (3 months)\n• 5 MT5 accounts\n• Advanced trading modes\n• Priority support\n\n🔴 SEMI-ANNUAL (6 months)\n• 10 MT5 accounts\n• All trading modes\n• Premium support\n\n⭐ ANNUAL (1 year)\n• 10 MT5 accounts\n• All features unlocked\n• Direct support\n\n👑 LIFETIME\n• All features\n• Lifetime access\n• Premium privileges\n. CONTACT MR SNIPER FOR KEY\n. WHATSAPP NO: +27 72 823 9526\n\n⚠️ IMPORTANT:\n• Each license is bound to ONE device only\n• Once activated, cannot be transferred\n• Contact your mentor for license keys").setPositiveButton((CharSequence) "OK", (DialogInterface.OnClickListener) null).show();
    }

    private final void navigateToBotDetails() {
        try {
            FragmentKt.findNavController(this).navigate(R.id.action_licenseKeyFragment_to_botDetailFragment);
        } catch (Exception e) {
            try {
                FragmentKt.findNavController(this).navigate(R.id.botDetailFragment);
            } catch (Exception e2) {
                Toast.makeText(getContext(), "Navigation error", 0).show();
            }
        }
    }

    private final boolean isDebugMode() {
        return false;
    }
}
