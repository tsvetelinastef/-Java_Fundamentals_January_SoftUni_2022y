package MID_EXAMS_PREPARE.SecondPartsEx;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class ex2_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> values = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input;

        while (!"end".equals(input = scanner.nextLine())) {
            String[] command = input.split("\\s+");
            switch (command[0]) {
                case "swap":
                    int swapIndex1 = Integer.parseInt(command[1]);
                    int swapIndex2 = Integer.parseInt(command[2]);
                    Collections.swap(values, swapIndex1, swapIndex2);
                    break;
                case "multiply":
                    int firstIndex = Integer.parseInt(command[1]);
                    int secondIndex = Integer.parseInt(command[2]);
                    values.set(firstIndex, values.get(firstIndex) * values.get(secondIndex));
                    break;
                case "decrease":
                    IntStream.range(0, values.size()).forEach(i -> values.set(i, values.get(i) - 1));
                    break;
            }
        }
        System.out.print(Arrays.toString(new List[]{values}).replaceAll("[\\[\\]]", ""));



    }
}

    /*
            System.out.printf("swap %d %d", number, number);
            System.out.printf("multiply %d %d", number, number);
......................................................................................................



............................................................................................................
             int size = s.nextInt();
             int myArray[] = new int [size];
             int product = 1;
         System.out.println("Enter the elements of the array one by one ");
         for(int i=0; i<size; i++){
                myArray[i] = s.nextInt();
                product = product * myArray[i];
          }
      System.out.println("Elements of the array are: "+Arrays.toString(myArray));
      System.out.println("Sum of the elements of the array ::"+product);

================================================================================================================

        String command = scanner.nextLine();
        while (!command.equals("end")) {

            // System.out.printf("swap %d %d", );   "swap %d %d"

  int number = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case "swap":
                    int swapIndex1 = Integer.parseInt(command);
                    int swapIndex2 = Integer.parseInt(command);
                    //int swapIndex3 = Integer.parseInt(command);
                    int temp1 = values[swapIndex1];
                    int temp2 = values[swapIndex2];
                    // int temp3 = values[swapIndex3];
                    values[swapIndex1] = values[swapIndex2];
                    values[swapIndex2] = temp1;

                    break;
                case "multiply":
                    int firstIndex = Integer.parseInt(command);
                    int secondIndex = Integer.parseInt(command);
                    int product = 1;
                    values = new int[firstIndex];
                    // values = new int [secondIndex];
                    for (int i = 0; i < firstIndex; i++) {
                        values[i] = scanner.nextInt();
                        product = product * values[i];
                    }

                    break;
                case "decrease":

                    for (int i = 0; i < values.length; i++) {
                        for (int j = 0; j < values.length; j++) {

                            if (values[j] > values[i]) {
                                values[j]--;
                            }

                        }
                        break;
                    }
            }

            System.out.print(Arrays.toString(new List[]{Collections.singletonList(values)})
                    .replaceAll("[\\[\\]]", ""));

    */

