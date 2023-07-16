
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stop = 0;
        int start = 0;
        // Write your program here
        System.out.println("Where to?");
        stop = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        start = Integer.valueOf(scanner.nextLine());
        if (start <= stop) {
            for (int i = start; i <= stop; i++) {
                System.out.println(i);
            }
        }

    }
}
