package com.example.tugas6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    private Button buttonsubmit;
    private EditText etAngka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        buttonsubmit = findViewById(R.id.btn_submit);
        etAngka = findViewById(R.id.etbilangan);
        buttonsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(Login.this,MainActivity.class);
                pindah.putExtra("bilangan",etAngka.getText().toString());
                startActivity(pindah);

            }
        });
    }
}