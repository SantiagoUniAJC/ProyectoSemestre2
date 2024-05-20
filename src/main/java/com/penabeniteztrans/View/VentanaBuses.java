package com.penabeniteztrans.View;

// paquetes necesarios para la aplicacion.
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import com.penabeniteztrans.Model.Bus;

public class VentanaBuses extends JFrame {

    private JTextArea textoAreaBuses;

    public VentanaBuses(List<Bus> listaBuses) {

        // Configuración de la ventana
        super("Lista de Buses");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(430, 400);
        setLocationRelativeTo(null);

        setLayout(null);

        // Crear el área de texto para mostrar la lista de buses
        textoAreaBuses = new JTextArea();
        textoAreaBuses.setEditable(false);

        // Agregar los buses al área de texto
        for (Bus bus : listaBuses) {
            textoAreaBuses.append(bus.getPlaca() + " -  Cantidad de Pasajeros: " + bus.getCantidadPasajeros() + "\n");
        }

        // Agregar el área de texto a la ventana
        JScrollPane scrollPane = new JScrollPane(textoAreaBuses);
        scrollPane.setBounds(10, 10, 380, 200);
        add(scrollPane);

        // Agregar un boton para crear un nuevo bus
        JButton btnNuevoBus = new JButton("Agregar Bus");
        btnNuevoBus.setBounds(10, 220, 120, 30);
        btnNuevoBus.setBackground(new java.awt.Color(0, 255, 0));
        add(btnNuevoBus);
        // logica para agregar un bus
        btnNuevoBus.addActionListener(e -> {
            // Crear un nuevo bus
            Bus bus = new Bus("ABC123", 40);
            // Agregar el bus a la lista de buses
            listaBuses.add(bus);
            // Agregar el bus al área de texto
            agregarBus(bus.getPlaca() + " -  Cantidad de Pasajeros: " + bus.getCantidadPasajeros());
        });

        // Agregar un boton para eliminar un bus
        JButton btnEliminarBus = new JButton("Eliminar Bus");
        btnEliminarBus.setBounds(140, 220, 120, 30);
        btnEliminarBus.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminarBus.setForeground(new java.awt.Color(255, 255, 255));
        add(btnEliminarBus);
        // logica para eliminar un bus
        btnEliminarBus.addActionListener(e -> {
            // Eliminar el bus de la lista de buses
            listaBuses.remove(listaBuses.size() - 1);
            // Actualizar el área de texto
            actualizarBuses(listaBuses);
        });

        // Agregar un boton para establecer la capacidad de un bus
        JButton btnCapacidadBus = new JButton("Capacidad Bus");
        btnCapacidadBus.setBounds(270, 220, 120, 30);
        btnCapacidadBus.setBackground(new java.awt.Color(0, 0, 255));

        // color de la letra blanco
        btnCapacidadBus.setForeground(new java.awt.Color(255, 255, 255));
        add(btnCapacidadBus);

        // Agregar un boton para actualizar la lista de buses mostrada en la ventana
        JButton btnActualizarBuses = new JButton("Actualizar Bus");
        btnActualizarBuses.setBounds(10, 260, 120, 30);
        btnActualizarBuses.setBackground(new java.awt.Color(255, 255, 0));
        add(btnActualizarBuses);
        // logica para actualizar la lista de buses
        btnActualizarBuses.addActionListener(e -> {
            // Actualizar el área de texto
            actualizarBuses(listaBuses);
        });

    }

    // Método para actualizar la lista de buses mostrada en la ventana
    public void actualizarBuses(List<Bus> listaBuses) {
        textoAreaBuses.setText("");
        for (Bus bus : listaBuses) {
            textoAreaBuses.append(bus + "\n");
        }
    }

    // Metodo para agregar un bus a la lista de buses mostrada en la ventana
    // vinculado al boton de agregar bus
    public void agregarBus(String bus) {
        textoAreaBuses.append(bus + "\n");
    }

    // Método main para probar la ventana de buses
    public static void main(String[] args) {
        VentanaBuses ventanaBuses = new VentanaBuses(null);
        ventanaBuses.setVisible(true);
    }
}
