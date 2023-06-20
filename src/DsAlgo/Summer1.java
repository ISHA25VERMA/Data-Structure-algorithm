package DsAlgo;

import java.util.Scanner;

public class Summer1 {
    public static void main(String[] args) {
        String[] products = {"Coke", "Sprite", "Water"};
        double[] prices = {1.50, 1.25, 1.00};

// Ask the user to select a product
        System.out.println("Please select a product:");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i+1) + ". " + products[i] + " - $" + prices[i]);
        }
        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();

// Ask the user to enter the amount of money they are inserting
        System.out.println("Please enter the amount of money you are inserting:");
        double amount = scanner.nextDouble();

// Check if the entered amount is sufficient to purchase the selected product
        if (amount < prices[selection-1]) {
            System.out.println("Insufficient funds. Please insert more money.");
        } else {
            // Calculate the change and return it to the user
            double change = amount - prices[selection-1];
            System.out.println("Thank you for your purchase! Your change is $" + change);
        }

    }
}
