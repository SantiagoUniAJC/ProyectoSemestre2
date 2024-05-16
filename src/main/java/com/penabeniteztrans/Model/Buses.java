package com.penabeniteztrans.Model;

import java.util.ArrayList;
import java.util.List;

public class Buses {
    private List<String> listaBuses;

    public Buses() {
        this.listaBuses = new ArrayList<>();
    }

    // Método para agregar un nuevo bus
    public void agregarBus(String bus) {
        listaBuses.add(bus);
    }

    // Método para obtener la lista de buses
    public List<String> getListaBuses() {
        return listaBuses;
    }

    // Método para eliminar un bus de la lista
    public void eliminarBus(String bus) {
        listaBuses.remove(bus);
    }

    // Método para modificar un bus de la lista
    public void modificarBus(String busAntiguo, String busNuevo) {
        int index = listaBuses.indexOf(busAntiguo);
        listaBuses.set(index, busNuevo);
    }

    // Método para imprimir la lista de buses
    public void imprimirBuses() {
        for (String bus : listaBuses) {
            System.out.println(bus);
        }
    }

    // Método main para probar la clase Buses
    public static void main(String[] args) {
        Buses buses = new Buses();
        buses.agregarBus("Bus 1");
        buses.agregarBus("Bus 2");
        buses.agregarBus("Bus 3");
        buses.imprimirBuses();
        buses.eliminarBus("Bus 2");
        buses.imprimirBuses();
        buses.modificarBus("Bus 1", "Bus 4");
        buses.imprimirBuses();
    }

}
