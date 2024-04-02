package lesson11.Mentort;
import java.util.Random;


public class SlotMachine {
    private static final String[] SYMBOLS = {"🍒", "🍋", "🍊", "🔔", "🍉", "🍇"};
    private Random random;

    public SlotMachine() {
        random = new Random();
    }

    public void pullLever() {
        // Randomly select three symbols
        String[] result = { SYMBOLS[random.nextInt(SYMBOLS.length)],
                SYMBOLS[random.nextInt(SYMBOLS.length)],
                SYMBOLS[random.nextInt(SYMBOLS.length)] };

        // Print the outcome of the lever pull
        System.out.println("Result: " + String.join(" | ", result));

        // Check if all three symbols match
        if (result[0].equals(result[1]) && result[1].equals(result[2])) {
            System.out.println("Congratulations! You win!");
        } else {
            System.out.println("Sorry, you lose.");
        }
    }
}
