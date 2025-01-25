import lab06.ParkingLot;
import lab06.ParkingEntry.Bike;
import lab06.ParkingEntry.Car;
import lab06.ParkingEntry.ParkingEntry;
import lab06.ParkingEntry.Truck;

public class Main {
  public static void main(String[] args) {
	ParkingEntry[] vehicles = {
		new Bike(),
		new Car(),
		new Truck(),
		new Car(),
	};

	ParkingLot parkingLot = new ParkingLot();

	for(ParkingEntry vehicle : vehicles) {
		parkingLot.letIn(vehicle);
	}
  }
}
