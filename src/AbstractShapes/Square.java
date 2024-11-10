package AbstractShapes;

public class Square extends AbstractShape {

    private double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    @Override
    public double CalculateArea() {
        return Math.pow(side, 2);
    }


}
