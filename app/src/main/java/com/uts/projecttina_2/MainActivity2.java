package com.uts.projecttina_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    public TextView name;
    public TextView absen;
    public TextView quiz;
    public TextView tugas;
    public TextView uts;
    public TextView uas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = (TextView) findViewById(R.id.textView);
        name.setText(getIntent().getStringExtra("name"));

        absen = (TextView) findViewById(R.id.textView2);
        absen.setText(getIntent().getStringExtra("absen"));

        quiz = (TextView) findViewById(R.id.textView3);
        quiz.setText(getIntent().getStringExtra("quiz"));

        tugas = (TextView) findViewById(R.id.textView4);
        tugas.setText(getIntent().getStringExtra("tugas"));

        uts = (TextView) findViewById(R.id.textView5);
        uts.setText(getIntent().getStringExtra("uts"));

        uas = (TextView) findViewById(R.id.textView6);
        uas.setText(getIntent().getStringExtra("uas"));
    }
}