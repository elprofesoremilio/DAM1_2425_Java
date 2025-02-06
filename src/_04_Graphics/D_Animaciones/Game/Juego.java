package _04_Graphics.D_Animaciones.Game;

import javax.swing.*;

public class Juego {
    JFrame ventana;
    Lienzo lienzo;

    public Juego(String title) {
        ventana = new JFrame(title);
        ventana.setSize(400,250);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        lienzo = new Lienzo();
        ventana.setContentPane(lienzo);

        ventana.setVisible(true);
    }

    public void iniciar() {
        while (true) {
            lienzo.actualizar();
            lienzo.dibujar();
            lienzo.sincronizar();
        }
    }

    public void add(Dibujable objeto) {
        lienzo.dibujables.add(objeto);
    }
}
