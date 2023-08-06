
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        String file = scanner.nextLine();
        
        List<String> list = new ArrayList<>();
        // List<String[]> parts = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                list.add(fileScanner.nextLine());
            }
            for (String str : list) {
                String[] parts = str.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                System.out.println(name + ", age: " + age + " years");
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
