package Arrays_MoreExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ex4_LongestIncreasingSubsequenceLIS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //                         0  1   2  3   4   5  6  7   8   9   10
        int[] numbers = new int[]{3, 14, 5, 12, 15, 7, 8, 9, 11, 10, 1};
        //                         1   2  2   3   1  1  1  1   6   6   1
        //                        -1   0  0   2  -1 -1 -1 -1  -1  -1  -1

        int[] lisLengths = new int[numbers.length];
        int[] lisPrev = new int[numbers.length];
        for (int i = 0; i < lisLengths.length; i++) {
            lisLengths[i] = 1;
            lisPrev[i] = -1;
        }

        for (int currentIndex = 1; currentIndex < numbers.length; currentIndex++) {
            for (int prevIndex = 0; prevIndex < currentIndex; prevIndex++) {
                if (numbers[prevIndex] < numbers[currentIndex]) {
                    int candidateLength = lisLengths[prevIndex] + 1;
                    if (candidateLength > lisLengths[currentIndex]) {
                        lisLengths[currentIndex] = candidateLength;
                        lisPrev[currentIndex] = prevIndex;
                    }
                }
            }
        }

        for (int lisLength: lisLengths) {
            System.out.print(lisLength + " ");
        }
        System.out.println();

       int maxLength = 0;
       int maxLengthIndex = -1;
        for (int i = 0; i < lisLengths.length; i++) {
            if (lisLengths[i] > maxLength){
                maxLength = lisLengths[i];
                maxLengthIndex = i;
            }
        }

        System.out.println(maxLength);

        int index = maxLengthIndex;

        ArrayList<Integer> lis = new ArrayList<Integer>();
        // int[] lis = new int[maxLength];
        // int pos = 0;
        while (index != -1) {
            lis.add(numbers[index]);
            // lis[pos] = numbers[index];
            // pos++;
            System.out.println(index);
            index = lisPrev[index];
        }

    }
}

/*
  for (int currentIndex = 1; currentIndex < numbers.length; currentIndex++) {
            for (int prevIndex = 0; prevIndex < currentIndex; prevIndex++) {
                if (numbers[prevIndex] < numbers[currentIndex]) {
                    int candidateLength = lisLengths[prevIndex] + 1;
                    if (candidateLength > lisLengths[currentIndex]) {
                        lisLengths[currentIndex] = candidateLength;
                    }
                }
            }
        }
 */