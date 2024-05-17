package com.penabeniteztrans.View;

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

// Extendemos de Jframe que es una clase de swing para crear ventanas
public class VentanaPrincipal extends JFrame {

    private JPanel contentPane;
    private JLabel labelExit;
    int xMouse, yMouse;

    public VentanaPrincipal() {
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

        Panel panel = new Panel();
        panel.setBackground(SystemColor.window);
        panel.setBounds(0, 0, 910, 537);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel imagenFondo = new JLabel("");
        imagenFondo.setBounds(50, 0, 732, 501);
        imagenFondo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/static/images/menu-img.png")));
        panel.add(imagenFondo);

        JLabel Logo = new JLabel("");
        Logo.setBounds(700, 0, 450, 400);
        Logo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/static/images/aH-1501px.png")));
        panel.add(Logo);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(0, 500, 910, 50);
        panel_1.setBackground(new Color(12, 138, 199));
        panel.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblCopyR = new JLabel("Desarrollado por Santiago Peña & Elkin Benitez  © 2024");
        lblCopyR.setBounds(150, 11, 600, 19);
        lblCopyR.setForeground(new Color(240, 248, 255));
        lblCopyR.setFont(new Font("Roboto", Font.PLAIN, 16));
        panel_1.add(lblCopyR);

        JPanel header = new JPanel();
        header.setBounds(0, 0, 910, 36);
        header.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                headerMouseDragged(e);

            }
        });

        header.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                headerMousePressed(e);
            }
        });
        header.setLayout(null);
        header.setBackground(Color.WHITE);
        panel.add(header);

        JPanel btnexit = new JPanel();
        btnexit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnexit.setBackground(Color.red);
                labelExit.setForeground(Color.white);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnexit.setBackground(Color.white);
                labelExit.setForeground(Color.black);
            }
        });

        btnexit.setLayout(null);
        btnexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnexit.setBackground(Color.WHITE);
        btnexit.setBounds(790, 10, 73, 36);
        header.add(btnexit);

        labelExit = new JLabel(" SALIR ");
        labelExit.setBounds(0, 0, 73, 26);
        btnexit.add(labelExit);
        labelExit.setHorizontalAlignment(SwingConstants.CENTER);
        labelExit.setFont(new Font("Roboto", Font.PLAIN, 18));

        JPanel btnLogin = new JPanel();
        btnLogin.setBounds(754, 300, 83, 70);
        btnLogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                VentanaLogin ventanaLogin = new VentanaLogin();
                ventanaLogin.setVisible(true);
                dispose();
            }
        });
        btnLogin.setLayout(null);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setBackground(SystemColor.window);
        panel.add(btnLogin);

        JLabel lblLogin = new JLabel("");
        lblLogin.setBounds(-50, -100, 200, 300);
        btnLogin.add(lblLogin);
        lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
        lblLogin.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/static/images/login.png")));

        JLabel lblTitulo = new JLabel("INICIAR SESION");
        lblTitulo.setBounds(670, 275, 250, 24);
        lblTitulo.setBackground(SystemColor.window);
        panel.add(lblTitulo);
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setForeground(SystemColor.textHighlight);
        lblTitulo.setFont(new Font("Roboto Light", Font.PLAIN, 20));

        JLabel lblTituloHeader = new JLabel("Sistema de Transporte PeñaBenitezTrans");
        lblTituloHeader.setBounds(200, 32, 400, 24);
        lblTituloHeader.setBackground(SystemColor.window);
        panel.add(lblTituloHeader);
        lblTituloHeader.setHorizontalAlignment(SwingConstants.CENTER);
        lblTituloHeader.setForeground(SystemColor.textHighlight);
        lblTituloHeader.setFont(new Font("Roboto Light", Font.PLAIN, 20));

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
