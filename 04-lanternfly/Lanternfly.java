import java.util.Scanner;

public class Lanternfly
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("A human needs on average 10,000 steps");
        System.out.println(", walking daily helps you stay healthy.");
        
        System.out.print("How many steps did you take today? ");
        int num = input.nextInt();
        
        if (num >= 5000) {
            System.out.println("You can do better than that!");
        } else if (num >= 10000){ 
            System.out.println("Wow you are very healthy!");
        } else {
            System.out.println("GO OUTSIDE!");
        } // end else statement
    
    } // end main method

} // end class