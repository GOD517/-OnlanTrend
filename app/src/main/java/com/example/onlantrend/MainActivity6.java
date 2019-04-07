package com.example.onlantrend;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

    }

    public void goNevScrin7(View view) {
        Intent intent = new Intent(this,MainActivity7.class);
        startActivity(intent);
    }

    public void goNevScrin8(View view) {
        Intent intent = new Intent(this,MainActivity8.class);
        startActivity(intent);
    }
}
