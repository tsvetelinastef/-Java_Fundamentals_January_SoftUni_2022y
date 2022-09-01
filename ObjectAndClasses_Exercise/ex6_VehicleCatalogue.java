package ObjectAndClasses_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class ex6_VehicleCatalogue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicleList = new ArrayList<>();

        String line = scanner.nextLine();

        while (!line.equals("End")) {
            String[] data = line.split("\\s+");

            Vehicle vehicle = new Vehicle(data[0], data[1], data[2], Integer.parseInt(data[3]));
            vehicleList.add(vehicle);

            line = scanner.nextLine();
        }

        line = scanner.nextLine();
        while (!line.equals("Close the Catalogue")) {
            String model = line;

            vehicleList.stream()
                    .filter(vehicle -> vehicle.getModel().equals(model))
                    .forEach(vehicle -> System.out.println(vehicle.toString()));

            line = scanner.nextLine();
        }

        List<Vehicle> car = vehicleList.stream()
                .filter(vehicle -> vehicle.getType().equals("car"))
                .collect(Collectors.toList());
        //vehicleList.stream().filter(vehicle -> vehicle.getType().equals("car"))
        //.mapToDouble()

        List<Vehicle> trucks = vehicleList.stream()
                .filter(vehicle -> vehicle.getType().equals("truck"))
                .collect(Collectors.toList());

        //  car.stream().mapToDouble(Vehicle::getHorsePower).sum();
        //  double sumCarsHp = car.stream().mapToDouble(Vehicle::getHorsePower).sum();
        //  double carsAvgHp = sumCarsHp / car.size();

        // double trucksAvgHp = sumTrucks / trucks.size();

      //  double carsAvgHp = car.stream().mapToDouble(Vehicle::getHorsePower).sum() / car.size();
        double carsAvgHp = avgHp(car);
        double trucksAvgHp = avgHp(trucks);
       // double trucksAvgHp = trucks.stream().mapToDouble(Vehicle::getHorsePower).sum() / trucks.size();


        System.out.printf("Cars have average horsepower of: %.2f.%n", carsAvgHp);
        System.out.printf("Trucks have average horsepower of: %.2f.", trucksAvgHp);
    }

    static double avgHp(List<Vehicle> vehicles) {
        if (vehicles.size() == 0) {
            return 0;
        }

        return vehicles.stream().mapToDouble(Vehicle::getHorsePower).sum() / vehicles.size();
    }


    static class Vehicle {
        // {typeOfVehicle} {model} {color} {horsepower}
        String type;
        String model;
        String colour;
        int horsePower;

        public Vehicle(String type, String model, String colour, int horsePower) {
            this.type = type;
            this.model = model;
            this.colour = colour;
            this.horsePower = horsePower;
        }

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        public String getColour() {
            return colour;
        }

        public int getHorsePower() {
            return horsePower;
        }

        @Override
        public String toString() {
            return String.format("Type: %s%n" +
                            "Model: %s%n" +
                            "Colour: %s%n" +
                            "Horsepower: %d", getType().toUpperCase().charAt(0) + getType().substring(1),
                    this.model, this.colour, this.horsePower);
        }
    }

}
