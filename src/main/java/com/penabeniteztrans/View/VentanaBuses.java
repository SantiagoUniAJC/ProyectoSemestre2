package com.penabeniteztrans.View;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.penabeniteztrans.Model.Bus;

public class VentanaBuses extends JFrame {

    private JTextArea textAreaBuses;

    public VentanaBuses(List<Bus> listaBuses) {

        // Configuración de la ventana
        super("Lista de Buses");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(430, 300);
        setLocationRelativeTo(null);

        setLayout(null);

        // Crear el área de texto para mostrar la lista de buses
        textAreaBuses = new JTextArea();
        textAreaBuses.setEditable(false);

        // Agregar los buses al área de texto
        for (Bus bus : listaBuses) {
            textAreaBuses.append(bus.getPlaca() + " - Pasajeros: " + bus.getCantidadPasajeros() + "\n");
        }

        // Agregar el área de texto a la ventana
        JScrollPane scrollPane = new JScrollPane(textAreaBuses);
        scrollPane.setBounds(10, 10, 380, 200);
        add(scrollPane);

        // Agregar un boton para crear un nuevo bus
        JButton btnNuevoBus = new JButton("Agregar Bus");
        btnNuevoBus.setBounds(10, 220, 120, 30);
        btnNuevoBus.setBackground(new java.awt.Color(0, 255, 0));
        add(btnNuevoBus);

        // Agregar un boton para eliminar un bus
        JButton btnEliminarBus = new JButton("Eliminar Bus");
        btnEliminarBus.setBounds(140, 220, 120, 30);
        btnEliminarBus.setBackground(new java.awt.Color(255, 0, 0));
        add(btnEliminarBus);

        // Agregar un boton para establecer la capacidad de un bus
        JButton btnCapacidadBus = new JButton("Capacidad Bus");
        btnCapacidadBus.setBounds(270, 220, 120, 30);
        btnCapacidadBus.setBackground(new java.awt.Color(0, 0, 255));
        add(btnCapacidadBus);

    }

    // Método para actualizar la lista de buses mostrada en la ventana
    public void actualizarBuses(List<String> listaBuses) {
        textAreaBuses.setText("");
        for (String bus : listaBuses) {
            textAreaBuses.append(bus + "\n");
        }
    }

    // Método main para probar la ventana de buses
    public static void main(String[] args) {
        VentanaBuses ventanaBuses = new VentanaBuses(null);
        ventanaBuses.setVisible(true);
    }
}
