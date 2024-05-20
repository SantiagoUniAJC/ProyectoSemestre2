package com.penabeniteztrans.View;

// paquetes necesarios para la aplicacion.
import javax.swing.*;
import com.penabeniteztrans.Model.Bus;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class VentanaMenu extends JFrame {

    // Constructor de la ventana
    public VentanaMenu() {
        super("Menú de Opciones");

        // Configuración de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla

        // Layout para organizar los botones
        setLayout(new FlowLayout());

        // Crear botones de menú
        JButton botonOpcion1 = new JButton("Conductor");
        JButton botonOpcion2 = new JButton("Taquilla");
        JButton botonOpcion3 = new JButton("Rutas");
        JButton btnBuses = new JButton("Buses");
        JButton botonOpcion5 = new JButton("CRM");
        JButton botonOpcion6 = new JButton("Nómina");

        // Agregar los botones a la ventana
        add(botonOpcion1);
        add(botonOpcion2);
        add(botonOpcion3);
        add(btnBuses);
        add(botonOpcion5);
        add(botonOpcion6);

        // Agregar ActionListener para manejar los clics en los botones
        botonOpcion1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Seleccionaste la Opción 1");
            }
        });

        botonOpcion2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Seleccionaste la Opción 2");
            }
        });

        botonOpcion3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Seleccionaste la Opción 3");
            }
        });
        // Agregar ActionListener para manejar los click en el botón de Buses
        btnBuses.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear una lista de objetos Bus con los buses deseados
                List<Bus> buses = new ArrayList<>();
                buses.add(new Bus("Bus 1", 20));
                buses.add(new Bus("Bus 2", 30));
                buses.add(new Bus("Bus 3", 25));

                // Crear una nueva ventana de Buses con la lista de buses
                VentanaBuses ventanaBuses = new VentanaBuses(buses);
                ventanaBuses.setVisible(true);
            }
        });

        botonOpcion6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Seleccionaste la Opción 6");
            }
        });

        // Hacer visible la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new VentanaMenu();
            }
        });
    }
}