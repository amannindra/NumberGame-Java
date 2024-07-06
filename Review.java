import java.util.*;

class Review {
    static Random rand = new Random();
    static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("We are going to play the Number Game");
        game();
    }

    public static void game() {
        int num = rand.nextInt(1000) + 1; // Change to 100 to match the prompt
        int i = 0;
        boolean continues = true;
        while (continues) {
            i++;
            System.out.print("Give me a number from 1 - 100: "); 
            int number = userinput.nextInt();
            // Consuming the newline left-over
            userinput.nextLine();

            if (number > num) {
                System.out.println("Too Big");
            } else if (number < num) {
                System.out.println("Too Small");
            } else {
                System.out.println("Congrats you finished the game in " + i + " tries");
                continues = false;
            }
        }

        boolean c = true;
        while (c){
            System.out.print("Do you want to play the game again?(y,n): ");
            String again = userinput.nextLine();
            if(again.equals("y")){
                game();
            }
            else if(again.equals("n")){
                c = false;
                return;
            }
            else{
                continue;
            }
        }
        
    }
}

