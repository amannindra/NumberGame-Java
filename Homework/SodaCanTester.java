/*

*Author: Aman Nindra
*Description: This programm
*/

package Homework;

public class SodaCanTester {
        public static void main(String[] args) {
                System.out.println("This program simulates a soda can object behavior.");
                SodaCan_15650 can = new SodaCan_15650();
                System.out.printf("%s %.2f\n", "Create a new can of soda: ", can.getFullCapacity());
                System.out.println("Expected Value:    12.00");

                System.out.printf("%s %s\n", "Can is full:      ", can.isFull());
                System.out.println("Expected Value:    true");




                
                boolean result = can.drinkSoda(3);
                System.out.printf("%s %.2f result = %s\n", "Drink 3fl. ounce.\nSoda can remaining volume is:",
                                can.getRemainingSoda(), result);
                System.out.println("Expected Value: 9.00 result = true");

                System.out.printf("%s %s\n", "Can is full:      ", can.isFull());
                System.out.println("Expected Value:    false");

                result = can.drinkSoda(2.5);
                System.out.printf("%s %.2f result = %s\n", "Drink 2.5fl. ounce.\nSoda remain is:",
                                can.getRemainingSoda(), result);
                System.out.println("Expected Value: 6.50 result = true");

                result = can.drinkSoda(1.5);
                System.out.printf("%s %.2f result = %s\n", "Drink 1.5fl. ounce.\nSoda remain is:",
                                can.getRemainingSoda(), result);
                System.out.println("Expected Value: 5.00 result = true");

                result = can.drinkSoda(3.5);
                System.out.printf("%s %.2f result = %s\n", "Drink 3.5fl. ounce.\nSoda remain is:",
                                can.getRemainingSoda(), result);
                System.out.println("Expected Value: 1.50 result = true");

                result = can.drinkSoda(4.0);
                System.out.printf("%s %.2f result = %s\n", "Drink 4.0fl. ounce.\nSoda remain is:",
                                can.getRemainingSoda(), result);
                System.out.println("Expected Value: 0.00 result = true");

                System.out.print("Drink 1.0fl. ounce from empty can.\n");

                result = can.drinkSoda(1.0);
                System.out.printf("%s %.2f result = %s\n", "Soda remain is:",
                                can.getRemainingSoda(), result);
                System.out.println("Expected Value: 0.00 result = false");

                result = can.drinkSoda(0.0);
                System.out.printf("%s %.2f result = %s\n", "Drink 0.0fl. ounce.\nSoda remain is:",
                                can.getRemainingSoda(), result);
                System.out.println("Expected Value: 0.00 result = true");

                result = can.refillSoda(5);
                System.out.printf("%s %.2f result = %s\n", "Refill with 5.0fl. ounce.\nSoda remain is:",
                                can.getRemainingSoda(), result);
                System.out.println("Expected Value: 5.00 result = true");

                result = can.refillSoda(7.1);
                System.out.printf("%s %.2f result = %s\n", "Refill with 7.1fl. ounce.\nSoda remain is:",
                                can.getRemainingSoda(), result);
                System.out.println("Expected Value: 5.00 result = false");








                SodaCan_15650 canCoke = new SodaCan_15650("Coke", 1.3, 4.762);
                System.out.printf("%s %.2f\n", "\nGet new full can of Coke: ", canCoke.getFullCapacity());
                System.out.println("Expected Value:    14.00");

                System.out.printf("%s %s\n", "Can is full:      ", canCoke.isFull());
                System.out.println("Expected Value:    true");

                result = canCoke.drinkSoda(3.3);
                System.out.printf("%s %.2f result = %s\n", "Drink 3.3fl. ounce.\nCoke remain is:",
                                canCoke.getRemainingSoda(), result);
                System.out.println("Expected Value: 10.70 result = true");

                result = canCoke.drinkSoda(6.8);
                System.out.printf("%s %.2f result = %s\n", "Drink 6.8fl. ounce.\nCoke remain is:",
                                canCoke.getRemainingSoda(), result);
                System.out.println("Expected Value: 3.90 result = true");

                result = canCoke.drinkSoda(-1);
                System.out.printf("%s %.2f result = %s\n", "Drink -1fl. ounce.\nCoke remain is:",
                                canCoke.getRemainingSoda(), result);
                System.out.println("Expected Value: 3.90 result = false");

                result = canCoke.drinkSoda(4.0);
                System.out.printf("%s %.2f result = %s\n", "Drink 4.0fl. ounce.\nCoke remain is:",
                                canCoke.getRemainingSoda(), result);
                System.out.println("Expected Value: 0.00 result = true");

                result = canCoke.refillSoda(14.1);
                System.out.printf("%s %.2f result = %s\n", "Refill with 14.1fl. ounce.\nCoke remain is:",
                                canCoke.getRemainingSoda(), result);
                System.out.println("Expected Value: 0.00 result = false");








                SodaCan_15650 canPepsi = new SodaCan_15650("Pepsi", 1.5, 4.762);
                System.out.printf("%s %s%s %.2f\n", "\nGet new full can of", canPepsi.getDrinkType(),
                                ", capacity: ", canPepsi.getFullCapacity());
                System.out.println("Expected Value:                       18.64");

                System.out.printf("%s %s %s %.2f\n", "\nCan of", canCoke.getDrinkType(), "radius is:",
                                canCoke.getRadius());
                System.out.println("Expected Value:        1.30");
                System.out.printf("%s %s %s %.2f\n", "\nCan of", canCoke.getDrinkType(), "height is:",
                                canCoke.getHeight());
                System.out.println("Expected Value:        4.76");

                System.out.printf("%s %s %s %.2f\n", "Can of", canCoke.getDrinkType(), "remain is: ",
                                canCoke.getRemainingSoda());
                System.out.println("Expected Value:         0.00");
        }

}
