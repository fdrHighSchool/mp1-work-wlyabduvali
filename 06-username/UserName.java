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
    employment = s.next();

    // test output
    if (s.equals(teacher)) {
    System.out.println(initialize(firstName) + "." + initialize(lastName) + "." + initialize(favNumber) + "@schools.nyc.gov");
} else {
  // block of code to be executed if the condition is false
}

    s.close();
  } // end main method

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
