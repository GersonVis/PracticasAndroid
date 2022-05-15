package com.example.practicasandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    Button buttonToast, buttonAppBar;
    AppCompatActivity viewPadre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPadre=this;
        //enlaces con la interfaz
        buttonToast=findViewById(R.id.buttonToast);
        buttonAppBar=findViewById(R.id.buttonAppBar);

        //eventos
        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Toast.makeText(viewPadre, "Pulsado toast", Toast.LENGTH_LONG).show();
            }
        });
        View.OnClickListener onClickListenerRevertir=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("APP", "revertir");
            }
        };
        buttonAppBar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Snackbar snackbarPulsado=Snackbar.make(findViewById(R.id.constraintLayourPadre), "Pulsado", Snackbar.LENGTH_SHORT);
                snackbarPulsado.setAction("Revertir", onClickListenerRevertir);
                snackbarPulsado.show();
            }
        });
    }
}