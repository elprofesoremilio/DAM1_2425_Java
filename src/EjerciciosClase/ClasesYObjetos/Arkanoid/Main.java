package EjerciciosClase.ClasesYObjetos.Arkanoid;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player();
        System.out.println(Player.activePlayers);
        Player player2 = new Player(150);
        System.out.println(player2.activePlayers);
        System.out.println(player1.activePlayers);

    }
}
