package estaru.kata.nearestcolour;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a 3 digit hex code: ");
        String input = scanner.nextLine();

        List<String> nearestColours = FindNearestColour.findNearestColour(input);

        System.out.println(input + nearestColours);
    }
}