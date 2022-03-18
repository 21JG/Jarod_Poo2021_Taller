package taller01.dispensador.dominio;

public class DispensadorDeSnack {
    public String marca;
    public double capacidad;
    public double cantidadActual;
    public Snack snack;

    public DispensadorDeSnack(String marca, double capacidad) {
        this.marca = marca;
        this.capacidad = capacidad;
    }

    public boolean Dispensar(double cantidadADispensar) {
        if (cantidadADispensar <= this.cantidadActual) {
            this.cantidadActual -= cantidadADispensar;
            System.out.println("Se dispenso bien...");
            System.out.println("Quedan " + this.cantidadActual + " de  " + this.snack.marca);
            return true;
        }

        System.out.println("No se pudo dispensar.");
        return false;
    }
// test
//    public void cambiarSnak(snack nuevoSnack) {
//        this.quitar();
//        this.snack = nuevoSnack;
//        this.llenar();
//    }

    public void llenar() {
        this.cantidadActual = this.capacidad;
        System.out.println("El dispensador se llenó con " + this.snack.marca);
    }

    public void quitar() {
        this.cantidadActual = 0;
        System.out.println("El dispensador se vació con exito.");
    }
}
