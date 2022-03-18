package taller01.dispensador.app;


public class AppDispensador {
    public static void main(String[] args0) {
//
        AppContenedor dispensador = new AppContenedor();

        dispensador.crearSnack("Doritos", "a1", (short) 5, 1400);

        dispensador.crearSnack("Detodito", "d3", (short) 3, 2100);

        dispensador.crearSnack("Choclitos", "b1", (short) 6, 1500);

        dispensador.crearSnack("Gudis", "a2", (short) 1, 800);

        dispensador.crearSnack("Cheesetris", "c2", (short) 0, 1300);

        dispensador.crearSnack("Todorico", "b3", (short) 0, 1600);

        dispensador.crearSnack("sparkies", "c1", (short) 6, 400);

        dispensador.crearSnack("kitkat", "d1", (short) 2, 4000);

        dispensador.crearSnack("Boolis", "c3", (short) 5, 100);

        dispensador.crearSnack("Tostacos", "b2", (short) 1, 800);

        dispensador.crearSnack("Quipitos", "d2", (short) 0, 500);

        dispensador.crearSnack("Margarita", "a3", (short) 6, 1800);



//        snack por codigo
        dispensador.dispensarSnackPorCodigo("c2", 1000);


//      snack por nombre
        dispensador.dispensarSnackPorNombre("Quipitos", 1200);

//      agregar snack

        dispensador.agregarUnSnack("Quipitos");

        dispensador.ordenarCantidad();
//        quitar snacvk
        dispensador.quitarUnSnack("Gudis");

        dispensador.dispensarSnackPorNombre("Quipitos", 1200);

        dispensador.ordenarCantidad();

//       Que snacks hay agotados
        dispensador.obtenerSnacksAgotados();

//        Obtener snacks disponibles
        dispensador.obtenerSnacksDisponibles();

//        Ordenar por precio de mayor a menor
        dispensador.ordenarPrecio();
//        Ordenar por los snakcs de menor cantidad a mayor
        dispensador.ordenarCantidad();


    }
}

// tets.1
//    Snack snack = new Snack("Margarita", 3);
//
//        DispensadorDeSnack dispensador = new DispensadorDeSnack("XXSS", 6);
//        dispensador.snack = snack;
//
//        dispensador.llenar();
//        dispensador.Dispensar(4);
//        dispensador.Dispensar(1);
//        dispensador.Dispensar(1);
//
//        Snack snack2 = new Snack("Rafi", 10);
//
//        dispensador.cambiarSnack(snack2);
//        dispensador.Dispensar(2);
//