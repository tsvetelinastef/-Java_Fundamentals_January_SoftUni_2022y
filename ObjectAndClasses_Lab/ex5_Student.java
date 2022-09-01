package ObjectAndClasses_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex5_Student {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        String input;

        while (!"end".equals(input = scanner.nextLine())) {
            String[] data = input.split(" ");

            Student useData = new Student(data[0], data[1],
                    Integer.parseInt(data[2]), data[3]);
            students.add(useData);
        }

        String townName = scanner.nextLine();
        for (Student student : students) {
            if (townName.equals(student.getHometown())) {
                System.out.printf("%s %s is %d years old%n",
                        student.getFirstName(), student.getLastName(),
                        student.getAge());
            }
        }
    }


    static class Student {
        String firstName;
        String lastName;
        int age;
        String hometown;


        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getHometown() {
            return hometown;
        }




        public Student(String firstName, String lastName, int age,
                       String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }
    }
}






