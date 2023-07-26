
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAge = 0;
        String maxName = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] pices = input.split(",");
            int age = Integer.valueOf(pices[1]);
            if (maxAge < age) {
                maxAge = age;
                maxName = pices[0];
            }
        }

        System.out.println("Name of the oldest: " + maxName);

    }
}
