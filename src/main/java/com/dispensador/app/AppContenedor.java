package com.dispensador.app;

import com.dispensador.dominio.Snack;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;


// ejemplo 01
//public class AppContenedor {
//    public static void main(String[] args) {
    //        List<String> nombres = Arrays.asList("Pedro", "Luisa", "Camilo", "Andrea");
//    List<String> nombresSnacks = new ArrayList<>();
//  //static list
////    public static List<Snack> main(String[] args) {
//    // Añadir un elemento
//        nombresSnacks.add("Rizada");
//        nombresSnacks.add("Margarita");
//        nombresSnacks.add("DeTodito");
//
//
//    // Eliminar un elemento
//    //List<String> nombresAEliminar = Arrays.asList("Luisa", "Pedro");
//    //nombres.removeAll(nombresAEliminar);
//
//    //nombres.removeIf(nombre -> nombre.equalsIgnoreCase("aLeJanDro"));
//
//    // Filtrar una lista
//
//
//
//    // Recorrer una lista
////        recorrerConFor(nombres);
////        recorrerConForEach(nombres);
//
////    List<String> nombresConLaA = nombres.stream()
////            .filter(name -> name.toLowerCase().startsWith("a"))
////            .collect(Collectors.toList());
////
////    recorrerConMetodoForEach(nombresConLaA);
////
////        System.out.println("los nombres con a son "+ nombresConLaA);
//
//    // Obtener tamaño de la lista
//    int cantidadSnack = nombresSnacks.size();
//        System.out.println(cantidadSnack);
//}
//
//    public static void recorrerConFor(List<String> nombres) {
//        for (int i = 0; i < nombres.size(); i++) {
//            System.out.println(nombres.get(i));
//        }
//    }
//
//    public static void recorrerConForEach(List<String> nombres) {
//        for (String name : nombres) {
//            System.out.println(name);
//        }
//    }
//
//    public static void recorrerConMetodoForEach(List<String> nombresSnacks) {
//        nombresSnacks.forEach(nombreARecorrer -> {
//            System.out.println(nombreARecorrer);
//        });
//    }
//}

public class AppContenedor {




    List<Snack> snacks = new ArrayList<>();

    public void crearSnack(String marca, String cod, short qty, int price){
        int space = snacks.size();
        if (space < 12){
            Snack snackAgregar = new Snack(marca, cod, price, qty);
            this.snacks.add(snackAgregar);
        } else {
            System.out.println("La maquina no tiene slots libres");

        }
    }

    public void dispensarSnackPorCodigo(String cod, int dinero){
        Snack s = this.snacks.stream()
                .filter(snack -> Objects.equals(snack.getCod(), cod))
                .findFirst().orElse(null);

        if (s != null){
            int price = s.price;
            short qty = s.qty;
            if(dinero >= price && qty > 0){
                short qtyActual = s.qty;
                qtyActual = (short) (qtyActual - 1);
                s.setQty(qtyActual);
                if (qtyActual == 0){
                    s.setLibre(true);
                }
                System.out.println(s.getMarca() + " se dispenso sin novedad");
            } else {
                System.out.println("No se logro dispensar revisa el dinero ingresado y la cantidad  " + s.getMarca());
            }
        } else {
            System.out.println("No hay " + s.getMarca());
        }
    }

    public void dispensarSnackPorNombre(String marca, int dinero){
        Snack s = this.snacks.stream()
                .filter(snack -> Objects.equals(snack.getMarca(), marca))
                .findFirst().orElse(null);

        if (s != null){
            int price = s.price;
            short qty = s.qty;
            if(dinero >= price && qty > 0){
                short cantidadActual = s.qty;
                cantidadActual = (short) (cantidadActual - 1);
                s.setQty(cantidadActual);
                if (cantidadActual == 0){
                    s.setLibre(true);
                }
                System.out.println(s.getMarca() + " se logro dispensaar");
            } else {
                System.out.println("No se logro dispensar revisa el dinero ingresado y la cantidad " + s.getMarca());
            }
        } else {
            System.out.println("No hay " + s.getMarca());
        }
    }

    public void agregarUnSnack(String marca){
        Snack s = this.snacks.stream()
                .filter(snack -> Objects.equals(snack.getMarca(), marca))
                .findFirst().orElse(null);

        if (s != null){
            short cantidadActual = s.qty;
            if (cantidadActual < 6) {
                cantidadActual = (short) (cantidadActual + 1);
                s.setQty(cantidadActual);
                System.out.println("Se a añadio una unidad a " + s.getMarca());
            } else {
                System.out.println("El slot está lleno.");
            }
        } else {
            System.out.println("No se ha encontrado el snack en la maquina ");
        }
    }

    public void quitarUnSnack(String marca){
        Snack s = this.snacks.stream()
                .filter(snack -> Objects.equals(snack.getMarca(), marca))
                .findFirst().orElse(null);

        if (s != null){
            short cantidadActual = s.qty;
            if (cantidadActual > 0) {
                cantidadActual = (short) (cantidadActual - 1);
                s.setQty(cantidadActual);
                if (cantidadActual == 0){
                    s.setLibre(true);
                }
                System.out.println("Se quito una unidad a " + s.getMarca());
            } else {
                System.out.println("No hay unidades de " + s.getMarca());
            }
        } else {
            System.out.println("No se ha encontrado el snack en la maquina");
        }
    }

    public void obtenerNumeroDeUnidades(String marca){
        Snack s = this.snacks.stream()
                .filter(snack -> Objects.equals(snack.getMarca(), marca))
                .findFirst().orElse(null);

        if (s != null){
            System.out.println(s.getMarca() + " - " + s.getQty());
        } else {
            System.out.println("No se ha encontrado el snack");
        }
    }

    //
    public void obtenerSnacksAgotados(){
        System.out.println("Snack Agotado");
        List<Snack> agotados = getAgotados(snacks);
        agotados.stream().forEach(snack -> {
            System.out.println(snack.getMarca());
        });
    };

    private List<Snack> getAgotados(List<Snack> snacks) {
        return snacks.stream().filter(Snack::isLibre).collect(Collectors.toList());
    }

    public void obtenerSnacksDisponibles(){
        System.out.println("Eston son los Snacks disponibles");
        this.snacks.forEach(snack -> System.out.println(snack.getMarca() + " - " + snack.getQty()));
    }

    public void ordenarPrecio(){
        System.out.println("Asi quedan los Snakcs ordenados por precio ");
        this.snacks.sort(Comparator.comparing(Snack::getPrice));
        Collections.reverse(snacks);
        this.snacks.forEach(snack -> System.out.println(snack.getMarca() + " - " + snack.getPrice()));
    }

    public void ordenarCantidad(){
        System.out.println("Asi quedan los Snakcs ordenados por el numero de estos");
    this.snacks.sort(Comparator.comparing(Snack::getQty));
        this.snacks.forEach(snack -> System.out.println(snack.getMarca() + " - " + snack.getQty()));
    }
}