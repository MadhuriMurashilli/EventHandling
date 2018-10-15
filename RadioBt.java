package com.example.mca.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class RadioBt extends AppCompatActivity {

    Button btn;
    RadioButton rbtMale, rbtFemale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio_main);

        btn = (Button) findViewById(R.id.btn);

        rbtFemale = (RadioButton) findViewById(R.id.rbtFemale);
        rbtMale = (RadioButton) findViewById(R.id.rbtMale);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rbtMale.isChecked()) {
                    Toast.makeText(RadioBt.this, "U have Selected Male", Toast.LENGTH_SHORT).show();
                } else if (rbtFemale.isChecked()) {
                    Toast.makeText(RadioBt.this, "U have Selected Female", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(RadioBt.this, "Please select one item", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

