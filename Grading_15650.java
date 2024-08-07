import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class Grading_15650 {

    /*
     * student ID, hw 1, hw 2, hw 3, hw 4, hw 5, hw 6, hw 7, hw 8, midterm score,
     * final exam score, labs score, quiz score
     * 56049257 16 16 20 16 12 15 12 20 58 123 59 10
     * 97201934 19 15 13 19 16 12 13 18 72 101 55 10
     * 93589574 13 16 19 19 18 12 6 14 58 108 50 7
     * 85404010 17 19 19 19 19 10 17 19 70 102 58 8
     * 99608681 11 15 19 19 17 10 16 19 42 117 57 7
     * 84918110 11 20 18 17 12 8 12 19 46 122 31 0
     * 89307179 16 16 19 18 14 17 15 19 56 117 52 5
     * 09250373 15 15 18 18 11 18 17 19 44 106 51 8
     * 91909583 12 14 16 19 20 11 20 16 66 92 50 9
     * 80262228 14 6 20 18 17 11 13 13 47 119 34 1
     */

    static final int HOMEWORK_CNT = 8;
    private String fileName;
    private double finalScoreAverage;
    private int finalScoreMax = Integer.MIN_VALUE;
    private int finalScoreMin = Integer.MAX_VALUE;

    public Grading_15650(String fileName) {
        this.fileName = fileName;
    }

    public int processGrades(String outfileName) throws IOException {
        File files = new File(fileName);
        Scanner inputFile = new Scanner(files);
        File outputFile = new File(outfileName);
        PrintWriter output = new PrintWriter(outputFile);

        ArrayList<Integer> numList = new ArrayList<>();
        System.out.println(inputFile.nextLine());
        if (!files.exists()) {
            return -1;
        } else if (!inputFile.hasNext()) {
            return 0;
        } else {
            output.print("      ID      Average HW      Lowest HW      Highest HW");
            while (inputFile.hasNextLine()) {


                System.out.print("Next line: " + inputFile.nextLine());
                inputFile.nextInt();
                for(int i = 0; i < 8; i++) {
                    numList.add(inputFile.nextInt());
                }
                int scor = inputFile.nextInt();
                if (scor > finalScoreMax) {
                    System.out.println("Has reached final score Max:" + scor);
                    finalScoreMax = scor;
                }
                else if (scor < finalScoreMin){
                    System.out.println("Has reached final score Min:" +scor);
                    finalScoreMin = scor;
                }
            }
            return 0;
        }
    }

    public void displayFinalScoreStat() {
        // Method to display final score statistics
    }

    public static double getAverageScore(int[] scores) {
        int score = 0;
        for (int i = 0; i < scores.length; i++) {
            score += scores[i];
        }
        return score / (double) scores.length;
    }

    public static int getHighestScore(int[] scores) {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > maximum)
                maximum = scores[i];
        }
        return maximum;
    }

    public static int getLowestScore(int[] scores) {
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < minimum)
                minimum = scores[i];
        }
        return minimum;
    }

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
            // sp.displayFinalScoreStat(); // display final exam average, high, and low
        }
        scanner.close();
    }
}
