package MID_EXAMS_PREPARE.FourthPartEx_MidExamPrep;

import java.util.Scanner;

public class test_shoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




    }
}

 /*
         • "Urgent {item}" - add the item at the start of the list.
                     If the item already exists, skip this command.
         • "Unnecessary {item}" - remove the item with the given name,
               only if it exists in the list. Otherwise, skip this command.
         • "Correct {oldItem} {newItem}" - if the item with the given old
                    name exists, change its name with the new
                    one. Otherwise, skip this command.
         • "Rearrange {item}" - if the grocery exists in the list, remove
                    it from its current position and add it at
                    the end of the list. Otherwise, skip this command.

.........................................................................

 List<String> elements = Arrays.stream((scanner.nextLine()
                .split("!"))).collect(Collectors.toList());


            String command = scanner.nextLine();
            if (!command.equals("Go Shopping!")){
            // add the item at the start of the list
            // If the item already exists, skip this command.
                command.equals("Urgent item");


            // remove the item with the given name, only if it
            // exists in the list. Otherwise, skip this command.
                command.equals("Unnecessary item");


            // - if the item with the given old name exists, change
            // its name with the new one. Otherwise, skip this command
                command.equals("Correct , oldItem , newItem");

            // if the grocery exists in the list, remove it from its
            // current position and add it at the end of the list.
            // Otherwise, skip this command.
            command.equals("Rearrange , item");

        }

        // There won't be any duplicate items in the initial list


       // Print the list with all the groceries, joined by ", ":
       //"{firstGrocery}, {secondGrocery}, … {nthGrocery}"

........................................................................
      List<String> elements = Arrays.stream((scanner.nextLine()
               .split("\\s+"))).collect(Collectors.toList());

      List<Integer> shoppingList = Arrays.stream(scanner.nextLine()
                .split("!"))
                .map(Integer::parseInt).collect(Collectors.toList());

      int[] lift = Arrays.stream(scanner.nextLine()
              .split("\\s+")).mapToInt(Integer::parseInt).toArray();
.......................................................................

 */

