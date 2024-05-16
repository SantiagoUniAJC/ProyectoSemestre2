package com.penabeniteztrans.Model;

import java.io.Serializable;

public class Bus implements Serializable {

    private String placa;
    private int cantidadPasajeros;

    public Bus(String placa, int cantidadPasajeros) {
        this.placa = placa;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "placa='" + placa + '\'' +
                ", cantidadPasajeros=" + cantidadPasajeros +
                '}';
    }
}
