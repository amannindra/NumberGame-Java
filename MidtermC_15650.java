import java.util.Scanner;
public class MidtermC_15650 {
    public static void main(String[] args){
        final double TAX_RATE = 9.25;
        final double PRICE_NEW_16 = 499.99;
        final double PRICE_NEW_32 = 549.99;
        final double PRICE_REFURB_16 = 419.99;
        final double PRICE_REFURB_32 = 429.99;
        final double PRICE_DENTED_16 = 339.99;
        final double PRICE_DENTED_32 = 359.99;
        Scanner user = new Scanner(System.in);
        System.out.println("Welcome to the CIS36A Game Store.");
        
        System.out.println(String.format("%30s","Memory size/Status") + 
        String.format("%30s","New") + String.format("%30s","Refurbished") + 
        String.format("%30s","Dented"));

        System.out.println(String.format("%30s","16 gigbytes") + String.
        format("%30s", PRICE_NEW_16) + String.format("%30s",PRICE_REFURB_16) +
        String.format("%30s", PRICE_DENTED_16));
        
        System.out.println(String.format("%30s","32 gigbytes") + 
        String.format("%30s",PRICE_NEW_32) + String.format("%30s",PRICE_REFURB_32) + 
        String.format("%30s\n",PRICE_DENTED_32));
        


        System.out.print("Enter the memory size of the console (32 or 16 gigabytes): ");
        int memory = user.nextInt();
        if (memory != 32 && memory != 16){
            System.out.println("Invalid memory size!"); 
            System.exit(0);
        }

        System.out.print("Enter the quality of the console (N for new, R for Reburbished, or D for Dented): ");
        user.nextLine();
        String quality = user.nextLine();
        

        if (!quality.equals("N") && !quality.equals("R") && !quality.equals("D")){
            System.out.println("Invalid quality!");
            System.exit(0);
        }
        System.out.print("Enter the console quality to buy: ");
        int amount = user.nextInt();

        if (amount < 0){
            System.out.println("Invalid quantity!");
            System.exit(0);
        }
        if(amount > 50){
            System.out.println("Quantity cannot exceed 50!");
            System.exit(0);
        }
 
        double cost = 0;
        if(memory == 32 && quality.equals("N")){
            cost = PRICE_NEW_32 * amount;
        }
        if(memory == 16 &&quality.equals("N")){
            cost = PRICE_NEW_16 * amount;
        }
        if(memory == 32 && quality.equals("R")){
            cost = PRICE_REFURB_32 * amount;
        }
        if(memory == 32 && quality.equals("R")){
            cost = PRICE_REFURB_32 * amount;
        }
        if(memory == 16 && quality.equals("R")){
            cost = PRICE_REFURB_32 * amount;
        }
        if(memory == 32 && quality.equals("D")){
            cost = PRICE_DENTED_32 * amount;
        }
        if(memory == 16 && quality.equals("D")){
            cost = PRICE_DENTED_16 * amount;
        }
        
        double taxtotal = cost * (TAX_RATE)/100;
        double total = cost + taxtotal;
        System.out.printf("The item total is %5s $ %5s %.2f\n","", "",cost);
        System.out.printf("The item total is %5s $ %5s %.2f\n","", "",taxtotal);
        System.out.printf("The item total is %5s $ %5s %.2f\n","", "",total);
    
        System.exit(0);
       }
    }
    
