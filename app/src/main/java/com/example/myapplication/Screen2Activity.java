package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Screen2Activity extends AppCompatActivity {

    private TextView summaryTextView;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        summaryTextView = findViewById(R.id.summary_text_view);
        backButton = findViewById(R.id.back_button);

        Intent intent = getIntent();

        String name = intent.getStringExtra("USER_NAME");
        String emailAddress = intent.getStringExtra("USER_EMAIL");
        String phoneNumber = intent.getStringExtra("USER_PHONE");
        String deliveryAddress = intent.getStringExtra("USER_ADDRESS");
        String cityName = intent.getStringExtra("USER_CITY");

        String summary = "Name: " + safe(name) +
                "\nEmail: " + safe(emailAddress) +
                "\nPhone: " + safe(phoneNumber) +
                "\nAddress: " + safe(deliveryAddress) +
                "\nCity: " + safe(cityName);

        summaryTextView.setText(summary);

        backButton.setOnClickListener(v -> finish());
    }

    private String safe(String s) {
        return (s == null || s.trim().isEmpty()) ? "—" : s.trim();
    }
}
