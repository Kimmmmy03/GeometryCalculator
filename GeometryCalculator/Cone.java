/*
 * Cone.java
 * 
 * Authors: Akmal, Chan, Ammar, Zikri
 * Date Created: 02/02/2024
 * 
 * Description:
 * This class represents a Cone and provides functionality
 * to calculate its volume using radius and height.
 */

// Cone class definition
public class Cone {
    private double radius; // Radius of the cone's base
    private double height; // Height of the cone

    // Constructor to initialize the radius and height
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Getter method to return the radius
    public double getRadius() {
        return radius;
    }

    // Getter method to return the height
    public double getHeight() {
        return height;
    }

    // Method to calculate and return the volume of the cone
    public double calculateVolume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height; // Volume = (1/3)πr²h
    }
}
