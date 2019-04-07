package com.example.onlantrend;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity17 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);

    }

    public void goNevScrin18(View view) {
        Intent intent = new Intent(this,MainActivity18.class);
        startActivity(intent);
    }

    public void goNevScrin19(View view) {
        Intent intent = new Intent(this,MainActivity19.class);
        startActivity(intent);
    }
}
