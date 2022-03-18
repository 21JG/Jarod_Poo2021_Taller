package taller01.agenda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AppLista {
    public static void main(String[] args) {
//        List<String> nombres = Arrays.asList("Pedro", "Luisa", "Camilo", "Andrea");
        List<String> nombres = new ArrayList<>();

        // Añadir un elemento
        nombres.add("Pedro");
        nombres.add("albeira");
        nombres.add("Luisa");
        nombres.add("Camilo");
        nombres.add("Andrea");
        nombres.add("Lucas");
        nombres.add("Alejandro");

        // Eliminar un elemento
        //List<String> nombresAEliminar = Arrays.asList("Luisa", "Pedro");
        //nombres.removeAll(nombresAEliminar);

        //nombres.removeIf(nombre -> nombre.equalsIgnoreCase("aLeJanDro"));

        // Filtrar una lista



        // Recorrer una lista
//        recorrerConFor(nombres);
//        recorrerConForEach(nombres);

        // Recorrer una lista
//        recorrerConFor(nombres);
//        recorrerConForEach(nombres);
        List<String> nombresConLaA = nombres.stream()
                .filter(name -> name.toLowerCase().startsWith("a"))
                .collect(Collectors.toList());

        recorrerConMetodoForEach(nombresConLaA);

        System.out.println("los nombres con a son "+ nombresConLaA);

        // Obtener tamaño de la lista
        int tamano = nombres.size();
        System.out.println(tamano);
    }

    public static void recorrerConFor(List<String> nombres) {
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
    }

    public static void recorrerConForEach(List<String> nombres) {
        for (String name : nombres) {
            System.out.println(name);
        }
    }

    public static void recorrerConMetodoForEach(List<String> nombres) {
        nombres.forEach(nombreARecorrer -> {
            System.out.println(nombreARecorrer);
        });
    }

    public static void filtrar(List<String> nombres){
        nombres.forEach(nombreARecorrer -> {
            System.out.println(nombreARecorrer);
        });
    }

}
