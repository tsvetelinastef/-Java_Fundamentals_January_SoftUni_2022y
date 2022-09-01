package MethodsExercises;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ex8_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());

      //  System.out.println(new DecimalFormat("0.####").format(getFactorialDivision(numberOne, numberTwo)/2));
      //  System.out.println(getFactorialDivision(numberOne,numberTwo)/2);
       System.out.printf("%.2f", getFactorialDivision(numberOne,numberTwo)/2);
    }

    private static double getFactorialDivision(int numberOne, int numberTwo) {

      //   double result ;

     //   for (int i = 1; i <= numberOne; i++) {
     //         numberTwo = numberTwo * numberOne;
     //       numberOne *= i;
     //   }

     //    result = (double) numberTwo / 2;

    //-----------------------------------------------------------

           return IntStream.iterate(numberOne, i -> i > 1, i -> i - 1).
            asLongStream().reduce(1, (a, b) -> a * b);

    }

}
