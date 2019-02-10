package com.example.uci_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public abstract class MainActivity extends AppCompatActivity {
    Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClick = findViewById(R.id.signupbutton);
}
    public void onButtonClick(View v)
    {
        if(v==btnClick)
        {
            Intent i = new Intent(getApplicationContext(),Signup.class);
            startActivity(i);
            setContentView(R.layout.activity_signup);
        }
    }
}
