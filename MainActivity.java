package com.example.passwordmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button entrynew;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entrynew = (Button) findViewById(R.id.new_entry);
        entrynew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewEntry();
            }
        });
        
    }

    public void openNewEntry(){
        Intent intent = new Intent(this, newEntry.class);
        startActivity(intent);
    }
}