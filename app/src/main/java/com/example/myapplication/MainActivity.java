package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
String S = " you are in ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"onCreate Function",Toast.LENGTH_SHORT).show();
        Log.d(S,"onCreate Method");


    }
    @Override
    protected void onStart() {
        super.onStart();
        getDelegate().onStart();
        Toast.makeText(this,"onStart Function",Toast.LENGTH_SHORT).show();
        Log.d(S,"onStart Method");

    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume Function",Toast.LENGTH_SHORT).show();
        Log.d(S,"onResume Method");

    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(this,"onRestart Function",Toast.LENGTH_SHORT).show();
        Log.d(S,"onRestart Method");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause Function",Toast.LENGTH_SHORT).show();
        Log.d(S,"onPause Method");

    }



    @Override
    protected void onStop() {
        super.onStop();
        getDelegate().onStop();
        Toast.makeText(this,"onStop Function",Toast.LENGTH_SHORT).show();
        Log.d(S,"onStop Method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        getDelegate().onDestroy();
        Toast.makeText(this,"onDestroy Function",Toast.LENGTH_SHORT).show();
        Log.d(S,"onDestroy Method");
    }


}
