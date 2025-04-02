package EjerciciosClase.Swing.GestionAlumnos;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestionAlumnos extends JPanel {
    private JTextField txtNombre, txtCorreo, txtEdad;
    private JButton btnGuardar, btnNext, btnPrevious;
    private int alumnoActual;

    private List<Alumno> alumnos;

    public GestionAlumnos() {
        alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Fran", "fran@yosoy.com", (byte)23));
        alumnos.add(new Alumno("Belén", "belén@yosoy.com", (byte)20));
        alumnos.add(new Alumno("Roberto", "roberto@yosoy.com", (byte)32));
        alumnoActual = 0;
        initComponents();
        actualizar();
    }

    private void actualizar() {
        btnPrevious.setEnabled(alumnoActual!=0);
        btnNext.setEnabled(alumnoActual!=alumnos.size()-1);
        txtNombre.setText(alumnos.get(alumnoActual).getNombre());
        txtCorreo.setText(alumnos.get(alumnoActual).getCorreo());
        txtEdad.setText(String.valueOf(alumnos.get(alumnoActual).getEdad()));
    }

    private void initComponents() {
        this.setLayout(new GridBagLayout());
        JLabel label = new JLabel("Nombre: ");
        btnNext = new JButton("  >  ");
        btnPrevious = new JButton("<");
        txtNombre = new JTextField(10);
        txtCorreo = new JTextField(10);
        txtEdad = new JTextField(10);
        btnGuardar = new JButton("Guardar");

        btnGuardar.addActionListener(e -> guardar());
        txtNombre.addActionListener(e -> guardar());
        txtCorreo.addActionListener(e -> guardar());
        txtEdad.addActionListener(e -> guardar());
        btnNext.addActionListener(e -> siguiente());
        btnPrevious.addActionListener(e -> anterior());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridy = gbc.gridx = 0;
        gbc.gridwidth = gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        label.setHorizontalAlignment(JLabel.RIGHT);
        this.add(label,gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.weightx = 1;
        this.add(txtNombre, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 0;
        label = new JLabel("Correo: ");
        label.setHorizontalAlignment(JLabel.RIGHT);
        this.add(label, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        gbc.gridwidth = 2;
        this.add(txtCorreo, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 0;
        gbc.gridwidth = 1;
        label = new JLabel("Edad: ");
        label.setHorizontalAlignment(JLabel.RIGHT);
        this.add(label, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        gbc.gridwidth = 2;
        this.add(txtEdad, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.weightx = 1;
        this.add(btnGuardar, gbc);

        gbc.gridx = 0;
        gbc.weightx = 0;
        this.add(btnPrevious,gbc);

        gbc.gridx = 2;
        this.add(btnNext,gbc);
    }

    private void siguiente() {
        alumnoActual++;
        actualizar();
    }

    private void anterior() {
        alumnoActual--;
        actualizar();
    }


    private void guardar() {
        String mensaje = String.format("<html><body>%s<br>%s<br>%s<br></body></html>",
                "Nombre correcto: <font color='red'>"+ txtNombre.getText().trim().matches("([a-zA-Z]+\\s?)+")+"</font>",
                "Correo correcto: "+ txtCorreo.getText().trim().matches("([a-z][a-z0-9_.]*)@([a-z][a-z0-9_.]*)[.]([a-z]){2,5}"),
                "Edad correcta: "+txtEdad.getText().matches("[1-9][0-9]?")
                );
        JOptionPane.showMessageDialog(this,mensaje,"Validación", JOptionPane.WARNING_MESSAGE);
        txtNombre.setText("Texto cambiado");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Gestión de alumnos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setContentPane(new GestionAlumnos());
        frame.pack();
        frame.setVisible(true);
    }
}
