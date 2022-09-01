package MethodsExercises;

import java.util.Scanner;

public class ex5_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        int numberThree = Integer.parseInt(scanner.nextLine());

        System.out.println(sumAndSubtract(numberOne,numberTwo,numberThree));
    }

    private static int sumAndSubtract(int numberOne, int numberTwo, int numberThree){
        int result ;
        result = (numberOne + numberTwo) - numberThree;


        return result;
    }
}
