package MethodsExercises;

import java.util.Scanner;

public class ex1_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        int numberThree = Integer.parseInt(scanner.nextLine());

        // System.out.println(getSmallestOfThreeNumbers(numberOne,numberTwo,numberThree));
        getSmallestOfThreeNumbers(numberOne, numberTwo, numberThree);
    }

    public static void getSmallestOfThreeNumbers(int numberOne, int numberTwo, int numberThree) {
        if (numberOne <= numberTwo && numberOne <= numberThree) { // numberOne >= numberTwo && numberOne >= numberThree
            System.out.println(numberOne); //  " is the largest Number"
        } else if (numberTwo <= numberOne && numberTwo <= numberThree) { // numberTwo>=numberOne && numberTwo>=numberThree
            System.out.println(numberTwo);  // is the largest Number"
        } else {
            System.out.println(numberThree); //  is the largest number"
        }
    }


}
