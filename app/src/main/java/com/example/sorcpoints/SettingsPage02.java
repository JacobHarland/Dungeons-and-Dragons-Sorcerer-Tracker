package com.example.sorcpoints;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SettingsPage02 extends AppCompatActivity {
    EditText sorcLevelInput;

    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_page02);

        sorcLevelInput = findViewById(R.id.sorcLevelInput);

        submitButton = findViewById(R.id.submitButton);

        //On button press, saves data and passes it to the main screen to show the values
        submitButton.setOnClickListener(view -> {
            Intent myIntent = new Intent(SettingsPage02.this, MainActivity.class);

            int sorcLevel = Integer.parseInt(sorcLevelInput.getText().toString());
            PrefConfig.saveSorcLevelPref(getApplicationContext(), sorcLevel);
            myIntent.putExtra("textView", sorcLevel);
            startActivity(myIntent);
            finish();
        });
    }
}