package edu.isc.tesoem.jdcg.P3_7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuActivity extends AppCompatActivity {


    Button btnsuma2nump3;
    Button btnresta2nump3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnresta2nump3 = findViewById(R.id.p2resta2num);
        btnresta2nump3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lanzar = new Intent(menuActivity.this, resta2numActivity.class);
                startActivity(lanzar);
            }
        });

        btnsuma2nump3 = findViewById(R.id.p2suma2num);
        btnsuma2nump3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lanza = new Intent(menuActivity.this, suma2numActivity.class);
                startActivity(lanza);
            }
        });

    }
}