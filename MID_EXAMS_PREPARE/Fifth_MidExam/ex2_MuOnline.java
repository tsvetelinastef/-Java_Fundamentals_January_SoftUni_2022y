package MID_EXAMS_PREPARE.Fifth_MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex2_MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> rooms = Arrays.stream((scanner.nextLine()
                .split("\\|"))).collect(Collectors.toList());

        int health = 100; // initial health 100
        int bitcoins = 0;  // initial bitcoins 0.


        int count = 0;

        while (count <= rooms.size() - 1) {
            String[] command = rooms.get(count).split(" ");

            switch (command[0]) {
                case "potion":
                    // You are healed with the number in the second part.
                    // But your health cannot exceed your initial health (100).
                    int cure = Integer.parseInt(command[1]);
                    if ((health + cure) > 100) {
                        cure = 100 - health;
                    }
                    health += cure;
                    System.out.printf("You healed for %d hp.%n", cure);
                    System.out.printf("Current health: %d hp.%n", health);
                    break;
                case "chest":
                    // You've found some bitcoins, the number in the second part
                    bitcoins += Integer.parseInt(command[1]);
                    System.out.printf("You found %d bitcoins.%n",
                            Integer.parseInt(command[1]));
                    break;
                default:
                    // You should remove the monster's attack from your health.
                    health -= Integer.parseInt(command[1]);
                    if (health > 0) {
                        System.out.printf("You slayed %s.%n", command[0]);

                    } else {
                        System.out.printf("You died! Killed by %s.%n", command[0]);
                        System.out.printf("Best room: %d%n", count + 1);
                        return;
                    }
                    break;
            }
            count++;
        }

        System.out.printf("You've made it!%nBitcoins: %d%nHealth: %d%n",
                bitcoins, health);

    }
}



