// Cylinder.java (Corrected Class)
public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {  // Parameterized constructor
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surfaceArea(double radius, double height) {
        return 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return "Cylinder [radius=" + radius + ", height=" + height +
                ", surface area=" + surfaceArea(radius, height) +
                ", volume=" + volume(radius, height) + "]";
    }
}
