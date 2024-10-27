import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
/*
 * Author: Aman Nindra
 * Description: This program gets information from the .txt file and then creates another 
 * .txt file showing the average HW score, lowest Hw score, and highest Hw score. It also prints in 
 * the console the highest Hw score, lowest Hw score, and the average HW score.
 */


public class Grading_15650 {

    // These are lass constants
    static final int HOMEWORK_CNT = 8;
    private String fileName;
    private double finalScoreAverage = 0;
    private int finalScoreMax = Integer.MIN_VALUE;
    private int finalScoreMin = Integer.MAX_VALUE;

    // This is the constructor    
    public Grading_15650(String fileName) {
        this.fileName = fileName;
    }
    // This function gets the information from the .txt file and inputs ID, Average H2, Lowest
    //HW, and Highest HW for each students in a different .txt file
    public int processGrades(String outfileName) throws IOException {
        File files = new File(fileName);
       

        if (!files.exists()) {
            
            return -1;
        }
        Scanner inputFile = new Scanner(files);
        File outputFile = new File(outfileName);
        PrintWriter outputs = new PrintWriter(outputFile);
        if (!inputFile.hasNext()) {
            return 0;
        } else {
            outputs.write(String.format("%-17s %-17s %-20s %-18s %-20s\n","","ID", 
            "Average HW", "Lowest HW", "Highest HW"));            
            int j = 0;
        
            while (inputFile.hasNextLine()) {
             
                int [] numList = new int[HOMEWORK_CNT];
                int ID = inputFile.nextInt();
                for(int i = 0; i < HOMEWORK_CNT; i++) {
                    numList[i] = inputFile.nextInt();
                }
     
                int midTerm = inputFile.nextInt();
                int finalexam = inputFile.nextInt();
                int LabScore = inputFile.nextInt();
                int quiz = inputFile.nextInt();
                int high = getHighestScore(numList);
                int low = getLowestScore(numList);
                double average = getAverageScore(numList);
                
                
                finalScoreAverage = (finalScoreAverage + finalexam);
                j += 1;
                if (finalexam > finalScoreMax){
                    finalScoreMax = finalexam;
                }
                else if (finalexam < finalScoreMin){
                    finalScoreMin = finalexam;
                }            
                outputs.write(String.format("%20s", ID) + 
                String.format("%20s %.2f" ,"", average) + 
                String.format("%20s", low)+
                String.format("%20s\n" , high));
            }
            finalScoreAverage = finalScoreAverage /(double)j;
            outputs.close();
            return 2;
        }
    }
    // This function prints the overall highest final score, lowest final score, and average final score.
    public void displayFinalScoreStat() {
       System.out.printf("Average final score is: %20.2f\n",finalScoreAverage );
       System.out.printf("Highest final score is: %20d\n", finalScoreMax);
       System.out.printf("Lowest final score is:  %20d\n", finalScoreMin);
    }
    // This function gets the average of a integer array
    public static double getAverageScore(int[] scores) {
        int score = 0;
        for (int i = 0; i < scores.length; i++) {
            score += scores[i];
        }
        return score / (double) scores.length;
    }
    // This function gets the highest number in the integer array
    public static int getHighestScore(int[] scores) {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > maximum)
                maximum = scores[i];
        }
        return maximum;
    }
    // This function gets the lowest number in the integer array
    public static int getLowestScore(int[] scores) {
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < minimum)
                minimum = scores[i];
        }
        return minimum;
    }
    // This function gets the student score file and inputs it into processGrades function. 
    // Then it displays the student score in the console
    public static void main(String[] args) throws IOException {
        // Replace XXXXX with last 5 digits of your student ID.
        final String OUTPUT_NAME = "OUTPUT-15650.TXT";

        System.out.println("This program reads scores data file and displays statistics.\n");
        System.out.print("Enter a student score file: ");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        System.out.println();
        Grading_15650 sp = new Grading_15650(fileName);
        int result = sp.processGrades(OUTPUT_NAME);
        if (result == -1)
            System.out.println("The file " + fileName + " does not exist!");
        else if (result == 0)
            System.out.println("File " + fileName + " is empty or does not contain scores.");
        else {
            System.out.println("\nFile " + fileName + " contains " + result + " students.");
            System.out.println();
            sp.displayFinalScoreStat(); // display final exam average, high, and low
        }
        scanner.close();
    }
}
