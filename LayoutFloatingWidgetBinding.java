package com.example.snipereambatha.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.snipereambatha.R;

public final class LayoutFloatingWidgetBinding implements ViewBinding {
    public final LinearLayout accountStatusContainer;
    public final ImageView accountStatusIcon;
    public final TextView accountStatusText;
    public final ImageView closeBtn;
    public final RelativeLayout collapseView;
    public final TextView countdownText;
    public final TextView dateTimeText;
    public final LinearLayout expandedContainer;
    public final ImageView floatingIcon;
    public final LinearLayout internetStatusContainer;
    public final ImageView internetStatusIcon;
    public final TextView internetStatusText;
    public final TextView modeButton;
    public final LinearLayout modeContainer;
    public final TextView modeText;
    public final LinearLayout robotStatusContainer;
    public final ImageView robotStatusIcon;
    public final TextView robotStatusText;
    private final FrameLayout rootView;
    public final TextView statusButton;
    public final LinearLayout statusContainer;
    public final LinearLayout symbolStatusContainer;
    public final ImageView symbolStatusIcon;
    public final TextView symbolStatusText;
    public final TextView tradeCountText;
    public final LinearLayout tradeInfoContainer;
    public final TextView tradePriceText;
    public final TextView tradeSlText;
    public final TextView tradeTpText;
    public final TextView tradeTypeText;

