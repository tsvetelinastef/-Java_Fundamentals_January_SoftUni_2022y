package Lists_MoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex2_CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        double leftTime = 0;
        double rightTime = 0;
        int right = numbers.size() - 1;

        // The number of elements of the array will always be odd
        for (int i = 0; i < numbers.size() / 2; i++) {
            if (numbers.get(i) != 0) {
                leftTime += numbers.get(i);
            } else { // . If you have a zero in the array,
                // you have to reduce the time of the racer
                // that reached it by 20% (from the time so far).
                leftTime *= 0.8;
            }

            // the rightTime
            if (numbers.get(right) != 0) {
                rightTime += numbers.get(right);
            } else { // numbers.get(right) == 0
                rightTime *= 0.8;
            }
            right--;
        }

        if (leftTime < rightTime) {
            System.out.printf("The winner is left with total time: %.1f", leftTime);
        } else {
            System.out.printf("The winner is right with total time: %.1f", rightTime);

        }



    }
}

