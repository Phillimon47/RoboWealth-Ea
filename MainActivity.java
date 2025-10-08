package com.example.snipereambatha;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.os.EnvironmentCompat;
import androidx.navigation.ActivityKt;
import androidx.navigation.NavController;
import com.example.snipereambatha.services.FloatingWidgetService;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u0007H\u0002J\u0006\u0010\u000b\u001a\u00020\u0007J\b\u0010\f\u001a\u00020\u0007H\u0002J\u001a\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0006\u0010\u0012\u001a\u00020\u0007J\"\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0006\u0010\u0018\u001a\u00020\u0007J\b\u0010\u0019\u001a\u00020\u0007H\u0014J\b\u0010\u001a\u001a\u00020\u0007H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/example/snipereambatha/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "OVERLAY_PERMISSION_REQUEST_CODE", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "checkUserLoginAndNavigate", "performLogout", "checkLicenseValidity", "showLicenseStatus", "expiryTime", "", "licenseType", "", "checkOverlayPermission", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "startFloatingWidgetService", "onResume", "onDestroy", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* compiled from: MainActivity.kt */
public final class MainActivity extends AppCompatActivity {
    private final int OVERLAY_PERMISSION_REQUEST_CODE = 100;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkUserLoginAndNavigate();
        if (getSharedPreferences("app_prefs", 0).getString("mentor_id", (String) null) != null) {
            checkLicenseValidity();
        }
    }

    private final void checkUserLoginAndNavigate() {
        getWindow().getDecorView().post(new MainActivity$$ExternalSyntheticLambda0(this, getSharedPreferences("app_prefs", 0).getString("mentor_id", (String) null)));
    }

    /* access modifiers changed from: private */
    public static final void checkUserLoginAndNavigate$lambda$0(MainActivity this$0, String $mentorId) {
        try {
            NavController navController = ActivityKt.findNavController(this$0, R.id.nav_host_fragment);
            if ($mentorId == null) {
                navController.navigate(R.id.loginFragment);
            } else {
                navController.navigate(R.id.homeFragment);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void performLogout() {
        SharedPreferences.Editor edit = getSharedPreferences("app_prefs", 0).edit();
        edit.remove("mentor_id");
        edit.remove(NotificationCompat.CATEGORY_EMAIL);
        edit.putBoolean("bot_active", false);
        edit.putBoolean("has_active_bots", false);
        edit.apply();
        try {
            stopService(new Intent(this, FloatingWidgetService.class));
        } catch (Exception e) {
        }
        try {
            ActivityKt.findNavController(this, R.id.nav_host_fragment).navigate(R.id.loginFragment);
        } catch (Exception e2) {
            recreate();
        }
        Toast.makeText(this, "Logged out successfully", 0).show();
    }

    private final void checkLicenseValidity() {
        SharedPreferences sharedPref = getSharedPreferences("app_prefs", 0);
        if (sharedPref.getBoolean("license_validated", false)) {
            long expiryTime = sharedPref.getLong("license_expiry_date", 0);
            String licenseType = sharedPref.getString("license_type", EnvironmentCompat.MEDIA_UNKNOWN);
            if (expiryTime <= System.currentTimeMillis()) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy", Locale.getDefault());
                Date expiryDate = new Date(expiryTime);
                new AlertDialog.Builder(this).setTitle((CharSequence) "License Expired").setMessage((CharSequence) "Your SNIPER EA " + licenseType + " license expired on " + dateFormat.format(expiryDate) + ".\n\nPlease renew to continue using the bot.").setPositiveButton((CharSequence) "Renew License", (DialogInterface.OnClickListener) new MainActivity$$ExternalSyntheticLambda1(this)).setNegativeButton((CharSequence) "Later", (DialogInterface.OnClickListener) new MainActivity$$ExternalSyntheticLambda2(sharedPref, this)).setCancelable(false).show();
                SharedPreferences.Editor edit = sharedPref.edit();
                edit.putBoolean("license_validated", false);
                edit.putBoolean("has_active_bots", false);
                edit.apply();
                return;
            }
            showLicenseStatus(expiryTime, licenseType);
        }
    }

    /* access modifiers changed from: private */
    public static final void checkLicenseValidity$lambda$2(MainActivity this$0, DialogInterface dialogInterface, int i) {
        try {
            ActivityKt.findNavController(this$0, R.id.nav_host_fragment).navigate(R.id.licenseKeyFragment);
        } catch (Exception e) {
            Toast.makeText(this$0, "Please restart the app", 0).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void checkLicenseValidity$lambda$4(SharedPreferences $sharedPref, MainActivity this$0, DialogInterface dialogInterface, int i) {
        SharedPreferences.Editor edit = $sharedPref.edit();
        edit.putBoolean("bot_active", false);
        edit.apply();
        Toast.makeText(this$0, "Bot features disabled until license renewal", 1).show();
    }

    private final void showLicenseStatus(long expiryTime, String licenseType) {
        int daysRemaining = (int) ((expiryTime - System.currentTimeMillis()) / ((long) 86400000));
        if (daysRemaining <= 3) {
            Toast.makeText(this, "License expires in " + daysRemaining + " days. Please renew soon!", 1).show();
        } else if (daysRemaining <= 7) {
            Toast.makeText(this, "License valid for " + daysRemaining + " more days", 0).show();
        }
    }

    public final void checkOverlayPermission() {
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    public final void startFloatingWidgetService() {
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (getSharedPreferences("app_prefs", 0).getString("mentor_id", (String) null) != null) {
            checkLicenseValidity();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }
}
