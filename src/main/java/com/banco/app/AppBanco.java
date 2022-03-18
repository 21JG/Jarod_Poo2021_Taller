package com.banco.app;

import com.banco.dominio.CuentaBancaria;

public class AppBanco {
    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria();
        CuentaBancaria tuCuenta = new CuentaBancaria();

        miCuenta.activar();
        miCuenta.consignar(100000);
        miCuenta.retirar(98000);
        //miCuenta.transferir(50000, tuCuenta);
        System.out.println("MI CUENTA: " + miCuenta.obtenerSaldoActual());
        System.out.println("TU CUENTA: " + tuCuenta.obtenerSaldoActual());
    }
}
