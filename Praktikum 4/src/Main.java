import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner optionScanner = new Scanner(System.in);
            Player player = new Player("", "", "",100, "", "", "", "");
            while (true) {
                System.out.println("     MENU");
                System.out.println("-----------------");
                System.out.println("1. Register");
                System.out.println("2. Login");
                System.out.println("3. Quit");
                System.out.print("Enter your choice: ");
                try {
                    int choice = optionScanner.nextInt();
                    optionScanner.nextLine();
                    System.out.println();
                    switch (choice) {
                        case 1:
                            player.register();
                            break;
                        case 2:
                            if (player.login()) {
                                player.startAdventure();
                            }
                            break;
                        case 3:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid choice.");
                            break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid choice.");
                    optionScanner.nextLine();
                }
                
                }
            }
        }
}
