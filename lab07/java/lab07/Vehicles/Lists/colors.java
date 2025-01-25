package lab07.Vehicles.Lists;

import java.awt.*;

public enum colors {
    RED , BLUE, GREEN;

    public static Color getRandomColor() {
        return getColorByName(values()[(int) (Math.random() * values().length)].name());
    }

    public static Color getColorByName(String colorName) {
        switch (colorName) {
            case "RED": return Color.RED;
            case "BLUE": return Color.BLUE;
            case "GREEN": return Color.GREEN;
            default: return Color.WHITE;
        }

    }
    public static String getNameByColor(Color color) {
        if (color.equals(Color.RED)) {
            return "RED";
        } else if (color.equals(Color.BLUE)) {
            return "BLUE";
        } else if (color.equals(Color.GREEN)) {
            return "GREEN";
        }
        else if (color.equals(Color.WHITE)) {
            return "WHITE";
        }
        return "UNKNOWN";
        }
    }
