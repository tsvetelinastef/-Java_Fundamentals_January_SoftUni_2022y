package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex6_CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstCards = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondCards = Arrays.
                stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        while (!(firstCards.isEmpty() || secondCards.isEmpty())) {
            if (firstCards.get(0) > secondCards.get(0)) {
                firstCards.add(firstCards.get(0));
                firstCards.add(secondCards.get(0));

            } else if (firstCards.get(0) < secondCards.get(0)) {
                secondCards.add(secondCards.get(0));
                secondCards.add(firstCards.get(0));
            }
            firstCards.remove(0);
            secondCards.remove(0);

        } if (!firstCards.isEmpty()) {
            System.out.println("First player wins! Sum: " + getSum(firstCards));
        } else {
            System.out.println("Second player wins! Sum: " + getSum(secondCards));
        }
    }

    private static int getSum(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;


    }
}

