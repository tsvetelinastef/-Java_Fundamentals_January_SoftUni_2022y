package MID_EXAMS_PREPARE.FourthPartEx_MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex2_ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> shoppingList = Arrays.stream((scanner.nextLine()
                .split("!+"))).collect(Collectors.toList());

        String input ;

        while (!"Go Shopping!".equals(input = scanner.nextLine())) {
            String[] command = input.split(" ");

          switch (command[0]) {
              case "Urgent":
                  if (!shoppingList.contains(command[1])) {
                      shoppingList.add(0, command[1]);
                  }
                  break;
              case "Unnecessary":
                  shoppingList.remove(command[1]);
                  break;
              case "Correct":
                  if (shoppingList.contains(command[1])) {
                      shoppingList
                         .set(shoppingList.indexOf(command[1]), command[2]);
                  }
                  break;
              case "Rearrange":
                  if (shoppingList.contains(command[1])) {
                      shoppingList.remove(command[1]);
                      shoppingList.add(command[1]);
                  }
                  break;
          }
        }
        System.out.println(shoppingList.toString().
                replaceAll("[\\[\\]]", ""));
    }
}


