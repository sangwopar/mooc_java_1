
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String st = scan.nextLine();
        System.out.println("Give an integer:");
        int it = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double db = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean bl = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + st);
        System.out.println("You gave the integer " + it);
        System.out.println("You gave the double " + db);
        System.out.println("You gave the boolean " + bl);

    }
}
