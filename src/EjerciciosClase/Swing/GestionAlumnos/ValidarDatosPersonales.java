package EjerciciosClase.Swing.GestionAlumnos;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ValidarDatosPersonales implements DocumentListener {
    public static final Border BORDER_ERROR = javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0));
    public static final int VALIDAR_CORREO = 0; 
    public static final int VALIDAR_NOMBRE = 1; 
    public static final int VALIDAR_EDAD = 2; 
    private Border borderDefault;


    JTextField campo;
    int tipoValidacion;

    public ValidarDatosPersonales(JTextField campo, int tipoValidacion) {
        this.campo = campo;
        borderDefault = campo.getBorder();
        this.tipoValidacion = tipoValidacion;
    }

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

    private void validar() {
        String regex = "";
        switch (tipoValidacion) {
            case VALIDAR_CORREO:
                regex = "([a-z][a-z0-9_.]*)@([a-z][a-z0-9_.]*)[.]([a-z]){2,5}";
                break;
            case VALIDAR_EDAD:
                regex = "[1-9][0-9]?";
                break;
            case VALIDAR_NOMBRE:
                regex = "([a-zA-Z]+\\s?)+";
                break;
        }
        if (!campo.getText().trim().matches(regex)) {
            campo.setBorder(BORDER_ERROR);
        } else {
            campo.setBorder(borderDefault);
        }
    }
}
