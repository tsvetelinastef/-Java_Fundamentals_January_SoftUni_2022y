package Lists_MoreExercise;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ex1_Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String text = scanner.nextLine();
        List<Character> textList = IntStream.range(0, text.length())
                .mapToObj(text::charAt).collect(Collectors.toList());

        StringBuilder output = new StringBuilder();

        for (int num : numbers) {
            int index = 0;
            while (num > 0) {
                index += num % 10;
                num /= 10;
            }
            if (!(index < textList.size() - 1)) {
                index = (index % textList.size());
            }
            output.append(textList.get(index));
            textList.remove(index);
        }
        System.out.println(output);
    }

}

// System.out.println(mergedList.toString().replaceAll("[\\[\\],]", "")
//         .replaceAll(", ", " "));

