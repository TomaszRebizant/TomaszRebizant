package lab07.Vehicles.Lists;

public enum workers {
    SMITH, JOHNSON, WILLIAMS, BROWN, JONES, GARCIA, MILLER, REBIZANT, KOWALSKI;

    public static boolean isWorker(String name)
    {
        for(workers worker : workers.values()) {
            if(worker.name().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
