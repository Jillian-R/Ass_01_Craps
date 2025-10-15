import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random rnd = new Random();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Craps!");

        boolean playAgain = true;
        while (playAgain) {
            playCraps();

        System.out.print("Play again? (y/n); ");
        String input = in.nextLine();
        playAgain = input.equalsIgnoreCase("Y");
    }
    System.out.println("Thanks for playing!");
}

public static void playCraps() {
    int roll = rollDice();

    if (roll == 7 || roll == 11) {
        System.out.println("You win!");
    } else if (roll == 2 || roll == 3 || roll == 12) {
        System.out.println("Craps! You lose.");
    } else {
        int point = roll;
        System.out.println("Point is set to " + point);

        while (true) {
            roll = rollDice();
            if (roll == point) {
                System.out.println("You rolled your point! You win!");
                break;
            } else if (roll == 7) {
                System.out.println("You rolled a 7! You lose.");
                break;

            }
        }
    }
}
public static int rollDice()  {
        int die1 = rnd.nextInt(6) + 1;
        int die2 = rnd.nextInt(6) + 1;
        int crapsRoll = die1 + die2;
        System.out.println("You rolled: " + die1 + " + " + die2 + " = " + crapsRoll);
        return crapsRoll;
    }
}
