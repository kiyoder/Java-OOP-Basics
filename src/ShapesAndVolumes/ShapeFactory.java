package ShapesAndVolumes;

import java.util.Scanner;

public class ShapeFactory {

    public Shape ceateShape(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose a shape (1 for Cylinder, 2 for Sphere, 3 for Cone): ");
        int choice = sc.nextInt();

        double radius = 0;
        double height = 0;

        switch(choice){
            case 1:
                System.out.print("Enter the radius of the Cylinder: ");
                radius = sc.nextDouble();
                System.out.print("Enter the height of the Cylinder: ");
                height = sc.nextDouble();
                return new Cylinder(radius, height);
            case 2:
                System.out.print("Enter the radius of the Sphere: ");
                radius = sc.nextDouble();
                return new Sphere(radius);
            case 3:
                System.out.print("Enter the radius of the Cone: ");
                radius = sc.nextDouble();
                System.out.print("Enter the height of the Cone: ");
                height = sc.nextDouble();
                return new Cone(radius, height);

            default:
                System.out.println("Invalid choice.");
                return null;
        }
    }

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.ceateShape();

        if(shape!= null){
            System.out.printf("Surface Area: %.2f%n",shape.getSurfaceArea());
            System.out.printf("Volume: %.2f%n",shape.getVolume());
        }
    }
}
