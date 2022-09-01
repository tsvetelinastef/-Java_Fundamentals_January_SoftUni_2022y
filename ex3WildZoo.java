import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ex3WildZoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      //  System.out.println("Animals");
      //  for (Map.Entry<String, Animal >) {
            
       // }

    }
}

/*
String line = scanner.nextLine();

        Map<String, Animal> animals = new LinkedHashMap<>();
        while (!line.equals("EndDay")) {
            String[] splitLine = line.split("\\s+");
            String command = splitLine[0];
            String[] splitPartTwo = splitLine[1].split("-");
            String name = splitPartTwo[0];
            int quantity = Integer.parseInt(splitPartTwo[1]);
            String areal = splitPartTwo[2];
            Animal animal = new Animal(name,quantity, areal);

            switch (command){
                case "Add:":

                    if(animals.containsKey(name)) {
                        animals.get(name).setFoodQuantity(animals.get(name).getFoodQuantity() + quantity);
                    } else {
                        animals.put(name, new Animal(name, quantity, areal));
                    }
                    break;
                case "Feed:":
                    if(animals.containsKey(name)) {
                        animals.get(name).setFoodQuantity(animals.get(name).getFoodQuantity() - quantity);
                    }if(quantity <= 0) {
                    System.out.printf("%s was successfully fed", name);
                    animals.remove(name);
                }
                    break;
            }

            line = scanner.nextLine();
        }

        animals.forEach((k,v) -> System.out.printf("%s -> %.2f%n", k, v.getFoodQuantity() * v.getFoodQuantity()));
    }
    static class Animal{
        String name;
        int foodQuantity;
        String areal;

        public Animal(String name, int foodQuantity, String areal) {
            this.foodQuantity = foodQuantity;
            this.areal = areal;
        }
        public String getName() {
            return name;
        }
        public int getFoodQuantity() {
            return foodQuantity;
        }
        public String getAreal() {
            return areal;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setFoodQuantity(int foodQuantity) {
            this.foodQuantity = foodQuantity;
        }
        public void setFoodQuantity(String areal) {
            this.areal = areal;
        }


 */

// https://pastebin.com/F8WhUY1r  -- това е моят код , но хвърля exception - и
// казаха ми да си  направя нов мап отдолу с ключ ареа която вземаш от entry get value get area
 //       екстрактваш си я като стринг и слагаш в новия мап ключ тая area и value бройката  правиш проверка ако не се съдържа слагаш в мапа ако се съдържа увеличаваш бройката с едно

 // --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*
 Scanner scanner = new Scanner(System.in);

        String commandOne = scanner.nextLine();

        Map<String, Animal> animalsHunger = new LinkedHashMap<>();
        Map<String, List<String>> areasWithDogs = new LinkedHashMap<>();
        int dogCounter = 0;

        while (!commandOne.equals("EndDay")) {
            String[] thisInput = commandOne.split(": ");
            String[] animalInfo = thisInput[1].split("-");
            switch (thisInput[0]) {
                case "Add":
                    int counter = 0;
                    String areaOne = animalInfo[2];
                    String name = animalInfo[0];
                    if (animalsHunger.containsKey(name)) {
                        int additionalFood = Integer.parseInt(animalInfo[1]);
                        animalsHunger.get(name).setNeededFood(additionalFood + animalsHunger.get(name).getNeededFood());
                        if (areasWithDogs.containsKey(areaOne) && !((areasWithDogs.get(areaOne).contains(name)))) {
                            areasWithDogs.get(areaOne).add(name);
                        } else if (!areasWithDogs.containsKey(areaOne)) {
                            areasWithDogs.putIfAbsent(areaOne, areasWithDogs.get(areaOne));
                            areasWithDogs.get(areaOne).add(name);
                        }

                    } else {
                        animalsHunger.putIfAbsent(name, new Animal(Integer.parseInt(animalInfo[1]), animalInfo[2]));
                        areasWithDogs.putIfAbsent(areaOne, new ArrayList<>());
                        areasWithDogs.get(animalInfo[2]).add(name);
                    }

                    break;
                case "Feed":
                    name = animalInfo[0];
                    if (animalsHunger.containsKey(name)) {
                        int eatenFood = Integer.parseInt(animalInfo[1]);
                        animalsHunger.get(name).setNeededFood(animalsHunger.get(name).getNeededFood() - eatenFood);
                        if (animalsHunger.get(name).getNeededFood() <= 0) {
                            areaOne = animalsHunger.get(name).getArea();
                            animalsHunger.remove(name);
                            if(animalsHunger.containsKey(name)){
                                if (areasWithDogs.get(areaOne).contains(name)) {
                                    areasWithDogs.get(areaOne).remove(name);
                                    if (areasWithDogs.get(name).size() == 0) {
                                        areasWithDogs.remove(areaOne);
                                    }
                                }
                            }else {
                                areasWithDogs.get(areaOne).remove(name);

                            }
                            System.out.println(name + " was successfully fed");
                        }
                    }
                    break;
            }
            commandOne = scanner.nextLine();
        }
        System.out.println("Animals:");

        printAMap(animalsHunger);
        System.out.println("Areas with hungry animals:");
        printStringMap(areasWithDogs);
    }

    static class Animal {
        int neededFood;
        String area;

        public Animal() {
        }

        public Animal(int neededFood, String area) {
            this.neededFood = neededFood;
            this.area = area;
        }

        public int getNeededFood() {
            return neededFood;
        }

        public void setNeededFood(int neededFood) {
            this.neededFood = neededFood;
        }

        public String getArea() {
            return area;
        }
    }

    static void printAMap(Map<String, Animal> animals) {
        for (Map.Entry<String, Animal> entry : animals.entrySet()) {
            System.out.println(" " + entry.getKey() + " -> " + entry.getValue().getNeededFood() + "g");
        }
    }

    static void printStringMap(Map<String, List<String>> area) {
        for (Map.Entry<String, List<String>> entry : area.entrySet()) {
            System.out.println(" " + entry.getKey() + ": " + entry.getValue().size());
        }
 */