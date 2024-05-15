package com.penabeniteztrans;

import java.awt.EventQueue;

import com.penabeniteztrans.View.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de transporte PeñaBenitezTrans!");

        /**
         * Despliegue de la aplicacion.
         */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VentanaPrincipal frame = new VentanaPrincipal();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}