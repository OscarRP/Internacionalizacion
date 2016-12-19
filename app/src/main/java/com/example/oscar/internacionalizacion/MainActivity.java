package com.example.oscar.internacionalizacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton = (Button)findViewById(R.id.button);
        Escuchando listenButton = new Escuchando(this);
        boton.setOnClickListener(listenButton);
    }
}
