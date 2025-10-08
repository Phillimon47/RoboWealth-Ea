package com.example.snipereambatha.services;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.example.snipereambatha.R;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00012\u00020\u0001:\u0002\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010E\u001a\u0004\u0018\u00010F2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\b\u0010I\u001a\u00020JH\u0016J\"\u0010K\u001a\u0002082\b\u0010G\u001a\u0004\u0018\u00010H2\u0006\u0010L\u001a\u0002082\u0006\u0010M\u001a\u000208H\u0016J\b\u0010N\u001a\u00020JH\u0002J\b\u0010O\u001a\u00020JH\u0002J\b\u0010P\u001a\u00020JH\u0002J\b\u0010Q\u001a\u00020JH\u0002J\u0012\u0010R\u001a\u0004\u0018\u00010(2\u0006\u0010S\u001a\u00020(H\u0002J\u0010\u0010T\u001a\u00020J2\u0006\u0010G\u001a\u00020HH\u0002J\u0010\u0010U\u001a\u00020J2\u0006\u0010G\u001a\u00020HH\u0002J\b\u0010V\u001a\u00020JH\u0002J\b\u0010W\u001a\u00020JH\u0002J\b\u0010X\u001a\u00020JH\u0002J\b\u0010Y\u001a\u00020JH\u0002J\u0018\u0010Z\u001a\u00020J2\u0006\u0010[\u001a\u00020(2\u0006\u0010\\\u001a\u00020(H\u0002J\b\u0010]\u001a\u00020JH\u0002J\u0012\u0010^\u001a\u00020J2\b\u0010_\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u0010`\u001a\u00020JH\u0002J\b\u0010a\u001a\u00020JH\u0002J\b\u0010b\u001a\u00020JH\u0002J\u0010\u0010c\u001a\u00020J2\u0006\u0010d\u001a\u000208H\u0002J\u0010\u0010e\u001a\u00020J2\u0006\u0010d\u001a\u000208H\u0002J \u0010f\u001a\u00020J2\u0006\u0010g\u001a\u0002082\u0006\u0010h\u001a\u00020(2\u0006\u0010i\u001a\u000208H\u0002J\b\u0010j\u001a\u00020JH\u0002J\u0010\u0010k\u001a\u00020J2\u0006\u0010l\u001a\u00020mH\u0002J\b\u0010n\u001a\u00020JH\u0002J\b\u0010o\u001a\u00020JH\u0002J\b\u0010p\u001a\u00020JH\u0002J\b\u0010q\u001a\u00020JH\u0002J\b\u0010r\u001a\u00020JH\u0002J\b\u0010s\u001a\u00020JH\u0002J\b\u0010t\u001a\u00020JH\u0002J\b\u0010u\u001a\u00020JH\u0002J\b\u0010v\u001a\u00020JH\u0002J\u001c\u0010w\u001a\u00020(2\u0006\u0010x\u001a\u00020+2\n\b\u0002\u0010y\u001a\u0004\u0018\u00010(H\u0002J\u0010\u0010z\u001a\u00020J2\u0006\u0010G\u001a\u00020HH\u0002J\b\u0010{\u001a\u00020JH\u0002J\u0010\u0010|\u001a\u0002042\u0006\u0010}\u001a\u00020(H\u0002J\b\u0010~\u001a\u00020JH\u0002J\t\u0010\u001a\u00030\u0001H\u0002J\t\u0010\u0001\u001a\u00020JH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020+X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020+X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020+X\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020(X\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020(X\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020(X\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000204X\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020(X\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u000208X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020(X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010;\u001a\b\u0012\u0004\u0012\u00020(0<X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u000208X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u000208X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020(X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u000204X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020(0<X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u000208X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u000204X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020(0<X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lcom/example/snipereambatha/services/FloatingWidgetService;", "Landroid/app/Service;", "<init>", "()V", "windowManager", "Landroid/view/WindowManager;", "floatingView", "Landroid/view/View;", "expandedContainer", "Landroid/widget/LinearLayout;", "collapseView", "Landroid/widget/RelativeLayout;", "dateTimeText", "Landroid/widget/TextView;", "countdownText", "accountStatusText", "internetStatusText", "symbolStatusText", "robotStatusText", "statusContainer", "modeText", "modeButton", "modeContainer", "tradeInfoContainer", "tradeTypeText", "tradePriceText", "tradeSlText", "tradeTpText", "copySymbolButton", "Landroid/widget/Button;", "copyTpButton", "copySlButton", "copyAllButton", "handler", "Landroid/os/Handler;", "updateRunnable", "Ljava/lang/Runnable;", "countdownTimer", "Landroid/os/CountDownTimer;", "eaSignalSymbol", "", "eaSignalAction", "eaSignalSL", "", "eaSignalTP", "eaSignalVolume", "studentSymbol", "studentLotSize", "studentName", "studentLogin", "currentSignalSource", "hasActiveSignal", "", "bridgeConnected", "lastSignalId", "totalAccounts", "", "executingAccounts", "currentMode", "tradingModes", "", "currentModeIndex", "todayTradesCount", "lastTradeDate", "isProcessingSignal", "studentSymbols", "countdownSeconds", "isCountdownActive", "VALID_EA_SOURCES", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "", "onStartCommand", "flags", "startId", "loadStudentData", "resetDailyTradeCount", "saveTradeCount", "loadTradeCount", "findStudentSymbolForEASignal", "eaSymbol", "handleIntent", "handleNewSignalAlert", "processSignalWithMode", "setupFloatingWidget", "initializeCopyButtons", "showCopyButtons", "copyToClipboard", "label", "text", "copyAllSignalData", "flashButton", "button", "switchMode", "updateModeDisplay", "updateModeOnBridge", "startCountdown", "seconds", "updateCountdownDisplay", "updateStageDisplay", "stage", "stageText", "accountsCount", "updateSymbolDisplay", "setupTouchListener", "params", "Landroid/view/WindowManager$LayoutParams;", "setupClickListeners", "toggleExpanded", "toggleStatusDisplay", "updateDateTime", "startDataUpdates", "updateData", "updateStatusDisplay", "checkForNewSignals", "updateSignalDisplay", "formatPrice", "price", "symbol", "handleExecutionSuccess", "checkBridgeStatus", "isValidHostedSource", "source", "createNotificationChannel", "createNotification", "Landroid/app/Notification;", "onDestroy", "Companion", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* compiled from: FloatingWidgetService.kt */
public final class FloatingWidgetService extends Service {
    private static final String CHANNEL_ID = "FloatingWidgetChannel";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int NOTIFICATION_ID = 1001;
    private final List<String> VALID_EA_SOURCES = CollectionsKt.listOf("HOSTED_EA", "HOSTING_EA", "SNIPER_EA_HOST", "SNIPER_HOSTING_EA", "SNIPER_EA_MBATHA");
    private TextView accountStatusText;
    private boolean bridgeConnected;
    private RelativeLayout collapseView;
    private Button copyAllButton;
    private Button copySlButton;
    private Button copySymbolButton;
    private Button copyTpButton;
    private int countdownSeconds;
    /* access modifiers changed from: private */
    public TextView countdownText;
    private CountDownTimer countdownTimer;
    private String currentMode = "NORMAL";
    private int currentModeIndex;
    private String currentSignalSource = "";
    private TextView dateTimeText;
    private String eaSignalAction;
    private double eaSignalSL;
    private String eaSignalSymbol;
    private double eaSignalTP;
    private double eaSignalVolume = 0.01d;
    private int executingAccounts;
    private LinearLayout expandedContainer;
    private View floatingView;
    /* access modifiers changed from: private */
    public final Handler handler = new Handler(Looper.getMainLooper());
    private boolean hasActiveSignal;
    private TextView internetStatusText;
    /* access modifiers changed from: private */
    public boolean isCountdownActive;
    private boolean isProcessingSignal;
    private String lastSignalId = "";
    private String lastTradeDate = "";
    private TextView modeButton;
    private LinearLayout modeContainer;
    private TextView modeText;
    private TextView robotStatusText;
    private LinearLayout statusContainer;
    private String studentLogin = "";
    private double studentLotSize = 0.01d;
    private String studentName = "";
    private String studentSymbol;
    private List<String> studentSymbols = CollectionsKt.emptyList();
    private TextView symbolStatusText;
    private int todayTradesCount;
    private int totalAccounts;
    private LinearLayout tradeInfoContainer;
    private TextView tradePriceText;
    private TextView tradeSlText;
    private TextView tradeTpText;
    private TextView tradeTypeText;
    private final List<String> tradingModes = CollectionsKt.listOf("NORMAL", "ATTACK", "SCALP", "SWING", "HEDGE", "MARTINGALE", "GRID", "NEWS");
    private Runnable updateRunnable;
    private WindowManager windowManager;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/example/snipereambatha/services/FloatingWidgetService$Companion;", "", "<init>", "()V", "CHANNEL_ID", "", "NOTIFICATION_ID", "", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* compiled from: FloatingWidgetService.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        createNotificationChannel();
        startForeground(1001, createNotification());
        Object systemService = getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
        setupFloatingWidget();
        loadStudentData();
        resetDailyTradeCount();
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        if (intent != null) {
            handleIntent(intent);
        }
        startDataUpdates();
        return 1;
    }

    private final void loadStudentData() {
        List<String> list;
        SharedPreferences sharedPref = getSharedPreferences("app_prefs", 0);
        String str = "";
        String string = sharedPref.getString("student_name", str);
        if (string == null) {
            string = str;
        }
        this.studentName = string;
        this.studentLotSize = (double) sharedPref.getFloat("lot_size", 0.01f);
        Set<String> stringSet = sharedPref.getStringSet("selected_symbols", SetsKt.emptySet());
        if (stringSet == null || (list = CollectionsKt.toList(stringSet)) == null) {
            list = CollectionsKt.emptyList();
        }
        this.studentSymbols = list;
        Set accounts = sharedPref.getStringSet("linked_accounts", SetsKt.emptySet());
        if (accounts == null) {
            accounts = SetsKt.emptySet();
        }
        if (!accounts.isEmpty()) {
            String string2 = sharedPref.getString(((String) CollectionsKt.first(accounts)) + "_login", str);
            if (string2 != null) {
                str = string2;
            }
            this.studentLogin = str;
        }
        String str2 = "NORMAL";
        String string3 = sharedPref.getString("current_trading_mode", str2);
        if (string3 != null) {
            str2 = string3;
        }
        this.currentMode = str2;
        this.currentModeIndex = this.tradingModes.indexOf(this.currentMode);
        if (this.currentModeIndex == -1) {
            this.currentModeIndex = 0;
        }
    }

    private final void resetDailyTradeCount() {
        String today = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
        if (!Intrinsics.areEqual((Object) this.lastTradeDate, (Object) today)) {
            this.todayTradesCount = 0;
            this.lastTradeDate = today;
            saveTradeCount();
            return;
        }
        loadTradeCount();
    }

    private final void saveTradeCount() {
        SharedPreferences.Editor edit = getSharedPreferences("trade_tracking", 0).edit();
        edit.putInt("today_trades_count", this.todayTradesCount);
        edit.putString("last_trade_date", this.lastTradeDate);
        edit.apply();
    }

    private final void loadTradeCount() {
        SharedPreferences sharedPref = getSharedPreferences("trade_tracking", 0);
        this.todayTradesCount = sharedPref.getInt("today_trades_count", 0);
        String str = "";
        String string = sharedPref.getString("last_trade_date", str);
        if (string != null) {
            str = string;
        }
        this.lastTradeDate = str;
    }

    private final String findStudentSymbolForEASignal(String eaSymbol) {
        String upperCase = eaSymbol.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        String eaBase = new Regex("[^A-Z]").replace((CharSequence) upperCase, "");
        if (this.studentSymbols.contains(eaSymbol)) {
            return eaSymbol;
        }
        for (String studentSym : this.studentSymbols) {
            String upperCase2 = studentSym.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            if (Intrinsics.areEqual((Object) new Regex("[^A-Z]").replace((CharSequence) upperCase2, ""), (Object) eaBase)) {
                return studentSym;
            }
        }
        return eaSymbol;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [android.widget.RelativeLayout] */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v3, types: [android.widget.TextView] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void handleIntent(android.content.Intent r11) {
        /*
            r10 = this;
            java.lang.String r0 = r11.getAction()
            if (r0 == 0) goto L_0x015d
            int r1 = r0.hashCode()
            r2 = 1008981770(0x3c23d70a, float:0.01)
            java.lang.String r3 = "lot_size"
            java.lang.String r4 = "app_prefs"
            java.lang.String r5 = ""
            java.lang.String r6 = "countdown_seconds"
            r7 = 1
            r8 = 0
            r9 = 0
            switch(r1) {
                case -1659117592: goto L_0x013b;
                case -1582099044: goto L_0x012e;
                case -1341571995: goto L_0x00eb;
                case -1168928085: goto L_0x00c4;
                case -837884389: goto L_0x00b1;
                case -825047995: goto L_0x0086;
                case -755636924: goto L_0x0077;
                case -96506484: goto L_0x001d;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x015d
        L_0x001d:
            java.lang.String r1 = "UPDATE_SIGNAL_FOR_COPY"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0027
            goto L_0x015d
        L_0x0027:
            java.lang.String r0 = "signal_symbol"
            java.lang.String r0 = r11.getStringExtra(r0)
            r10.eaSignalSymbol = r0
            java.lang.String r0 = "signal_action"
            java.lang.String r0 = r11.getStringExtra(r0)
            r10.eaSignalAction = r0
            java.lang.String r0 = "signal_volume"
            r5 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r0 = r11.getDoubleExtra(r0, r5)
            r10.eaSignalVolume = r0
            java.lang.String r0 = "signal_sl"
            r5 = 0
            double r0 = r11.getDoubleExtra(r0, r5)
            r10.eaSignalSL = r0
            java.lang.String r0 = "signal_tp"
            double r0 = r11.getDoubleExtra(r0, r5)
            r10.eaSignalTP = r0
            java.lang.String r0 = r10.eaSignalSymbol
            if (r0 == 0) goto L_0x0060
            r1 = 0
            java.lang.String r8 = r10.findStudentSymbolForEASignal(r0)
        L_0x0060:
            r10.studentSymbol = r8
            android.content.SharedPreferences r0 = r10.getSharedPreferences(r4, r9)
            float r1 = r0.getFloat(r3, r2)
            double r1 = (double) r1
            r10.studentLotSize = r1
            r10.hasActiveSignal = r7
            r10.updateSignalDisplay()
            r10.showCopyButtons()
            goto L_0x015d
        L_0x0077:
            java.lang.String r1 = "NEW_SIGNAL_ALERT"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0081
            goto L_0x015d
        L_0x0081:
            r10.handleNewSignalAlert(r11)
            goto L_0x015d
        L_0x0086:
            java.lang.String r1 = "UPDATE_SYMBOLS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0090
            goto L_0x015d
        L_0x0090:
            java.lang.String r0 = "symbols"
            java.util.ArrayList r0 = r11.getStringArrayListExtra(r0)
            if (r0 == 0) goto L_0x009b
            java.util.List r0 = (java.util.List) r0
            goto L_0x009f
        L_0x009b:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L_0x009f:
            r10.studentSymbols = r0
            android.content.SharedPreferences r0 = r10.getSharedPreferences(r4, r9)
            float r1 = r0.getFloat(r3, r2)
            double r1 = (double) r1
            r10.studentLotSize = r1
            r10.updateSymbolDisplay()
            goto L_0x015d
        L_0x00b1:
            java.lang.String r1 = "UPDATE_COUNTDOWN"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00bb
            goto L_0x015d
        L_0x00bb:
            int r0 = r11.getIntExtra(r6, r9)
            r10.updateCountdownDisplay(r0)
            goto L_0x015d
        L_0x00c4:
            java.lang.String r1 = "UPDATE_LOADING_STATUS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00ce
            goto L_0x015d
        L_0x00ce:
            java.lang.String r0 = "loading_status"
            java.lang.String r0 = r11.getStringExtra(r0)
            if (r0 != 0) goto L_0x00d7
            goto L_0x00d8
        L_0x00d7:
            r5 = r0
        L_0x00d8:
            android.widget.TextView r0 = r10.robotStatusText
            if (r0 != 0) goto L_0x00e2
            java.lang.String r0 = "robotStatusText"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            goto L_0x00e3
        L_0x00e2:
            r8 = r0
        L_0x00e3:
            r0 = r5
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r8.setText(r0)
            goto L_0x015d
        L_0x00eb:
            java.lang.String r1 = "START_MONITORING"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00f5
            goto L_0x015d
        L_0x00f5:
            java.lang.String r0 = "show_immediately"
            boolean r0 = r11.getBooleanExtra(r0, r7)
            java.lang.String r1 = "auto_expand_on_signal"
            boolean r1 = r11.getBooleanExtra(r1, r7)
            if (r0 == 0) goto L_0x011e
            android.widget.RelativeLayout r2 = r10.collapseView
            java.lang.String r3 = "collapseView"
            if (r2 != 0) goto L_0x010d
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            r2 = r8
        L_0x010d:
            r2.setVisibility(r9)
            android.widget.RelativeLayout r2 = r10.collapseView
            if (r2 != 0) goto L_0x0118
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            goto L_0x0119
        L_0x0118:
            r8 = r2
        L_0x0119:
            r2 = 1065353216(0x3f800000, float:1.0)
            r8.setAlpha(r2)
        L_0x011e:
            r10.loadStudentData()
            r10.resetDailyTradeCount()
            int r2 = r11.getIntExtra(r6, r9)
            if (r2 <= 0) goto L_0x015d
            r10.startCountdown(r2)
            goto L_0x015d
        L_0x012e:
            java.lang.String r1 = "EXECUTION_SUCCESS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0137
            goto L_0x015d
        L_0x0137:
            r10.handleExecutionSuccess(r11)
            goto L_0x015d
        L_0x013b:
            java.lang.String r1 = "UPDATE_STAGE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0144
            goto L_0x015d
        L_0x0144:
            java.lang.String r0 = "stage"
            int r0 = r11.getIntExtra(r0, r9)
            java.lang.String r1 = "stage_text"
            java.lang.String r1 = r11.getStringExtra(r1)
            if (r1 != 0) goto L_0x0153
            goto L_0x0154
        L_0x0153:
            r5 = r1
        L_0x0154:
            java.lang.String r1 = "accounts_count"
            int r1 = r11.getIntExtra(r1, r9)
            r10.updateStageDisplay(r0, r5, r1)
        L_0x015d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.snipereambatha.services.FloatingWidgetService.handleIntent(android.content.Intent):void");
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v7, types: [android.widget.LinearLayout] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9, types: [android.widget.TextView] */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11, types: [android.widget.TextView] */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void handleNewSignalAlert(android.content.Intent r12) {
        /*
            r11 = this;
            java.lang.String r0 = r11.currentMode
            java.lang.String r1 = "NORMAL"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            java.lang.String r1 = "robotStatusText"
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x003a
            r0 = r11
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r4 = "Signal blocked - NORMAL mode active"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r4, r2)
            r0.show()
            android.widget.TextView r0 = r11.robotStatusText
            if (r0 != 0) goto L_0x0024
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r0 = r3
        L_0x0024:
            java.lang.String r2 = "BLOCKED: NORMAL mode"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            android.widget.TextView r0 = r11.robotStatusText
            if (r0 != 0) goto L_0x0033
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            goto L_0x0034
        L_0x0033:
            r3 = r0
        L_0x0034:
            r0 = -256(0xffffffffffffff00, float:NaN)
            r3.setTextColor(r0)
            return
        L_0x003a:
            java.lang.String r0 = r11.currentMode
            java.lang.String r4 = "ATTACK"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r4)
            if (r0 == 0) goto L_0x0076
            int r0 = r11.todayTradesCount
            r4 = 10
            if (r0 < r4) goto L_0x0076
            r0 = r11
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r4 = "ATTACK limit reached: 10/10"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r4, r2)
            r0.show()
            android.widget.TextView r0 = r11.robotStatusText
            if (r0 != 0) goto L_0x0060
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r0 = r3
        L_0x0060:
            java.lang.String r2 = "ATTACK LIMIT: 10/10"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            android.widget.TextView r0 = r11.robotStatusText
            if (r0 != 0) goto L_0x006f
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            goto L_0x0070
        L_0x006f:
            r3 = r0
        L_0x0070:
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r3.setTextColor(r0)
            return
        L_0x0076:
            java.lang.String r0 = "auto_expand"
            r1 = 1
            boolean r0 = r12.getBooleanExtra(r0, r1)
            java.lang.String r4 = "vibrate"
            boolean r4 = r12.getBooleanExtra(r4, r1)
            java.lang.String r5 = "play_sound"
            boolean r5 = r12.getBooleanExtra(r5, r1)
            java.lang.String r6 = "signal_symbol"
            java.lang.String r6 = r12.getStringExtra(r6)
            r11.eaSignalSymbol = r6
            java.lang.String r6 = "signal_action"
            java.lang.String r6 = r12.getStringExtra(r6)
            r11.eaSignalAction = r6
            java.lang.String r6 = "signal_volume"
            r7 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r6 = r12.getDoubleExtra(r6, r7)
            r11.eaSignalVolume = r6
            java.lang.String r6 = "signal_sl"
            r7 = 0
            double r9 = r12.getDoubleExtra(r6, r7)
            r11.eaSignalSL = r9
            java.lang.String r6 = "signal_tp"
            double r6 = r12.getDoubleExtra(r6, r7)
            r11.eaSignalTP = r6
            java.lang.String r6 = "total_accounts"
            int r6 = r12.getIntExtra(r6, r2)
            r11.totalAccounts = r6
            java.lang.String r6 = r11.eaSignalSymbol
            if (r6 == 0) goto L_0x00cb
            r7 = 0
            java.lang.String r6 = r11.findStudentSymbolForEASignal(r6)
            goto L_0x00cc
        L_0x00cb:
            r6 = r3
        L_0x00cc:
            r11.studentSymbol = r6
            java.lang.String r6 = "app_prefs"
            android.content.SharedPreferences r6 = r11.getSharedPreferences(r6, r2)
            java.lang.String r7 = "lot_size"
            r8 = 1008981770(0x3c23d70a, float:0.01)
            float r7 = r6.getFloat(r7, r8)
            double r7 = (double) r7
            r11.studentLotSize = r7
            java.lang.String r7 = "student_name"
            java.lang.String r8 = ""
            java.lang.String r7 = r6.getString(r7, r8)
            if (r7 != 0) goto L_0x00eb
            goto L_0x00ec
        L_0x00eb:
            r8 = r7
        L_0x00ec:
            r11.studentName = r8
            r11.hasActiveSignal = r1
            r11.processSignalWithMode()
            android.widget.RelativeLayout r1 = r11.collapseView
            if (r1 != 0) goto L_0x00fd
            java.lang.String r1 = "collapseView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r1 = r3
        L_0x00fd:
            r7 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r7)
            if (r0 == 0) goto L_0x0118
            android.widget.LinearLayout r1 = r11.expandedContainer
            if (r1 != 0) goto L_0x010e
            java.lang.String r1 = "expandedContainer"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            goto L_0x010f
        L_0x010e:
            r3 = r1
        L_0x010f:
            int r1 = r3.getVisibility()
            if (r1 == 0) goto L_0x0118
            r11.toggleExpanded()
        L_0x0118:
            if (r4 == 0) goto L_0x013e
            java.lang.String r1 = "vibrator"
            java.lang.Object r1 = r11.getSystemService(r1)     // Catch:{ Exception -> 0x013d }
            java.lang.String r3 = "null cannot be cast to non-null type android.os.Vibrator"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r3)     // Catch:{ Exception -> 0x013d }
            android.os.Vibrator r1 = (android.os.Vibrator) r1     // Catch:{ Exception -> 0x013d }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x013d }
            r7 = 26
            r8 = 500(0x1f4, double:2.47E-321)
            if (r3 < r7) goto L_0x0139
            r3 = -1
            android.os.VibrationEffect r3 = android.os.VibrationEffect.createOneShot(r8, r3)     // Catch:{ Exception -> 0x013d }
            r1.vibrate(r3)     // Catch:{ Exception -> 0x013d }
            goto L_0x013e
        L_0x0139:
            r1.vibrate(r8)     // Catch:{ Exception -> 0x013d }
            goto L_0x013e
        L_0x013d:
            r1 = move-exception
        L_0x013e:
            if (r5 == 0) goto L_0x0153
            r1 = 2
            android.net.Uri r1 = android.media.RingtoneManager.getDefaultUri(r1)     // Catch:{ Exception -> 0x0152 }
            android.content.Context r3 = r11.getApplicationContext()     // Catch:{ Exception -> 0x0152 }
            android.media.Ringtone r3 = android.media.RingtoneManager.getRingtone(r3, r1)     // Catch:{ Exception -> 0x0152 }
            r3.play()     // Catch:{ Exception -> 0x0152 }
            goto L_0x0153
        L_0x0152:
            r1 = move-exception
        L_0x0153:
            java.lang.String r1 = "countdown_seconds"
            int r1 = r12.getIntExtra(r1, r2)
            if (r1 <= 0) goto L_0x015e
            r11.startCountdown(r1)
        L_0x015e:
            r11.updateSignalDisplay()
            r11.showCopyButtons()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.snipereambatha.services.FloatingWidgetService.handleNewSignalAlert(android.content.Intent):void");
    }

    private final void processSignalWithMode() {
        if (!this.isProcessingSignal) {
            this.isProcessingSignal = true;
            new Thread(new FloatingWidgetService$$ExternalSyntheticLambda17(this)).start();
        }
    }

    /* access modifiers changed from: private */
    public static final void processSignalWithMode$lambda$7(FloatingWidgetService this$0) {
        try {
            URLConnection openConnection = new URL("http://77.93.152.165:5000/signal_trade").openConnection();
            Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection connection = (HttpURLConnection) openConnection;
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);
            JSONObject signalData = new JSONObject();
            JSONObject jSONObject = signalData;
            jSONObject.put("ea_key", "SNIPER_EA_MBATHA20");
            jSONObject.put("magic", 123456);
            jSONObject.put("source", "FLOATING_WIDGET");
            jSONObject.put("symbol", this$0.eaSignalSymbol);
            jSONObject.put("action", this$0.eaSignalAction);
            jSONObject.put("volume", this$0.eaSignalVolume);
            jSONObject.put("sl", this$0.eaSignalSL);
            jSONObject.put("tp", this$0.eaSignalTP);
            jSONObject.put("student_mode", this$0.currentMode);
            jSONObject.put("student_login", this$0.studentLogin);
            jSONObject.put("price", 0);
            OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
            writer.write(signalData.toString());
            writer.flush();
            writer.close();
            if (connection.getResponseCode() == 200) {
                this$0.todayTradesCount++;
                this$0.saveTradeCount();
                this$0.handler.post(new FloatingWidgetService$$ExternalSyntheticLambda10(this$0));
            }
        } catch (Exception e) {
            this$0.handler.post(new FloatingWidgetService$$ExternalSyntheticLambda12(this$0));
        } catch (Throwable th) {
            this$0.isProcessingSignal = false;
            throw th;
        }
        this$0.isProcessingSignal = false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void processSignalWithMode$lambda$7$lambda$5(com.example.snipereambatha.services.FloatingWidgetService r7) {
        /*
            java.lang.String r0 = r7.currentMode
            int r1 = r0.hashCode()
            switch(r1) {
                case 2196294: goto L_0x005f;
                case 2392787: goto L_0x0051;
                case 68616709: goto L_0x0043;
                case 78713141: goto L_0x0035;
                case 79316702: goto L_0x0027;
                case 1109473486: goto L_0x0019;
                case 1941037640: goto L_0x000b;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x006d
        L_0x000b:
            java.lang.String r1 = "ATTACK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0014
            goto L_0x0009
        L_0x0014:
            int r0 = r7.todayTradesCount
            int r0 = 10 - r0
            goto L_0x006f
        L_0x0019:
            java.lang.String r1 = "MARTINGALE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0022
            goto L_0x0009
        L_0x0022:
            int r0 = r7.todayTradesCount
            int r0 = 7 - r0
            goto L_0x006f
        L_0x0027:
            java.lang.String r1 = "SWING"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0030
            goto L_0x0009
        L_0x0030:
            int r0 = r7.todayTradesCount
            int r0 = 4 - r0
            goto L_0x006f
        L_0x0035:
            java.lang.String r1 = "SCALP"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003e
            goto L_0x0009
        L_0x003e:
            int r0 = r7.todayTradesCount
            int r0 = 3 - r0
            goto L_0x006f
        L_0x0043:
            java.lang.String r1 = "HEDGE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x004c
            goto L_0x0009
        L_0x004c:
            int r0 = r7.todayTradesCount
            int r0 = 20 - r0
            goto L_0x006f
        L_0x0051:
            java.lang.String r1 = "NEWS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005a
            goto L_0x0009
        L_0x005a:
            int r0 = r7.todayTradesCount
            int r0 = 2 - r0
            goto L_0x006f
        L_0x005f:
            java.lang.String r1 = "GRID"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0068
            goto L_0x0009
        L_0x0068:
            int r0 = r7.todayTradesCount
            int r0 = 15 - r0
            goto L_0x006f
        L_0x006d:
            r0 = 999(0x3e7, float:1.4E-42)
        L_0x006f:
            android.widget.TextView r1 = r7.robotStatusText
            r2 = 0
            java.lang.String r3 = "robotStatusText"
            if (r1 != 0) goto L_0x007b
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            r1 = r2
        L_0x007b:
            java.lang.String r4 = r7.currentMode
            int r5 = r7.todayTradesCount
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r4 = r6.append(r4)
            java.lang.String r6 = ": "
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = " trades | "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r5 = " left"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r1.setText(r4)
            android.widget.TextView r1 = r7.robotStatusText
            if (r1 != 0) goto L_0x00b3
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            goto L_0x00b4
        L_0x00b3:
            r2 = r1
        L_0x00b4:
            r1 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r2.setTextColor(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.snipereambatha.services.FloatingWidgetService.processSignalWithMode$lambda$7$lambda$5(com.example.snipereambatha.services.FloatingWidgetService):void");
    }

    /* access modifiers changed from: private */
    public static final void processSignalWithMode$lambda$7$lambda$6(FloatingWidgetService this$0) {
        TextView textView = this$0.robotStatusText;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("robotStatusText");
            textView = null;
        }
        textView.setText("Failed to process signal");
        TextView textView3 = this$0.robotStatusText;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("robotStatusText");
        } else {
            textView2 = textView3;
        }
        textView2.setTextColor(SupportMenu.CATEGORY_MASK);
    }

    private final void setupFloatingWidget() {
        WindowManager.LayoutParams params;
        RelativeLayout relativeLayout = null;
        this.floatingView = LayoutInflater.from(this).inflate(R.layout.layout_floating_widget, (ViewGroup) null);
        View view = this.floatingView;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingView");
            view = null;
        }
        this.expandedContainer = (LinearLayout) view.findViewById(R.id.expanded_container);
        View view2 = this.floatingView;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingView");
            view2 = null;
        }
        this.collapseView = (RelativeLayout) view2.findViewById(R.id.collapse_view);
        View view3 = this.floatingView;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingView");
            view3 = null;
        }
        this.dateTimeText = (TextView) view3.findViewById(R.id.date_time_text);
        View view4 = this.floatingView;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingView");
            view4 = null;
        }
        this.countdownText = (TextView) view4.findViewById(R.id.countdown_text);
        View view5 = this.floatingView;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingView");
            view5 = null;
        }
        this.accountStatusText = (TextView) view5.findViewById(R.id.account_status_text);
        View view6 = this.floatingView;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingView");
            view6 = null;
        }
        this.internetStatusText = (TextView) view6.findViewById(R.id.internet_status_text);
        View view7 = this.floatingView;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingView");
            view7 = null;
        }
        this.symbolStatusText = (TextView) view7.findViewById(R.id.symbol_status_text);
        View view8 = this.floatingView;
        if (view8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingView");
            view8 = null;
        }
        this.robotStatusText = (TextView) view8.findViewById(R.id.robot_status_text);
        View view9 = this.floatingView;
        if (view9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingView");
            view9 = null;
        }
        this.statusContainer = (LinearLayout) view9.findViewById(R.id.status_container);
        View view10 = this.floatingView;
        if (view10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingView");
            view10 = null;
        }
        this.modeText = (TextView) view10.findViewById(R.id.mode_text);
        View view11 = this.floatingView;
        if (view11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingView");
            view11 = null;
        }
        this.modeButton = (TextView) view11.findViewById(R.id.mode_button);
        View view12 = this.floatingView;
        if (view12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingView");
            view12 = null;
        }
        this.modeContainer = (LinearLayout) view12.findViewById(R.id.mode_container);
        View view13 = this.floatingView;
        if (view13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingView");
            view13 = null;
        }
        this.tradeInfoContainer = (LinearLayout) view13.findViewById(R.id.trade_info_container);
        View view14 = this.floatingView;
        if (view14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingView");
            view14 = null;
        }
        this.tradeTypeText = (TextView) view14.findViewById(R.id.trade_type_text);
        View view15 = this.floatingView;
        if (view15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingView");
            view15 = null;
        }
        this.tradePriceText = (TextView) view15.findViewById(R.id.trade_price_text);
        View view16 = this.floatingView;
        if (view16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingView");
            view16 = null;
        }
        this.tradeSlText = (TextView) view16.findViewById(R.id.trade_sl_text);
        View view17 = this.floatingView;
        if (view17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingView");
            view17 = null;
        }
        this.tradeTpText = (TextView) view17.findViewById(R.id.trade_tp_text);
        initializeCopyButtons();
        if (Build.VERSION.SDK_INT >= 26) {
            params = new WindowManager.LayoutParams(-2, -2, 2038, 8, -3);
        } else {
            params = new WindowManager.LayoutParams(-2, -2, 2002, 8, -3);
        }
        params.gravity = 8388659;
        params.x = 100;
        params.y = 100;
        WindowManager windowManager2 = this.windowManager;
        if (windowManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("windowManager");
            windowManager2 = null;
        }
        View view18 = this.floatingView;
        if (view18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingView");
            view18 = null;
        }
        windowManager2.addView(view18, params);
        setupTouchListener(params);
        setupClickListeners();
        LinearLayout linearLayout = this.expandedContainer;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("expandedContainer");
            linearLayout = null;
        }
        linearLayout.setVisibility(8);
        RelativeLayout relativeLayout2 = this.collapseView;
        if (relativeLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("collapseView");
        } else {
            relativeLayout = relativeLayout2;
        }
        relativeLayout.setVisibility(0);
        updateModeDisplay();
    }

    private final void initializeCopyButtons() {
        LinearLayout copyContainer = new LinearLayout(this);
        LinearLayout linearLayout = copyContainer;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        Button button = new Button(this);
        Button button2 = button;
        button2.setText("📋 Symbol");
        button2.setTextSize(10.0f);
        button2.setOnClickListener(new FloatingWidgetService$$ExternalSyntheticLambda1(this));
        this.copySymbolButton = button;
        Button button3 = new Button(this);
        Button button4 = button3;
        button4.setText("📋 TP");
        button4.setTextSize(10.0f);
        button4.setOnClickListener(new FloatingWidgetService$$ExternalSyntheticLambda2(this));
        this.copyTpButton = button3;
        Button button5 = new Button(this);
        Button button6 = button5;
        button6.setText("📋 SL");
        button6.setTextSize(10.0f);
        button6.setOnClickListener(new FloatingWidgetService$$ExternalSyntheticLambda3(this));
        this.copySlButton = button5;
        Button button7 = new Button(this);
        Button button8 = button7;
        button8.setText("📋 ALL");
        button8.setTextSize(10.0f);
        button8.setOnClickListener(new FloatingWidgetService$$ExternalSyntheticLambda4(this));
        this.copyAllButton = button7;
        copyContainer.addView(this.copySymbolButton);
        copyContainer.addView(this.copyTpButton);
        copyContainer.addView(this.copySlButton);
        copyContainer.addView(this.copyAllButton);
        LinearLayout linearLayout2 = this.tradeInfoContainer;
        if (linearLayout2 != null) {
            linearLayout2.addView(copyContainer);
        }
    }

    /* access modifiers changed from: private */
    public static final void initializeCopyButtons$lambda$10$lambda$9(FloatingWidgetService this$0, View it) {
        String str = this$0.studentSymbol;
        if (str == null) {
            str = "";
        }
        this$0.copyToClipboard("Symbol", str);
    }

    /* access modifiers changed from: private */
    public static final void initializeCopyButtons$lambda$12$lambda$11(FloatingWidgetService this$0, View it) {
        this$0.copyToClipboard("TP", this$0.eaSignalTP > 0.0d ? this$0.formatPrice(this$0.eaSignalTP, this$0.studentSymbol) : "No TP");
    }

    /* access modifiers changed from: private */
    public static final void initializeCopyButtons$lambda$14$lambda$13(FloatingWidgetService this$0, View it) {
        this$0.copyToClipboard("SL", this$0.eaSignalSL > 0.0d ? this$0.formatPrice(this$0.eaSignalSL, this$0.studentSymbol) : "No SL");
    }

    /* access modifiers changed from: private */
    public static final void initializeCopyButtons$lambda$16$lambda$15(FloatingWidgetService this$0, View it) {
        this$0.copyAllSignalData();
    }

    private final void showCopyButtons() {
        Button button = this.copySymbolButton;
        int i = 0;
        if (button != null) {
            button.setVisibility(this.hasActiveSignal ? 0 : 8);
        }
        Button button2 = this.copyTpButton;
        if (button2 != null) {
            button2.setVisibility((!this.hasActiveSignal || this.eaSignalTP <= 0.0d) ? 8 : 0);
        }
        Button button3 = this.copySlButton;
        if (button3 != null) {
            button3.setVisibility((!this.hasActiveSignal || this.eaSignalSL <= 0.0d) ? 8 : 0);
        }
        Button button4 = this.copyAllButton;
        if (button4 != null) {
            if (!this.hasActiveSignal) {
                i = 8;
            }
            button4.setVisibility(i);
        }
    }

    private final void copyToClipboard(String label, String text) {
        Object systemService = getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(label, text));
        Toast.makeText(this, label + " copied: " + text, 0).show();
        switch (label.hashCode()) {
            case -1803656776:
                if (label.equals("Symbol")) {
                    flashButton(this.copySymbolButton);
                    return;
                }
                return;
            case 2649:
                if (label.equals("SL")) {
                    flashButton(this.copySlButton);
                    return;
                }
                return;
            case 2684:
                if (label.equals("TP")) {
                    flashButton(this.copyTpButton);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void copyAllSignalData() {
        if (this.hasActiveSignal) {
            String str = this.studentName;
            String str2 = this.studentSymbol;
            if (str2 == null) {
                str2 = this.eaSignalSymbol;
            }
            String str3 = this.eaSignalAction;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(this.eaSignalVolume)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String format2 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(this.studentLotSize)}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            String str4 = "None";
            String formatPrice = this.eaSignalSL > 0.0d ? formatPrice(this.eaSignalSL, this.studentSymbol) : str4;
            if (this.eaSignalTP > 0.0d) {
                str4 = formatPrice(this.eaSignalTP, this.studentSymbol);
            }
            String str5 = this.currentMode;
            String signalData = StringsKt.trimIndent("\n            SNIPER EA SIGNAL - " + str + "\n            Symbol: " + str2 + "\n            Action: " + str3 + "\n            EA Requested: " + format + "\n            YOUR LOT SIZE: " + format2 + "\n            SL: " + formatPrice + "\n            TP: " + str4 + "\n            Mode: " + str5 + "\n            Today's Trades: " + this.todayTradesCount + "\n            Accounts: " + this.totalAccounts + "\n        ");
            Object systemService = getSystemService("clipboard");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Signal Data", signalData));
            Toast.makeText(this, "All signal data copied!", 0).show();
            flashButton(this.copyAllButton);
        }
    }

    private final void flashButton(Button button) {
        if (button != null) {
            Button button2 = button;
            button2.setBackgroundColor(-16711936);
            this.handler.postDelayed(new FloatingWidgetService$$ExternalSyntheticLambda9(button2), 200);
        }
    }

    /* access modifiers changed from: private */
    public static final void flashButton$lambda$18$lambda$17(Button $it) {
        $it.setBackgroundColor(-7829368);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void switchMode() {
        /*
            r7 = this;
            int r0 = r7.currentModeIndex
            r1 = 1
            int r0 = r0 + r1
            java.util.List<java.lang.String> r2 = r7.tradingModes
            int r2 = r2.size()
            int r0 = r0 % r2
            r7.currentModeIndex = r0
            java.util.List<java.lang.String> r0 = r7.tradingModes
            int r2 = r7.currentModeIndex
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            r7.currentMode = r0
            java.lang.String r0 = "app_prefs"
            r2 = 0
            android.content.SharedPreferences r0 = r7.getSharedPreferences(r0, r2)
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.String r3 = "current_trading_mode"
            java.lang.String r4 = r7.currentMode
            android.content.SharedPreferences$Editor r2 = r2.putString(r3, r4)
            r2.apply()
            r7.updateModeDisplay()
            r7.updateModeOnBridge()
            java.lang.String r2 = r7.currentMode
            int r3 = r2.hashCode()
            switch(r3) {
                case -1986416409: goto L_0x0094;
                case 2196294: goto L_0x0088;
                case 2392787: goto L_0x007c;
                case 68616709: goto L_0x0070;
                case 78713141: goto L_0x0064;
                case 79316702: goto L_0x0058;
                case 1109473486: goto L_0x004c;
                case 1941037640: goto L_0x0040;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x00a0
        L_0x0040:
            java.lang.String r3 = "ATTACK"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0049
            goto L_0x003e
        L_0x0049:
            java.lang.String r2 = "Max 10 trades per day"
            goto L_0x00a2
        L_0x004c:
            java.lang.String r3 = "MARTINGALE"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0055
            goto L_0x003e
        L_0x0055:
            java.lang.String r2 = "Max 7 martingale trades"
            goto L_0x00a2
        L_0x0058:
            java.lang.String r3 = "SWING"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0061
            goto L_0x003e
        L_0x0061:
            java.lang.String r2 = "Max 4 long positions"
            goto L_0x00a2
        L_0x0064:
            java.lang.String r3 = "SCALP"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x006d
            goto L_0x003e
        L_0x006d:
            java.lang.String r2 = "Max 3 quick trades"
            goto L_0x00a2
        L_0x0070:
            java.lang.String r3 = "HEDGE"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0079
            goto L_0x003e
        L_0x0079:
            java.lang.String r2 = "Max 20 hedge positions"
            goto L_0x00a2
        L_0x007c:
            java.lang.String r3 = "NEWS"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0085
            goto L_0x003e
        L_0x0085:
            java.lang.String r2 = "Max 2 news trades"
            goto L_0x00a2
        L_0x0088:
            java.lang.String r3 = "GRID"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0091
            goto L_0x003e
        L_0x0091:
            java.lang.String r2 = "Max 15 grid levels"
            goto L_0x00a2
        L_0x0094:
            java.lang.String r3 = "NORMAL"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x009d
            goto L_0x003e
        L_0x009d:
            java.lang.String r2 = "BLOCKS ALL SIGNALS"
            goto L_0x00a2
        L_0x00a0:
            java.lang.String r2 = "Standard trading mode"
        L_0x00a2:
            r3 = r7
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r4 = r7.currentMode
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r5 = ": "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r4 = r4.toString()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r4, r1)
            r1.show()
            java.lang.String r1 = "vibrator"
            java.lang.Object r1 = r7.getSystemService(r1)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r3 = "null cannot be cast to non-null type android.os.Vibrator"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r3)     // Catch:{ Exception -> 0x00eb }
            android.os.Vibrator r1 = (android.os.Vibrator) r1     // Catch:{ Exception -> 0x00eb }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00eb }
            r4 = 26
            r5 = 100
            if (r3 < r4) goto L_0x00e7
            r3 = -1
            android.os.VibrationEffect r3 = android.os.VibrationEffect.createOneShot(r5, r3)     // Catch:{ Exception -> 0x00eb }
            r1.vibrate(r3)     // Catch:{ Exception -> 0x00eb }
            goto L_0x00ec
        L_0x00e7:
            r1.vibrate(r5)     // Catch:{ Exception -> 0x00eb }
            goto L_0x00ec
        L_0x00eb:
            r1 = move-exception
        L_0x00ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.snipereambatha.services.FloatingWidgetService.switchMode():void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void updateModeDisplay() {
        /*
            r6 = this;
            android.widget.TextView r0 = r6.modeText
            if (r0 == 0) goto L_0x001e
            java.lang.String r1 = r6.currentMode
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Mode: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x001e:
            java.lang.String r0 = r6.currentMode
            int r1 = r0.hashCode()
            java.lang.String r2 = "NORMAL"
            switch(r1) {
                case -1986416409: goto L_0x008e;
                case 2196294: goto L_0x007e;
                case 2392787: goto L_0x006e;
                case 68616709: goto L_0x0061;
                case 78713141: goto L_0x0055;
                case 79316702: goto L_0x0048;
                case 1109473486: goto L_0x0038;
                case 1941037640: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x0099
        L_0x002b:
            java.lang.String r1 = "ATTACK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            r0 = -65536(0xffffffffffff0000, float:NaN)
            goto L_0x009a
        L_0x0038:
            java.lang.String r1 = "MARTINGALE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0041
            goto L_0x0029
        L_0x0041:
            java.lang.String r0 = "#FFA500"
            int r0 = android.graphics.Color.parseColor(r0)
            goto L_0x009a
        L_0x0048:
            java.lang.String r1 = "SWING"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0051
            goto L_0x0029
        L_0x0051:
            r0 = -16711681(0xffffffffff00ffff, float:-1.714704E38)
            goto L_0x009a
        L_0x0055:
            java.lang.String r1 = "SCALP"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005e
            goto L_0x0029
        L_0x005e:
            r0 = -256(0xffffffffffffff00, float:NaN)
            goto L_0x009a
        L_0x0061:
            java.lang.String r1 = "HEDGE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x006a
            goto L_0x0029
        L_0x006a:
            r0 = -65281(0xffffffffffff00ff, float:NaN)
            goto L_0x009a
        L_0x006e:
            java.lang.String r1 = "NEWS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0077
            goto L_0x0029
        L_0x0077:
            java.lang.String r0 = "#FFD700"
            int r0 = android.graphics.Color.parseColor(r0)
            goto L_0x009a
        L_0x007e:
            java.lang.String r1 = "GRID"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0087
            goto L_0x0029
        L_0x0087:
            java.lang.String r0 = "#800080"
            int r0 = android.graphics.Color.parseColor(r0)
            goto L_0x009a
        L_0x008e:
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0095
            goto L_0x0029
        L_0x0095:
            r0 = -7829368(0xffffffffff888888, float:NaN)
            goto L_0x009a
        L_0x0099:
            r0 = -1
        L_0x009a:
            android.widget.TextView r1 = r6.modeText
            if (r1 == 0) goto L_0x00a2
            r1.setTextColor(r0)
        L_0x00a2:
            java.lang.String r1 = r6.currentMode
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x00ad
            java.lang.String r1 = "SIGNALS BLOCKED"
            goto L_0x00ce
        L_0x00ad:
            java.lang.String r1 = r6.currentMode
            int r2 = r6.todayTradesCount
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r3 = ": "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " trades today"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
        L_0x00ce:
            android.widget.TextView r2 = r6.robotStatusText
            r3 = 0
            java.lang.String r4 = "robotStatusText"
            if (r2 != 0) goto L_0x00da
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r2 = r3
        L_0x00da:
            r5 = r1
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r2.setText(r5)
            android.widget.TextView r2 = r6.robotStatusText
            if (r2 != 0) goto L_0x00e8
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            goto L_0x00e9
        L_0x00e8:
            r3 = r2
        L_0x00e9:
            r3.setTextColor(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.snipereambatha.services.FloatingWidgetService.updateModeDisplay():void");
    }

    private final void updateModeOnBridge() {
        new Thread(new FloatingWidgetService$$ExternalSyntheticLambda18(this)).start();
    }

    /* access modifiers changed from: private */
    public static final void updateModeOnBridge$lambda$20(FloatingWidgetService this$0) {
        try {
            URLConnection openConnection = new URL("http://77.93.152.165:5000/update_student_mode").openConnection();
            Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection connection = (HttpURLConnection) openConnection;
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);
            JSONObject data = new JSONObject();
            JSONObject jSONObject = data;
            jSONObject.put("login", this$0.studentLogin);
            jSONObject.put("mode", this$0.currentMode);
            OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
            writer.write(data.toString());
            writer.flush();
            writer.close();
            connection.getResponseCode();
        } catch (Exception e) {
        }
    }

    private final void startCountdown(int seconds) {
        this.countdownSeconds = seconds;
        this.isCountdownActive = true;
        CountDownTimer countDownTimer = this.countdownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.countdownTimer = new FloatingWidgetService$startCountdown$1(this, (long) (seconds * 1000)).start();
    }

    /* access modifiers changed from: private */
    public final void updateCountdownDisplay(int seconds) {
        int i;
        int mins = seconds / 60;
        int secs = seconds % 60;
        TextView textView = this.countdownText;
        if (textView != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(mins), Integer.valueOf(secs)}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            textView.setText(format);
        }
        TextView textView2 = this.countdownText;
        if (textView2 != null) {
            if (seconds <= 10) {
                i = SupportMenu.CATEGORY_MASK;
            } else if (seconds <= 30) {
                i = InputDeviceCompat.SOURCE_ANY;
            } else {
                i = -1;
            }
            textView2.setTextColor(i);
        }
        TextView textView3 = this.countdownText;
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
    }

    private final void updateStageDisplay(int stage, String stageText, int accountsCount) {
        TextView textView = this.robotStatusText;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("robotStatusText");
            textView = null;
        }
        textView.setText(stageText);
        int stageColor = -16711936;
        switch (stage) {
            case 0:
                stageColor = InputDeviceCompat.SOURCE_ANY;
                break;
            case 1:
            case 4:
                break;
            case 2:
                stageColor = -16711681;
                break;
            case 3:
                stageColor = Color.parseColor("#FFA500");
                break;
            case 5:
                stageColor = SupportMenu.CATEGORY_MASK;
                break;
            default:
                stageColor = -1;
                break;
        }
        TextView textView3 = this.robotStatusText;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("robotStatusText");
            textView3 = null;
        }
        textView3.setTextColor(stageColor);
        if (accountsCount > 0) {
            TextView textView4 = this.internetStatusText;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("internetStatusText");
            } else {
                textView2 = textView4;
            }
            textView2.setText("Accounts: " + accountsCount);
        }
    }

    private final void updateSymbolDisplay() {
        String symbolText;
        if (!this.studentSymbols.isEmpty()) {
            if (this.studentSymbols.size() > 3) {
                symbolText = CollectionsKt.joinToString$default(CollectionsKt.take(this.studentSymbols, 3), ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) + "... (" + this.studentSymbols.size() + ")";
            } else {
                symbolText = CollectionsKt.joinToString$default(this.studentSymbols, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
            }
            TextView textView = this.symbolStatusText;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("symbolStatusText");
                textView = null;
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(this.studentLotSize)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            textView.setText(symbolText + " | Lot: " + format);
        }
    }

    private final void setupTouchListener(WindowManager.LayoutParams params) {
        Ref.IntRef initialX = new Ref.IntRef();
        Ref.IntRef initialY = new Ref.IntRef();
        Ref.FloatRef initialTouchX = new Ref.FloatRef();
        Ref.FloatRef initialTouchY = new Ref.FloatRef();
        View view = this.floatingView;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingView");
            view = null;
        }
        view.setOnTouchListener(new FloatingWidgetService$$ExternalSyntheticLambda8(initialX, params, initialY, initialTouchX, initialTouchY, this));
    }

    /* access modifiers changed from: private */
    public static final boolean setupTouchListener$lambda$21(Ref.IntRef $initialX, WindowManager.LayoutParams $params, Ref.IntRef $initialY, Ref.FloatRef $initialTouchX, Ref.FloatRef $initialTouchY, FloatingWidgetService this$0, View view, MotionEvent event) {
        switch (event.getAction()) {
            case 0:
                $initialX.element = $params.x;
                $initialY.element = $params.y;
                $initialTouchX.element = event.getRawX();
                $initialTouchY.element = event.getRawY();
                return true;
            case 2:
                $params.x = $initialX.element + ((int) (event.getRawX() - $initialTouchX.element));
                $params.y = $initialY.element + ((int) (event.getRawY() - $initialTouchY.element));
                WindowManager windowManager2 = this$0.windowManager;
                View view2 = null;
                if (windowManager2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("windowManager");
                    windowManager2 = null;
                }
                View view3 = this$0.floatingView;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("floatingView");
                } else {
                    view2 = view3;
                }
                windowManager2.updateViewLayout(view2, $params);
                return true;
            default:
                return false;
        }
    }

    private final void setupClickListeners() {
        View view = this.floatingView;
        View view2 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingView");
            view = null;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.close_btn);
        if (imageView != null) {
            imageView.setOnClickListener(new FloatingWidgetService$$ExternalSyntheticLambda0(this));
        }
        RelativeLayout relativeLayout = this.collapseView;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("collapseView");
            relativeLayout = null;
        }
        relativeLayout.setOnClickListener(new FloatingWidgetService$$ExternalSyntheticLambda11(this));
        View view3 = this.floatingView;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingView");
        } else {
            view2 = view3;
        }
        TextView textView = (TextView) view2.findViewById(R.id.status_button);
        if (textView != null) {
            textView.setOnClickListener(new FloatingWidgetService$$ExternalSyntheticLambda14(this));
        }
        TextView textView2 = this.modeButton;
        if (textView2 != null) {
            textView2.setOnClickListener(new FloatingWidgetService$$ExternalSyntheticLambda15(this));
        }
    }

    /* access modifiers changed from: private */
    public static final void setupClickListeners$lambda$22(FloatingWidgetService this$0, View it) {
        this$0.stopSelf();
    }

    /* access modifiers changed from: private */
    public static final void setupClickListeners$lambda$23(FloatingWidgetService this$0, View it) {
        this$0.toggleExpanded();
    }

    /* access modifiers changed from: private */
    public static final void setupClickListeners$lambda$24(FloatingWidgetService this$0, View it) {
        this$0.toggleStatusDisplay();
    }

    /* access modifiers changed from: private */
    public static final void setupClickListeners$lambda$25(FloatingWidgetService this$0, View it) {
        this$0.switchMode();
    }

    private final void toggleExpanded() {
        LinearLayout linearLayout = this.expandedContainer;
        RelativeLayout relativeLayout = null;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("expandedContainer");
            linearLayout = null;
        }
        if (linearLayout.getVisibility() == 0) {
            LinearLayout linearLayout2 = this.expandedContainer;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("expandedContainer");
                linearLayout2 = null;
            }
            linearLayout2.setVisibility(8);
            RelativeLayout relativeLayout2 = this.collapseView;
            if (relativeLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("collapseView");
            } else {
                relativeLayout = relativeLayout2;
            }
            relativeLayout.setVisibility(0);
            return;
        }
        LinearLayout linearLayout3 = this.expandedContainer;
        if (linearLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("expandedContainer");
            linearLayout3 = null;
        }
        linearLayout3.setVisibility(0);
        RelativeLayout relativeLayout3 = this.collapseView;
        if (relativeLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("collapseView");
        } else {
            relativeLayout = relativeLayout3;
        }
        relativeLayout.setVisibility(8);
        updateDateTime();
        updateData();
    }

    private final void toggleStatusDisplay() {
        LinearLayout linearLayout = this.statusContainer;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusContainer");
            linearLayout = null;
        }
        if (linearLayout.getVisibility() == 0) {
            LinearLayout linearLayout3 = this.statusContainer;
            if (linearLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("statusContainer");
            } else {
                linearLayout2 = linearLayout3;
            }
            linearLayout2.setVisibility(8);
            return;
        }
        LinearLayout linearLayout4 = this.statusContainer;
        if (linearLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statusContainer");
        } else {
            linearLayout2 = linearLayout4;
        }
        linearLayout2.setVisibility(0);
        updateStatusDisplay();
    }

    private final void updateDateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss", Locale.getDefault());
        TextView textView = this.dateTimeText;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dateTimeText");
            textView = null;
        }
        textView.setText(sdf.format(new Date()));
    }

    private final void startDataUpdates() {
        this.updateRunnable = new FloatingWidgetService$startDataUpdates$1(this);
        Handler handler2 = this.handler;
        Runnable runnable = this.updateRunnable;
        Intrinsics.checkNotNull(runnable);
        handler2.post(runnable);
    }

    /* access modifiers changed from: private */
    public final void updateData() {
        updateDateTime();
        resetDailyTradeCount();
        new Thread(new FloatingWidgetService$$ExternalSyntheticLambda19(this)).start();
    }

    /* access modifiers changed from: private */
    public static final void updateData$lambda$27(FloatingWidgetService this$0) {
        try {
            SharedPreferences sharedPref = this$0.getSharedPreferences("app_prefs", 0);
            Set accounts = sharedPref.getStringSet("linked_accounts", SetsKt.emptySet());
            if (accounts == null) {
                accounts = SetsKt.emptySet();
            }
            String string = sharedPref.getString("student_name", "");
            if (string == null) {
                string = "";
            }
            this$0.studentName = string;
            this$0.studentLotSize = (double) sharedPref.getFloat("lot_size", 0.01f);
            if (!accounts.isEmpty()) {
                this$0.handler.post(new FloatingWidgetService$$ExternalSyntheticLambda16(this$0, sharedPref.getString(((String) CollectionsKt.first(accounts)) + "_login", "")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void updateData$lambda$27$lambda$26(FloatingWidgetService this$0, String $login) {
        String displayName = this$0.studentName.length() > 0 ? this$0.studentName : "Account";
        TextView textView = this$0.accountStatusText;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("accountStatusText");
            textView = null;
        }
        textView.setText(displayName + ": " + $login);
        if (this$0.hasActiveSignal) {
            String signalText = this$0.eaSignalAction + " ACTIVE | " + this$0.currentMode;
            TextView textView3 = this$0.robotStatusText;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("robotStatusText");
                textView3 = null;
            }
            textView3.setText(signalText);
            TextView textView4 = this$0.robotStatusText;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("robotStatusText");
            } else {
                textView2 = textView4;
            }
            textView2.setTextColor(Intrinsics.areEqual((Object) this$0.eaSignalAction, (Object) "BUY") ? -16711936 : SupportMenu.CATEGORY_MASK);
        } else {
            this$0.updateModeDisplay();
        }
        this$0.updateSignalDisplay();
    }

    private final void updateStatusDisplay() {
        SharedPreferences sharedPref = getSharedPreferences("app_prefs", 0);
        Set symbols = sharedPref.getStringSet("selected_symbols", SetsKt.emptySet());
        if (symbols == null) {
            symbols = SetsKt.emptySet();
        }
        this.studentLotSize = (double) sharedPref.getFloat("lot_size", 0.01f);
        TextView textView = null;
        if (!symbols.isEmpty()) {
            TextView textView2 = this.symbolStatusText;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("symbolStatusText");
            } else {
                textView = textView2;
            }
            String joinToString$default = CollectionsKt.joinToString$default(symbols, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(this.studentLotSize)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            textView.setText(joinToString$default + " | Lot: " + format);
            return;
        }
        TextView textView3 = this.symbolStatusText;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbolStatusText");
        } else {
            textView = textView3;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String format2 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(this.studentLotSize)}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        textView.setText("All symbols | Lot: " + format2);
    }

    /* access modifiers changed from: private */
    public final void checkForNewSignals() {
        if (!Intrinsics.areEqual((Object) this.currentMode, (Object) "NORMAL")) {
            new Thread(new FloatingWidgetService$$ExternalSyntheticLambda20(this)).start();
        }
    }

    /* access modifiers changed from: private */
    public static final void checkForNewSignals$lambda$30(FloatingWidgetService this$0) {
        try {
            URLConnection openConnection = new URL("http://77.93.152.165:5000/get_pending_signals").openConnection();
            Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection connection = (HttpURLConnection) openConnection;
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "SNIPER-EA-WIDGET/1.0");
            connection.setConnectTimeout(PathInterpolatorCompat.MAX_NUM_POINTS);
            if (connection.getResponseCode() == 200) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String response = TextStreamsKt.readText(reader);
                reader.close();
                JSONArray signals = new JSONObject(response).optJSONArray("pending_signals");
                if (signals != null && signals.length() > 0) {
                    JSONObject latestSignal = signals.getJSONObject(0);
                    String optString = latestSignal.optString("source", "");
                    Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                    String signalSource = optString.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(signalSource, "toUpperCase(...)");
                    String signalId = latestSignal.optString("id", "");
                    if (this$0.isValidHostedSource(signalSource) && !Intrinsics.areEqual((Object) signalId, (Object) this$0.lastSignalId)) {
                        this$0.lastSignalId = signalId;
                        this$0.handler.post(new FloatingWidgetService$$ExternalSyntheticLambda13(this$0, latestSignal));
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    /* access modifiers changed from: private */
    public static final void checkForNewSignals$lambda$30$lambda$29(FloatingWidgetService this$0, JSONObject $latestSignal) {
        Intent intent = new Intent(this$0, FloatingWidgetService.class);
        Intent intent2 = intent;
        intent2.setAction("NEW_SIGNAL_ALERT");
        intent2.putExtra("auto_expand", true);
        intent2.putExtra("vibrate", true);
        intent2.putExtra("play_sound", true);
        intent2.putExtra("signal_symbol", $latestSignal.getString("symbol"));
        intent2.putExtra("signal_action", $latestSignal.getString("action"));
        intent2.putExtra("signal_volume", $latestSignal.getDouble("volume"));
        intent2.putExtra("signal_sl", $latestSignal.optDouble("sl", 0.0d));
        intent2.putExtra("signal_tp", $latestSignal.optDouble("tp", 0.0d));
        intent2.putExtra("countdown_seconds", 5);
        this$0.handleIntent(intent);
    }

    private final void updateSignalDisplay() {
        String lotDisplay;
        if (!this.hasActiveSignal || this.studentSymbol == null || this.tradeInfoContainer == null) {
            LinearLayout linearLayout = this.tradeInfoContainer;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            showCopyButtons();
            return;
        }
        LinearLayout linearLayout2 = this.tradeInfoContainer;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        int actionColor = Intrinsics.areEqual((Object) this.eaSignalAction, (Object) "BUY") ? -16711936 : SupportMenu.CATEGORY_MASK;
        TextView textView = this.tradeTypeText;
        if (textView != null) {
            String str = this.eaSignalAction;
            String str2 = this.studentSymbol;
            if (str2 == null) {
                str2 = this.eaSignalSymbol;
            }
            textView.setText(str + " " + str2);
        }
        TextView textView2 = this.tradeTypeText;
        if (textView2 != null) {
            textView2.setTextColor(actionColor);
        }
        if (this.studentName.length() > 0) {
            String str3 = this.studentName;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(this.studentLotSize)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            lotDisplay = str3 + " Lot: " + format;
        } else {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String format2 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(this.eaSignalVolume)}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String format3 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(this.studentLotSize)}, 1));
            Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
            lotDisplay = "EA: " + format2 + " | YOUR: " + format3;
        }
        TextView textView3 = this.tradePriceText;
        if (textView3 != null) {
            textView3.setText(lotDisplay);
        }
        if (this.eaSignalSL > 0.0d) {
            TextView textView4 = this.tradeSlText;
            if (textView4 != null) {
                textView4.setText("SL: " + formatPrice(this.eaSignalSL, this.studentSymbol));
            }
            TextView textView5 = this.tradeSlText;
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
        } else {
            TextView textView6 = this.tradeSlText;
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
        }
        if (this.eaSignalTP > 0.0d) {
            TextView textView7 = this.tradeTpText;
            if (textView7 != null) {
                textView7.setText("TP: " + formatPrice(this.eaSignalTP, this.studentSymbol));
            }
            TextView textView8 = this.tradeTpText;
            if (textView8 != null) {
                textView8.setVisibility(0);
            }
        } else {
            TextView textView9 = this.tradeTpText;
            if (textView9 != null) {
                textView9.setVisibility(8);
            }
        }
        showCopyButtons();
    }

    static /* synthetic */ String formatPrice$default(FloatingWidgetService floatingWidgetService, double d, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return floatingWidgetService.formatPrice(d, str);
    }

    private final String formatPrice(double price, String symbol) {
        String symbolToUse;
        String format;
        if (symbol == null) {
            symbolToUse = this.eaSignalSymbol;
            if (symbolToUse == null) {
                symbolToUse = "";
            }
        } else {
            symbolToUse = symbol;
        }
        String upperCase = symbolToUse.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        String baseSymbol = new Regex("[^A-Z]").replace((CharSequence) upperCase, "");
        if (StringsKt.contains$default((CharSequence) baseSymbol, (CharSequence) "XAUUSD", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) baseSymbol, (CharSequence) "GOLD", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) baseSymbol, (CharSequence) "BTCUSD", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) baseSymbol, (CharSequence) "ETHUSD", false, 2, (Object) null)) {
            format = "%.2f";
        } else if (StringsKt.contains$default((CharSequence) baseSymbol, (CharSequence) "JPY", false, 2, (Object) null)) {
            format = "%.3f";
        } else {
            format = "%.5f";
        }
        String format2 = String.format(format, Arrays.copyOf(new Object[]{Double.valueOf(price)}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return format2;
    }

    private final void handleExecutionSuccess(Intent intent) {
        String successText;
        if (intent.getStringExtra("signal_symbol") == null) {
            Object obj = "";
        }
        String stringExtra = intent.getStringExtra("signal_action");
        if (stringExtra != null) {
            String str = stringExtra;
        }
        boolean z = false;
        this.executingAccounts = intent.getIntExtra("executed_accounts", 0);
        this.todayTradesCount++;
        saveTradeCount();
        if (this.studentName.length() > 0) {
            z = true;
        }
        if (z) {
            successText = this.studentName + ": " + this.executingAccounts + " accounts | Today: " + this.todayTradesCount;
        } else {
            successText = "EXECUTED: " + this.executingAccounts + " accounts | Today: " + this.todayTradesCount;
        }
        TextView textView = this.robotStatusText;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("robotStatusText");
            textView = null;
        }
        textView.setText(successText);
        TextView textView3 = this.robotStatusText;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("robotStatusText");
        } else {
            textView2 = textView3;
        }
        textView2.setTextColor(-16711936);
        this.handler.postDelayed(new FloatingWidgetService$$ExternalSyntheticLambda21(this), CoroutineLiveDataKt.DEFAULT_TIMEOUT);
    }

    /* access modifiers changed from: private */
    public static final void handleExecutionSuccess$lambda$31(FloatingWidgetService this$0) {
        this$0.hasActiveSignal = false;
        this$0.eaSignalSymbol = null;
        this$0.studentSymbol = null;
        this$0.eaSignalAction = null;
        this$0.updateSignalDisplay();
        this$0.updateModeDisplay();
    }

    /* access modifiers changed from: private */
    public final void checkBridgeStatus() {
        new Thread(new FloatingWidgetService$$ExternalSyntheticLambda7(this)).start();
    }

    /* access modifiers changed from: private */
    public static final void checkBridgeStatus$lambda$34(FloatingWidgetService this$0) {
        try {
            URLConnection openConnection = new URL("http://77.93.152.165:5000/system_status").openConnection();
            Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection connection = (HttpURLConnection) openConnection;
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(2000);
            if (connection.getResponseCode() == 200) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String response = TextStreamsKt.readText(reader);
                reader.close();
                JSONObject json = new JSONObject(response);
                int verifiedAccounts = json.optInt("verified_accounts", 0);
                int studentSettings = json.optInt("student_settings", 0);
                this$0.totalAccounts = verifiedAccounts;
                this$0.handler.post(new FloatingWidgetService$$ExternalSyntheticLambda5(this$0, verifiedAccounts, studentSettings));
            }
        } catch (Exception e) {
            this$0.handler.post(new FloatingWidgetService$$ExternalSyntheticLambda6(this$0));
        }
    }

    /* access modifiers changed from: private */
    public static final void checkBridgeStatus$lambda$34$lambda$32(FloatingWidgetService this$0, int $verifiedAccounts, int $studentSettings) {
        this$0.bridgeConnected = true;
        TextView textView = this$0.internetStatusText;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internetStatusText");
            textView = null;
        }
        textView.setText("BRIDGE: " + $verifiedAccounts + "/" + $studentSettings);
        TextView textView3 = this$0.internetStatusText;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internetStatusText");
        } else {
            textView2 = textView3;
        }
        textView2.setTextColor(-16711936);
    }

    /* access modifiers changed from: private */
    public static final void checkBridgeStatus$lambda$34$lambda$33(FloatingWidgetService this$0) {
        this$0.bridgeConnected = false;
        TextView textView = this$0.internetStatusText;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internetStatusText");
            textView = null;
        }
        textView.setText("BRIDGE OFFLINE");
        TextView textView3 = this$0.internetStatusText;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internetStatusText");
        } else {
            textView2 = textView3;
        }
        textView2.setTextColor(SupportMenu.CATEGORY_MASK);
    }

    private final boolean isValidHostedSource(String source) {
        String upperSource = source.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperSource, "toUpperCase(...)");
        Iterable<String> iterable = this.VALID_EA_SOURCES;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (String upperCase : iterable) {
            String upperCase2 = upperCase.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            if (StringsKt.contains$default((CharSequence) upperSource, (CharSequence) upperCase2, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    private final void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, "Floating Widget Service", 2);
            NotificationChannel notificationChannel = channel;
            notificationChannel.setDescription("SNIPER EA Signal Monitoring");
            notificationChannel.setShowBadge(false);
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(channel);
        }
    }

    private final Notification createNotification() {
        String displayText;
        if (Intrinsics.areEqual((Object) this.currentMode, (Object) "NORMAL")) {
            displayText = this.studentName + " | SIGNALS BLOCKED";
        } else {
            displayText = this.studentName + " | " + this.currentMode + ": " + this.todayTradesCount + " trades";
        }
        Notification build = new NotificationCompat.Builder((Context) this, CHANNEL_ID).setContentTitle("SNIPER EA Active").setContentText(displayText).setSmallIcon(R.drawable.ic_notification).setPriority(-1).setOngoing(true).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public void onDestroy() {
        super.onDestroy();
        Runnable runnable = this.updateRunnable;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
        }
        CountDownTimer countDownTimer = this.countdownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (this.floatingView != null) {
            WindowManager windowManager2 = this.windowManager;
            View view = null;
            if (windowManager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("windowManager");
                windowManager2 = null;
            }
            View view2 = this.floatingView;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("floatingView");
            } else {
                view = view2;
            }
            windowManager2.removeView(view);
        }
    }
}
