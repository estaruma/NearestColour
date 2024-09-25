package org.example;

public class NearestColour {
    private static String[] predefinedColours = {"F00", "0F0", "00F"};

    public static String NearestColour(String inputHex) {
        Colour inputColour = new Colour(inputHex);
        double minDistance = Double.MAX_VALUE;
        String nearestColour = null;


        for (String colourHex : predefinedColours) {
            Colour predefinedColour = new Colour(colourHex);
            double distance = inputColour.distanceTo(predefinedColour);

            if(distance <minDistance) {
                minDistance = distance;
                nearestColour = colourHex;
            }
        }

        return nearestColour;
    }




}
