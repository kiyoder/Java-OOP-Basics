package AbstractShapes;

import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.print("\nChoose Shape (1. Circle, 2. Square, 3. Rectangle, 4. Triangle, 0. Exit): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius of Circle: ");
                    double circleRadius = sc.nextDouble();
                    Circle circle = new Circle(circleRadius);
                    circle.displayInfo();
                    break;
                case 2:
                    System.out.print("Enter side of Square: ");
                    double side = sc.nextDouble();
                    Square square = new Square(side);
                    square.displayInfo();
                    break;
                case 3:
                    System.out.print("Enter length of Rectangle: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter width of Rectangle: ");
                    double width = sc.nextDouble();
                    Rectangle rectangle = new Rectangle(length, width);
                    rectangle.displayInfo();
                    break;
                case 4:
                    System.out.print("Enter length of Triangle: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter height of Triangle: ");
                    double height = sc.nextDouble();
                    Triangle triangle = new Triangle(base, height);
                    triangle.displayInfo();
                    break;
            }

        }while(choice!=0);

        sc.close();
    }
}
