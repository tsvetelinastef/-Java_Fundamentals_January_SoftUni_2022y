package MID_EXAMS_PREPARE.SecondPartsEx;

import java.util.*;
import java.util.stream.Collectors;

public class ex3_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //single line holding space-separated integers.
        List<Integer> input = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        //print the top 5 numbers greater than the average
        //value in the sequence, sorted in descending order
        List<Integer> averageNumbers = input.stream()
                .filter(e -> e > input.stream()
                .mapToDouble(Integer::doubleValue)
                .average().orElse(0.0))
                .sorted(Comparator.reverseOrder()) // in descending order
                .limit(5) // less than 5 numbers
                .collect(Collectors.toList());

        if (averageNumbers.isEmpty()) {
            System.out.println("No");
        } else {
            System.out.print(Arrays.toString(new List[]{averageNumbers})
                    .replaceAll("[\\[\\]]", "")
                    .replaceAll(", ", " "));
        }
    }

}

/*
 .............................................................................
    if (array.size() == 1) {
            array.remove(0);
        } */
/*else {
            double average = (double) (array.stream().reduce(0, Integer::sum)) / array.size();
            array.removeIf((Integer i) -> (i <= average));
            Collections.sort(array);
            Collections.reverse(array);
            if (array.size() > 5) {
                array.subList(5, array.size()).clear();
            }
        }
...........................................................................
Mine
 List<Integer> values = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        float sum = 0;
        //compute sum
        int i = 0;
        while (i < values.size()) {
            sum += values.get(i);
            i++;
        }

        //compute average
        float average = (sum / values.size());
        System.out.printf("%.0f", average);


        if ( sum > average){
            Integer array[] = values.toArray(new Integer[0]);
            Arrays.sort(array, Collections.reverseOrder());


            System.out.println(Arrays.toString(array));
        }
       // Integer array[] = values.toArray(new Integer[0]);
       // Arrays.sort(array, Collections.reverseOrder());

       // System.out.println(Arrays.toString(array));
 */