package com.agenda.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Agenda {
    public List<Contacto> contactos;

    public Agenda() {
        this.contactos = new ArrayList<>();
    }


    //Funcion Agregar
    public void agregar(String nombre, String apellido, long celular) {
        Contacto contactoAAgregar = new Contacto(nombre, apellido, celular);
        this.contactos.add(contactoAAgregar);
    }

    //Funcion Eliminar
    public void eliminar(Contacto contactoAEliminar) {

        boolean eliminoCorrectamente = this.contactos.remove(contactoAEliminar.celular);

        if (eliminoCorrectamente) {
            System.out.println("Se eliminó el contacto " + contactoAEliminar.nombre);
        } else {
            System.out.println("No se eliminó nada. Porque el contacto " + contactoAEliminar.nombre + " no existe.");
        }
    }

//    Editar
    public void editar(Contacto contactoAEditar) {
        Contacto c = buscarPrimero(contactoAEditar.celular);

        if(c != null) {
            int posicionAReemplazar = this.contactos.indexOf(c);
            this.contactos.set(posicionAReemplazar, contactoAEditar);
        } else {
            System.out.println("El contacto a editar no existe.");
        }
    }
    // editar celular
    public void editarCel(Contacto contactoAEditar) {
        Contacto l = buscarUltimoName(contactoAEditar.nombre);

        if(l != null) {
            int posicionAReemplazar = this.contactos.indexOf(l);
            this.contactos.set(posicionAReemplazar, contactoAEditar);
        } else {
            System.out.println("El contacto a editar no existe.");
        }
    }
    public Contacto buscarUltimoName(String nombre) {
        Contacto contactSearch = this.contactos.stream()
                .filter(contacto -> contacto.nombre == nombre)
                .findFirst().orElse(null);
        return contactSearch;
    }






// buscar primercontacto
    public Contacto buscarPrimero(long celular) {
        Contacto contactBusc = this.contactos.stream()
                                    .filter(contacto -> contacto.celular == celular)
                                    .findFirst().orElse(null);
        return contactBusc;
    }

//    buscar ultimo
    public Contacto buscarUltimo(long celular) {
        Contacto contactSearch = this.contactos.stream()
            .filter(contacto -> contacto.celular == celular)
            .findFirst().orElse(null);
        return contactSearch;
    }


    //buscar por celular
    public Contacto buscarContCel(long celular) {
        AtomicReference<Contacto> contactoBuscado = new AtomicReference<>();

        this.contactos.forEach(contacto -> {
            if (contacto.celular == celular) {
                contactoBuscado.set(contacto);
            }
        });
        return contactoBuscado.get();
    }
    //buscar por Apellido
    public Contacto buscarContApe(String apellido) {
        AtomicReference<Contacto> contactoBuscado = new AtomicReference<>();

        this.contactos.forEach(contacto -> {
            if (contacto.apellido == apellido) {
                contactoBuscado.set(contacto);
            }
        });
        return contactoBuscado.get();
    }
    //buscar por Apellido
    public Contacto buscarContNom(String nombre) {
        AtomicReference<Contacto> contactoBuscado = new AtomicReference<>();

        this.contactos.forEach(contacto -> {
            if (contacto.nombre == nombre) {
                contactoBuscado.set(contacto);
            }
        });
        return contactoBuscado.get();
    }

    public void imprimirAgenda() {
        this.contactos.forEach(c -> System.out.println(c.nombre + " - " + c.celular));
    }

    public void imprimirAgendaOrdenada() {
    }
}
