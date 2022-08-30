package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class ex3_ElevatorByLector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil(n / p);

        System.out.printf("%.0f", courses);
    }
}
