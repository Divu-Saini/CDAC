import java.util.Scanner;

public class ShapeArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the shape (Circle, Square, Rectangle, Triangle): ");
        String shape = scanner.next().toLowerCase(); 

        double area;

        switch (shape) {
            case "circle":
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                area = 3.14 * radius * radius;
                break;
            case "square":
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                area = side * side;
                break;
            case "rectangle":
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                area = length * width;
                break;
            case "triangle":
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                area = 0.5 * base * height;
                break;
            default:
                System.out.println("Invalid shape");
                scanner.close();
                return; 
        }

        System.out.println("The area of the " + shape + " is: " + area);

        scanner.close();
    }
}