    private LayoutFloatingWidgetBinding(FrameLayout rootView2, LinearLayout accountStatusContainer2, ImageView accountStatusIcon2, TextView accountStatusText2, ImageView closeBtn2, RelativeLayout collapseView2, TextView countdownText2, TextView dateTimeText2, LinearLayout expandedContainer2, ImageView floatingIcon2, LinearLayout internetStatusContainer2, ImageView internetStatusIcon2, TextView internetStatusText2, TextView modeButton2, LinearLayout modeContainer2, TextView modeText2, LinearLayout robotStatusContainer2, ImageView robotStatusIcon2, TextView robotStatusText2, TextView statusButton2, LinearLayout statusContainer2, LinearLayout symbolStatusContainer2, ImageView symbolStatusIcon2, TextView symbolStatusText2, TextView tradeCountText2, LinearLayout tradeInfoContainer2, TextView tradePriceText2, TextView tradeSlText2, TextView tradeTpText2, TextView tradeTypeText2) {
        this.rootView = rootView2;
        this.accountStatusContainer = accountStatusContainer2;
        this.accountStatusIcon = accountStatusIcon2;
        this.accountStatusText = accountStatusText2;
        this.closeBtn = closeBtn2;
        this.collapseView = collapseView2;
        this.countdownText = countdownText2;
        this.dateTimeText = dateTimeText2;
        this.expandedContainer = expandedContainer2;
        this.floatingIcon = floatingIcon2;
        this.internetStatusContainer = internetStatusContainer2;
        this.internetStatusIcon = internetStatusIcon2;
        this.internetStatusText = internetStatusText2;
        this.modeButton = modeButton2;
        this.modeContainer = modeContainer2;
        this.modeText = modeText2;
        this.robotStatusContainer = robotStatusContainer2;
        this.robotStatusIcon = robotStatusIcon2;
        this.robotStatusText = robotStatusText2;
        this.statusButton = statusButton2;
        this.statusContainer = statusContainer2;
        this.symbolStatusContainer = symbolStatusContainer2;
        this.symbolStatusIcon = symbolStatusIcon2;
        this.symbolStatusText = symbolStatusText2;
        this.tradeCountText = tradeCountText2;
        this.tradeInfoContainer = tradeInfoContainer2;
        this.tradePriceText = tradePriceText2;
        this.tradeSlText = tradeSlText2;
        this.tradeTpText = tradeTpText2;
        this.tradeTypeText = tradeTypeText2;
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static LayoutFloatingWidgetBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static LayoutFloatingWidgetBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.layout_floating_widget, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static LayoutFloatingWidgetBinding bind(View rootView2) {
        View view = rootView2;
        int id = R.id.account_status_container;
        LinearLayout accountStatusContainer2 = (LinearLayout) ViewBindings.findChildViewById(view, id);
        if (accountStatusContainer2 != null) {
            id = R.id.account_status_icon;
            ImageView accountStatusIcon2 = (ImageView) ViewBindings.findChildViewById(view, id);
            if (accountStatusIcon2 != null) {
                id = R.id.account_status_text;
                TextView accountStatusText2 = (TextView) ViewBindings.findChildViewById(view, id);
                if (accountStatusText2 != null) {
                    id = R.id.close_btn;
                    ImageView closeBtn2 = (ImageView) ViewBindings.findChildViewById(view, id);
                    if (closeBtn2 != null) {
                        id = R.id.collapse_view;
                        RelativeLayout collapseView2 = (RelativeLayout) ViewBindings.findChildViewById(view, id);
                        if (collapseView2 != null) {
                            id = R.id.countdown_text;
                            TextView countdownText2 = (TextView) ViewBindings.findChildViewById(view, id);
                            if (countdownText2 != null) {
                                id = R.id.date_time_text;
                                TextView dateTimeText2 = (TextView) ViewBindings.findChildViewById(view, id);
                                if (dateTimeText2 != null) {
                                    id = R.id.expanded_container;
                                    LinearLayout expandedContainer2 = (LinearLayout) ViewBindings.findChildViewById(view, id);
                                    if (expandedContainer2 != null) {
                                        id = R.id.floating_icon;
                                        ImageView floatingIcon2 = (ImageView) ViewBindings.findChildViewById(view, id);
                                        if (floatingIcon2 != null) {
                                            id = R.id.internet_status_container;
                                            LinearLayout internetStatusContainer2 = (LinearLayout) ViewBindings.findChildViewById(view, id);
                                            if (internetStatusContainer2 != null) {
                                                id = R.id.internet_status_icon;
                                                ImageView internetStatusIcon2 = (ImageView) ViewBindings.findChildViewById(view, id);
                                                if (internetStatusIcon2 != null) {
                                                    id = R.id.internet_status_text;
                                                    TextView internetStatusText2 = (TextView) ViewBindings.findChildViewById(view, id);
                                                    if (internetStatusText2 != null) {
                                                        id = R.id.mode_button;
                                                        TextView modeButton2 = (TextView) ViewBindings.findChildViewById(view, id);
                                                        if (modeButton2 != null) {
                                                            id = R.id.mode_container;
                                                            LinearLayout modeContainer2 = (LinearLayout) ViewBindings.findChildViewById(view, id);
                                                            if (modeContainer2 != null) {
                                                                id = R.id.mode_text;
                                                                TextView modeText2 = (TextView) ViewBindings.findChildViewById(view, id);
                                                                if (modeText2 != null) {
                                                                    id = R.id.robot_status_container;
                                                                    LinearLayout robotStatusContainer2 = (LinearLayout) ViewBindings.findChildViewById(view, id);
                                                                    if (robotStatusContainer2 != null) {
                                                                        id = R.id.robot_status_icon;
                                                                        ImageView robotStatusIcon2 = (ImageView) ViewBindings.findChildViewById(view, id);
                                                                        if (robotStatusIcon2 != null) {
                                                                            id = R.id.robot_status_text;
                                                                            TextView robotStatusText2 = (TextView) ViewBindings.findChildViewById(view, id);
                                                                            if (robotStatusText2 != null) {
                                                                                id = R.id.status_button;
                                                                                TextView statusButton2 = (TextView) ViewBindings.findChildViewById(view, id);
                                                                                if (statusButton2 != null) {
                                                                                    id = R.id.status_container;
                                                                                    LinearLayout statusContainer2 = (LinearLayout) ViewBindings.findChildViewById(view, id);
                                                                                    if (statusContainer2 != null) {
                                                                                        id = R.id.symbol_status_container;
                                                                                        LinearLayout symbolStatusContainer2 = (LinearLayout) ViewBindings.findChildViewById(view, id);
                                                                                        if (symbolStatusContainer2 != null) {
                                                                                            id = R.id.symbol_status_icon;
                                                                                            ImageView symbolStatusIcon2 = (ImageView) ViewBindings.findChildViewById(view, id);
                                                                                            if (symbolStatusIcon2 != null) {
                                                                                                id = R.id.symbol_status_text;
                                                                                                TextView symbolStatusText2 = (TextView) ViewBindings.findChildViewById(view, id);
                                                                                                if (symbolStatusText2 != null) {
                                                                                                    id = R.id.trade_count_text;
                                                                                                    TextView tradeCountText2 = (TextView) ViewBindings.findChildViewById(view, id);
                                                                                                    if (tradeCountText2 != null) {
                                                                                                        id = R.id.trade_info_container;
                                                                                                        LinearLayout tradeInfoContainer2 = (LinearLayout) ViewBindings.findChildViewById(view, id);
                                                                                                        if (tradeInfoContainer2 != null) {
                                                                                                            id = R.id.trade_price_text;
                                                                                                            TextView tradePriceText2 = (TextView) ViewBindings.findChildViewById(view, id);
                                                                                                            if (tradePriceText2 != null) {
                                                                                                                id = R.id.trade_sl_text;
                                                                                                                TextView tradeSlText2 = (TextView) ViewBindings.findChildViewById(view, id);
                                                                                                                if (tradeSlText2 != null) {
                                                                                                                    id = R.id.trade_tp_text;
                                                                                                                    TextView tradeTpText2 = (TextView) ViewBindings.findChildViewById(view, id);
                                                                                                                    if (tradeTpText2 != null) {
                                                                                                                        id = R.id.trade_type_text;
                                                                                                                        TextView tradeTypeText2 = (TextView) ViewBindings.findChildViewById(view, id);
                                                                                                                        if (tradeTypeText2 != null) {
                                                                                                                            return new LayoutFloatingWidgetBinding((FrameLayout) view, accountStatusContainer2, accountStatusIcon2, accountStatusText2, closeBtn2, collapseView2, countdownText2, dateTimeText2, expandedContainer2, floatingIcon2, internetStatusContainer2, internetStatusIcon2, internetStatusText2, modeButton2, modeContainer2, modeText2, robotStatusContainer2, robotStatusIcon2, robotStatusText2, statusButton2, statusContainer2, symbolStatusContainer2, symbolStatusIcon2, symbolStatusText2, tradeCountText2, tradeInfoContainer2, tradePriceText2, tradeSlText2, tradeTpText2, tradeTypeText2);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(id)));
    }
}
