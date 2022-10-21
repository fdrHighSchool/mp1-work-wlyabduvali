import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);

    // get String input from user
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("Enter your favorite number: ");
    String favNumber = s.nextLine();
    System.out.print("Are you a teacher or student: ");
    String role = s.next();    

    // test output
    if (role.equalsIgnoreCase("teacher")) {
    System.out.println(initialize(firstName) + (lastName) + initialize(favNumber) + "@schools.nyc.gov");
} else {
  System.out.println((firstName) + initialize(lastName) + initialize(favNumber) + "@nycstudents.net");
}
    System.out.println("How long do you want your password?");
    int len = s.nextInt();
    generatePassword(len);
    s.close();
  } // end main method
      public static String generatePassword(int length) {
        String password = "";
            
        int min, max;
                
        for (int i = 0; i < length; i++) {
            int choice = (int)(Math.random()* 3 + 1);
            if (choice == 1) {
                    min = 65;
                    max = 90;
                }
            else if (choice == 2) {
                    min = 97;
                    max = 122;
                }
            else{
                    min = 33;
                    max = 47;
            }
            int rand = (int)(Math.random()*(max - min + 1) + min);
            
            char c = (char)(int)rand;
            password += c;
            System.out.println(rand + "" + c);
        }
        
        return password;
    }
  /*
   * Name: initialize
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String initialize(String n) {
    return n.substring(0, 1);
  } // end initialize method
} // end class
