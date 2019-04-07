package com.example.onlantrend;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity20 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);

    }

    public void goNevScrin21(View view) {
        Intent intent = new Intent(this,MainActivity21.class);
        startActivity(intent);
    }

    public void goNevScrin22(View view) {
        Intent intent = new Intent(this,MainActivity22.class);
        startActivity(intent);
    }
}
