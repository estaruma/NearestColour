package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String input = "FF0";

        List<String> nearestColours = FindNearestColour.findNearestColour(input);

        System.out.println(input + nearestColours);
    }
}