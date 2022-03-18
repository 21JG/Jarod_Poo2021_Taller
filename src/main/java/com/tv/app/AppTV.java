package com.tv.app;

import com.tv.dominio.Televisor;

public class AppTV {
    public static void main(String[] args) {
        String nombre = "AleJaNdro";
        Televisor tv = new Televisor();

        tv.subirVolumen();
        tv.subirVolumen();
        tv.subirVolumen();
        tv.subirVolumen();

        tv.cambiarCanal(7);

        System.out.println(tv.obtenerInfoCanalSwitch());
    }
}