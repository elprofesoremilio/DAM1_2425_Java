package EjerciciosClase.Swing.GestionAlumnos;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class FrmValidarDatosDocumentListener extends JPanel {
    private JTextField txtNombre, txtCorreo, txtEdad;
    private Border borderDefault;

    private List<Alumno> alumnos;

    public FrmValidarDatosDocumentListener() {
        alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Fran", "fran@yosoy.com", (byte)23));
        alumnos.add(new Alumno("Belén", "belén@yosoy.com", (byte)20));
        alumnos.add(new Alumno("Roberto", "roberto@yosoy.com", (byte)32));
        initComponents();
    }

    private void initComponents() {
        this.setLayout(new GridBagLayout());
        JLabel label = new JLabel("Nombre: ");
        txtNombre = new JTextField(10);
        txtCorreo = new JTextField(10);
        txtEdad = new JTextField(10);

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

        borderDefault = txtCorreo.getBorder();

        txtNombre.getDocument().addDocumentListener(
            new ValidarDatosPersonales(txtNombre,ValidarDatosPersonales.VALIDAR_NOMBRE)
        );
        txtCorreo.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validar();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validar();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validar();
            }
        });

        txtEdad.getDocument().addDocumentListener(
                new ValidarDatosPersonales(txtEdad,ValidarDatosPersonales.VALIDAR_EDAD)
        );

    }

    private void validar() {
        if (!txtCorreo.getText().trim().matches("([a-z][a-z0-9_.]*)@([a-z][a-z0-9_.]*)[.]([a-z]){2,5}")) {
            txtCorreo.setBorder(ValidarDatosPersonales.BORDER_ERROR);
        } else {
            txtCorreo.setBorder(borderDefault);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Gestión de alumnos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setContentPane(new FrmValidarDatosDocumentListener());
        frame.pack();
        frame.setVisible(true);
    }
}
