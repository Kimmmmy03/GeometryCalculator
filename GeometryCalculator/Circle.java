/*
 * Circle.java
 * 
 * Authors: Akmal, Chan, Ammar, Zikri
 * Date Created: 02/02/2024
 * 
 * Description:
 * This class represents a Circle and provides functionality
 * to calculate its area based on a given radius.
 */

// Circle class definition
public class Circle {
    private double radius; // Radius of the circle

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter method to return the radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate and return the area of the circle
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2); // Area = πr²
    }
}
