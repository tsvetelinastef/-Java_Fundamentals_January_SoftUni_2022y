package MethodsExercises;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ex8_FactorialDivision_Again {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

           int num1 = Integer.parseInt(scanner.nextLine());
           int num2 = Integer.parseInt(scanner.nextLine());

           System.out.printf("%.2f", (double) factorial(num1) / factorial(num2));
      }

    private static long factorial(int num) {
           return IntStream.iterate(num, i -> i > 1, i -> i - 1).
                   asLongStream().reduce(1, (a, b) -> a * b);
    }

}
