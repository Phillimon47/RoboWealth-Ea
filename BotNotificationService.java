package com.example.snipereambatha.services;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import com.example.snipereambatha.MainActivity;
import com.example.snipereambatha.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\"\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0014\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0002J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0002¨\u0006\u0016"}, d2 = {"Lcom/example/snipereambatha/services/BotNotificationService;", "Landroid/app/Service;", "<init>", "()V", "onCreate", "", "onStartCommand", "", "intent", "Landroid/content/Intent;", "flags", "startId", "onBind", "Landroid/os/IBinder;", "createNotificationChannel", "createNotification", "Landroid/app/Notification;", "startMonitoring", "updateNotification", "status", "", "Companion", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* compiled from: BotNotificationService.kt */
public final class BotNotificationService extends Service {
    public static final String CHANNEL_ID = "BotStatusChannel";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int NOTIFICATION_ID = 1001;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/example/snipereambatha/services/BotNotificationService$Companion;", "", "<init>", "()V", "CHANNEL_ID", "", "NOTIFICATION_ID", "", "start", "", "context", "Landroid/content/Context;", "stop", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* compiled from: BotNotificationService.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void start(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, BotNotificationService.class);
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(intent);
            } else {
                context.startService(intent);
            }
        }

        public final void stop(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.stopService(new Intent(context, BotNotificationService.class));
        }
    }

    public void onCreate() {
        super.onCreate();
        createNotificationChannel();
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        startForeground(1001, createNotification());
        startMonitoring();
        return 1;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    private final void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, "Bot Status", 2);
            NotificationChannel notificationChannel = channel;
            notificationChannel.setDescription("Shows bot trading status");
            notificationChannel.setShowBadge(false);
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(channel);
        }
    }

    private final Notification createNotification() {
        Notification build = new NotificationCompat.Builder((Context) this, CHANNEL_ID).setContentTitle("Sniper EA Bot").setContentText("Bot is active and monitoring trades").setSmallIcon(R.drawable.ic_notification).setContentIntent(PendingIntent.getActivity(this, 0, new Intent(this, MainActivity.class), 201326592)).setOngoing(true).setPriority(-1).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final void startMonitoring() {
    }

    private final void updateNotification(String status) {
        Notification notification = new NotificationCompat.Builder((Context) this, CHANNEL_ID).setContentTitle("Sniper EA Bot").setContentText(status).setSmallIcon(R.drawable.ic_notification).setPriority(-1).build();
        Intrinsics.checkNotNullExpressionValue(notification, "build(...)");
        ((NotificationManager) getSystemService(NotificationManager.class)).notify(1001, notification);
    }
}
