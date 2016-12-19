package com.example.oscar.internacionalizacion;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import static com.example.oscar.internacionalizacion.R.layout.holactivity;


public class LanzarSaludo {

    public static void saludar (Context context) {
        Intent intent = null;
        Activity a = null;
        a = (Activity) context;

        intent = new Intent(this, holactivity.class);
        a.startActivity(intent);
    }




}
