
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cake = scanner.nextLine();
        cake = cake + cake + cake;
        System.out.println(cake);
        // Write your program here

    }
}
