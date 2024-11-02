package ShapesAndVolumes;

public class Cone implements Shape {

    private double radius;
    private double height;
    private static final double PI = Math.PI;

    public Cone(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getSurfaceArea(){
        return PI * radius * (radius + Math.sqrt(Math.pow(height,2) + Math.pow(radius,2)));
    }

    @Override
    public double getVolume(){
        return (PI * Math.pow(radius,2) * height)/3;
    }

}