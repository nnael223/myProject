package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTxt;
    Button btn;
    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {





        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTxt = findViewById(R.id.editTxt);
        btn = findViewById(R.id.btn);
        txtView = findViewById(R.id.txtView);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  txt = editTxt.getText().toString();
                txtView.setText(txt);
            }
        });



    }
}