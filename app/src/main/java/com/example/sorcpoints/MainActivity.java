package com.example.sorcpoints;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    private Button settingsButton;
    private Button increaseButton;
    private Button decreaseButton;
    private Button resetButton;

    int sorcLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        increaseButton = findViewById(R.id.increase);
        decreaseButton = findViewById(R.id.decrease);
        resetButton = findViewById(R.id.reset);
        settingsButton = findViewById(R.id.settings);

        //Method for the button that adds 1 when pressed
        increaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newText = Integer.toString(Integer.parseInt(textView.getText().toString()) + 1);
                textView.setText(newText);
            }
        });

        //Method for the button that subtracts 1 when pressed
        decreaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Integer.parseInt(textView.getText().toString()) != 0) {
                    String newText = Integer.toString(Integer.parseInt(textView.getText().toString()) - 1);
                    textView.setText(newText);
                }
            }
        });

        //Opens the settings page
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSettingsPage02();
            }
        });

        //Calls Activity 2's sorcLevel value and then sets it as the textView
        Intent mIntent = getIntent();
        int sorcLevel = mIntent.getIntExtra("textView", 0);
        textView.setText(String.valueOf(sorcLevel));

    }

    //Opens the settings page
    public void openSettingsPage02(){
        Intent intent = new Intent(this, SettingsPage02.class);
        startActivity(intent);
    }

    public void resetTextView (View view){
        //textView.setText("0");
        Intent mIntent = getIntent();
        int sorcLevel = mIntent.getIntExtra("textView", 0);
        textView.setText(String.valueOf(sorcLevel));
    }
}