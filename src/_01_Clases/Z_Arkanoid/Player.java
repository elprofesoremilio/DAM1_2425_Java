package _01_Clases.Z_Arkanoid;

import java.awt.*;

public class Player {
    int x, y;
    int height, width;
    int speedX;
    Color color;

    static int activePlayers=0;

    public Player() {
        activePlayers++;
        height = 10;
        width = 100;
        x = (Config.SCREEN_WIDTH/2) - (width/2);
        y = Config.SCREEN_HEIGHT - height - 150;
        speedX = 5;
        color = new Color();
        color.b = color.r = color.g = 0;
    }

    public Player(int newWidth) {
        activePlayers++;
        height = 10;
        width = newWidth;
        x = (Config.SCREEN_WIDTH/2) - (width/2);
        y = Config.SCREEN_HEIGHT - height - 150;
        speedX = 5;
    }

    public void move(int nueva_x) {
        x += nueva_x;
    }


}
