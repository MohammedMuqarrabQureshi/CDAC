import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a shape to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Triangle");

        System.out.print("Enter the number corresponding to your choice: ");
        int choice = scanner.nextInt();

        double area = 0; // Variable to store the calculated area

        // Switch case to calculate area based on selected shape
        switch (choice) {
            case 1: // Circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                area = Math.PI * radius * radius; // Area of Circle = πr²
                System.out.printf("The area of the circle is: %.2f\n", area);
                break;

            case 2: // Square
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                area = side * side; // Area of Square = side²
                System.out.printf("The area of the square is: %.2f\n", area);
                break;

            case 3: // Rectangle
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                area = length * width; // Area of Rectangle = length × width
                System.out.printf("The area of the rectangle is: %.2f\n", area);
                break;

            case 4: // Triangle
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                area = 0.5 * base * height; // Area of Triangle = ½ × base × height
                System.out.printf("The area of the triangle is: %.2f\n", area);
                break;

            default:
                System.out.println("Invalid choice. Please select a valid shape.");
                break;
        }

        scanner.close();
    }
}
