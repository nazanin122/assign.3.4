/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task3.pkg4;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author 2277120
 */
class Coin {
    private Random random = new Random();

    public boolean flip() {
        return random.nextBoolean();
    }
}

public class Task34 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Coin coin = new Coin();
        int headsCount = 0;
        int tailsCount = 0;
        int choice;

        do {
            System.out.println("1. Toss Coin");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                if (coin.flip()) {
                    headsCount++;
                } else {
                    tailsCount++;
                }
                System.out.println("Heads: " + headsCount + ", Tails: " + tailsCount);
            } else if (choice != 2) {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }

        } while (choice != 2);
        

    }
}
