/*

*Author: Ama Nindra
*Description: This program calculates the displays all numbers from 10 to the number the user
* specificied in incroments of a another that the user specified
*/
package Homework;

import java.util.Scanner;

public class Homework6_15650 {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        int divisor = 0;

        do {
            System.out.print("Enter a divisor from 2 to 10: ");
            divisor = userinput.nextInt();
            System.out.print("\n");
            if (divisor >= 2 && divisor <= 10) {
                break;
            }
        } while (true);

        int range = 1;
        do {
            System.out.print("Enter the largest number to be generated. It must be in the range of 10-500: ");
            range = userinput.nextInt();
            System.out.print("\n");
            if (range >= 10 && range <= 500) {
                break;
            }
        } while (true);

        System.out.println(String.format("Generated numbers divisible by %s ", Integer.toString(divisor)) +
                String.format("from 10 to %s", Integer.toString(range)));

        int sum = 0;
        int count = 0;

        int prints = 6;
        for (int i = 10; i <= range; i++) {
            if (i % divisor == 0) {
                System.out.printf("%5d", i);
                count++;
                sum += i;

                if (count % 15 == 0 && count != 0) {
                    System.out.println();
                }
            }
        }
        System.out.println();

        System.out.printf("%n%s %9s", "Total sum: ", sum);
        System.out.printf("%n%s %9s", "Count: ", count);
        if (count > 0) {
            double average = (double) sum / count;
            System.out.printf("%n%s %9.2f%n", "Average:", average);
        } else {
            System.exit(0);
        }

    }
}