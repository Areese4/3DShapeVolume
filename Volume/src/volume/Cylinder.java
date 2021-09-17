package volume;

public class Cylinder {
    public double Height;
    public double Radius;
    public double pi;
    public double V;
    
    public Cylinder(double radius, double height) {
        this.Radius = radius;
        this.Height = height;
        this.pi = Math.PI;
        this.V = (pi * (Radius * Radius) * Height);
    }

    public double Volume() {
        return V;
    }

    public double getHeight() {
        return Height;
    }
    public double getRadius() {
        return Radius;
    }

    @Override
    public String toString() {
        return "Volume of your Cylinder is: " + V; 
    }


}