/*
 * Cylinder.java
 * 
 * Authors: Akmal, Chan, Ammar, Zikri
 * Date Created: 02/02/2024
 * 
 * Description:
 * This class represents a Cylinder and provides functionality
 * to calculate its volume using radius and height.
 */

// Cylinder class definition
public class Cylinder {
    private double radius; // Radius of the cylinder's base
    private double height; // Height of the cylinder

    // Constructor to initialize the radius and height
    public Cylinder(double radius, double height) {
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

    // Method to calculate and return the volume of the cylinder
    public double calculateVolume() {
        return Math.PI * radius * radius * height; // Volume = πr²h
    }
}
