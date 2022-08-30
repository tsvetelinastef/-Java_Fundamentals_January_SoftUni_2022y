package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class ex2_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        //  int numberOne = 0;
        int digit;
        int sum = 0;

        while (number > 0) {
      //finds the last digit of the given number
            digit = number % 10;
      //adds last digit to the variable sum
            sum = sum + digit;
      //removes the last digit from the number
            number = number / 10;
        }
      //prints the result
        System.out.println(sum);

    }
}
