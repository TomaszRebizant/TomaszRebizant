package lab07.Vehicles.Lists;

public enum workersWithSubsciption {
    SMITH, JOHNSON, WILLIAMS, BROWN, JONES;

    public static boolean isWorker(String name)
    {
        for(workersWithSubsciption worker : workersWithSubsciption.values()) {
            if(worker.name().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
