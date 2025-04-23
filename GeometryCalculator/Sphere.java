/*
 * Sphere.java
 * 
 * Authors: Akmal, Chan, Ammar, Zikri
 * Date Created: 02/02/2024
 * 
 * Description:
 * This class represents a Sphere and provides functionality
 * to calculate its volume using the radius.
 */

// Sphere class definition
public class Sphere {
    private double radius; // Radius of the sphere

    // Constructor to initialize the radius
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Getter method to return the radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate and return the volume of the sphere
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); // Volume = 4/3 × π × r³
    }
}
