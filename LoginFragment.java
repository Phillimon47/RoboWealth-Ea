package com.example.snipereambatha.fragments;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.NotificationCompat;
import androidx.core.net.MailTo;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.FragmentKt;
import com.example.snipereambatha.R;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0002J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0006H\u0002J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0006H\u0002J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0006H\u0002J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0006H\u0002J\u0018\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0002J\u0018\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0002J\b\u0010#\u001a\u00020\u0013H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u0006H\u0002J\u0018\u0010&\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0002J\b\u0010'\u001a\u00020\u0013H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/example/snipereambatha/fragments/LoginFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "VALID_MENTOR_IDS", "", "", "WHOP_PAYMENT_URL", "SUPPORT_EMAIL", "SUPPORT_WHATSAPP", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "loadValidMentorIds", "showPaymentRequiredDialogAndAutoPay", "enteredId", "email", "openWhopPayment", "showPaymentInstructionsDialog", "openWhatsApp", "userEmail", "sendSupportEmail", "copyToClipboard", "label", "text", "saveAttemptedLogin", "mentorId", "checkExistingLogin", "isValidEmail", "", "proceedWithLogin", "onResume", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* compiled from: LoginFragment.kt */
public final class LoginFragment extends Fragment {
    private final String SUPPORT_EMAIL = "fxsniper076@gmail.com";
    private final String SUPPORT_WHATSAPP = "+27728239526";
    private final List<String> VALID_MENTOR_IDS = CollectionsKt.mutableListOf("2001");
    private final String WHOP_PAYMENT_URL = "https://whop.com/sniper-mobile-host-f499/sniper-mobile-host-be";

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        EditText mentorIdInput = (EditText) view.findViewById(R.id.mentorIdInput);
        loadValidMentorIds();
        checkExistingLogin();
        ((Button) view.findViewById(R.id.proceedButton)).setOnClickListener(new LoginFragment$$ExternalSyntheticLambda6(mentorIdInput, (EditText) view.findViewById(R.id.emailInput), this));
        mentorIdInput.setHint("Enter your Mentor ID");
    }

    /* access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(EditText $mentorIdInput, EditText $emailInput, LoginFragment this$0, View it) {
        String mentorId = StringsKt.trim((CharSequence) $mentorIdInput.getText().toString()).toString();
        String email = StringsKt.trim((CharSequence) $emailInput.getText().toString()).toString();
        boolean z = true;
        if (mentorId.length() == 0) {
            $mentorIdInput.setError("Mentor ID required");
            Toast.makeText(this$0.getContext(), "Please enter Mentor ID", 0).show();
            return;
        }
        if (email.length() != 0) {
            z = false;
        }
        if (z) {
            $emailInput.setError("Email required");
            Toast.makeText(this$0.getContext(), "Please enter email", 0).show();
        } else if (!this$0.isValidEmail(email)) {
            $emailInput.setError("Invalid email format");
            Toast.makeText(this$0.getContext(), "Please enter valid email", 0).show();
        } else if (Intrinsics.areEqual((Object) mentorId, (Object) "2001")) {
            this$0.proceedWithLogin(mentorId, email);
        } else {
            this$0.showPaymentRequiredDialogAndAutoPay(mentorId, email);
        }
    }

    private final void loadValidMentorIds() {
        Set additionalIds = requireActivity().getSharedPreferences("app_prefs", 0).getStringSet("additional_mentor_ids", SetsKt.emptySet());
        if (additionalIds == null) {
            additionalIds = SetsKt.emptySet();
        }
        this.VALID_MENTOR_IDS.addAll(additionalIds);
    }

    private final void showPaymentRequiredDialogAndAutoPay(String enteredId, String email) {
        saveAttemptedLogin(enteredId, email);
        AlertDialog dialog = new AlertDialog.Builder(requireContext()).setTitle((CharSequence) "🔓 Get Access - Only $8").setMessage((CharSequence) StringsKt.trimIndent("\n            ❌ Mentor ID '" + enteredId + "' is not valid.\n            \n            📱 SNIPER EA MBATHA - Premium Trading Bot\n            \n            💰 One-Time Payment: $8 USD Only!\n            \n            ✅ What you get for just $8:\n            • Lifetime access - No monthly fees!\n            • Your personal Mentor ID\n            • All premium features unlocked\n            • Free updates forever\n            • 24/7 Trading signals\n            • Direct WhatsApp support\n            • Access to all trading modes\n            • Multi-account support\n            \n            🔄 Opening payment page automatically...\n        ")).setPositiveButton((CharSequence) "💬 WhatsApp Support", (DialogInterface.OnClickListener) new LoginFragment$$ExternalSyntheticLambda0(this, email)).setNegativeButton((CharSequence) "OK", (DialogInterface.OnClickListener) new LoginFragment$$ExternalSyntheticLambda1()).setCancelable(true).create();
        Intrinsics.checkNotNullExpressionValue(dialog, "create(...)");
        dialog.show();
        new Handler(Looper.getMainLooper()).postDelayed(new LoginFragment$$ExternalSyntheticLambda2(this, email, dialog), 2000);
    }

    /* access modifiers changed from: private */
    public static final void showPaymentRequiredDialogAndAutoPay$lambda$1(LoginFragment this$0, String $email, DialogInterface dialogInterface, int i) {
        this$0.openWhatsApp($email);
    }

    /* access modifiers changed from: private */
    public static final void showPaymentRequiredDialogAndAutoPay$lambda$2(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void showPaymentRequiredDialogAndAutoPay$lambda$4(LoginFragment this$0, String $email, AlertDialog $dialog) {
        this$0.openWhopPayment($email);
        new Handler(Looper.getMainLooper()).postDelayed(new LoginFragment$$ExternalSyntheticLambda5($dialog, this$0, $email), 1000);
    }

    /* access modifiers changed from: private */
    public static final void showPaymentRequiredDialogAndAutoPay$lambda$4$lambda$3(AlertDialog $dialog, LoginFragment this$0, String $email) {
        if ($dialog.isShowing()) {
            $dialog.dismiss();
        }
        this$0.showPaymentInstructionsDialog($email);
    }

    private final void openWhopPayment(String email) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.WHOP_PAYMENT_URL)));
            Toast.makeText(getContext(), "Complete payment to get your Mentor ID", 1).show();
        } catch (Exception e) {
            Toast.makeText(getContext(), "Opening payment page...", 0).show();
            copyToClipboard("Payment Link", this.WHOP_PAYMENT_URL);
        }
    }

    private final void showPaymentInstructionsDialog(String email) {
        new AlertDialog.Builder(requireContext()).setTitle((CharSequence) "📝 After Payment").setMessage((CharSequence) StringsKt.trimIndent("\n                ✅ After completing your $8 payment:\n                \n                1. 📸 Take a screenshot of confirmation\n                \n                2. 📱 Send to WhatsApp (FASTEST):\n                   +27 72 823 9526\n                   \n                   Message: \"Paid - " + email + "\"\n                \n                3. ⏰ You'll receive in 15-30 minutes:\n                   • Your unique Mentor ID (like 2002)\n                   • Quick start guide\n                   \n                💡 Keep this app open!\n                Return here and enter your new Mentor ID\n                \n                Need help? WhatsApp us anytime!\n            ")).setPositiveButton((CharSequence) "Open WhatsApp", (DialogInterface.OnClickListener) new LoginFragment$$ExternalSyntheticLambda3(this, email)).setNeutralButton((CharSequence) "Copy Number", (DialogInterface.OnClickListener) new LoginFragment$$ExternalSyntheticLambda4(this)).setNegativeButton((CharSequence) "OK", (DialogInterface.OnClickListener) null).show();
    }

    /* access modifiers changed from: private */
    public static final void showPaymentInstructionsDialog$lambda$5(LoginFragment this$0, String $email, DialogInterface dialogInterface, int i) {
        this$0.openWhatsApp($email);
    }

    /* access modifiers changed from: private */
    public static final void showPaymentInstructionsDialog$lambda$6(LoginFragment this$0, DialogInterface dialogInterface, int i) {
        this$0.copyToClipboard("WhatsApp", "+27728239526");
    }

    private final void openWhatsApp(String userEmail) {
        String message;
        try {
            if (userEmail.length() > 0) {
                message = "Hi! I just paid $8 on Whop for SNIPER EA access. My email: " + userEmail + ". Please send my Mentor ID.";
            } else {
                message = "Hi! I want to pay $8 for SNIPER EA MBATHA access.";
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://api.whatsapp.com/send?phone=27728239526&text=" + Uri.encode(message)));
            startActivity(intent);
        } catch (Exception e) {
            Toast.makeText(getContext(), "WhatsApp not installed", 0).show();
            copyToClipboard("WhatsApp", "+27728239526");
        }
    }

    private final void sendSupportEmail(String userEmail) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        Intent intent2 = intent;
        intent2.setData(Uri.parse(MailTo.MAILTO_SCHEME));
        intent2.putExtra("android.intent.extra.EMAIL", new String[]{this.SUPPORT_EMAIL});
        intent2.putExtra("android.intent.extra.SUBJECT", "SNIPER EA - Request Access");
        intent2.putExtra("android.intent.extra.TEXT", StringsKt.trimIndent("\n                Hello,\n                \n                I would like to purchase SNIPER EA MBATHA access ($8).\n                \n                My email: " + userEmail + "\n                \n                Please send me payment instructions.\n                \n                Thank you!\n            "));
        try {
            startActivity(intent);
        } catch (Exception e) {
            Toast.makeText(getContext(), "No email app found", 0).show();
            copyToClipboard("Email", this.SUPPORT_EMAIL);
        }
    }

    private final void copyToClipboard(String label, String text) {
        Object systemService = requireContext().getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(label, text));
        Toast.makeText(getContext(), label + " copied!", 0).show();
    }

    private final void saveAttemptedLogin(String mentorId, String email) {
        SharedPreferences.Editor edit = requireActivity().getSharedPreferences("app_prefs", 0).edit();
        edit.putString("attempted_mentor_id", mentorId);
        edit.putString("attempted_email", email);
        edit.putLong("payment_redirect_time", System.currentTimeMillis());
        edit.apply();
    }

    private final void checkExistingLogin() {
        boolean z = false;
        SharedPreferences sharedPref = requireActivity().getSharedPreferences("app_prefs", 0);
        String savedMentorId = sharedPref.getString("mentor_id", "");
        if (sharedPref.getBoolean("is_logged_in", false)) {
            CharSequence charSequence = savedMentorId;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            }
            if (!z && this.VALID_MENTOR_IDS.contains(savedMentorId)) {
                try {
                    FragmentKt.findNavController(this).navigate(R.id.action_loginFragment_to_homeFragment);
                } catch (Exception e) {
                }
            }
        }
    }

    private final boolean isValidEmail(String email) {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    private final void proceedWithLogin(String mentorId, String email) {
        Toast.makeText(getContext(), "✅ Welcome to SNIPER EA!", 1).show();
        SharedPreferences.Editor edit = requireActivity().getSharedPreferences("app_prefs", 0).edit();
        edit.putString("mentor_id", mentorId);
        edit.putString(NotificationCompat.CATEGORY_EMAIL, email);
        edit.putBoolean("is_logged_in", true);
        edit.putLong("login_timestamp", System.currentTimeMillis());
        edit.putString("mentor_status", "ACTIVE");
        edit.remove("license_validated");
        edit.remove("license_permanent_active");
        edit.remove("license_key");
        edit.apply();
        try {
            FragmentKt.findNavController(this).navigate(R.id.action_loginFragment_to_homeFragment);
        } catch (Exception e) {
            Toast.makeText(getContext(), "Navigation error: Please restart app", 1).show();
        }
    }

    public void onResume() {
        super.onResume();
        View view = getView();
        EditText emailInput = null;
        EditText mentorIdInput = view != null ? (EditText) view.findViewById(R.id.mentorIdInput) : null;
        View view2 = getView();
        if (view2 != null) {
            emailInput = (EditText) view2.findViewById(R.id.emailInput);
        }
        boolean z = false;
        SharedPreferences sharedPref = requireActivity().getSharedPreferences("app_prefs", 0);
        if (sharedPref.getBoolean("is_logged_in", false)) {
            if (mentorIdInput != null) {
                mentorIdInput.setText("");
            }
            if (emailInput != null) {
                emailInput.setText("");
                return;
            }
            return;
        }
        String attemptedId = sharedPref.getString("attempted_mentor_id", "");
        String attemptedEmail = sharedPref.getString("attempted_email", "");
        long paymentTime = sharedPref.getLong("payment_redirect_time", 0);
        CharSequence charSequence = attemptedId;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        }
        if (!z && System.currentTimeMillis() - paymentTime < 300000) {
            if (mentorIdInput != null) {
                mentorIdInput.setText("");
            }
            if (emailInput != null) {
                emailInput.setText(attemptedEmail);
            }
            Toast.makeText(getContext(), "Enter your new Mentor ID after payment confirmation", 1).show();
            SharedPreferences.Editor edit = sharedPref.edit();
            edit.remove("attempted_mentor_id");
            edit.remove("payment_redirect_time");
            edit.apply();
        }
    }
}
