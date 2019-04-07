package com.example.onlantrend;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

    }

    public void goNevScrin9(View view) {
        Intent intent = new Intent(this,MainActivity9.class);
        startActivity(intent);
    }

    public void goNevScrin10(View view) {
        Intent intent = new Intent(this,MainActivity10.class);
        startActivity(intent);
    }
}
