package taller01.agenda.app;

import taller01.agenda.dominio.Agenda;
import taller01.agenda.dominio.Contacto;

public class AppAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.agregar("Georgina", "Ronaldo", 3113776458l);
        agenda.agregar("Ana", "Bedoya", 3219000174l);
        agenda.agregar("Carlos", "Mattos", 3002587496l);
        agenda.agregar("Alejandro", "Ramirez", 3104698710l);
        agenda.agregar("Maurioc","Bedoya",3229008990l);

        agenda.imprimirAgenda();

//buscar por celular
        Contacto X = agenda.buscarPrimero(3104698710l);

        if (X != null) {
            System.out.println("Contacto buscado: " + X.nombre);
        } else {
            System.out.println("Contacto no encontrado");
        }

//        Contacto contactoABorrar = Contacto;
//        Contacto contactoAMatar= ;
//        agenda.eliminar(contactoAMatar);


        Contacto contactoExistente = new Contacto("Alfredo", "Berrio", 3104698710l);
        agenda.editar(contactoExistente);




        agenda.imprimirAgenda();



        // buscar por Apellido
        Contacto Z = agenda.buscarContApe("Bedoya");

        if (Z != null) {
            System.out.println("Contacto buscado: " + Z.nombre);
        } else {
            System.out.println("Contacto no encontrado");
        }


        // buscar por nombre
        Contacto Y = agenda.buscarContNom("Ana");

        if (Y != null) {
            System.out.println("Contacto buscado: " + Y.nombre);
        } else {
            System.out.println("Contacto no encontrado");
        }


//        cambiar a un contacto garcias a su  celular
        Contacto contactoExistente2 = new Contacto("Ana", "Caiman", 3214909999l);
        agenda.editarCel(contactoExistente2);




        agenda.imprimirAgenda();

//        agenda.


//        ordenar contactos


//        para eleminar un elemento
//        List<String> nombresAEliminar = Array.asLiList("Luisa", "Pedro");
//        nombres.removeAll(nombresAEliminar);

//        nombres.removeIf(nombre -> nombre.startsWhith("---"));
//        nombres.removeIf(nombre -> nombre.equals("---"));

//        No le va a importar como este escrito
//        nombres.removeIf(nombre -> nombre.equalsIgnoreCase("-----"));

//    Filtrar una Lista
        this.contactos = this.contactos.stream().sorted().collect(collectors);





    }
}
