package estaru.kata.nearestcolour;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindNearestColourTest {

    // red
    @Test
    public void findNearestColourF45Test() {
        String input = "F42";
        List<String> expected = List.of("F00");

        List<String> actual = FindNearestColour.findNearestColour(input);

        assertEquals(expected, actual);
    }

    // blue
    @Test
    public void findNearestColourFF0Test() {
        String input = "FF0";
        List<String> expected = List.of("F00", "0F0");

        List<String> actual = FindNearestColour.findNearestColour(input);

        assertEquals(expected, actual);
    }

    //green

    @Test
    public void findNearestColour0F0Test() {
        String input = "0F0";
        List<String> expected = List.of("0F0");

        List<String> actual = FindNearestColour.findNearestColour(input);

        assertEquals(expected, actual);

    }

    @Test
    public void invalidInputTest() {
        String input = "XYZ";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            FindNearestColour.findNearestColour(input);

        });

        assertEquals("invalid", exception.getMessage());
    }

    @Test
    public void mixedColoursTest() {
        String input = "f42";
        List<String> expected = List.of("F00");

        List<String> actual = FindNearestColour.findNearestColour(input);

        assertEquals(expected, actual);

    }

    // close to red
    @Test
    public void closeTwoColoursTest() {
        String input = "FA0";
        List<String> expected = List.of("F00");

        List<String> actual = FindNearestColour.findNearestColour(input);

        assertEquals(expected, actual);

    }



}