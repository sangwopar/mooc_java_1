
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();

        List<String> list = new ArrayList<>();
        try (Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                list.add(file.nextLine());
            }

            System.out.println("Team:");
            String team = scan.nextLine();
            int games = 0;
            int wins = 0;
            int losses = 0;
            for (String str : list) {
                String[] parts = str.split(",");
                if (team.equals(parts[0])) {
                    games += 1;
                    int me = Integer.valueOf(parts[2]);
                    int you = Integer.valueOf(parts[3]);
                    if (me > you) {
                        wins += 1;
                    } else {
                        losses += 1;
                    }
                } else if (team.equals(parts[1])) {
                    games += 1;
                    int me = Integer.valueOf(parts[3]);
                    int you = Integer.valueOf(parts[2]);
                    if (me > you) {
                        wins += 1;
                    } else {
                        losses += 1;
                    }
                }
            }
            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
    }

}
