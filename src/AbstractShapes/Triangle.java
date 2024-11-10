package AbstractShapes;

public class Triangle extends AbstractShape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    @Override
    public double CalculateArea() {
        return (base * height) / 2;
    }

}
