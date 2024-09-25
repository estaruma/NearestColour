package org.example;



public class Colour {

    private String hex;

    private int[] rgb;


    // constructor - converts to 6 digits
    public Colour (String hex3) {
        this.hex = convertToSixDigitHex(hex3);
        this.rgb = hexToRGB(this.hex);


    }

    // 3 digit to 6 digits for colour accuracy

    private String convertToSixDigitHex(String hex) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : hex.toCharArray()) {
            stringBuilder.append(ch).append(ch);
        }
        return stringBuilder.toString();
    }

    //6 digit to RGB array
    // red, green, blue
    // beginning index // end index
    private int[] hexToRGB(String hex) {
        String r = hex.substring(0,2);
        String g = hex.substring(2,4);
        String b = hex.substring(4,6);

        // parse colours to decimal
        // 16 symbols
        int red = Integer.parseInt(r,16);
        int green = Integer.parseInt(g,16);
        int blue = Integer.parseInt(b,16);

        // array to store RGB values
        int[] rgb = new int[3];
        rgb[0] = red;
        rgb[1] = green;
        rgb[2] = blue;

        return rgb;

    }

    public int[] getRGB() {
        return this.rgb;
    }

    // // euclidean distance between 2 colours

    public double distanceTo(Colour other) {
        int[] otherRGB = other.getRGB();
        return Math.sqrt(
                Math.pow(this.rgb[0] - otherRGB[0], 2) + Math.pow(this.rgb[1] - otherRGB[1], 2) + Math.pow(this.rgb[2] - otherRGB[2], 2)
        );
    }



}

