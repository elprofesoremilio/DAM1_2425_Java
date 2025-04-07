package EjerciciosClase.Swing.GestionAlumnos;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.util.function.Function;

public class ValidarDatosPersonalesLambda implements DocumentListener {
    public static final Border BORDER_ERROR = BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0));
    public static final int VALIDAR_CORREO = 0;
    public static final int VALIDAR_NOMBRE = 1;
    public static final int VALIDAR_EDAD = 2;
    private Border borderDefault;


    JTextField campo;
    int tipoValidacion;

    public ValidarDatosPersonalesLambda(JTextField campo, int tipoValidacion) {
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
        Function<String, Boolean> validar;
        switch (tipoValidacion) {
            case VALIDAR_CORREO:
                validar = ValidarString::validarCorreo;
                break;
            case VALIDAR_EDAD:
                validar = ValidarString::validarEdad;
                break;
            default:  // VALIDAR_NOMBRE
                validar = ValidarString::validarNombre;
                break;
        }
        if (!validar.apply(campo.getText())) {
            campo.setBorder(BORDER_ERROR);
        } else {
            campo.setBorder(borderDefault);
        }
    }
}
