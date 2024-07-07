//https://bootcamp.cvn.columbia.edu/blog/java-projects-for-beginners-to-gain-skills/

public class Top15JavaProjectIdeasforBeginners {
    public static void main(String[] args){
        //problem 1
        double sums = Sum(2,5);
        int soup = (int)sums;
        System.out.println(soup);

        //Problem 2
        //System.out.println(Reverse("Hello"));

        //My own Problem
        //System.out.println(RemoveSpace("Top 15 Java Project Ideas for Beginners"));


    
    }
    //Problem Addition
    public static double Sum(int a, int b){
        return a + b;
    }
    //Problem 2 Reverse a String
    public static String Reverse(String a){
        String output = "";
        for(int i = a.length()-1; i >= 0; i --){
            output += a.charAt(i);
        }
        return output;
    }
    //My own Project
    public static String RemoveSpace(String space){
        return space.replace(" ", "");
    }
}
