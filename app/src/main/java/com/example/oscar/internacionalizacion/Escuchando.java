package com.example.oscar.internacionalizacion;


import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.app.Activity;

public class Escuchando implements View.OnClickListener{
    Context context;

    public Escuchando (Context context) {this.context = context;}

    @Override
    public void onClick(View vista) {
        LanzarSaludo.saludar (context);
    }
}
