package com.example.snipereambatha.services;

import java.util.TimerTask;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/example/snipereambatha/services/MultiBrokerService$startConnectionMaintenance$1", "Ljava/util/TimerTask;", "run", "", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* compiled from: MultiBrokerService.kt */
public final class MultiBrokerService$startConnectionMaintenance$1 extends TimerTask {
    final /* synthetic */ String $account;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ MultiBrokerService this$0;

    MultiBrokerService$startConnectionMaintenance$1(MultiBrokerService $receiver, String $sessionId2, String $account2) {
        this.this$0 = $receiver;
        this.$sessionId = $sessionId2;
        this.$account = $account2;
    }

    public void run() {
        this.this$0.checkAccountStatus(this.$sessionId, this.$account);
    }
}
