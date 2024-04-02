package lesson11.Mentort;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SlotMachine slotMachine = new SlotMachine();

        System.out.println("Welcome to the Slot Machine Game!");

        while (true) {
            System.out.println("\nPress 'P' to pull the lever or 'Q' to quit.");
            String input = scanner.nextLine().toUpperCase();

            if (input.equals("P")) {
                slotMachine.pullLever();
            } else if (input.equals("Q")) {
                System.out.println("Thank you for playing! Goodbye!");
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }

    }
}
