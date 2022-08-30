package Arrays;

import java.util.Scanner;

public class ex4_ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lineOfNumbers = scanner.nextLine();

        String[] numbersAsStrings = lineOfNumbers.split(" ");

      /*

        int[] numbers = new int[numbersAsStrings.length];
        for (int i = 0; i < numbersAsStrings.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsStrings[i]);
        }

       */

        for (int i = 0; i < numbersAsStrings.length/2; i++) {
            int otherIndex = numbersAsStrings.length - 1 -i;
            String currentNumber = numbersAsStrings[i];
            numbersAsStrings[i] = numbersAsStrings[otherIndex];
            numbersAsStrings[otherIndex] = currentNumber;
        }

        for (int i = 0; i < numbersAsStrings.length; i++) {
            System.out.print(numbersAsStrings[i] + " ");
        }

    }
}


/*
  for (int i = numbers.length - 1; i >= 0 ; i--) {
            System.out.println(numbers[i]);
        }
 */


/*
 Scanner scanner = new Scanner(System.in);
        String lineOfNumbers = scanner.nextLine();

        String[] numbersAsStrings = lineOfNumbers.split("\\s+");

        int[] numbers = new int[numbersAsStrings.length];
        for (int i = 0; i < numbersAsStrings.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsStrings[i]);
        }

        for (int i = 0; i < numbers.length / 2; i++) {
            int otherIndex = numbers.length - 1 - i;
            int currentNumber = numbers[i];
            numbers[i] = numbers[otherIndex];
            numbers[otherIndex] = currentNumber;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }


           11 22 33 44 55
           55 44 33 22 11
 */

/*
 String line = scanner.nextLine();
        String[] numbersAsStrings = line.split("\\s+");

        String text = scanner.nextLine();
        String[] reversedText = text.split(" ");

        for (int index = 0; index < reversedText.length / 2; index++) {
            String temp = reversedText[index];
            reversedText[index] = reversedText[reversedText.length - index - 1];
            reversedText[reversedText.length - index - 1] = temp;
        }


        for (int index = 0; index < reversedText.length; index++)
        {
            System.out.println(text + " ");
        }
 */