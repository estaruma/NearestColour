package estaru.kata.nearestcolour;

import java.util.ArrayList;
import java.util.List;

public class FindNearestColour {
    private static String[] predefinedColours = {"F00", "0F0", "00F"};

    // change to list to return more than one colour
    public static List<String> findNearestColour(String inputHex) {
        if (inputHex == null || !inputHex.matches("^[0-9A-Fa-f]{3}$")) {

            throw new IllegalArgumentException("invalid");
        }

        //tolerance
        final double THRESHOLD = 1.0;

        Colour inputColour = new Colour(inputHex);
        double minDistance = Double.MAX_VALUE;
        List<String> nearestColours = new ArrayList<>();


        for (String colourHex : predefinedColours) {
            Colour predefinedColour = new Colour(colourHex);
            double distance = inputColour.distanceTo(predefinedColour);

            if(distance <minDistance - THRESHOLD) {
                minDistance = distance;
                nearestColours.clear();
                nearestColours.add(colourHex);
            } else if (Math.abs(distance - minDistance) <= THRESHOLD){
                nearestColours.add(colourHex);
            }
        }

        return nearestColours;
    }



}
