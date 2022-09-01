package ListsLAB;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex4_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true){
            String line = scanner.nextLine();

            if (line.equals("end")){
                break;
            }

            String[] tokens = line.split(" ");

            switch (tokens[0]) {
                case "Add":
                    int numberToAdd = Integer.parseInt(tokens[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(tokens[1]);
                    numbers.remove(numberToRemove);
                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(tokens[1]);
                    numbers.remove(indexToRemove);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(tokens[1]);
                    int indexToInsert = Integer.parseInt(tokens[2]);
                    numbers.add(indexToInsert, numberToInsert);
                    break;

            }
            System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));

        }


    }
}
