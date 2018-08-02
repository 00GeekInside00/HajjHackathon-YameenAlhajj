package com.hajj.al.yamen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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
        if(email.getText().toString().equals("a@a.com")&& password.getText().toString().equals("1234")){
            Intent i=new Intent(this,MainActivity.class);
            startActivity(i);
        }
        else
            Toast.makeText(getApplicationContext(),"Wrong Email or password try again",Toast.LENGTH_SHORT).show();
    }
}
