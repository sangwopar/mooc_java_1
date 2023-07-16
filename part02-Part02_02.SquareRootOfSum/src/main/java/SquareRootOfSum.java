
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());
        num = num + Integer.valueOf(scanner.nextLine());
        double squareRoot = Math.sqrt(num);
        System.out.println(squareRoot);
    }
}
