package EjerciciosClase.PintarYAnimar;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.fillRect(50,50,200,100);
        g.setColor(Color.green);
        g.fillOval(150,300, 50,100);
    }
}
