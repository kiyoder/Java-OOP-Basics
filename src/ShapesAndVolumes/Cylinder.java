package ShapesAndVolumes;

public class Cylinder implements Shape {

    private double radius;
    private double height;
    private static final double PI = Math.PI;

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getSurfaceArea(){
        return 2 * PI * radius * height + 2 * PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume(){
        return PI * Math.pow(radius, 2) * height;
    }

}
