/*

*Author: Aman Nindra
*Description: This programm
*/

package Homework;

public class SodaCan_15650 {
        private String drinkType;
        private double radius = 1.195;
        private double height = 4.83;
        private double remainingSoda;
        public static final double PI = 3.14;
        public static final double MM_IN_INCH = 25.4;
        public static final double L_OZ_PER_CUBIC_MM = 3.3814e-5;

        public SodaCan_15650(){
                drinkType = "Soda";
        }

        public SodaCan_15650(String drinkType1, double radius1, double height1) {
                radius = radius1 * MM_IN_INCH;
                drinkType = drinkType1;
                height = height1;
                remainingSoda = PI * radius * radius * height * L_OZ_PER_CUBIC_MM;
        }

        // This method returns the DrinkType
        public String getDrinkType() {
                return drinkType;
        }

        // This method returns the radius of the can
        public double getRadius() {
                return radius;

        }

        // This method returns the height of the can
        public double getHeight() {
                return height;
        }

        // This method returns the Capacity of the can
        public double getFullCapacity() {
                return PI * radius * radius * height * L_OZ_PER_CUBIC_MM;
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
                if (getFullCapacity() > remainingSoda + volume) {
                        return false;
                } else {
                        remainingSoda += volume;
                        return true;
                }
        }

        public boolean isFull() {

                return getRemainingSoda() == getFullCapacity() ? true : false;
        }
}
