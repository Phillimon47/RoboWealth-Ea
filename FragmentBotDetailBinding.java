package com.example.snipereambatha.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.snipereambatha.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public final class FragmentBotDetailBinding implements ViewBinding {
    public final LinearLayout actionButtons;
    public final Button addNewEaButton;
    public final ImageView botImage;
    public final CardView botInfoCard;
    public final TextView botName;
    public final TextView botStatusText;
    public final BottomNavigationView bottomNavigation;
    public final TextView licenseText;
    public final Button quotesButton;
    public final Button removeButton;
    private final ConstraintLayout rootView;
    public final TextView selectedSymbolsText;
    public final ImageView signalIndicator;
    public final TextView signalStatusText;
    public final LinearLayout statusContainer;
    public final Button tradeButton;

    private FragmentBotDetailBinding(ConstraintLayout rootView2, LinearLayout actionButtons2, Button addNewEaButton2, ImageView botImage2, CardView botInfoCard2, TextView botName2, TextView botStatusText2, BottomNavigationView bottomNavigation2, TextView licenseText2, Button quotesButton2, Button removeButton2, TextView selectedSymbolsText2, ImageView signalIndicator2, TextView signalStatusText2, LinearLayout statusContainer2, Button tradeButton2) {
        this.rootView = rootView2;
        this.actionButtons = actionButtons2;
        this.addNewEaButton = addNewEaButton2;
        this.botImage = botImage2;
        this.botInfoCard = botInfoCard2;
        this.botName = botName2;
        this.botStatusText = botStatusText2;
        this.bottomNavigation = bottomNavigation2;
        this.licenseText = licenseText2;
        this.quotesButton = quotesButton2;
        this.removeButton = removeButton2;
        this.selectedSymbolsText = selectedSymbolsText2;
        this.signalIndicator = signalIndicator2;
        this.signalStatusText = signalStatusText2;
        this.statusContainer = statusContainer2;
        this.tradeButton = tradeButton2;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentBotDetailBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, (ViewGroup) null, false);
    }

    public static FragmentBotDetailBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.fragment_bot_detail, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static FragmentBotDetailBinding bind(View rootView2) {
        View view = rootView2;
        int id = R.id.actionButtons;
        LinearLayout actionButtons2 = (LinearLayout) ViewBindings.findChildViewById(view, id);
        if (actionButtons2 != null) {
            id = R.id.addNewEaButton;
            Button addNewEaButton2 = (Button) ViewBindings.findChildViewById(view, id);
            if (addNewEaButton2 != null) {
                id = R.id.botImage;
                ImageView botImage2 = (ImageView) ViewBindings.findChildViewById(view, id);
                if (botImage2 != null) {
                    id = R.id.botInfoCard;
                    CardView botInfoCard2 = (CardView) ViewBindings.findChildViewById(view, id);
                    if (botInfoCard2 != null) {
                        id = R.id.botName;
                        TextView botName2 = (TextView) ViewBindings.findChildViewById(view, id);
                        if (botName2 != null) {
                            id = R.id.botStatusText;
                            TextView botStatusText2 = (TextView) ViewBindings.findChildViewById(view, id);
                            if (botStatusText2 != null) {
                                id = R.id.bottomNavigation;
                                BottomNavigationView bottomNavigation2 = (BottomNavigationView) ViewBindings.findChildViewById(view, id);
                                if (bottomNavigation2 != null) {
                                    id = R.id.licenseText;
                                    TextView licenseText2 = (TextView) ViewBindings.findChildViewById(view, id);
                                    if (licenseText2 != null) {
                                        id = R.id.quotesButton;
                                        Button quotesButton2 = (Button) ViewBindings.findChildViewById(view, id);
                                        if (quotesButton2 != null) {
                                            id = R.id.removeButton;
                                            Button removeButton2 = (Button) ViewBindings.findChildViewById(view, id);
                                            if (removeButton2 != null) {
                                                id = R.id.selectedSymbolsText;
                                                TextView selectedSymbolsText2 = (TextView) ViewBindings.findChildViewById(view, id);
                                                if (selectedSymbolsText2 != null) {
                                                    id = R.id.signalIndicator;
                                                    ImageView signalIndicator2 = (ImageView) ViewBindings.findChildViewById(view, id);
                                                    if (signalIndicator2 != null) {
                                                        id = R.id.signalStatusText;
                                                        TextView signalStatusText2 = (TextView) ViewBindings.findChildViewById(view, id);
                                                        if (signalStatusText2 != null) {
                                                            id = R.id.statusContainer;
                                                            LinearLayout statusContainer2 = (LinearLayout) ViewBindings.findChildViewById(view, id);
                                                            if (statusContainer2 != null) {
                                                                id = R.id.tradeButton;
                                                                Button tradeButton2 = (Button) ViewBindings.findChildViewById(view, id);
                                                                if (tradeButton2 != null) {
                                                                    return new FragmentBotDetailBinding((ConstraintLayout) view, actionButtons2, addNewEaButton2, botImage2, botInfoCard2, botName2, botStatusText2, bottomNavigation2, licenseText2, quotesButton2, removeButton2, selectedSymbolsText2, signalIndicator2, signalStatusText2, statusContainer2, tradeButton2);
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
