package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ex6_EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scanner.nextLine().split(" "))
                // за да имаме поточната линия - stream
                // .mapToInt(Integer::parseInt)
                // .toArray(); // toArray -  към масив
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        String[] secondInput = scanner.nextLine().split(" ");
        int[] secondArray = new int[secondInput.length];
        for (int i = 0; i < secondInput.length; i++) {
            secondArray[i] = Integer.parseInt(secondInput[i]);

        }

        int sum = 0;
        boolean areIdentical = true;

        for (int i = 0; i < secondArray.length; i++) {
            sum += firstArray[i]; // добавяме някое от числата в сумата
            if (firstArray[i] != secondArray[i]) { // сравняваме техните елем
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                areIdentical = false;
                break;
            }
        }

        if (areIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }


    }
}

