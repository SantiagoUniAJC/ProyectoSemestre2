package com.penabeniteztrans;

// paquetes necesarios para la aplicacion.
import java.awt.EventQueue;
import com.penabeniteztrans.View.VentanaPrincipal;

/**
 * Clase principal de la aplicacion.
 */
public class Main {
    public static void main(String[] args) {
        // Mensaje de bienvenida que se muestra en la terminal.
        System.out.println("Bienvenido al sistema de transporte PeñaBenitezTrans!");

        /**
         * Despliegue de la aplicacion.
         */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    // Se crea una instancia de la ventana principal.
                    VentanaPrincipal frame = new VentanaPrincipal();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}