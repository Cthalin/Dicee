package com.example.eslowikowski.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = (Button) findViewById(R.id.rollButton);

        ImageView leftDice = (ImageView) findViewById(R.id.image_leftdice);
        ImageView rightDice = (ImageView) findViewById(R.id.image_rightdice);

    }
}
