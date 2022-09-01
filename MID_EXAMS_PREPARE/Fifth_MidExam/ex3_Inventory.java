package MID_EXAMS_PREPARE.Fifth_MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ex3_Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> itemsList = Arrays.stream((scanner.nextLine().
                split(",+"))).collect(Collectors.toList());


        IntStream.range(0, itemsList.size())
                .forEach(i -> itemsList.set(i, itemsList.get(i).trim()));
        String input;

        // until receiving "Craft!" you will be receiving different
        // commands split by " - ":
        while (!"Craft!".equals(input = scanner.nextLine())) {
            String[] command = input.split(" - ");

            switch (command[0]) {
                case "Collect":
                    // add the given item to your inventory.
                    //If the item already exists, you should skip this line
                    if (!itemsList.contains(command[1])) {
                        itemsList.add(command[1]);
                    }
                    break;
                case "Drop":
                    // remove the item from your inventory if it exists.
                    itemsList.remove(command[1]);
                    break;
                case "Combine Items":
                 // check if the old item exists. If so, add the
                 //new item after the old one. Otherwise, ignore the command
                    String[] oldNewItem = command[1].split(":");
                    if (itemsList.contains(oldNewItem[0])) {
                        itemsList.add(((itemsList.
                                indexOf(oldNewItem[0])) + 1), oldNewItem[1]);
                    }
                    break;
                case "Renew":
                    // if the given item exists, you should change
                    // its position and put it last in your inventory.
                    if (itemsList.contains(command[1])) {
                        itemsList.add(itemsList.
                                get(itemsList.indexOf(command[1])));
                        itemsList.remove(command[1]);
                    }
                    break;
            }
        }
        System.out.println(String.join(", ", itemsList));


    }
}

