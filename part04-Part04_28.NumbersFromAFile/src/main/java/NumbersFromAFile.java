
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        System.out.println("File?");
        String fileName = scanner.nextLine();
        List<Integer> list = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                list.add(Integer.valueOf(fileScanner.nextLine()));
            }
            System.out.println("Lower bound?");
            int lower = Integer.valueOf(scanner.nextLine());
            System.out.println("Upper bound?");
            int upper = Integer.valueOf(scanner.nextLine());
            int count = 0;
            for (Integer number : list) {
                if (number >= lower && number <= upper) {
                    count += 1;
                }
            }
            System.out.println("Numbers: " + count);
        } catch (Exception e) {
            // TODO: handle exception
            e.getMessage();
        }
    }

}
