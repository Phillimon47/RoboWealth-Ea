package com.example.snipereambatha.fragments;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.fragment.FragmentKt;
import com.example.snipereambatha.R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0007H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/example/snipereambatha/fragments/HomeFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "bottomNavigation", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "hasNavigatedToBotDetail", "", "hasValidatedLogin", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "clearOldAppDataIfNeeded", "validateLoginAndNavigateIfNeeded", "checkAndNavigateIfLicenseValid", "showNoLicenseDialog", "showExpiredLicenseDialog", "updateUIBasedOnLicenseStatus", "onResume", "onPause", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* compiled from: HomeFragment.kt */
public final class HomeFragment extends Fragment {
    private BottomNavigationView bottomNavigation;
    private boolean hasNavigatedToBotDetail;
    private boolean hasValidatedLogin;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        clearOldAppDataIfNeeded();
        if (validateLoginAndNavigateIfNeeded()) {
            checkAndNavigateIfLicenseValid();
            ((Button) view.findViewById(R.id.addNewEaButton)).setOnClickListener(new HomeFragment$$ExternalSyntheticLambda1(this));
            this.bottomNavigation = (BottomNavigationView) view.findViewById(R.id.bottomNavigation);
            BottomNavigationView bottomNavigationView = this.bottomNavigation;
            if (bottomNavigationView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomNavigation");
                bottomNavigationView = null;
            }
            bottomNavigationView.setOnItemSelectedListener(new HomeFragment$$ExternalSyntheticLambda2(this));
            updateUIBasedOnLicenseStatus();
        }
    }

    /* access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(HomeFragment this$0, View it) {
        SharedPreferences sharedPref = this$0.requireActivity().getSharedPreferences("app_prefs", 0);
        boolean hasValidLicense = sharedPref.getBoolean("license_validated", false);
        long expiryTime = sharedPref.getLong("license_expiry_date", 0);
        if (!hasValidLicense || expiryTime <= System.currentTimeMillis()) {
            try {
                FragmentKt.findNavController(this$0).navigate(R.id.action_homeFragment_to_licenseKeyFragment);
            } catch (Exception e) {
            }
        } else {
            try {
                FragmentKt.findNavController(this$0).navigate(R.id.action_homeFragment_to_botDetailFragment);
            } catch (Exception e2) {
                try {
                    FragmentKt.findNavController(this$0).navigate(R.id.botDetailFragment);
                } catch (Exception e3) {
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static final boolean onViewCreated$lambda$1(HomeFragment this$0, MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        if (itemId == R.id.nav_home) {
            return true;
        }
        if (itemId != R.id.nav_metatrader) {
            return false;
        }
        SharedPreferences sharedPref = this$0.requireActivity().getSharedPreferences("app_prefs", 0);
        boolean hasValidLicense = sharedPref.getBoolean("license_validated", false);
        long expiryTime = sharedPref.getLong("license_expiry_date", 0);
        if (!hasValidLicense || expiryTime <= System.currentTimeMillis()) {
            this$0.showNoLicenseDialog();
            return false;
        }
        try {
            FragmentKt.findNavController(this$0).navigate(R.id.action_homeFragment_to_metatraderFragment);
            return true;
        } catch (Exception e) {
            return true;
        }
    }

    private final void clearOldAppDataIfNeeded() {
        SharedPreferences sharedPref = requireActivity().getSharedPreferences("app_prefs", 0);
        if (sharedPref.getInt("app_version", 0) < 2) {
            SharedPreferences.Editor edit = sharedPref.edit();
            edit.remove("license_validated");
            edit.remove("license_permanent_active");
            edit.remove("license_key");
            edit.remove("license_type");
            edit.remove("license_expiry_date");
            edit.remove("student_name");
            edit.remove("remaining_days");
            edit.remove("is_logged_in");
            edit.remove("mentor_id");
            edit.remove(NotificationCompat.CATEGORY_EMAIL);
            edit.putBoolean("bot_active", false);
            edit.putBoolean("has_active_bots", false);
            edit.remove("linked_accounts");
            edit.putInt("app_version", 2);
            edit.apply();
            Toast.makeText(getContext(), "App updated - Please login again", 0).show();
        }
    }

    private final boolean validateLoginAndNavigateIfNeeded() {
        if (this.hasValidatedLogin) {
            return true;
        }
        SharedPreferences sharedPref = requireActivity().getSharedPreferences("app_prefs", 0);
        String mentorId = sharedPref.getString("mentor_id", "");
        boolean isLoggedIn = sharedPref.getBoolean("is_logged_in", false);
        CharSequence charSequence = mentorId;
        if ((charSequence == null || charSequence.length() == 0) || !isLoggedIn || !Intrinsics.areEqual((Object) mentorId, (Object) "2001")) {
            SharedPreferences.Editor edit = sharedPref.edit();
            edit.remove("is_logged_in");
            edit.remove("mentor_id");
            edit.remove(NotificationCompat.CATEGORY_EMAIL);
            edit.remove("license_validated");
            edit.remove("license_permanent_active");
            edit.remove("license_key");
            edit.apply();
            new Handler(Looper.getMainLooper()).postDelayed(new HomeFragment$$ExternalSyntheticLambda7(this), 100);
            return false;
        }
        this.hasValidatedLogin = true;
        return true;
    }

    /* access modifiers changed from: private */
    public static final void validateLoginAndNavigateIfNeeded$lambda$4(HomeFragment this$0) {
        try {
            FragmentKt.findNavController(this$0).navigate(R.id.loginFragment);
        } catch (Exception e) {
            FragmentActivity activity = this$0.getActivity();
            if (activity != null) {
                activity.recreate();
            }
        }
    }

    private final void checkAndNavigateIfLicenseValid() {
        if (!this.hasNavigatedToBotDetail) {
            SharedPreferences sharedPref = requireActivity().getSharedPreferences("app_prefs", 0);
            boolean hasValidLicense = sharedPref.getBoolean("license_validated", false);
            long expiryTime = sharedPref.getLong("license_expiry_date", 0);
            long currentTime = System.currentTimeMillis();
            if (hasValidLicense && expiryTime > currentTime) {
                this.hasNavigatedToBotDetail = true;
                new Handler(Looper.getMainLooper()).postDelayed(new HomeFragment$$ExternalSyntheticLambda0(this), 200);
            } else if (hasValidLicense && expiryTime <= currentTime) {
                SharedPreferences.Editor edit = sharedPref.edit();
                edit.putBoolean("license_validated", false);
                edit.putBoolean("license_permanent_active", false);
                edit.putBoolean("has_active_bots", false);
                edit.remove("license_key");
                edit.apply();
                showExpiredLicenseDialog();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void checkAndNavigateIfLicenseValid$lambda$5(HomeFragment this$0) {
        try {
            FragmentKt.findNavController(this$0).navigate(R.id.action_homeFragment_to_botDetailFragment);
        } catch (Exception e) {
            try {
                FragmentKt.findNavController(this$0).navigate(R.id.botDetailFragment);
            } catch (Exception e2) {
                this$0.hasNavigatedToBotDetail = false;
            }
        }
    }

    private final void showNoLicenseDialog() {
        new MaterialAlertDialogBuilder(requireContext()).setTitle((CharSequence) "🔐 License Key Required").setMessage((CharSequence) "You must enter a valid Sniper EA license key to access MetaTrader features.\n\nWithout a license key, you cannot:\n• Connect to MetaTrader accounts\n• Use automated trading\n• Access trading signals\n\nPlease enter your license key to unlock all features.").setPositiveButton((CharSequence) "Enter License Key", (DialogInterface.OnClickListener) new HomeFragment$$ExternalSyntheticLambda5(this)).setNegativeButton((CharSequence) "Cancel", (DialogInterface.OnClickListener) new HomeFragment$$ExternalSyntheticLambda6()).setCancelable(true).show();
        Toast.makeText(getContext(), "⌛ License key required for MetaTrader", 1).show();
    }

    /* access modifiers changed from: private */
    public static final void showNoLicenseDialog$lambda$7(HomeFragment this$0, DialogInterface dialog, int i) {
        FragmentKt.findNavController(this$0).navigate(R.id.action_homeFragment_to_licenseKeyFragment);
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void showNoLicenseDialog$lambda$8(DialogInterface dialog, int i) {
        dialog.dismiss();
    }

    private final void showExpiredLicenseDialog() {
        SharedPreferences sharedPref = requireActivity().getSharedPreferences("app_prefs", 0);
        long expiryTime = sharedPref.getLong("license_expiry_date", 0);
        String licenseType = "";
        String string = sharedPref.getString("license_type", licenseType);
        if (string != null) {
            licenseType = string;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy", Locale.getDefault());
        Date expiryDate = new Date(expiryTime);
        MaterialAlertDialogBuilder title = new MaterialAlertDialogBuilder(requireContext()).setTitle((CharSequence) "⚠️ License Expired");
        String upperCase = licenseType.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        title.setMessage((CharSequence) "Your " + upperCase + " license expired on:\n" + dateFormat.format(expiryDate) + "\n\nPlease renew your license to continue using MetaTrader features.\n\nContact support: +27 72 823 9526").setPositiveButton((CharSequence) "Renew License", (DialogInterface.OnClickListener) new HomeFragment$$ExternalSyntheticLambda3(this)).setNegativeButton((CharSequence) "Cancel", (DialogInterface.OnClickListener) new HomeFragment$$ExternalSyntheticLambda4()).setCancelable(true).show();
        Toast.makeText(getContext(), "⚠️ License expired - Please renew", 1).show();
    }

    /* access modifiers changed from: private */
    public static final void showExpiredLicenseDialog$lambda$9(HomeFragment this$0, DialogInterface dialog, int i) {
        FragmentKt.findNavController(this$0).navigate(R.id.action_homeFragment_to_licenseKeyFragment);
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void showExpiredLicenseDialog$lambda$10(DialogInterface dialog, int i) {
        dialog.dismiss();
    }

    private final void updateUIBasedOnLicenseStatus() {
        BottomNavigationView bottomNavigationView;
        BottomNavigationView bottomNavigationView2;
        CharSequence charSequence;
        SharedPreferences sharedPref = requireActivity().getSharedPreferences("app_prefs", 0);
        boolean hasValidLicense = sharedPref.getBoolean("license_validated", false);
        long expiryTime = sharedPref.getLong("license_expiry_date", 0);
        String studentName = "";
        if (sharedPref.getString("license_type", studentName) == null) {
            String str = studentName;
        }
        String string = sharedPref.getString("student_name", studentName);
        if (string != null) {
            studentName = string;
        }
        long currentTime = System.currentTimeMillis();
        View view = getView();
        Button addNewEaButton = view != null ? (Button) view.findViewById(R.id.addNewEaButton) : null;
        BottomNavigationView bottomNavigationView3 = this.bottomNavigation;
        if (bottomNavigationView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomNavigation");
            bottomNavigationView3 = null;
        }
        MenuItem findItem = bottomNavigationView3.getMenu().findItem(R.id.nav_metatrader);
        if (!hasValidLicense || expiryTime <= currentTime) {
            if (addNewEaButton != null) {
                Button button = addNewEaButton;
                button.setText("🔒 Enter License Key to Unlock");
                button.setBackgroundColor(Color.parseColor("#FFA000"));
                button.setEnabled(true);
            }
            BottomNavigationView bottomNavigationView4 = this.bottomNavigation;
            if (bottomNavigationView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomNavigation");
                bottomNavigationView = null;
            } else {
                bottomNavigationView = bottomNavigationView4;
            }
            BadgeDrawable orCreateBadge = bottomNavigationView.getOrCreateBadge(R.id.nav_metatrader);
            BadgeDrawable badgeDrawable = orCreateBadge;
            badgeDrawable.setText("🔒");
            badgeDrawable.setBackgroundColor(Color.parseColor("#F44336"));
            badgeDrawable.setVisible(true);
            Intrinsics.checkNotNull(orCreateBadge);
            return;
        }
        long j = expiryTime;
        int remainingDays = (int) ((expiryTime - currentTime) / ((long) 86400000));
        if (addNewEaButton != null) {
            Button button2 = addNewEaButton;
            if (studentName.length() > 0) {
                charSequence = "➕ " + studentName + " - Bot Active (" + remainingDays + " days)";
            } else {
                charSequence = "➕ Add New EA Bot (" + remainingDays + " days left)";
            }
            button2.setText(charSequence);
            button2.setBackgroundColor(Color.parseColor("#4CAF50"));
            button2.setEnabled(true);
        }
        BottomNavigationView bottomNavigationView5 = this.bottomNavigation;
        if (bottomNavigationView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomNavigation");
            bottomNavigationView2 = null;
        } else {
            bottomNavigationView2 = bottomNavigationView5;
        }
        BadgeDrawable orCreateBadge2 = bottomNavigationView2.getOrCreateBadge(R.id.nav_metatrader);
        orCreateBadge2.setText("PRO");
        orCreateBadge2.setBackgroundColor(Color.parseColor("#4CAF50"));
        orCreateBadge2.setVisible(true);
        if (studentName.length() > 0) {
            Toast.makeText(getContext(), "✅ Welcome back " + studentName + "! License active: " + remainingDays + " days left", 0).show();
        }
    }

    public void onResume() {
        super.onResume();
        this.hasNavigatedToBotDetail = false;
        this.hasValidatedLogin = false;
        if (validateLoginAndNavigateIfNeeded()) {
            checkAndNavigateIfLicenseValid();
            if (!this.hasNavigatedToBotDetail) {
                updateUIBasedOnLicenseStatus();
            }
        }
    }

    public void onPause() {
        super.onPause();
        this.hasNavigatedToBotDetail = false;
    }
}
