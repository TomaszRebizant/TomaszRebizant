import lab07.Vehicles.Logic.parkingManager;

public class Main {
  public static void main(String[] args) {
      parkingManager parkingManager = new parkingManager();
      parkingManager.openParking();
        parkingManager.printQueue2();
      System.out.println("\nSummary: ");
        parkingManager.getSummary();
  }
}

