/*
 * Rectangle.java
 * 
 * Authors: Akmal, Chan, Ammar, Zikri
 * Date Created: 02/02/2024
 * 
 * Description:
 * This class represents a Rectangle and provides functionality
 * to calculate its area using length and width.
 */

// Rectangle class definition
public class Rectangle {
    private double length; // Length of the rectangle
    private double width;  // Width of the rectangle

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter method to return the length
    public double getLength() {
        return length;
    }

    // Getter method to return the width
    public double getWidth() {
        return width;
    }

    // Method to calculate and return the area of the rectangle
    public double calculateArea() {
        return length * width; // Area = length × width
    }
}
