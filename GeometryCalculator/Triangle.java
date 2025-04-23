/*
 * Triangle.java
 * 
 * Authors: Akmal, Chan, Ammar, Zikri
 * Date Created: 02/02/2024
 * 
 * Description:
 * This class represents a Triangle with a base and height.
 * It provides a method to calculate the area of the triangle.
 */

// Triangle class to store base and height, and compute area
public class Triangle {

    // Private instance variables to store base and height
    private double base;
    private double height;

    // Constructor to initialize base and height of the triangle
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Getter method to retrieve the base of the triangle
    public double getBase() {
        return base;
    }

    // Getter method to retrieve the height of the triangle
    public double getHeight() {
        return height;
    }

    // Method to calculate and return the area of the triangle
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
