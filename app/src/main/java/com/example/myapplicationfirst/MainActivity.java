package com.example.myapplicationfirst;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final String Username = "xyz";
    private final String Password = "123";
    boolean isValid = false;
    private EditText eName;
    private EditText ePassword;
    private Button eLogin;
    private TextView eAttemptsInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eName = findViewById(R.id.Username);
        ePassword = findViewById(R.id.Password);
        eLogin = findViewById(R.id.Continuebutton);
        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputName = eName.getText().toString();
                String inputPassword = ePassword.getText().toString();
                if (inputName.isEmpty() || inputPassword.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter all the details correctly", Toast.LENGTH_SHORT).show();
                } else {
                    isValid = validate(inputName, inputPassword);
                    if (!isValid) {
                        Toast.makeText(MainActivity.this, "incorrect entry", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Login sucessfull", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent);
                    }
                }
            }
        });
    }

    private boolean validate(String name, String password) {
        return name.equals(Username) && password.equals(Password);
    }
}