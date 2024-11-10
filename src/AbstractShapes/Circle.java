package AbstractShapes;

public class Circle extends AbstractShape {

    private double radius;

    public Circle(double radius){
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double CalculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
