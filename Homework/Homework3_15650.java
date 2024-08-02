package Homework;
/*
Homework
@author: Aman Nindra
@since: July 8, 2024
Program Purpose: This program calculates the focus, area, and perimeter from length of the major and minor radius that the user inputed.

 */
import java.lang.Math;
import javax.swing.JOptionPane;
public class Homework3_15650 {
    public static void main(String[] args){
        String majorRadiusString;
        double majorRadius;
        majorRadiusString = JOptionPane.showInputDialog("Program to calculate ellipse geometry.\nEnter the major radius:");
        majorRadius = Double.parseDouble(majorRadiusString);

        String minorRadiusString;
        double minorRadius ;
        minorRadiusString = JOptionPane.showInputDialog("Program to calculate ellipse geometry.\nEnter the major radius:");
        minorRadius = Double.parseDouble(minorRadiusString);
        
        double focus = Math.sqrt(Math.pow(majorRadius,2) - Math.pow(minorRadius,2));
        double area = Math.PI * majorRadius * minorRadius;
        double perimeter = Math.PI*(3*(majorRadius + minorRadius) - Math.sqrt(10 * majorRadius * minorRadius + 3 * (Math.pow(majorRadius,2) + Math.pow(minorRadius,2))));

        JOptionPane.showMessageDialog(null, "Focus: " + focus+"\n Area: " + area + "\nCircumference: " + perimeter);
        System.exit(0);
    }
}
