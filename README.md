Nearest color
Introduction
A color is composed by an amount of red, green and blue.

This program takes a 3-digit hexadecimal colour code as input and finds nearest from a predefined set of basic colours by calculating the distance between the input colour using the Euclidean distance formula for RBG values. 

Features: 
1. Converts 3 digit colour codes to 6 digit equivalent 
2. Finds closest colour based on distance 
3. Provides support for invalid input

Predefined Colours:
F00 for red
0F0 for green
0FF for blue

Predefined colours can be changed in the predefinedColours array

Classes: 
Colour - handles colour conversion and distance calculations 
FindNearestColour - contains logic to find the nearest colours from the predefined set 
Main - main method for interactive use 
FindNearestColourTest - Junit test cases 