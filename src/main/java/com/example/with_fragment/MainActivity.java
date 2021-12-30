package com.example.with_fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT";
    private Button btn;
    private EditText enter_line;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enter_line = (EditText) findViewById(R.id.edit_text);
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra(EXTRA_TEXT,enter_line.getText().toString());
                startActivity(intent);
            }
        });


    }
}