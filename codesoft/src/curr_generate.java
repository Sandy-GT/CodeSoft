/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Sanidhya Singh
 */
public class curr_generate {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        // Display the menu
        System.out.println("Choose an option:");
        System.out.println("1. Convert USD to EUR");
        System.out.println("2. Convert EUR to USD");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        // Variables for conversion rates
        double usdToEurRate = 0.85;  // 1 USD = 0.85 EUR

        switch (choice) {
            case 1:
                System.out.print("Enter the amount in USD: $");
                double usdAmount = scanner.nextDouble();
                double eurAmount = usdAmount * usdToEurRate;
                System.out.printf("$%.2f is equal to €%.2f%n", usdAmount, eurAmount);
                break;
            case 2:
                System.out.print("Enter the amount in EUR: €");
                double eurAmount2 = scanner.nextDouble();
                double usdAmount2 = eurAmount2 / usdToEurRate;
                System.out.printf("€%.2f is equal to $%.2f%n", eurAmount2, usdAmount2);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }

        scanner.close();
    }

}
