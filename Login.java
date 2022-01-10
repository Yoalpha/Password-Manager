package com.example.passwordmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText password, username;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        password = (EditText)findViewById(R.id.password);
        username = (EditText)findViewById(R.id.username);
        login = (Button) findViewById(R.id.login);
    }

    public void validate(View view){

        String name = username.getText().toString();
        String pass = password.getText().toString();

        if(name.equals("yoalpha") || pass.equals("password")){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this,"Password or Username is Inncorect", Toast.LENGTH_SHORT).show();
        }

    }
}