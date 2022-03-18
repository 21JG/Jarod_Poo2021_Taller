package com.tv.dominio;

public class Televisor {
    public String marca;
    public String color;
    public float tamano;
    public String serial;
    public String resolucion;
    public byte volumen;
    public boolean encendido;
    public int canalActual;

    public void subirVolumen() {
        if (this.volumen < 100) {
            this.volumen++;
        }
    }

    public void bajarVolumen() {

    }

    public void encender() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
    }

    public void cambiarCanal(int nuevoCanal) {
        if (this.canalActual != nuevoCanal) {
            this.canalActual = nuevoCanal;
        }
    }

    public String obtenerInfoCanalSwitch() {
        String nombreCanal = null;

        switch (this.canalActual) {
            case 5:
                nombreCanal = "Teleantioquia";
                break;
            case 6:
                nombreCanal = "Telemedellín";
                break;
            case 7:
                nombreCanal = "Caracol";
                break;
            default:
                nombreCanal = "NO SE :(";
        }

        return "El canal actual es " + nombreCanal;
    }

    public String obtenerInfoCanal() {
        String nombreCanal = null;

        if (this.canalActual == 5) {
            nombreCanal = "Teleantioquia";
        } else if (this.canalActual == 6) {
            nombreCanal = "Telemedellín";
        } else if (this.canalActual == 7) {
            nombreCanal = "Caracol";
        } else if (this.canalActual == 8) {
            nombreCanal = "WIN";
        } else if (this.canalActual == 9) {
            nombreCanal = "RCN";
        } else {
            nombreCanal = "NO IDENTIFICADO";
        }

        return "El canal actual es " + nombreCanal;
    }
}

