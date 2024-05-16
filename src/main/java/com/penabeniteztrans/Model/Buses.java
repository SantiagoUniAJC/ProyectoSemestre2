package com.penabeniteztrans.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Buses implements Serializable {
    private List<Bus> listaBuses;

    public Buses() {
        this.listaBuses = new ArrayList<>();
    }

    // Método para agregar un nuevo bus
    public void agregarBus(Bus bus) {
        listaBuses.add(bus);
    }

    // Método para obtener la lista de buses
    public List<Bus> getListaBuses() {
        return listaBuses;
    }

    // Método para eliminar un bus de la lista
    public void eliminarBus(Bus bus) {
        if (listaBuses.contains(bus)) {
            listaBuses.remove(bus);
        } else {
            throw new IllegalArgumentException("El bus no existe en la lista.");
        }
    }

    // Método para modificar un bus de la lista
    public void modificarBus(Bus busAntiguo, Bus busNuevo) {
        if (listaBuses.contains(busAntiguo)) {
            int index = listaBuses.indexOf(busAntiguo);
            listaBuses.set(index, busNuevo);
        } else {
            throw new IllegalArgumentException("El bus antiguo no existe en la lista.");
        }
    }

    // Método para imprimir la lista de buses
    public void imprimirBuses() {
        for (Bus bus : listaBuses) {
            System.out.println(bus);
        }
    }

}
