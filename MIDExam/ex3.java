package MIDExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        List<Integer> priceRatings = Arrays.stream(scanner.nextLine()
                .split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());

         */


        int[] priceRatings = nextIntArray(scanner, ", ");

        int entryPoint = Integer.parseInt(scanner.nextLine());
        String typeOfItems = scanner.nextLine();
        int sum = 0;
        int sum1 = 0;


        switch (typeOfItems) {
            case "cheap":
                for (int i = entryPoint ; i < priceRatings.length; i++) {
                    if (priceRatings[entryPoint] > priceRatings[i]) {
                        sum += priceRatings[i];
                    }
                }

                for (int i = 0; i < priceRatings[entryPoint]; i++) {
                    if (priceRatings[entryPoint] > priceRatings[i]) {
                        sum1 += priceRatings[i];
                    }

                    // if(sum>sum1){
                    //                        System.out.printf("Right - %d",sum);
                    //                    }else {
                    //                        System.out.printf("Left - %d",sum1);
                    //                    }


                }
                if (sum > sum1) {
                    System.out.printf("Right - %d", sum);
                } else {
                    System.out.printf("Left - %d", sum1);
                }


                break;
            case "expensive":
                for (int i = entryPoint + 1; i < priceRatings.length; i++) {
                    if (priceRatings[entryPoint] <= priceRatings[i]) {
                        sum += priceRatings[i];
                    }
                }
                for (int i = 0; i < priceRatings[entryPoint]; i++) {
                    if (priceRatings[entryPoint] <= priceRatings[i]) {
                        sum1 += priceRatings[i];
                    }

                    //  if(sum>sum1){
                    //                    System.out.printf("Right - %d",sum);
                    //                }else {
                    //                    System.out.printf("Left - %d",sum1);
                    //                }


                }

                if (sum > sum1) {
                    System.out.printf("Right - %d", sum);
                } else {
                    System.out.printf("Left - %d", sum1);
                }
                break;


        }

    }

    private static int[] nextIntArray(Scanner scanner, String separator) {
        String[] intAsStrings = scanner.nextLine().split(separator);
        int[] array = new int[intAsStrings.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(intAsStrings[i]);
        }
        return array;
    }
}
