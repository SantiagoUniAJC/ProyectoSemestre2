package com.penabeniteztrans.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMenu extends JFrame {
    public VentanaMenu() {
        super("Menú de Opciones");

        // Configuración de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla

        // Layout para organizar los botones
        setLayout(new FlowLayout());

        // Crear botones de menú
        JButton botonOpcion1 = new JButton("Facturación");
        JButton botonOpcion2 = new JButton("Cuentas por Pagar");
        JButton botonOpcion3 = new JButton("Cuentas por Cobrar");
        JButton botonOpcion4 = new JButton("Inventarios");
        JButton botonOpcion5 = new JButton("CRM");
        JButton botonOpcion6 = new JButton("Nómina");

        // Agregar los botones a la ventana
        add(botonOpcion1);
        add(botonOpcion2);
        add(botonOpcion3);
        add(botonOpcion4);
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

        botonOpcion4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Seleccionaste la Opción 4");
            }
        });

        botonOpcion5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Seleccionaste la Opción 5");
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