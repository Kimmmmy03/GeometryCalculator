/*
 * GeometryCalculator.java
 * 
 * Authors: Akmal, Chan, Ammar, Zikri
 * Date Created: 02/02/2024
 * 
 * Description:
 * This program is a Geometry Calculator that allows users to calculate
 * the area of different shapes (circle, rectangle, triangle) and the
 * volume of various 3D objects (cylinder, sphere, cone, pyramid).
 */
// Importing the Scanner class to enable user input
import java.util.Scanner;

// Main class of the Geometry Calculator program
public class GeometryCalculator {

    // Main method: Entry point of the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        int choice; // Variable to store user's menu choice

        // Loop to repeatedly display the menu and handle user choices
        do {
            // Display the menu options to the user
            System.out.println("Geometry Calculator");
            System.out.println("1. Calculate the area of a circle");
            System.out.println("2. Calculate the area of a rectangle");
            System.out.println("3. Calculate the area of a triangle");
            System.out.println("4. Calculate the volume of a cylinder");
            System.out.println("5. Calculate the volume of a sphere");
            System.out.println("6. Calculate the volume of a cone");
            System.out.println("7. Calculate the volume of a pyramid");
            System.out.println("8. Exit");
            System.out.print("Enter your choice (1-8): ");
            choice = scanner.nextInt(); // Read user's choice

            // Call appropriate method based on user's input
            if (choice == 1) {
                calculateCircleArea(scanner);
            } else if (choice == 2) {
                calculateRectangleArea(scanner);
            } else if (choice == 3) {
                calculateTriangleArea(scanner);
            } else if (choice == 4) {
                calculateCylinderVolume(scanner);
            } else if (choice == 5) {
                calculateSphereVolume(scanner);
            } else if (choice == 6) {
                calculateConeVolume(scanner);
            } else if (choice == 7) {
                calculatePyramidVolume(scanner); 
            } else if (choice == 8) {
                System.out.println("Exiting...");
                break; // Exit the loop and program
            } else {
                // Handle invalid choices
                System.out.println("Invalid choice. Please enter a number between 1 and 8.");
            }
            System.out.println(); // Add space after each operation
        } while (true); // Loop continues indefinitely until user chooses to exit
    }

    // Method to calculate the area of circles
    private static void calculateCircleArea(Scanner scanner) {
        System.out.print("Enter the number of circles: ");
        int numCircles = scanner.nextInt(); // Read number of circles
        Circle[] circles = new Circle[numCircles]; // Array to store Circle objects

        // Collect radius input for each circle
        for (int i = 0; i < numCircles; i++) {
            System.out.print("Enter the radius of circle " + (i + 1) + ": ");
            double radius = scanner.nextDouble();
            circles[i] = new Circle(radius); // Create new Circle object
        }

        System.out.println("Calculating areas of circles...");
        // Calculate and display area for each circle
        for (int i = 0; i < numCircles; i++) {
            Circle circle = circles[i];
            double area = circle.calculateArea();
            System.out.printf("Area of circle %d is: %.2f\n", i+1, area);
        }
    }

    // Method to calculate the area of rectangles
    private static void calculateRectangleArea(Scanner scanner) {
        System.out.print("Enter the number of rectangles: ");
        int numRectangles = scanner.nextInt();
        Rectangle[] rectangles = new Rectangle[numRectangles];

        for (int i = 0; i < numRectangles; i++) {
            System.out.print("Enter the length of rectangle " + (i + 1) + ": ");
            double length = scanner.nextDouble();
            System.out.print("Enter the width of rectangle " + (i + 1) + ": ");
            double width = scanner.nextDouble();
            rectangles[i] = new Rectangle(length, width); // Create new Rectangle object
        }

        System.out.println("Calculating areas of rectangles...");
        for (int i = 0; i < numRectangles; i++) {
            Rectangle rectangle = rectangles[i];
            double area = rectangle.calculateArea();
            System.out.printf("Area of rectangle %d is: %.2f\n", i+1, area);
        }
    }

    // Method to calculate the area of triangles
    private static void calculateTriangleArea(Scanner scanner) {
        System.out.print("Enter the number of triangles: ");
        int numTriangles = scanner.nextInt();
        Triangle[] triangles = new Triangle[numTriangles];

        for (int i = 0; i < numTriangles; i++) {
            System.out.print("Enter the base length of triangle " + (i + 1) + ": ");
            double base = scanner.nextDouble();
            System.out.print("Enter the height of triangle " + (i + 1) + ": ");
            double height = scanner.nextDouble();
            triangles[i] = new Triangle(base, height); // Create new Triangle object
        }

        System.out.println("Calculating areas of triangles...");
        for (int i = 0; i < numTriangles; i++) {
            Triangle triangle = triangles[i];
            double area = triangle.calculateArea();
            System.out.printf("Area of triangle %d is: %.2f\n", i+1, area);
        }
    }

    // Method to calculate the volume of cylinders
    private static void calculateCylinderVolume(Scanner scanner) {
        System.out.print("Enter the number of cylinders: ");
        int numCylinders = scanner.nextInt();
        Cylinder[] cylinders = new Cylinder[numCylinders];

        for (int i = 0; i < numCylinders; i++) {
            System.out.print("Enter the radius of cylinder " + (i + 1) + ": ");
            double radius = scanner.nextDouble();
            System.out.print("Enter the height of cylinder " + (i + 1) + ": ");
            double height = scanner.nextDouble();
            cylinders[i] = new Cylinder(radius, height); // Create new Cylinder object
        }

        System.out.println("Calculating volumes of cylinders...");
        for (int i = 0; i < numCylinders; i++) {
            Cylinder cylinder = cylinders[i];
            double volume = cylinder.calculateVolume();
            System.out.printf("Volume of cylinder %d is: %.2f\n", i+1, volume);
        }
    }

    // Method to calculate the volume of spheres
    private static void calculateSphereVolume(Scanner scanner) {
        System.out.print("Enter the number of spheres: ");
        int numSpheres = scanner.nextInt();
        Sphere[] spheres = new Sphere[numSpheres];

        for (int i = 0; i < numSpheres; i++) {
            System.out.print("Enter the radius of sphere " + (i + 1) + ": ");
            double radius = scanner.nextDouble();
            spheres[i] = new Sphere(radius); // Create new Sphere object
        }

        System.out.println("Calculating volumes of spheres...");
        for (int i = 0; i < numSpheres; i++) {
            Sphere sphere = spheres[i];
            double volume = sphere.calculateVolume();
            System.out.printf("Volume of sphere %d is: %.2f\n", i+1, volume);
        }
    }

    // Method to calculate the volume of cones
    private static void calculateConeVolume(Scanner scanner) {
        System.out.print("Enter the number of cones: ");
        int numCones = scanner.nextInt();
        Cone[] cones = new Cone[numCones];

        for (int i = 0; i < numCones; i++) {
            System.out.print("Enter the radius of cone " + (i + 1) + ": ");
            double radius = scanner.nextDouble();
            System.out.print("Enter the height of cone " + (i + 1) + ": ");
            double height = scanner.nextDouble();
            cones[i] = new Cone(radius, height); // Create new Cone object
        }

        System.out.println("Calculating volumes of cones...");
        for (int i = 0; i < numCones; i++) {
            Cone cone = cones[i];
            double volume = cone.calculateVolume();
            System.out.printf("Volume of cone %d is: %.2f\n", i+1, volume);
        }
    }

    // Method to calculate the volume of pyramids
    private static void calculatePyramidVolume(Scanner scanner) {
        System.out.print("Enter the number of pyramids: ");
        int numPyramids = scanner.nextInt();
        Pyramid[] pyramids = new Pyramid[numPyramids];

        for (int i = 0; i < numPyramids; i++) {
            System.out.print("Enter the base area of pyramid " + (i + 1) + ": ");
            double baseArea = scanner.nextDouble();
            System.out.print("Enter the height of pyramid " + (i + 1) + ": ");
            double height = scanner.nextDouble();
            pyramids[i] = new Pyramid(baseArea, height); // Create new Pyramid object
        }

        System.out.println("Calculating volumes of pyramids...");
        for (int i = 0; i < numPyramids; i++) {
            Pyramid pyramid = pyramids[i];
            double volume = pyramid.calculateVolume();
            System.out.printf("Volume of pyramid %d is: %.2f\n", i+1, volume);
        }
    }
}
