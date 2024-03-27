package com.example.activity_cycle;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.tvSecondActivity), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });*/

       Toast toast =  Toast.makeText(this, "secondActivity", Toast.LENGTH_SHORT);
       toast.setGravity(Gravity.CENTER, 0, 0);
       toast.show();
    }


    @Override
    protected void onStart(){
        super.onStart();
        Toast toast =  Toast.makeText(this, "secondStart", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }


    @Override
    protected void onResume(){
        super.onResume();
        Toast toast =  Toast.makeText(this, "secondResume", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }


    @Override
    protected void onPause(){
        super.onPause();
        Toast toast =  Toast.makeText(this, "secondOnPause", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast toast =  Toast.makeText(this, "secondOnStop", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Toast toast =  Toast.makeText(this, "secondOnRestart", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast toast =  Toast.makeText(this, "secondOnDestroy", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}