package com.penabeniteztrans.View;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VentanaBuses extends JFrame {

    private JTextArea textAreaBuses;

    public VentanaBuses(List<String> listaBuses) {
        // Configuración de la ventana
        super("Lista de Buses");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Crear el área de texto para mostrar la lista de buses
        textAreaBuses = new JTextArea();
        textAreaBuses.setEditable(false);

        // Agregar los buses al área de texto
        for (String bus : listaBuses) {
            textAreaBuses.append(bus + "\n");
        }

        // Agregar el área de texto a la ventana
        getContentPane().add(new JScrollPane(textAreaBuses), BorderLayout.CENTER);
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
        VentanaBuses ventanaBuses = new VentanaBuses(List.of("Bus 1", "Bus 2", "Bus 3"));
        ventanaBuses.setVisible(true);
    }

}
