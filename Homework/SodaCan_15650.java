/*

*Author: Aman Nindra
*Description: This programm
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

        public SodaCan_15650() {
                drinkType = "Soda";
                radius = 1.195 * MM_IN_INCH;
                height = 4.83 * MM_IN_INCH;
                remainingSoda = PI * radius * radius * height * FL_OZ_PER_CUBIC_MM;

        }

        public SodaCan_15650(String drinkType1, double radius1, double height1) {
                radius = radius1 * MM_IN_INCH;
                drinkType = drinkType1;
                height = height1 * MM_IN_INCH;
                remainingSoda = PI * radius * radius * height * FL_OZ_PER_CUBIC_MM;
        }

        // This method returns the DrinkType
        public String getDrinkType() {
                return drinkType;
        }

        // This method returns the radius of the can
        public double getRadius() {
                return radius/ MM_IN_INCH;

        }

        // This method returns the height of the can
        public double getHeight() {
                return height/ MM_IN_INCH;
        }

        // This method returns the Capacity of the can
        public double getFullCapacity() {

                return PI * radius * radius * height * FL_OZ_PER_CUBIC_MM;
        }

        public double getRemainingSoda() {
                return remainingSoda;
        }

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
