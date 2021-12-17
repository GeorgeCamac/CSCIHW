import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numLifes;
        int numPanels;
        Game newGame =  new Game();
        System.out.println("How many panels of glass:");
        numPanels = keyboard.nextInt();
        System.out.println("How many lives would you like:");
        numLifes = keyboard.nextInt();
        Lives player1 = new Lives(numLifes);
        System.out.println(player1.getLives());
        Game.Ladder(numPanels, player1);
        System.exit(0);
    }
}
    