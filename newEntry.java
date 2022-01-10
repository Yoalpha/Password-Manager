package com.example.passwordmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.passwordmanager.data.DBHelper;

public class newEntry extends AppCompatActivity {
    EditText username, email, password;
    Button createEntry;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_entry);

        username = findViewById(R.id.username_entry);
        email = findViewById(R.id.email_entry);
        password = findViewById(R.id.password_entry);

        createEntry = findViewById(R.id.create_entry);
        DB = new DBHelper(this);

        createEntry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameTXT = username.getText().toString();
                String emailTXT = email.getText().toString();
                String passwordTXT = password.getText().toString();

                Boolean checkinsertdata = DB.insertuserdate(usernameTXT, emailTXT, passwordTXT);
                if (checkinsertdata == true)
                    Toast.makeText(newEntry.this, "Entry Added", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(newEntry.this, "Entry Not Added", Toast.LENGTH_SHORT).show();
            }
        });
    }
}