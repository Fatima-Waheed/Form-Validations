package com.example.myapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText firstName, lastName, emailAddress, password, confirmPassword;
    RadioGroup genderGroup;
    RadioButton male, female, ratherNotSay;
    CheckBox termsAndConditions;
    Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        emailAddress = findViewById(R.id.emailAddress);
        password = findViewById(R.id.password);
        confirmPassword = findViewById(R.id.confirmPassword);
        genderGroup = findViewById(R.id.genderGroup);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        ratherNotSay = findViewById(R.id.ratherNotSay);
        termsAndConditions = findViewById(R.id.termsAndConditions);
        btnSubmit = findViewById(R.id.btnSubmit);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (validate()) {
                    Toast.makeText(getApplicationContext(), "Form is valid!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Form not valid!", Toast.LENGTH_LONG).show();
                }

            }
        };

        btnSubmit.setOnClickListener(listener);
    }

    private boolean validate() {

        boolean isValid = true;

        String firstNameString = firstName.getText().toString();
        String lastNameString = lastName.getText().toString();
        String emailAddressString = emailAddress.getText().toString();
        String passwordString = password.getText().toString();
        String confirmPasswordString = confirmPassword.getText().toString();


        if (firstNameString.length() == 0) {
            firstName.setError("Field is required!");
            isValid = false;
        }

        if (lastNameString.length() == 0) {
            lastName.setError("Field is required!");
            isValid = false;
        }

        if (emailAddressString.length() == 0) {
            emailAddress.setError("Field is required!");
            isValid = false;
        }

        if (passwordString.length() == 0) {
            password.setError("Field is required!");
            isValid = false;
        }

        if (confirmPasswordString.length() == 0) {
            confirmPassword.setError("Field is required!");
            isValid = false;
        }

        return isValid;
    }
}
