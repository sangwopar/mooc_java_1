
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Archive> list = new ArrayList<>();
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.equals("")) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            Archive archive = new Archive(id, name);
            if (list.contains(archive)) {
                continue;
            }
            list.add(archive);
        }
        System.out.println();
        System.out.println("==Items==");
        for (Archive archive : list) {
            System.out.println(archive);
        }
    }
}
