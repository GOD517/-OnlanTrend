package com.example.onlantrend;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity11 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

    }

    public void goNevScrin13(View view) {
        Intent intent = new Intent(this,MainActivity13.class);
        startActivity(intent);
    }

    public void goNevScrin14(View view) {
        Intent intent = new Intent(this,MainActivity14.class);
        startActivity(intent);
    }
}
