import java.util.Scanner;
public class Homework2_15650 {
    public static void main(String[] args){
        System.out.println("Author: Aman Nindra\nThis program shows how to calculate the volume and surface area of a cubiod using Java");
        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter the cuboid length: ");
        double length = userinput.nextDouble();
        System.out.print("Enter the cuboid length: ");
        double height = userinput.nextDouble();
        System.out.print("Enter the cuboid length: ");
        double width = userinput.nextDouble();
        double cuboidVolume = length*height*width;
        double surfaceArea = 2*length*width  + 2*width*height + 2*length*height;
        System.out.println("Volume of the cuboid (length " + length + ", height " +  height + ", width " + width + ") is " + cuboidVolume); 
        System.out.println("Surface area of the cuboid (length " + length + ", height " +  height + ", width " + width + ") is " + surfaceArea); 

        

        
    }
}
