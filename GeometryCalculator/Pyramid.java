/*
 * Pyramid.java
 * 
 * Authors: Akmal, Chan, Ammar, Zikri
 * Date Created: 02/02/2024
 * 
 * Description:
 * This class represents a Pyramid and provides functionality
 * to calculate its volume using base area and height.
 */

// Pyramid class definition
public class Pyramid {
    private double baseArea; // Area of the pyramid's base
    private double height;   // Height from base to apex

    // Constructor to initialize base area and height
    public Pyramid(double baseArea, double height) {
        this.baseArea = baseArea;
        this.height = height;
    }

    // Getter method to return the base area
    public double getBaseArea() {
        return baseArea;
    }

    // Getter method to return the height
    public double getHeight() {
        return height;
    }

    // Method to calculate and return the volume of the pyramid
    public double calculateVolume() {
        return (1.0 / 3.0) * baseArea * height; // Volume = (1/3) * base area * height
    }
}
