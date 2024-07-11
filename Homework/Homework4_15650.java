package Homework;
import javax.swing.JOptionPane;
/*
Homework 4
Description: This program tells the user if the year is a leap year using Java
Author: Aman Nindra

 
 */

public class Homework4_15650 {
    public static void main(String[] args){
        String year = JOptionPane.showInputDialog("This program determines leap year, writen by Aman Nindra.\nEnter a year (not earlier than 1582):");
        int yearint = Integer.parseInt(year);
        
        if (yearint > 1582){
            boolean isleapyear = (yearint % 4 == 0 && yearint % 100 != 0) || yearint % 400 == 0;
            
            if (isleapyear)
                JOptionPane.showMessageDialog(null, "The year " + yearint + " is a lap year");
            else
                JOptionPane.showMessageDialog(null, "The year " + yearint + " is not lap year");
            System.exit(0);
        }
        else{
            JOptionPane.showMessageDialog(null, "There is no leap year before 1582");
        }
        System.exit(0);
            
    }   
        
    
}
