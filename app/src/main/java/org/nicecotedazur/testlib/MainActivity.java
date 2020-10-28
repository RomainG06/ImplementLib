package org.nicecotedazur.testlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.nicecotedazur.mylibrary.TestActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestActivity test = new TestActivity();
        test.presentActivity(this);
    }
}