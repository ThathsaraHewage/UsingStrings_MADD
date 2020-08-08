package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.w3c.dom.Text;

public class ActivityOne extends AppCompatActivity {

        Text txtView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        Log.i(tag: "LifCycle" , msg:"OnCreate() invoked");

        txtView2 = findViewByID(R.id.textView2);
        txtView2.setText(R.string.Msg2);
    }

    public void onStart() {
        super.onStart();
        Log.in(tag: "LifCycle" , msg:"OnStart() invoked");
    }
    public void onRestart(){
        super.onRestart();
        Log.in(tag: "LifCycle" , msg:"OnRestart() invoked");
    }
    public void onResume(){
        super.onResume();
        Log.in(tag: "LifCycle" , msg:"OnResume() invoked");
    }
    public void onPause(){
        super.onPause();
        Log.in(tag: "LifCycle" , msg:"OnPause() invoked");
    }
    public void onStop(){
        super.onStop();
        Log.in(tag: "LifCycle" , msg:"OnStop() invoked");
    }
    public void onDestroy(){
        super.onDestroy();
        Log.in(tag: "LifCycle" , msg:"OnDestroy() invoked");
    }
}