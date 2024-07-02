import java.io.*;
import java.util.*;

class Review {
    static Random rand = new Random();
    static Scanner userinput = new Scanner(System.in);
    String continues;
    public static void main(String[] args){
        
        System.out.println("We are going to play the Number Game");
        game();
    }
    public void game(){
        int i = 0;
        continues = userinput.nextBoolean();
        while (continues){
            System.out.println(i);
            if(i == 10){
                continues = false;
            }
        }
    }

}

