package Homework;

import java.util.Scanner;

/**
 *Description: This program ask the user for his restaurant order and calculates the total bill including tax and gratuity
 *@author Aman Nindra
 *@version 1.0
 *@since 07/21/2024
 */


public class Homework5_15650 {
    public static void main(String[] args) {
        final double PRICE_A = 28.99;
        final double PRICE_B = 21.99;
        final double PRICE_C = 17.99;
        final double PRICE_D = 8.99;
        final double PRICE_E = 7.99;
        final double PRICE_F = 6.99;
        final double PRICE_G = 1.29;
        final double PRICE_H = 1.50;
        final double PRICE_I = 2.50;
        final double TAX_RATE = 0.095;
        System.out.println("Welcome to the Java restaurant.");
        System.out.println("Please choose 1 of the following items :");
        
        System.out.printf("%-28s$%.2f\n", "A- Grilled salmon, price",PRICE_A);
        System.out.printf("%-28s$%.2f\n","B- New York Steak, price",PRICE_B);
        System.out.printf("%-28s$%.2f\n","C- Roast Chicken, price",PRICE_C);
        System.out.printf("%-28s$%.2f\n","D- Salad, price",PRICE_D);
        System.out.printf("%-28s$%.2f\n","E- Soup, price",PRICE_E);
        System.out.printf("%-28s$%.2f\n","F- Hamburger, price",PRICE_F);
        System.out.printf("%-28s$%.2f\n","G- Soft drink, price",PRICE_E);
        System.out.printf("%-28s$%.2f\n","H- Tea, price",PRICE_H);
        System.out.printf("%-28s$%.2f\n","I- Grilled salmon, price",PRICE_I);

        System.out.print("\n");
        Scanner userinput = new Scanner(System.in);
        System.out.print("Select a letter from the above menu: ");

        String letter = userinput.nextLine();
        double price = 0;
        int maxQuantity = 100;
        String name = "";
        switch (letter){
            case "A":
                price = PRICE_A;
                maxQuantity = 40;
                name = "Grilled salmon";
                break;
            case "B":
                price = PRICE_B;
                maxQuantity = 40;
                name = "New York Steak";
                break;
            case "C":
                price = PRICE_C;
                maxQuantity = 40;
                name = "Roast Chicken";
                break;
            case "D":
                price = PRICE_D;
                name = "Salad";
                break;
            case "E":
                price = PRICE_E;
                name = "Soup";
                break;
            case "F":
                price = PRICE_F;
                name = "Hamburger";
                break;
            case "G":
                price = PRICE_G;
                name = "Soft drink";
                break;
            case "H":
                price = PRICE_H;
                name = "Tea";
                break;
            case "I":
                price = PRICE_I;
                name = "Orange juice";
                break;
            default:
                System.out.println("Invalid menu item");
                System.exit(0);
        }


        System.out.print("Enter the quantity: ");
        int quantity = userinput.nextInt();

        double sum = quantity * price;

        

        if (quantity > maxQuantity){
            System.out.print("Invalid item quantity. It must not exceed " 
            + maxQuantity + ".");
            System.exit(0);
        }
        if (quantity < 0){
            System.out.print("Invalid negative quantity");
            System.exit(0);
        }
        System.out.print("\n");

        System.out.printf("The item price for (" + quantity + " x " + name + 
        ") is: $%.2f\n", sum);
        double tax = TAX_RATE * sum;
        System.out.printf("The sale tax is $%.2f:\n", tax);
        System.out.print("\n");
        System.out.print("Enter the gratuity amount: $");
        int gratuity = userinput.nextInt();
        if (gratuity < 0) {
            System.out.println("Invalid gratuity amount");
            System.exit(0);
        }
        System.out.print("\n");
        double total = tax + sum + gratuity;
        
        System.out.printf("Your total bill is $%.2f\n", total);
        System.out.print("Thank you for your order");
        System.exit(0);
    }   
}
