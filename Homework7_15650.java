/*

*Author: Aman Nindra
*Description: This program will go through the file specified by the user and return the 
numbers counted, smallest number, largest number, average number, numbers below average, 
and numbers above average.

*/



import java.util.Scanner;
import java.io.*;

public class Homework7_15650 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program read a number file and print statistics.");
        System.out.print("Enter a file name: ");

        String fileName = sc.nextLine();
        File file = new File(fileName);

        // Check if file exists or file is empty
        checkInputFile(file, fileName);

        // Read all numbers, keep count, smallest and highest number, calculates average
        double average = processFileFirstPass(file);

        // // Read all numbers, keep count of numbers below and above the average
        processFileSecondPass(file, average);
        sc.close();
    }

    public static void checkInputFile(File file, String fileName)
            throws IOException {

        if (!file.exists()) {
            System.out.println("The file " + fileName + " does not exist!");
            System.exit(0);
        }
        Scanner inputs = new Scanner(file);
        if(!inputs.hasNextLine()){
            System.out.println("The file " + fileName + " is empty or dosen't contain any numbers");
            inputs.close();
            System.exit(0);
        }

    }

    public static double processFileFirstPass(File file)
        throws IOException {
        int count = 0;
        int sum = 0;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        Scanner inputFile = new Scanner(file);

        inputFile.nextLine();
        if (!inputFile.hasNext()) {
            System.out.println("File is empty or does not contain numbers");
            System.exit(0);
        }
        while (inputFile.hasNextInt()) {
            int number = inputFile.nextInt();
            sum += number;
            count++;
            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }


        }
        inputFile.close();
        System.out.println();
        double average =  sum / (double) count;
        System.out.printf("%42s\n","File Statistics");
        System.out.printf("%25s  %10d\n","Count",count);
        System.out.printf("%25s  %10d\n","Smallest",smallest);
        System.out.printf("%25s  %10d\n", "Largest",largest);
        System.out.printf("%25s  %10.2f\n","Average",average);

        return sum /(double) count;
    }

    public static void processFileSecondPass(File file, double average)
            throws IOException {
        int numbersAbove = 0;
        int numbersBelow = 0;
        Scanner inputFile = new Scanner(file);
        inputFile.nextLine();
        while (inputFile.hasNextInt()) {
            int number = inputFile.nextInt();
            if (number > average){
                numbersAbove++;
            }
            if(number < average){
                numbersBelow++;
            }

        }
        inputFile.close();
        System.out.printf("%25s  %10d\n", "Numbers below average", numbersBelow);
        System.out.printf("%25s  %10d\n", "Numbers above average",numbersAbove);

    }
}
