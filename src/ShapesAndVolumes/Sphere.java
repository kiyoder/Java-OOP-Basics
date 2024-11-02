package ShapesAndVolumes;
public class Sphere implements Shape {

    private double radius;
    private static final double PI = Math.PI;

    public Sphere(double radius){
        this.radius = radius;
    }

    @Override
    public double getSurfaceArea(){
        return 4 * PI * Math.pow(radius,2);
    }

    @Override
    public double getVolume(){
        return (4 * PI * Math.pow(radius,3))/3;
    }

}
