package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nameEditText, emailEditText, phoneEditText, addressEditText, cityEditText;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.name_edit_text);
        emailEditText = findViewById(R.id.email_edit_text);
        phoneEditText = findViewById(R.id.phone_edit_text);
        addressEditText = findViewById(R.id.address_edit_text);
        cityEditText = findViewById(R.id.city_edit_text);
        submitButton = findViewById(R.id.submit_button);

        submitButton.setOnClickListener(v -> {
            String name = nameEditText.getText().toString().trim();
            String email = emailEditText.getText().toString().trim();
            String phone = phoneEditText.getText().toString().trim();
            String address = addressEditText.getText().toString().trim();
            String city = cityEditText.getText().toString().trim();

            if (name.isEmpty() || email.isEmpty()) {
                Toast.makeText(this, "Name and Email are required.", Toast.LENGTH_SHORT).show();
                return;
            }

            Intent intent = new Intent(MainActivity.this, Screen2Activity.class);

            intent.putExtra("USER_NAME", name);
            intent.putExtra("USER_EMAIL", email);
            intent.putExtra("USER_PHONE", phone);
            intent.putExtra("USER_ADDRESS", address);
            intent.putExtra("USER_CITY", city);

            startActivity(intent);
        });
    }
}
