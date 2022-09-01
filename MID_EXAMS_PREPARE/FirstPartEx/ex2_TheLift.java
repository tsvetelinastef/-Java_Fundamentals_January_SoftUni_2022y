package MID_EXAMS_PREPARE.FirstPartEx;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ex2_TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleWaiting = Integer.parseInt(scanner.nextLine());
        int[] lift = Arrays.stream(scanner.nextLine()
              .split("\\s+")).mapToInt(Integer::parseInt).toArray();
       // String currentStateOfTheLift = scanner.nextLine();
        //  .split("\\s+"))

        for (int i = 0; i < lift.length; i++) {
            if ((lift[i] < 4)) {
                if (peopleWaiting >= 4 - lift[i]) {
                    peopleWaiting -= 4 - lift[i];
                    lift[i] = 4;
                } else {
                    lift[i] += peopleWaiting;
                    peopleWaiting = 0;
                }
            }
        }
        boolean full = IntStream.range(0, lift.length)
                .noneMatch(i -> lift[i] != 4);

        if (peopleWaiting == 0 && !full) {
            System.out.println("The lift has empty spots!");

        } else if (peopleWaiting > 0 && full) {
            System.out.printf("There isn't enough space! %d people in" +
                    " a queue!%n", peopleWaiting);
        }
        System.out.print(Arrays.toString(lift).replaceAll("[\\[\\]]",
                "").replaceAll(", ", " "));
    }

}

/*
List<Integer> people = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
...........................................................................
    List<Integer> numbers = Arrays.stream(scanner.nextLine()
    .split("\\s+")) .map(Integer::parseInt).collect(Collectors.toList());

    String text = scanner.nextLine();
    List<Character> textList = IntStream.range(0, text.length())
                    .mapToObj(text::charAt).collect(Collectors.toList());

    StringBuilder output = new StringBuilder();
.........................................................................
int people = Integer.parseInt(scan.nextLine());
        int[] lift = Arrays.stream(scan.nextLine()
        .split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < lift.length; i++) {
            if ((lift[i] < 4)) {
                if (people >= 4 - lift[i]) {
                    people -= 4 - lift[i];
                    lift[i] = 4;
                } else {
                    lift[i] += people;
                    people = 0;
                }
            }
        }
        boolean full = IntStream.range(0, lift.length).
        noneMatch(i -> lift[i] != 4);
        if (people == 0 && !full) {
            System.out.println("The lift has empty spots!");
        } else if (people > 0 && full) {
            System.out.printf("There isn't enough space! %d people in
             a queue!%n", people);
        }
        System.out.print(Arrays.toString(lift).
        replaceAll("[\\[\\]]", "").replaceAll(", ", " "));
    }
 */