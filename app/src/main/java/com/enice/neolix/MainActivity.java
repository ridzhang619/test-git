package com.enice.neolix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("ridzhang","process = " + Settings.Global.getString(getContentResolver(),"ngbj_process"));

        String a = "com.enice";

        String b = "com.enice.net";

        Log.i("ridzhang","process = " + b.contains(a));

    }
}