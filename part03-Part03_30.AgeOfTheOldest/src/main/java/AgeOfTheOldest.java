
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAge = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] piecs = input.split(",");
            int age = Integer.valueOf(piecs[1]);
            if (maxAge <  age) {
                maxAge = age;
            }
        }
        System.out.println("Age of the oldest: " + maxAge);

    }
}
