package AssociativeArraysExercise;

import java.util.*;

public class ex6_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<String>> coursePerson = new LinkedHashMap<>();
        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] tokens = line.split(" : ");
            if (!coursePerson.containsKey(tokens[0])) {
               // coursePerson.put(tokens[0], new ArrayList<>());
                coursePerson.put(tokens[0], new ArrayList<>());
               // coursePerson.get(tokens[0]).add(tokens[1]);
                coursePerson.get(tokens[0]).add(tokens[1]);
            } else {
                coursePerson.get(tokens[0]).add(tokens[1]);
                //Collections.sort(coursePerson.get(tokens[0]));
            }
            line = scanner.nextLine();
        }
        coursePerson.entrySet().stream()//sorted((left, right) -> Integer.compare(right.getValue().size(), left.getValue().size()))
                .forEach(entry -> {
                    System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
                    for (int i = 0; i < entry.getValue().size(); i++) {
                        System.out.println("-- " + entry.getValue().get(i));
                    }
                });

    }
}

/*
   String input = scanner.nextLine();
        // име на курс -> списък с имената на студенти
        Map<String, List<String>>  courses = new HashMap<>();
        while(!input.equals("end")){
            // име на курс - име на ученик
            String courseName = input.split(" : ")[0];
            String personName = input.split(" : ")[1];
            // проверка имаам ли такъв курс
            // ако нямам такъв курс
            if(!courses.containsKey(courseName)){
                courses.put(courseName, new ArrayList<>());

            }

            // ако курсът е нов - връща празен списък
            // ако е стар - връща моментния списък с хора
            courses.get(courseName).add(personName);


            input = scanner.nextLine();

==================================================================================================================
   Map<String, List<String>> course = new LinkedHashMap<>();
        String command = scanner.nextLine();
        while(!command.equalsIgnoreCase("end")){

            String [] splitCommand = command.split(" : ");
            String courseName = splitCommand[0];
            String user = splitCommand[1];

            if (!course.containsKey(courseName)){
                course.put(courseName,new ArrayList<>());
                course.get(courseName).add(user);
            }else {
                if (!course.get(courseName).contains(user)){
                    course.get(courseName).add(user);
                }
            }
            command = scanner.nextLine();
        }

        course.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(e -> {
                    System.out.printf("%s: %d%n", e.getKey(), e.getValue().size());
                    e.getValue().stream().sorted(String::compareTo).forEach(p -> System.out.printf("-- %s%n",p));
                });

 ======================================================================================================================
course.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(e -> {
                    System.out.printf("%s: %d%n", e.getKey(), e.getValue().size());
                    e.getValue().stream().forEach(p -> System.out.printf("-- %s%n",p));
                });



=======================================================================================================================
 Map<String, List<String>> course = new TreeMap<>();
        String command = scanner.nextLine();
        while(!command.equalsIgnoreCase("end")){

            String [] splitCommand = command.split(" : ");
            String courseName = splitCommand[0];
            String user = splitCommand[1];

            if (!course.containsKey(courseName)){
                course.put(courseName,new ArrayList<>());
                course.get(courseName).add(user);
            }else {
                if (!course.get(courseName).contains(user)){
                    course.get(courseName).add(user);
                }
            }
            command = scanner.nextLine();
        }


        course.entrySet().stream().sorted((f,s) ->
                s.getValue().size()-f.getValue().size()
        ).//forEach(entry->System.out.println(entry.getKey()+":"+entry.getValue().size()));
        forEach(entry -> {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
            entry.getValue().stream().sorted(String::compareTo).
                    forEach(e -> System.out.printf("-- %s%n", e));
        });

=======================================================================================================================
 Map<String, List<String>> register = new LinkedHashMap<>();
        String input;

        while (!"end".equals(input = scanner.nextLine())) {
            String[] command = input.split(" : ");
            register.putIfAbsent(command[0], new ArrayList<>());
            register.get(command[0]).add(command[1]);
        }
        register.entrySet().stream()
                .sorted((list1, list2) -> Integer.compare(list2.getValue().size(),
                        list1.getValue().size()))
                .forEach(entry -> {
                    System.out.printf("%s: %d%n", entry.getKey(),
                            entry.getValue().size());
                    entry.getValue().stream().sorted(String::compareTo)
                            .forEach(element -> System.out.printf("-- %s%n", element));
                });
 */

