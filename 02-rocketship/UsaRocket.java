
/**
 * Write a description of class UsaRocket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UsaRocket{
    public static void main(String[]args) {
        cone();
        box();
        usa();
        box();
        cone();
    }
    public static void cone() {
         System.out.println("   /\\");
         System.out.println("  /  \\");
         System.out.println(" /    \\");
    }
    public static void box() {
         System.out.println("+------+");
         System.out.println("|      |");
         System.out.println("|      |");
         System.out.println("+------+");
    }
    public static void usa() {
         System.out.println("|United|");
         System.out.println("|States|");
    }
}
