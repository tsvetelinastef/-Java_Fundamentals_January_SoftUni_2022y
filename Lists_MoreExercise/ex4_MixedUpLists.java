package Lists_MoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class ex4_MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // Започнете от началото на първия списък и края на втория.
       //• Добавете елемент от първия и елемент от втория.
       //• В крайна сметка винаги ще има списък, в който остават 2 елемента.
       // • Тези елементи ще бъдат обхватът на елементите, които трябва
       // да отпечатате.
       // • Прегледайте списъка с резултати и вземете само елементите,
       //които отговарят на условието.
       //• Отпечатайте елементите, подредени във възходящ ред и разделени
       // с интервал


        List<Integer> firstList = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> finalList = new ArrayList<>();

        while (!(firstList.isEmpty() || secondList.isEmpty())) {
            finalList.add(firstList.get(0)); // добавяме елемент от първия
            finalList.add(secondList.get(secondList.size() - 1)); // добавяме елемент от втория
            firstList.remove(0);
            secondList.remove(secondList.size() - 1);
        }
        int min;
        int max;
        if (!firstList.isEmpty()) {
            min = Math.min(firstList.get(firstList.size() - 1),
                    firstList.get(firstList.size() - 2));
            max = Math.max(firstList.get(firstList.size() - 1),
                    firstList.get(firstList.size() - 2));
        } else {
            min = Math.min(secondList.get(0), secondList.get(1));
            max = Math.max(secondList.get(0), secondList.get(1));
        }

        for (int i = 0; i < finalList.size(); i++) {
            if (finalList.get(i) >= max || finalList.get(i) <= min) {
                finalList.remove(i);
                i--;
            }
        }
        Collections.sort(finalList);
        System.out.println(finalList.toString().replaceAll("[\\[\\],]",
                "").replaceAll(", ", " "));
    }
}

//  list.add(0, yourObject);
//  if(list.size() > 10)
//      list.remove(list.size() - 1);
//  CircularFifoQueue queue = new CircularFifoQueue(10);

