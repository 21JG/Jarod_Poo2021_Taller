package com.dispensador.dominio;

public class Snack {
    public String marca;
    public String cod;
    public int price;
    public short qty;

    public boolean libre = false;

    public Snack(String marca, String cod, int price, short qty) {
        this.marca = marca;
        this.cod = cod;
        this.price = price;
        this.qty = qty;
    }

    //    getter
    public String getMarca() {
        return marca;
    }

    public String getCod() {
        return cod;
    }

    public int getPrice() {
        return price;
    }

    public short getQty() {
        return qty;
    }

    public boolean isLibre() {
        return libre;
    }


//    Setter
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQty(short qty) {
        this.qty = qty;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    //// clicl derecho generate constructor


}
