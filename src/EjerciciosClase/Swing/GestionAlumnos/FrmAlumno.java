package EjerciciosClase.Swing.GestionAlumnos;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FrmAlumno extends JFrame {
    private static final Border BORDER_ERROR = javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0));
    private JLabel lbEstado;
    private JButton btnNuevo, btnBorrar, btnGuardar, btnCargar, btnSiguiente, btnAnterior, btnValidar;
    private JTextField txtNombre, txtCorreo, txtEdad;
    private int alumnoActual;
    private Border borderDefault;

    List<Alumno> alumnos;

    public FrmAlumno() {
        super("Gestión de Alumnos");
        alumnos = new ArrayList<>();
        alumnoActual = -1;
        initComponents();
        actualizar();
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

        File f = new File("."+File.separator+"src");
        String path = f.getAbsolutePath()+File.separator;
        btnNuevo = new JButton(new ImageIcon(path+"nuevo.png"));
        btnNuevo.addActionListener(e->nuevo());
        pIconos.add(btnNuevo);
        btnBorrar = new JButton(new ImageIcon(path+"borrar.png"));
        btnBorrar.addActionListener(e->borrar());
        pIconos.add(btnBorrar);
        btnGuardar = new JButton(new ImageIcon(path+"guardar.png"));
        pIconos.add(btnGuardar);
        btnGuardar.addActionListener(e->guardar());
        btnCargar = new JButton(new ImageIcon(path+"cargar.png"));
        btnCargar.addActionListener(e->cargar());
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
        btnAnterior.addActionListener(e->anterior());
        pNavegacion.add(btnAnterior, gbc);

        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        btnValidar = new JButton("Validar");
        pNavegacion.add(btnValidar,gbc);
        btnValidar.addActionListener(e->editar());

        gbc.gridx = 2;
        gbc.weightx = 0;
        btnSiguiente = new JButton(">");
        btnSiguiente.addActionListener(e->siguiente());

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
        
        borderDefault = txtNombre.getBorder();

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void guardar() {
        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get("alumnos.csv"))) {
            for (Alumno alumno : alumnos) {
                bw.write(alumno.toCSV());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo...");
        }
    }

    private void cargar() {
        try (BufferedReader br = Files.newBufferedReader(Paths.get("alumnos.csv"))) {
            String linea;
            alumnos.clear();
            alumnoActual=-1;
            while ((linea = br.readLine())!=null) {
                alumnos.add(Alumno.fromCSV(linea));
                alumnoActual++;
            }
            actualizar();
        } catch (IOException e) {
            System.err.println("Error al cargar datos.");
        }
    }

    private void borrar() {
        if (alumnoActual!=-1) {
            if (alumnos.size()==1) {
                alumnoActual=-1;
                alumnos.clear();
            } else {
                alumnos.remove(alumnoActual);
                if (alumnoActual!=0) {
                    alumnoActual--;
                }
                actualizar();
            }
        }
        actualizar();
    }

    private boolean validar() {
        boolean correcto = true;
        if (!txtNombre.getText().trim().matches("([a-zA-Z]+\\s?)+")) {
            txtNombre.setBorder(BORDER_ERROR);
            correcto = false;
        } else {
            txtNombre.setBorder(borderDefault);
        }
        if (!txtCorreo.getText().trim().matches("([a-z][a-z0-9_.]*)@([a-z][a-z0-9_.]*)[.]([a-z]){2,5}")) {
            txtCorreo.setBorder(BORDER_ERROR);
            correcto = false;
        } else {
            txtCorreo.setBorder(borderDefault);
        }
        if (!txtEdad.getText().matches("[1-9][0-9]?")) {
            txtEdad.setBorder(BORDER_ERROR);
            correcto = false;
        } else {
            txtEdad.setBorder(borderDefault);
        }
        return correcto;
    }

    private void editar() {
        if (validar()) {
            Alumno alumno = alumnos.get(alumnoActual);
            alumno.setCorreo(txtCorreo.getText());
            alumno.setEdad(Byte.parseByte(txtEdad.getText()));
            alumno.setNombre(txtNombre.getText());
        }
    }

    private void siguiente() {
        alumnoActual++;
        actualizar();
    }

    private void anterior() {
        alumnoActual--;
        actualizar();
    }

    private void nuevo() {
        alumnos.add(new Alumno("Nombre", "cambiacorreo@ya.now", (byte) 1));
        alumnoActual=alumnos.size()-1;
        actualizar();
    }

    private void actualizar() {
        btnAnterior.setEnabled(alumnoActual!=0 && alumnoActual!=-1);
        btnSiguiente.setEnabled(alumnoActual<alumnos.size()-1 && alumnoActual!=-1);
        btnValidar.setEnabled(alumnoActual!=-1);
        if (alumnoActual==-1) {
            txtCorreo.setText("");
            txtEdad.setText("");
            txtNombre.setText("");
        } else {
            txtNombre.setText(alumnos.get(alumnoActual).getNombre());
            txtCorreo.setText(alumnos.get(alumnoActual).getCorreo());
            txtEdad.setText(String.valueOf(alumnos.get(alumnoActual).getEdad()));
        }
        lbEstado.setText("Alumno " + (alumnoActual + 1) + " de " + alumnos.size());
    }

    public static void main(String[] args) {
        new FrmAlumno();
    }
}
