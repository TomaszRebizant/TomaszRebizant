import lab08.Collection2;
import lab08.Vehicle;

import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Vehicle[] cars = new Vehicle[25];
    for (int i = 0; i < 25; i++) {
      cars[i] = new Vehicle();
    }
    Collection2<Vehicle> carCollection = new Collection2<>(cars);
    List<String> rejectedModels = Arrays.asList("BMW", "Audi");
    carCollection.reject(car -> rejectedModels.contains(car.getModel()))
            .sort((car1, car2) -> Integer.parseInt(car2.getMileage()) - Integer.parseInt(car1.getMileage()))
            .map(car -> car.getVin())
            .limit(5).print();
    Player[] players = new Player[25];
    for (int i = 0; i < 25; i++) {
      players[i] = new Player("Player" + i);
    }
    Collection2<Player> playerCollection = new Collection2<>(players);
    playerCollection.filter(player -> player.isAlive()).print();
  }

}
