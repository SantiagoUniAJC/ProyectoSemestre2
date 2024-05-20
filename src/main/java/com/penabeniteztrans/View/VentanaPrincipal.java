package com.penabeniteztrans.View;

// paquetes necesarios para la aplicacion.
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

// Extendemos de Jframe que es una clase del paquete swing para crear ventanas
public class VentanaPrincipal extends JFrame {

    // Atributos de la clase VentanaPrincipal
    private JPanel contentPane;
    private JLabel labelExit;

    // Variables para mover la ventana
    int xMouse, yMouse;

    // Constructor de la clase VentanaPrincipal
    public VentanaPrincipal() {
        // Configuracion de la ventana
        setIconImage(
                Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/static/images/aH-40px.png")));
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setBounds(100, 100, 910, 537);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        setUndecorated(true);

        // Panel principal
        Panel panel = new Panel();
        panel.setBackground(SystemColor.window);
        panel.setBounds(0, 0, 910, 537);
        contentPane.add(panel);
        panel.setLayout(null);

        // Imagenes de fondo
        JLabel imagenFondo = new JLabel("");
        imagenFondo.setBounds(50, 0, 732, 501);
        imagenFondo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/static/images/menu-img.png")));
        panel.add(imagenFondo);

        // Logo de la aplicacion
        JLabel Logo = new JLabel("");
        Logo.setBounds(700, 0, 450, 400);
        Logo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/static/images/aH-1501px.png")));
        panel.add(Logo);

        // Panel de la parte inferior
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(0, 500, 910, 50);
        panel_1.setBackground(new Color(12, 138, 199));
        panel.add(panel_1);
        panel_1.setLayout(null);

        // Texto de derechos de autor
        JLabel labelCopyR = new JLabel("Desarrollado por Santiago Peña & Elkin Benitez  © 2024");
        labelCopyR.setBounds(150, 11, 600, 19);
        labelCopyR.setForeground(new Color(240, 248, 255));
        labelCopyR.setFont(new Font("Roboto", Font.PLAIN, 16));
        panel_1.add(labelCopyR);

        // Panel de la parte superior
        JPanel header = new JPanel();
        header.setBounds(0, 0, 910, 36);
        header.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                headerMouseDragged(e);

            }
        });

        // Evento para mover la ventana
        header.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                headerMousePressed(e);
            }
        });
        header.setLayout(null);
        header.setBackground(Color.WHITE);
        panel.add(header);

        // Boton de salir
        JPanel botonexit = new JPanel();
        botonexit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                botonexit.setBackground(Color.red);
                labelExit.setForeground(Color.white);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                botonexit.setBackground(Color.white);
                labelExit.setForeground(Color.black);
            }
        });

        // Configuracion del boton de salir
        botonexit.setLayout(null);
        botonexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonexit.setBackground(Color.WHITE);
        botonexit.setBounds(790, 10, 73, 36);
        header.add(botonexit);

        // Texto del boton de salir
        labelExit = new JLabel(" SALIR ");
        labelExit.setBounds(0, 0, 73, 26);
        botonexit.add(labelExit);
        labelExit.setHorizontalAlignment(SwingConstants.CENTER);
        labelExit.setFont(new Font("Roboto", Font.PLAIN, 18));

        JPanel botonLogin = new JPanel();
        botonLogin.setBounds(754, 300, 83, 70);
        botonLogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                VentanaLogin ventanaLogin = new VentanaLogin();
                ventanaLogin.setVisible(true);
                dispose();
            }
        });
        botonLogin.setLayout(null);
        botonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLogin.setBackground(SystemColor.window);
        panel.add(botonLogin);

        JLabel labelLogin = new JLabel("");
        labelLogin.setBounds(-50, -100, 200, 300);
        botonLogin.add(labelLogin);
        labelLogin.setHorizontalAlignment(SwingConstants.CENTER);
        labelLogin.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/static/images/login.png")));

        JLabel labelTitulo = new JLabel("INICIAR SESION");
        labelTitulo.setBounds(670, 275, 250, 24);
        labelTitulo.setBackground(SystemColor.window);
        panel.add(labelTitulo);
        labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        labelTitulo.setForeground(SystemColor.textHighlight);
        labelTitulo.setFont(new Font("Roboto Light", Font.PLAIN, 20));

        JLabel labelTituloHeader = new JLabel("Sistema de Transporte PeñaBenitezTrans");
        labelTituloHeader.setBounds(200, 32, 400, 24);
        labelTituloHeader.setBackground(SystemColor.window);
        panel.add(labelTituloHeader);
        labelTituloHeader.setHorizontalAlignment(SwingConstants.CENTER);
        labelTituloHeader.setForeground(SystemColor.textHighlight);
        labelTituloHeader.setFont(new Font("Roboto Light", Font.PLAIN, 20));

    }

    // Metodos para mover la ventana
    private void headerMousePressed(java.awt.event.MouseEvent evt) {
        xMouse = evt.getX();
        yMouse = evt.getY();
    }

    // Metodos para mover la ventana
    protected void headerMouseDragged(java.awt.event.MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }
}
