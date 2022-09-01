package ObjectAndClasses_Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ex3_OpinionPoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> result = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split(" ");

            if (Integer.parseInt(tokens[1]) > 30){
                result.add(tokens[0] + " - " + tokens[1]);
            }
        }
       // Collections.sort(result);
        for (String r : result) {
            System.out.println(r);

        }
        }
}

/*
 // 30 years ===> Person... String name; .... int age;
        // alphabetical order ===> Person... String name; .... int age;

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            Person person = new Person(data[0], Integer.parseInt(data[1]));
            people.add(person);
        }

        people.stream().
                sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .filter(person -> person.age > 30)
                .forEach(p -> System.out.println(p.toString()));
    }

    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("%s - %d", this.name, this.age);
        }
    }
 */
