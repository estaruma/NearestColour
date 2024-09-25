package org.example;

import java.util.ArrayList;
import java.util.List;

public class FindNearestColour {
    private static String[] predefinedColours = {"F00", "0F0", "00F", "FF0"};

    // change to list to return more than one colour
    public static List<String> findNearestColour(String inputHex) {
        Colour inputColour = new Colour(inputHex);
        double minDistance = Double.MAX_VALUE;
        List<String> nearestColours = new ArrayList<>();


        for (String colourHex : predefinedColours) {
            Colour predefinedColour = new Colour(colourHex);
            double distance = inputColour.distanceTo(predefinedColour);

            if(distance <minDistance) {
                minDistance = distance;
                nearestColours.clear();
                nearestColours.add(colourHex);
            } else if (distance == minDistance) {
                nearestColours.add(colourHex);
            }
        }

        return nearestColours;
    }



}
