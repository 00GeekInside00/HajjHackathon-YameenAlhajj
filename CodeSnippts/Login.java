package com.hajj.al.yamen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login extends AppCompatActivity {
    EditText password;
    EditText email;
  
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
         password=(EditText) findViewById(R.id.editText);
         email=(EditText) findViewById(R.id.editText3);
    }
    public void click(View view){
        if (isValidPassword(password.getText().toString().trim())&& password.getText().toString() .equals("A123456") && email.getText().toString().equals("hamza@gmail.com") && isValidEmail(email.getText().toString().trim())) {
        Intent intent= new Intent(Login.this,MainActivity.class);
        startActivity(intent);
        } else {
            Toast.makeText(Login.this, "Invalid email or password", Toast.LENGTH_SHORT).show();
        }
    }


    public boolean isValidPassword(final String password) {

        Pattern pattern;
        Matcher matcher;

        final String PASSWORD_PATTERN = "^(?=.*\\d)(?=.*[A-Z])(?!.*[^a-zA-Z0-9@#$^+=])(.{6,})$";

        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(password);

        return matcher.matches();

    }


    public boolean isValidEmail(final String email) {

        Pattern pattern;
        Matcher matcher;

        final String EMAIL_PATTERN = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";

        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);

        return matcher.matches();

    }

}
