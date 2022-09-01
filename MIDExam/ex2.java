package MIDExam;
// 100 of 100
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> travels = Arrays.stream(scanner.nextLine()
                .split("\\|+")).collect(Collectors.toList());

        int fuel = Integer.parseInt(scanner.nextLine());
        int ammunition = Integer.parseInt(scanner.nextLine());
        boolean stopProgram = false;
        boolean isArriveDestination = false;
        for (int i = 0; i < travels.size(); i++) {
            String[] route = travels.get(i).split(" ");
            switch (route[0]) {
                case "Travel":
                    int years = Integer.parseInt(route[1]);
                    if (fuel >= years) {
                        System.out.printf("The spaceship travelled %d light-years.%n", years);
                        fuel -=years;
                    } else {
                        stopProgram = true;
                    }
                    break;
                case "Enemy":
                    int enemyArmour = Integer.parseInt(route[1]);
                    if (ammunition >= enemyArmour) {
                        ammunition -= enemyArmour;
                        System.out.printf("An enemy with %d armour is defeated.%n", enemyArmour);
                    } else {
                        if (enemyArmour * 2 <= fuel) {
                            fuel -= enemyArmour * 2;
                            System.out.printf("An enemy with %d armour is outmaneuvered.%n", enemyArmour);
                            if (fuel<0){
                                stopProgram = true;
                            }
                        } else {
                            stopProgram = true;
                        }
                    }
                    break;
                case "Repair":
                    int addFuel = Integer.parseInt(route[1]);
                    int addAmmunition = Integer.parseInt(route[1]) * 2;
                    fuel += addFuel;
                    ammunition += addAmmunition;
                    System.out.printf("Ammunitions added: %d.%n", addAmmunition);
                    System.out.printf("Fuel added: %d.%n", addFuel);
                    break;
                case "Titan":
                    if (fuel > 0) {
                        System.out.printf("You have reached Titan, all passengers are safe.%n");
                        isArriveDestination = true;
                    } else {
                        stopProgram = true;
                    }
                    break;
            }
            if (stopProgram && !isArriveDestination) {
                System.out.printf("Mission failed.%n");
                break;
            }

        }
        //  System.out.printf("Fuel: %d",fuel);
    }
}
