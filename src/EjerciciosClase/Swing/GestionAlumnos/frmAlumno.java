package EjerciciosClase.Swing.GestionAlumnos;

import javafx.scene.shape.Box;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class frmAlumno extends JFrame {
    private JLabel lbEstado;
    private JButton btnNuevo, btnBorrar, btnGuardar, btnCargar, btnSiguiente, btnAnterior, btnValidar;
    private JTextField txtNombre, txtCorreo, txtEdad;
    private int alumnoActual;

    List<Alumno> alumnos;

    public frmAlumno() {
        super("Gestión de Alumnos");
        initComponents();
        alumnos = new ArrayList<>();
        alumnoActual = -1;
    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());

        JPanel pEstado = new JPanel();
        pEstado.setLayout(new GridLayout());
        lbEstado = new JLabel("Alumno 0 de 0");
        pEstado.add(lbEstado);
        lbEstado.setHorizontalAlignment(JLabel.CENTER);
        getContentPane().add(pEstado,BorderLayout.SOUTH);

        JPanel pIconos = new JPanel();
//        pIconos.setLayout(new BoxLayout(pIconos,BoxLayout.X_AXIS));
        pIconos.setLayout(new GridLayout());
        getContentPane().add(pIconos,BorderLayout.NORTH);

        btnNuevo = new JButton("Nuevo");
        pIconos.add(btnNuevo);
        btnBorrar = new JButton("Borrar");
        pIconos.add(btnBorrar);
        btnGuardar = new JButton("Guardar");
        pIconos.add(btnGuardar);
        btnCargar = new JButton("Cargar");
        pIconos.add(btnCargar);

        JPanel pCentral = new JPanel();
        getContentPane().add(pCentral, BorderLayout.CENTER);
        pCentral.setLayout(new BorderLayout());

        JPanel pAlumno = new JPanel();
        pAlumno.setLayout(new BorderLayout());
        pCentral.add(pAlumno, BorderLayout.CENTER);

        JPanel pNavegacion = new JPanel();
        pAlumno.add(pNavegacion, BorderLayout.SOUTH);
        pNavegacion.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0;
        btnAnterior = new JButton("<");
        pNavegacion.add(btnAnterior, gbc);

        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        btnValidar = new JButton("Validar");
        pNavegacion.add(btnValidar,gbc);

        gbc.gridx = 2;
        gbc.weightx = 0;
        btnSiguiente = new JButton(">");

        // TODO hacer grande
        pNavegacion.add(btnSiguiente, gbc);

        JPanel pDatos = new JPanel();
        pAlumno.add(pDatos,BorderLayout.CENTER);
        pDatos.setLayout(new GridBagLayout());
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0;
        JLabel label = new JLabel("Nombre: ");
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        pDatos.add(label,gbc);

        txtNombre = new JTextField(10);
        gbc.gridx = 1;
        gbc.weightx = 1;
        pDatos.add(txtNombre,gbc);

        label = new JLabel("Correo: ");
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0;
        pDatos.add(label,gbc);

        txtCorreo = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1;
        pDatos.add(txtCorreo,gbc);

        label = new JLabel("Edad: ");
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 0;
        pDatos.add(label,gbc);

        txtEdad = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 1;
        pDatos.add(txtEdad,gbc);





        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new frmAlumno();
    }
}
