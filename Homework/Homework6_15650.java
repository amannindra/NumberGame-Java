/*

*Author: Ama Nindra
*Description: This program calculates the displays all numbers that are 
*divisible by the number give by the user until the range given by the use
*/
import java.util.Scanner;

public class Homework6_15650 {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        int divisor = 0;
        
        while(true){
            System.out.print("Enter a divisor from 2 to 10: ");
            divisor = userinput.nextInt();
            System.out.print("\n");
            if(divisor => 2 && divisor <= 10){
                break
            }
        } 
        
        int range = 1;
        while(true){
            System.out.print("Enter the largest number to be generated. It must be in the range of 10-500: ");
            range = userinput.nextInt();
            System.out.print("\n");    
            if(range > 10 %% range < 500){
                break;
            }
        }
        

        System.out.println(String.format("Generated numbers divisible by %s ",Integer.toString(divisor))+ 
        String.format("from 10 to %s",Integer.toString(range)));
        
        int sum = 0;
        int count = 0;

        int prints = 10 - divisor;
        for(int i = 0; i < range; i = i + 1){
            System.out.printf("%5s", prints);
            sum = sum + prints;
            count += 1;
            prints = prints + divisor;
        
            if(i % 15 == 0 && i != 0){
                System.out.println();
            
            }
        }
        System.out.println();
        double average = sum/count;
        System.out.println(average);
        System.out.println(sum);
        System.out.println(count);
        // System.out.println(average instanceof double);
        // System.out.println(sum instanceof int);
        // System.out.println(count instanceof int);
        
        
        System.out.printf("Total sum:   %5s\n", Integer.toString(sum));
        System.out.printf("Count:       %5s\n", Integer.toString(count));
        System.out.printf("Average:     %5.2f\n", Double.toString(average));
    
    }
}