package com.jimenez.almikka;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4IT-H", "onCreate will run.");

    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("4IT-H", "onStart will run.");

    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("4IT-H", "onResume will run.");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("4IT-H", "onStop will run.");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("4IT-H", "onRestart will run.");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("4IT-H", "onDestroy will run.");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("4IT-H", "onPause will run.");
    }
    public void btnToast(android.view.View v) {

        Toast.makeText(this, "you clicked back button", Toast.LENGTH_LONG).show();

    }
    public void btnSnackbar(android.view.View v) {

        // Toast.makeText(this, "you clicked back button", Toast.LENGTH_LONG).show();
        Snackbar.make(v, "you clicked next button.", Snackbar.LENGTH_LONG).show();

    }
}
