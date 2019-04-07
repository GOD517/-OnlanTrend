package com.example.onlantrend;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity10 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

    }

    public void goNevScrin11(View view) {
        Intent intent = new Intent(this,MainActivity11.class);
        startActivity(intent);
    }

    public void goNevScrin12(View view) {
        Intent intent = new Intent(this,MainActivity12.class);
        startActivity(intent);
    }
}
