package com.banco.dominio;

public class CuentaBancaria {
    public long numero;
    public String tipo;
    public long saldo;
    public long tope;
    public short clave;
    public Persona propietario;
    public boolean activa;

    public void activar() {
        this.activa = true;
    }

    public void cerrar() {
        this.activa = false;
    }

    public boolean retirar(long montoARetirar) {
        if (activa == true && saldo >= montoARetirar) {
            this.saldo -= montoARetirar; // same to-> this.saldo = this.saldo - montoARetirar;
            return true;
        } else {
            System.out.println("No se pudo retirar. La cuenta está inactiva o el saldo es insuficiente.");
            return false;
        }
    }

    public boolean consignar(long montoAConsignar) {
        if (activa == true) {
            this.saldo += montoAConsignar;
            return true;
        }

        System.out.println("No se pudo consignar. La cuenta está inactiva.");
        return false;
    }

    public boolean transferir(long montoATransferir, CuentaBancaria cuentaDestino) {
        // 1. sacar de la cuenta de origen
        boolean retiroBien = this.retirar(montoATransferir);

        // 2. adicionar a la cuenta destino
        if (retiroBien == true) {
            boolean consignoBien = cuentaDestino.consignar(montoATransferir);

            if (!consignoBien) {

            }

            return consignoBien;
        }

        return false;
    }

    public String obtenerSaldoActual() {
        return "Tienes " + this.saldo + " pesos.";
    }
}
