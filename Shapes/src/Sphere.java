public class Sphere extends Shape {

    private double radius;
    private double height;

    public Sphere(double radius) {  // Parameterized constructor
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surfaceArea(double radius, double height) {  // Override with actual radius value
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume(double radius, double height) {  // Override with actual radius value
        return ((double) 4 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere [radius=" + radius + ", surface area=" + surfaceArea(radius, height) +
                ", volume=" + volume(radius, height) + "]";
    }
}