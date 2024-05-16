package com.penabeniteztrans.View;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class VentanaLogin extends JFrame {

    private JPanel contentPane;
    private JTextField txtUsuario;
    private JPasswordField txtContrasena;
    int xMouse, yMouse;
    private JLabel labelExit;

    public VentanaLogin() {
        setResizable(false);
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 788, 527);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 788, 527);
        panel.setBackground(Color.WHITE);
        contentPane.add(panel);
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(12, 138, 199));
        panel_1.setBounds(484, 0, 304, 527);
        panel.add(panel_1);
        panel_1.setLayout(null);

        JLabel imgApp = new JLabel("");
        imgApp.setBounds(0, -350, 304, 1238);
        panel_1.add(imgApp);
        imgApp.setIcon(new ImageIcon(VentanaLogin.class.getResource("/static/images/imgApp.png")));

        JPanel btnexit = new JPanel();
        btnexit.setBounds(200, 10, 73, 36);
        panel_1.add(btnexit);
        btnexit.addMouseListener(new MouseListener() {
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
                btnexit.setBackground(new Color(12, 138, 199));
                labelExit.setForeground(Color.white);
            }

            @Override
            public void mouseReleased(MouseEvent e) {

                throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
            }

            @Override
            public void mousePressed(MouseEvent e) {

                throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
            }
        });
        btnexit.setBackground(new Color(12, 138, 199));
        btnexit.setLayout(null);
        btnexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        labelExit = new JLabel(" SALIR");
        labelExit.setBounds(0, 0, 60, 30);
        btnexit.add(labelExit);
        labelExit.setForeground(SystemColor.text);
        labelExit.setFont(new Font("Roboto", Font.PLAIN, 18));
        labelExit.setHorizontalAlignment(SwingConstants.CENTER);

        txtUsuario = new JTextField();
        txtUsuario.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (txtUsuario.getText().equals("Ingrese su número de cedula")) {
                    txtUsuario.setText("");
                    txtUsuario.setForeground(Color.black);
                }
                if (String.valueOf(txtContrasena.getPassword()).isEmpty()) {
                    txtContrasena.setText("********");
                    txtContrasena.setForeground(Color.gray);
                }
            }
        });

        txtUsuario.setFont(new Font("Roboto", Font.PLAIN, 16));
        txtUsuario.setText("Ingrese su número de cedula");
        txtUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        txtUsuario.setForeground(SystemColor.activeCaptionBorder);
        txtUsuario.setBounds(65, 256, 324, 32);
        panel.add(txtUsuario);
        txtUsuario.setColumns(10);

        JSeparator separator = new JSeparator();
        separator.setBackground(new Color(0, 120, 215));
        separator.setBounds(65, 292, 324, 2);
        panel.add(separator);

        JLabel labelTitulo = new JLabel("INICIAR SESIÓN");
        labelTitulo.setForeground(SystemColor.textHighlight);
        labelTitulo.setFont(new Font("Roboto Black", Font.PLAIN, 26));
        labelTitulo.setBounds(125, 169, 202, 26);
        panel.add(labelTitulo);

        JSeparator separator_1 = new JSeparator();
        separator_1.setBackground(SystemColor.textHighlight);
        separator_1.setBounds(65, 393, 324, 2);
        panel.add(separator_1);

        txtContrasena = new JPasswordField();
        txtContrasena.setText("********");
        txtContrasena.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (String.valueOf(txtContrasena.getPassword()).equals("********")) {
                    txtContrasena.setText("");
                    txtContrasena.setForeground(Color.black);
                }
                if (txtUsuario.getText().isEmpty()) {
                    txtUsuario.setText("Ingrese su nombre de usuario");
                    txtUsuario.setForeground(Color.gray);
                }
            }
        });
        txtContrasena.setForeground(SystemColor.activeCaptionBorder);
        txtContrasena.setFont(new Font("Roboto", Font.PLAIN, 16));
        txtContrasena.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        txtContrasena.setBounds(65, 353, 324, 32);
        panel.add(txtContrasena);

        JLabel LabelUsuario = new JLabel("USUARIO");
        LabelUsuario.setForeground(SystemColor.textInactiveText);
        LabelUsuario.setFont(new Font("Roboto Black", Font.PLAIN, 20));
        LabelUsuario.setBounds(65, 219, 107, 26);
        panel.add(LabelUsuario);

        JLabel lblContrasena = new JLabel("CONTRASEÑA");
        lblContrasena.setForeground(SystemColor.textInactiveText);
        lblContrasena.setFont(new Font("Roboto Black", Font.PLAIN, 20));
        lblContrasena.setBounds(65, 316, 140, 26);
        panel.add(lblContrasena);

        // Boton de Login
        JPanel btnLogin = new JPanel();
        btnLogin.addMouseListener(new MouseListener() {

            @Override
            public void mouseEntered(MouseEvent e) {
                btnLogin.setBackground(new Color(0, 156, 223));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnLogin.setBackground(SystemColor.textHighlight);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // Logica para hacer el Login
                String cedula = txtUsuario.getText();
                String contrasena = new String(txtContrasena.getPassword());

                if (cedula.isEmpty() || contrasena.isEmpty()) {
                    // Mostrar mensaje de error
                    JOptionPane.showMessageDialog(rootPane, "Por favor, llene todos los campos", "Error",
                            0);
                } else {
                    if (validarCredenciales(cedula, contrasena)) {
                        VentanaMenu ventanaMenu = new VentanaMenu();
                        setVisible(false);
                        ventanaMenu.setVisible(true);
                    } else {
                        // Mostrar un mensaje de error si las credenciales son incorrectas
                        JOptionPane.showMessageDialog(rootPane, "Cédula o contraseña incorrecta", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }

            private boolean validarCredenciales(String cedula, String contrasena) {
                // Logica para validar las credenciales
                return cedula.equals("75094924") && contrasena.equals("root");
            }

            @Override
            public void mouseReleased(MouseEvent e) {

                throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
            }

            @Override
            public void mousePressed(MouseEvent e) {

                throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
            }
        });

        // Boton de Registro
        btnLogin.setBackground(SystemColor.textHighlight);
        btnLogin.setBounds(65, 431, 122, 44);
        panel.add(btnLogin);
        btnLogin.setLayout(null);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        JLabel lblNewLabel = new JLabel("ENTRAR");
        lblNewLabel.setBounds(0, 0, 122, 44);
        btnLogin.add(lblNewLabel);
        lblNewLabel.setForeground(SystemColor.controlLtHighlight);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 18));

        JPanel btnRegistro = new JPanel();
        btnRegistro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnRegistro.setBackground(new Color(0, 156, 223));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnRegistro.setBackground(SystemColor.textHighlight);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // Crear una ventana que informe que esta en desarrollo
                JOptionPane.showMessageDialog(rootPane, "Esta funcionalidad está en desarrollo", "En desarrollo",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        btnRegistro.setBackground(SystemColor.textHighlight);
        btnRegistro.setBounds(195, 431, 122, 44);
        panel.add(btnRegistro);
        btnRegistro.setLayout(null);
        btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        JLabel lblRegistro = new JLabel("REGISTRO");
        lblRegistro.setBounds(0, 0, 122, 44);
        btnRegistro.add(lblRegistro);
        lblRegistro.setForeground(SystemColor.controlLtHighlight);
        lblRegistro.setHorizontalAlignment(SwingConstants.CENTER);
        lblRegistro.setFont(new Font("Roboto", Font.PLAIN, 18));

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setIcon(new ImageIcon(VentanaLogin.class.getResource("/static/images/aH-40px.png")));
        lblNewLabel_1.setBounds(45, 0, 400, 159);
        panel.add(lblNewLabel_1);

        JPanel header = new JPanel();
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
        header.setBackground(SystemColor.window);
        header.setBounds(0, 0, 784, 36);
        panel.add(header);
        header.setLayout(null);
    }

    private void headerMousePressed(java.awt.event.MouseEvent evt) {
        xMouse = evt.getX();
        yMouse = evt.getY();
    }

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }
}
