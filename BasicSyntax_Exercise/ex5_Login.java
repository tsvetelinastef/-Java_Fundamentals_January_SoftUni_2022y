package BasicSyntax_Exercise;

import java.util.Scanner;

public class ex5_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String password = "";


        for (int i = userName.length() - 1; i >= 0; i--) {
            password += userName.charAt(i);
        }

        String input = scanner.nextLine();
        int count = 0;
        while (true) {
            count++;
            if (input.equals(password)) {
                System.out.printf("User %s logged in.", userName);
                break;
            } else {
                if (count == 4) {
                    System.out.printf("User %s blocked!", userName);
                    break;
                }
                System.out.println("Incorrect password. Try again.");
            }
            input = scanner.nextLine();
        }


    }
}
