/*

*Author: Aman Nindra
*Description: This programm calculates the remaining soda in fluid composition 
* after a person drinks or adds soda to the can. It takes in type of drink, radius and height.
*/

package Homework;

public class SodaCan_15650 {
        private String drinkType;
        private double radius;
        private double height;
        private double remainingSoda;
        public static final double PI = 3.14;
        public static final double MM_IN_INCH = 25.4;
        public static final double FL_OZ_PER_CUBIC_MM = 3.3814e-5;

        // This is the first constructor of the class. It takes in no values and leaves
        // everything in default value
        public SodaCan_15650() {
                drinkType = "Soda";
                radius = 1.195 * MM_IN_INCH;
                height = 4.83 * MM_IN_INCH;
                remainingSoda = PI * radius * radius * height * FL_OZ_PER_CUBIC_MM;

        }

        // This is the second constructor of the class. It takes in 2 values
        public SodaCan_15650(String drinkType, double radius, double height) {
                this.drinkType = drinkType;
                this.radius = radius * MM_IN_INCH; // Convert radius to mm
                this.height = height * MM_IN_INCH; // Convert height to mm
                this.remainingSoda = getFullCapacity(); // Set remaining soda to full capacity
        }

        // This method returns the DrinkType
        public String getDrinkType() {
                return drinkType;
        }

        // This method returns the radius of the can
        public double getRadius() {
                return radius / MM_IN_INCH;

        }

        // This method returns the height of the can
        public double getHeight() {
                return height / MM_IN_INCH;
        }

        // This method returns the Capacity of the can
        public double getFullCapacity() {

                return PI * radius * radius * height * FL_OZ_PER_CUBIC_MM;
        }

        public double getRemainingSoda() {
                return remainingSoda;
        }

        // This method returns a boolean indicating whether volumes is reduced in
        // remainingSoda
        public boolean drinkSoda(double volume) {
                double rem = getRemainingSoda();
                if (volume < 0) {
                        return false;
                } else if (rem == 0 && volume > rem) {
                        return false;
                } else if (rem < volume && rem != 0) {
                        remainingSoda = 0;
                        return true;
                } else {
                        remainingSoda -= volume;
                        return true;
                }
        }

        public boolean refillSoda(double volume) {
                if (getFullCapacity() < remainingSoda + volume && volume >= 0) {
                        return false;
                } else {
                        remainingSoda += volume;
                        return true;
                }
        }

        // This method checks in Remaining Soda is at full capacity
        public boolean isFull() {

                return getRemainingSoda() == getFullCapacity() ? true : false;
        }
}
