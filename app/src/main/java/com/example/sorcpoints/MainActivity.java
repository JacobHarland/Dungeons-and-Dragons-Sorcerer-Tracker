package com.example.sorcpoints;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    public static TextView textView;

    private Button increaseButton;
    private Button decreaseButton;
    private Button resetButton;
    private Button settingsButton;
    private Button metaMagicButton;
    private Button flexibleCastingButtonGainSpellSlot;
    private Button flexibleCastingButtonGainSorceryPoint;

    Context context;

    private String sorcPoints;
    private int sorcLevelSaved;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        //loads the saved data
        sorcPoints = PrefConfig.loadTextViewFromPref(this);
        textView.setText(String.valueOf(sorcPoints));
        sorcLevelSaved = PrefConfig.loadSorcLevelFromPref(this);

        increaseButton = findViewById(R.id.button_increase);
        decreaseButton = findViewById(R.id.button_decrease);
        resetButton = findViewById(R.id.button_reset);
        settingsButton = findViewById(R.id.button_settings);
        metaMagicButton = findViewById(R.id.button_metaMagic);
        flexibleCastingButtonGainSpellSlot = findViewById(R.id.button_flexibleCastingGainSpellSlot);
        flexibleCastingButtonGainSorceryPoint = findViewById(R.id.button_flexibleCastingGainSorceryPoint);

        context = this;

        //Method for the button that adds 1 when pressed
        increaseButton.setOnClickListener(view -> {
            String newText = Integer.toString(Integer.parseInt(textView.getText().toString()) + 1);
            PrefConfig.saveTotalInPref(getApplicationContext(), newText);
            textView.setText(newText);
        });

        //Method for the button that subtracts 1 when pressed
        decreaseButton.setOnClickListener(view -> {
            if (Integer.parseInt(textView.getText().toString()) != 0) {
                String newText = Integer.toString(Integer.parseInt(textView.getText().toString()) - 1);
                PrefConfig.saveTotalInPref(getApplicationContext(), newText);
                textView.setText(newText);
            }
        });

        //Method for the button that resets the counter to sorcLevel
        resetButton.setOnClickListener(view -> {
            int sorcLevel = sorcLevelSaved;
            PrefConfig.saveTotalInPref(getApplicationContext(), String.valueOf(sorcLevel));
            textView.setText(String.valueOf(sorcLevel));
        });

        settingsButton.setOnClickListener(view -> openSettingsPage02());
        flexibleCastingButtonGainSpellSlot.setOnClickListener(view -> openFlexibleCastingDialog());
        flexibleCastingButtonGainSorceryPoint.setOnClickListener(view -> openFlexibleCastingDialog2());
        metaMagicButton.setOnClickListener(view -> metaMagicDialog());
    }

    //Opens the settings page
    public void openSettingsPage02(){
        Intent intent = new Intent(this, SettingsPage02.class);
        startActivity(intent);
    }

    public void openFlexibleCastingDialog() {
        SorcToSpellDialog sorcToSpellDialog = new SorcToSpellDialog();
        sorcToSpellDialog.show(getSupportFragmentManager(), "example dialog");
    }

    public void openFlexibleCastingDialog2() {
        SpellToSorcDialog spellToSorcDialog = new SpellToSorcDialog();
        spellToSorcDialog.show(getSupportFragmentManager(), "example dialog");
    }

    public void metaMagicDialog() {
        MetaMagicDialog metaMagicDialog = new MetaMagicDialog();
        metaMagicDialog.show(getSupportFragmentManager(), "example dialog");
    }
}

