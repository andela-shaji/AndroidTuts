package com.tutorials.suada.androidtuts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VerticalLinearLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vertical_linear_layout);
    }

    public void horizontalView(View view) {
        Intent intent = new Intent(this, HorizontalLinearLayout.class);
        startActivity(intent);
    }



}
