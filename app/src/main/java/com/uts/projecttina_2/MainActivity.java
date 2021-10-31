package com.uts.projecttina_2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public Button hitung;
    public EditText name;
    public EditText absen;
    public EditText quiz;
    public EditText tugas;
    public EditText uts;
    public EditText uas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hitung = (Button) findViewById(R.id.hitung);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = (EditText) findViewById(R.id.editTextTextPersonName);
                absen = (EditText) findViewById(R.id.editTextTextPersonName2);
                quiz = (EditText) findViewById(R.id.editTextTextPersonName3);
                tugas = (EditText) findViewById(R.id.editTextTextPersonName4);
                uts = (EditText) findViewById(R.id.editTextTextPersonName5);
                uas = (EditText) findViewById(R.id.editTextTextPersonName6);

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("name", name.getText().toString());
                intent.putExtra("absen", absen.getText().toString());
                intent.putExtra("quiz", quiz.getText().toString());
                intent.putExtra("tugas", tugas.getText().toString());
                intent.putExtra("uts", uts.getText().toString());
                intent.putExtra("uas", uas.getText().toString());
                startActivity(intent);
            }
        });
    }
}