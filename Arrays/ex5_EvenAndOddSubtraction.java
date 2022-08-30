package Arrays;

import java.util.Scanner;

public class ex5_EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] numbersAsStrings = line.split("\\s+");


       int evenSum = 0;
       int oddSum = 0;

      //  int[] sums = new int[2];
        for (String s : numbersAsStrings) {
            int number = Integer.parseInt(s);
          //  sums[number % 2] += number;


            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
           }
        }


        System.out.println(evenSum - oddSum);
       // System.out.println(sums[0] - sums[1]);

    }
}

/*

        int[] numbers = new int[numbersAsStrings.length];
        for (int i = 0; i < numbersAsStrings.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsStrings);
        }

        for (int i = 0; i < numbers.length/2; i++) {
            int otherIndex = numbers.length -1 -i;
            int currentNumber = numbers[i];
            numbers[i] = numbers[otherIndex];
            numbers[otherIndex] = currentNumber;
        }
 */