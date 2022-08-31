package Lists_MoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex5_DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double savings = Double.parseDouble(scanner.nextLine());
        List<Integer> drumSet = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> finalList = new ArrayList<>(drumSet); // saveDrumSet


        String command;  //= scanner.nextLine();
        while (!"Hit it again, Gabsy!".equals(command = scanner.nextLine())) {
            int hitPower = Integer.parseInt(command);
            for (int i = 0; i < drumSet.size(); i++) {
                drumSet.set(i, drumSet.get(i) - hitPower); // decrease

 // When a certain drum reaches 0 quality, it breaks. Then Gabsy should buy
 // a replacement. She needs to buy the same model. Therefore, its
 // quality will be the same as the initial quality of the broken drum.
 // The price is calculated by the formula: {initialQuality} * 3.
 // Gabsy will always replace her broken drums until the moment she can
 // no longer afford them

                if (drumSet.get(i) <= 0) {
                    if (!((savings - (finalList.get(i) * 3.0)) < 0)) {
                        drumSet.set(i, finalList.get(i));
                        savings -= finalList.get(i) * 3;
                    } else { // . If she doesn't have enough
  // money for a replacement, the broken drum is removed from the drum set
                        drumSet.remove(i);
                        finalList.remove(i);
                        i--;
                    }
                }
            }
        }
        System.out.println(drumSet.toString().
                replaceAll("[\\[\\],]", "")
                .replaceAll(", ", " "));
        System.out.printf("Gabsy has %.2flv.", savings);



    }
}

