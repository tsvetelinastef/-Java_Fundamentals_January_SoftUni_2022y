package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class ex3_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfThePeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

       // int divide = numberOfThePeople/capacity;
        int courses = (int) Math.ceil((double) numberOfThePeople/ capacity);

        System.out.println(courses);

    }
}
