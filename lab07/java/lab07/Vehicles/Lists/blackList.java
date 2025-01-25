package lab07.Vehicles.Lists;

public enum blackList {
    DZLMG01, DZLMG02, DZLMG03;

    public static boolean isOnBlackList(String plate)
    {
        for(blackList blackList : blackList.values()) {
            if(blackList.name().equals(plate)) {
                return true;
            }
        }
        return false;
    }
}
