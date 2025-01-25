package lab07.Vehicles.Logic;

import lab07.Vehicles.Lists.*;
import lab07.Vehicles.Obj.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class queueGenerator {
    Random rand = new Random();
    int limit = 0;
    Map<String, Integer> probabilities = new HashMap<>();
    HashMap<Integer, Vehicle> vehicles = new HashMap<>();
    ArrayList<ParkingEntry> parkingEntries = new ArrayList<>();

    public queueGenerator(int number) {
        this.limit = number;
        probabilities.put("Car", (int)(Math.random()*10));
        probabilities.put("Ambulance", (int)(Math.random()*2));
        probabilities.put("Bike",(int)(Math.random()*10));
        probabilities.put("Dog",(int)(Math.random()*3));
        probabilities.put("Motorcycle", (int)(Math.random()*10));
        probabilities.put("Pedestrian", (int)(Math.random()*4));
        probabilities.put("Scooter", (int)(Math.random()*4));
        probabilities.put("Truck", (int)(Math.random()*4));
        probabilities.put("Tank", (int)(Math.random()*1));

        int probSum = probabilities.values().stream().mapToInt(Integer::intValue).sum();

        for (int i = 0; i < limit; i++) {
            int random = rand.nextInt(probSum);
            int cumulativeProbability = 0;

            for (Map.Entry<String, Integer> entry : probabilities.entrySet()) {
                cumulativeProbability += entry.getValue();
                if (random < cumulativeProbability) {
                    generateVehicle(entry.getKey());
                    break;
                }
            }
        }
    }

    private void generateVehicle(String vehicleType) {
        switch (vehicleType) {
            case "Car":
                int isColored = rand.nextInt(2);
                Random randCar = new Random();
                switch(randCar.nextInt(2)){
                    case 0:
                        if(isColored == 0) {
                            Car car1 = new Car(plates.getRandomPlate(), models.getRandomModel());
                            parkingEntries.add(car1);
                        } else {
                            Car car2 = new Car(plates.getRandomPlate(), models.getRandomModel(), colors.getRandomColor());
                            parkingEntries.add(car2);
                        }
                        break;
                    case 1:
                        if(isColored == 0) {
                            Car car3 = new Car(plates.getRandomPlate(), models.getRandomModel(), surnames.getRandomSurname());
                            parkingEntries.add(car3);
                        } else {
                            Car car4 = new Car(plates.getRandomPlate(), models.getRandomModel(), surnames.getRandomSurname(),colors.getRandomColor() );
                            parkingEntries.add(car4);
                        }
                        break;
                }
                break;
            case "Ambulance":
                Ambulance ambulance = new Ambulance(plates.getRandomPlate());
                parkingEntries.add(ambulance);
                break;
            case "Bike":
                Random randBike = new Random();
                switch (randBike.nextInt(2)) {
                    case 0:
                        Bike bike1 = new Bike();
                        parkingEntries.add(bike1);
                        break;
                    case 1:
                        Bike bike2 = new Bike(surnames.getRandomSurname());
                        parkingEntries.add(bike2);
                        break;
                }
                break;
            case "Dog":
                Dog dog = new Dog();
                parkingEntries.add(dog);
                break;
            case "Motorcycle":
               Random randMotorcycle = new Random();
               switch(randMotorcycle.nextInt(2)) {
                        case 0:
                            Motorcycle motorcycle1 = new Motorcycle(plates.getRandomPlate());
                            parkingEntries.add(motorcycle1);
                            break;
                        case 1:
                            Motorcycle motorcycle2 = new Motorcycle(plates.getRandomPlate(), surnames.getRandomSurname());
                            parkingEntries.add(motorcycle2);
                            break;
                    }
                break;
            case "Pedestrian":
                Random randPedestrian  = new Random();
                switch(randPedestrian.nextInt(2)) {
                    case 0:
                        Pedestrian pedestrian1 = new Pedestrian();
                        parkingEntries.add(pedestrian1);
                        break;
                    case 1:
                        Pedestrian pedestrian2 = new Pedestrian(surnames.getRandomSurname());
                        parkingEntries.add(pedestrian2);
                        break;
                }
                break;
            case "Scooter":
                Random randSccoter = new Random();
                switch(randSccoter.nextInt(2)) {
                    case 0:
                        Scooter scooter1 = new Scooter();
                        parkingEntries.add(scooter1);
                        break;
                    case 1:
                        Scooter scooter2 = new Scooter(surnames.getRandomSurname());
                        parkingEntries.add(scooter2);
                        break;
                }
                break;
            case "Truck":
                Truck truck = new Truck(plates.getRandomPlate(), companyNames.getRandomCompanyName());
                parkingEntries.add(truck);
                break;
            case "Tank":
                Tank tank = new Tank(plates.getRandomPlate());
                parkingEntries.add(tank);
                break;
        }
    }

    public ArrayList<ParkingEntry> getParkingEntries() {
        return parkingEntries;
    }
}