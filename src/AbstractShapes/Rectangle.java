package AbstractShapes;

public class Rectangle extends AbstractShape{
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        super("Rectangle");
        this.height = height;
        this.width = width;
    }

    @Override
    public double CalculateArea() {
        return this.width * this.height;
    }
}
