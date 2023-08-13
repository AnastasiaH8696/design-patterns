import com.proxy.example.SoldierProxy;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        label:
        while (true) {
            System.out.println("1. List all soldier IDs");
            System.out.println("2. Get soldier details by ID");
            System.out.println("3. Exit");

            java.util.Scanner scanner = new java.util.Scanner(System.in);
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    File folder = new File("proxy-pattern/resources");
                    File[] files = folder.listFiles((dir, name) -> name.endsWith(".csv"));
                    if (files != null) {
                        for (File file : files) {
                            String id = file.getName().replace(".csv", "");
                            System.out.print(id + " ");
                        }
                        System.out.println();
                    }
                    break;
                case "2":
                    System.out.print("Enter soldier ID: ");
                    String soldierId = scanner.nextLine();
                    SoldierProxy proxy = new SoldierProxy(soldierId);
                    proxy.printDetails();
                    break;
                case "3":
                    break label;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}