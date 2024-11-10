package AbstractShapes;

public abstract class AbstractShape {

    protected String name;

    public AbstractShape(String name) {
        this.name = name;
    }

    public abstract double CalculateArea();

    public void displayInfo(){
        System.out.println("Shape: " + this.name);
        System.out.printf("Area: %.2f", CalculateArea());
    }
}
