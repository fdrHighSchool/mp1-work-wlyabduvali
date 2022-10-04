
/**
 * Think Hava; Chapter 2,
 *
 * @Abduvali T
 * @09/28/2022
 */

import java.util.Scanner;  // Import the Scanner class

public class Date
{
    public static void main(String[] args) {  
    Scanner s = new Scanner(System.in);    
    System.out.print("Enter the Day of the Week: ");
    String day = s.nextLine ();
    
    System.out.print("Enter the Month: ");
    String month = s.nextLine ();
    
    System.out.print("Enter the Date: ");
    String date = s.nextLine ();
    
    System.out.print("Enter the Year: ");
    String year = s.nextLine ();
    
    System.out.println("American Format: " + day + ", " + month + " " + date +", " + year + 
    " European Format: " + day + " " + date + " " + month + " " + year);
    } //end of main method
} //end of class
