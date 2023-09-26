package edu.isc.tesoem.jdcg.P3_7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class principalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent lanza = new Intent(principalActivity.this, menuActivity.class);
                startActivity(lanza);
                finish();
            }
        }, 4000);
    }
}