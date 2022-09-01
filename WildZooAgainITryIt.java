import java.util.*;
import java.util.stream.Stream;

public class WildZooAgainITryIt {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       Map<String, Animal> resultsOne = new LinkedHashMap<>();

       String line = scanner.nextLine();

       while (!line.equals("EndDay")){
           String[] data = line.split(": ");
           String commandFirst = data[0];

           switch (commandFirst){
               case "Add":
                   String info = data[1];
                   String[] splits = info.split("-");
                   String name = splits[0];
                   int neededFood = Integer.parseInt(splits[1]);
                   String area = splits[2];
                   if (!resultsOne.containsKey(name)){
                       Animal animal = new Animal(name, neededFood, area);
                       resultsOne.put(name, animal);
                   } else {
                       Animal animal = resultsOne.get(name);
                       animal.setNeededFood(animal.getNeededFood() + neededFood);
                   }
                   break;

               case "Feed":
                   String info1 = data[1];
                   String[] splits1 = info1.split("-");
                   String name1 = splits1[0];
                   int food = Integer.parseInt(splits1[1]);
                   if (!resultsOne.containsKey(name1)){
                       line = scanner.nextLine();
                       continue;
                   } else {
                       Animal animal = resultsOne.get(name1);
                       animal.setNeededFood(animal.getNeededFood() - food);
                       if (animal.getNeededFood() <= 0){
                           resultsOne.remove(name1);
                           System.out.printf("%s was successfully fed%n", name1);
                       }
                   }
                   break;
           }

           line = scanner.nextLine();
       }

        System.out.println("Animals:");
       for(Map.Entry<String, Animal> entry : resultsOne.entrySet()){
           System.out.printf("%s -> %dg%n", entry.getKey(), entry.getValue().getNeededFood());
       }

        System.out.println("Areas with hungry animals:");
        Map<String, Integer> result1 = new LinkedHashMap<>();
        for (Map.Entry<String, Animal> entry : resultsOne.entrySet()){
            String area = entry.getValue().getArea();
            if (!result1.containsKey(area)){
                result1.put(area, 1);
            } else {
                result1.put(area, result1.get(area) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : result1.entrySet()){
            System.out.printf("%s:%d%n", entry.getKey(),entry.getValue());
        }
    }


    private static class Animal {
        String name;
        int neededFood;
        String area;

        public  Animal(String name,int neededFood,String area  ){
            this.name = name;
            this.neededFood = neededFood;
            this.area = area;
        }
        public String getName(){
            return  name;
        }


        public void setName(String name){
            this.name = name;
        }

        public  int getNeededFood(){
            return  neededFood;
        }

        public void getNeededFood(int neededFood){
            this.neededFood = neededFood;
        }

        public String getArea(){
            return  area;
        }

        public void  setArea(String area){
            this.area = area;
        }

        public void setNeededFood(int i) {

        }
    }

}
