package com.lizij.flappybirddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lizij.flappybirddemo.View.FlappyBirdView;

public class MainActivity extends AppCompatActivity {
    private FlappyBirdView mGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        mGame = new FlappyBirdView(this);
        setContentView(mGame);
    }
}
