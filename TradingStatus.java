package com.example.snipereambatha.services;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/example/snipereambatha/services/TradingStatus;", "", "currentTrade", "", "message", "isActive", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getCurrentTrade", "()Ljava/lang/String;", "getMessage", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* compiled from: TradingService.kt */
public final class TradingStatus {
    private final String currentTrade;
    private final boolean isActive;
    private final String message;

    public static /* synthetic */ TradingStatus copy$default(TradingStatus tradingStatus, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradingStatus.currentTrade;
        }
        if ((i & 2) != 0) {
            str2 = tradingStatus.message;
        }
        if ((i & 4) != 0) {
            z = tradingStatus.isActive;
        }
        return tradingStatus.copy(str, str2, z);
    }

    public final String component1() {
        return this.currentTrade;
    }

    public final String component2() {
        return this.message;
    }

    public final boolean component3() {
        return this.isActive;
    }

    public final TradingStatus copy(String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "currentTrade");
        Intrinsics.checkNotNullParameter(str2, "message");
        return new TradingStatus(str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradingStatus)) {
            return false;
        }
        TradingStatus tradingStatus = (TradingStatus) obj;
        return Intrinsics.areEqual((Object) this.currentTrade, (Object) tradingStatus.currentTrade) && Intrinsics.areEqual((Object) this.message, (Object) tradingStatus.message) && this.isActive == tradingStatus.isActive;
    }

    public int hashCode() {
        return (((this.currentTrade.hashCode() * 31) + this.message.hashCode()) * 31) + TradingStatus$$ExternalSyntheticBackport0.m(this.isActive);
    }

    public String toString() {
        String str = this.currentTrade;
        String str2 = this.message;
        return "TradingStatus(currentTrade=" + str + ", message=" + str2 + ", isActive=" + this.isActive + ")";
    }

    public TradingStatus(String currentTrade2, String message2, boolean isActive2) {
        Intrinsics.checkNotNullParameter(currentTrade2, "currentTrade");
        Intrinsics.checkNotNullParameter(message2, "message");
        this.currentTrade = currentTrade2;
        this.message = message2;
        this.isActive = isActive2;
    }

    public final String getCurrentTrade() {
        return this.currentTrade;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean isActive() {
        return this.isActive;
    }
}
