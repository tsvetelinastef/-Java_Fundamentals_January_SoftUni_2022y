package Arrays_Exercise;

import java.util.Scanner;

public class ex5_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");

        for (int i = 0; i < array.length; i++) {

            boolean isItBigger = true;

            for (int j = i + 1; j < array.length; j++) {
    //  i + 1 leaves i's current value unchanged.
    //++i increments i, i.e. i's value is one greater after evaluating that expression.

                if (Integer.parseInt(array[i]) <= Integer.parseInt(array[j])) {

                    isItBigger = false;

                }
            }

            if (isItBigger) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
