import java.util.Scanner;
public class moretest {
    public static void main(String[] args){
         final double TAX_RATE = 9.25;
        final double PRICE_NEW_16 = 499.99;
        final double PRICE_NEW_32 = 549.99;
        final double PRICE_REFURB_16 = 419.99;
        final double PRICE_REFURB_32 = 429.99;
        final double PRICE_DENTED_16 = 339.99;
        final double PRICE_DENTED_32 = 359.99;
        Scanner user = new Scanner(System.in);
         System.out.println(String.format("%30s","Memory size/Status") + 
        String.format("%30s","New") + String.format("%30s","Refurbished") + 
        String.format("%30s","Dented"));
        System.out.println(String.format("%30s","16 gigbytes") + String.
        format("%30s", PRICE_NEW_16) + String.format("%30s",PRICE_REFURB_16) +
         String.format("%30s", PRICE_DENTED_16));
        System.out.println(String.format("%30s","32 gigbytes") + 
        String.format("%30s",PRICE_NEW_32) + String.format("%30s",PRICE_REFURB_32) + 
        String.format("%30s\n",PRICE_DENTED_32));

    
        System.out.print("Enter the quality of the console (N for new, R for Reburbished, or D for Dented): ");
        String quality = user.nextLine();

  
       if (!quality.equals("N") && !quality.equals("R") && !quality.equals("D")){
            System.out.println("This is quality: " + quality);
            System.out.println("Invalid quality!");
            System.exit(0);
        }
        
        System.out.print("Enter the console quality to buy: ");

    }
}
