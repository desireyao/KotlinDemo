package com.yaoh.kt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.yaoh.kt.model.Basic;

public class MainJavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_java);

        Basic basic = new Basic();
        basic.testIf(1, 2);
    }
}
