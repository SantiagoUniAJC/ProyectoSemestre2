package com.penabeniteztrans.View;

// paquetes necesarios para la aplicacion.
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

    // Atributos de la clase VentanaLogin
    private JPanel contentPane;
    private JTextField textoUsuario;
    private JPasswordField textoContrasena;
    int xMouse, yMouse;
    private JLabel labelExit;

    // Constructor de la clase VentanaLogin
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

        // Panel principal
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 788, 527);
        panel.setBackground(Color.WHITE);
        contentPane.add(panel);
        panel.setLayout(null);

        // Panel de la derecha
        JPanel panelDerecha = new JPanel();
        panelDerecha.setBackground(new Color(12, 138, 199));
        panelDerecha.setBounds(484, 0, 304, 527);
        panel.add(panelDerecha);
        panelDerecha.setLayout(null);

        // Imagen de la aplicacion
        JLabel imgApp = new JLabel("");
        imgApp.setBounds(0, -350, 304, 1238);
        panelDerecha.add(imgApp);
        imgApp.setIcon(new ImageIcon(VentanaLogin.class.getResource("/static/images/imgApp.png")));

        JPanel botonexit = new JPanel();
        botonexit.setBounds(200, 10, 73, 36);
        panelDerecha.add(botonexit);
        // Eventos del boton de exit
        botonexit.addMouseListener(new MouseListener() {

            // Cerrar la aplicacion
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }

            // Cambio de color al pasar el mouse
            @Override
            public void mouseEntered(MouseEvent e) {
                botonexit.setBackground(Color.red);
                labelExit.setForeground(Color.white);
            }

            // Cambio de color al salir del boton
            @Override
            public void mouseExited(MouseEvent e) {
                botonexit.setBackground(new Color(12, 138, 199));
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
        // Configuracion del boton de exit
        botonexit.setBackground(new Color(12, 138, 199));
        botonexit.setLayout(null);
        botonexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        labelExit = new JLabel(" SALIR");
        labelExit.setBounds(0, 0, 60, 30);
        botonexit.add(labelExit);
        labelExit.setForeground(SystemColor.text);
        labelExit.setFont(new Font("Roboto", Font.PLAIN, 18));
        labelExit.setHorizontalAlignment(SwingConstants.CENTER);

        // Panel de la izquierda
        textoUsuario = new JTextField();
        textoUsuario.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (textoUsuario.getText().equals("Ingrese su número de cedula")) {
                    textoUsuario.setText("");
                    textoUsuario.setForeground(Color.black);
                }
                if (String.valueOf(textoContrasena.getPassword()).isEmpty()) {
                    textoContrasena.setText("********");
                    textoContrasena.setForeground(Color.gray);
                }
            }
        });

        // Configuracion del panel de la izquierda
        textoUsuario.setFont(new Font("Roboto", Font.PLAIN, 16));
        textoUsuario.setText("Ingrese su número de cedula");
        textoUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        textoUsuario.setForeground(SystemColor.activeCaptionBorder);
        textoUsuario.setBounds(65, 256, 324, 32);
        panel.add(textoUsuario);
        textoUsuario.setColumns(10);

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

        textoContrasena = new JPasswordField();
        textoContrasena.setText("********");
        textoContrasena.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (String.valueOf(textoContrasena.getPassword()).equals("********")) {
                    textoContrasena.setText("");
                    textoContrasena.setForeground(Color.black);
                }
                if (textoUsuario.getText().isEmpty()) {
                    textoUsuario.setText("Ingrese su nombre de usuario");
                    textoUsuario.setForeground(Color.gray);
                }
            }
        });
        textoContrasena.setForeground(SystemColor.activeCaptionBorder);
        textoContrasena.setFont(new Font("Roboto", Font.PLAIN, 16));
        textoContrasena.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        textoContrasena.setBounds(65, 353, 324, 32);
        panel.add(textoContrasena);

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
        JPanel botonLogin = new JPanel();
        botonLogin.addMouseListener(new MouseListener() {
            // Eventos del boton de login
            @Override
            public void mouseEntered(MouseEvent e) {
                botonLogin.setBackground(new Color(0, 156, 223));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                botonLogin.setBackground(SystemColor.textHighlight);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // Logica para hacer el Login
                String cedula = textoUsuario.getText();
                String contrasena = new String(textoContrasena.getPassword());

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
                return cedula.equals("root") && contrasena.equals("root");
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

        // Configuracion del boton de login
        botonLogin.setBackground(SystemColor.textHighlight);
        botonLogin.setBounds(65, 431, 122, 44);
        panel.add(botonLogin);
        botonLogin.setLayout(null);
        botonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        JLabel labelNewLabel = new JLabel("INGRESAR");
        labelNewLabel.setBounds(0, 0, 122, 44);
        botonLogin.add(labelNewLabel);
        labelNewLabel.setForeground(SystemColor.controlLtHighlight);
        labelNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        labelNewLabel.setFont(new Font("Roboto", Font.PLAIN, 18));

        JPanel botonRegistro = new JPanel();
        botonRegistro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                botonRegistro.setBackground(new Color(0, 156, 223));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                botonRegistro.setBackground(SystemColor.textHighlight);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // Crear una ventana que informe que esta en desarrollo
                JOptionPane.showMessageDialog(rootPane, "Esta funcionalidad está en desarrollo", "En desarrollo",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        botonRegistro.setBackground(SystemColor.textHighlight);
        botonRegistro.setBounds(195, 431, 122, 44);
        panel.add(botonRegistro);
        botonRegistro.setLayout(null);
        botonRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        JLabel labelRegistro = new JLabel("REGISTRO");
        labelRegistro.setBounds(0, 0, 122, 44);
        botonRegistro.add(labelRegistro);
        labelRegistro.setForeground(SystemColor.controlLtHighlight);
        labelRegistro.setHorizontalAlignment(SwingConstants.CENTER);
        labelRegistro.setFont(new Font("Roboto", Font.PLAIN, 18));

        JLabel labelNewLabel_1 = new JLabel("");
        labelNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        labelNewLabel_1.setIcon(new ImageIcon(VentanaLogin.class.getResource("/static/images/aH-40px.png")));
        labelNewLabel_1.setBounds(45, 0, 400, 159);
        panel.add(labelNewLabel_1);

        JPanel header = new JPanel();
        // Eventos del header
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

    // Metodo para mover la ventana
    private void headerMousePressed(java.awt.event.MouseEvent evt) {
        xMouse = evt.getX();
        yMouse = evt.getY();
    }

    // Metodo para mover la ventana
    private void headerMouseDragged(java.awt.event.MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }
}
