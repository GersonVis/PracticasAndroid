package com.example.practicasandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonToast, buttonAppBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //enlaces con la interfaz
        buttonToast=findViewById(R.id.buttonToast);
        buttonAppBar=findViewById(R.id.buttonAppBar);

        //eventos
        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getParent(), "Pulsado toast", Toast.LENGTH_LONG).show();
            }
        });

        buttonAppBar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });
    }
}