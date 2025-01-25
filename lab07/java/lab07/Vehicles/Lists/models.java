package lab07.Vehicles.Lists;

public enum models {
    PASSAT, A3, INSIGNIA, A4,A5,CEED,MEGANE,FOCUS,MONDEO,IBIZA,LEON,TOLEDO,POLO,SCIROCCO,CLIO,LAGUNA,SCENIC;

    public static String getRandomModel() {
        return String.valueOf(values()[(int) (Math.random() * values().length)]);
    }
}
