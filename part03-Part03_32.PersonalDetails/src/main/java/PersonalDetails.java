
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumYear = 0;
        String longName = "";
        int length = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] pices = input.split(",");

            if (length < pices[0].length()) {
                length = pices[0].length();
                longName = pices[0];
            }
            
            sumYear += Integer.valueOf(pices[1]);
            count += 1;
        }
        System.out.println("Longest name: " + longName);
        System.out.println("Average of the birth years: " + (double) sumYear / count);

    }
}
