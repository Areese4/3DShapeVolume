package volume;

public class Cone {
    public double Height;
    public double Radius;
    public double pi;
    public double V;
    
    public Cone(double radius, double height) {
    
        this.Radius = radius;
        this.Height = height;
        this.pi = Math.PI;
        this.V = (pi * (radius * radius) * (height/3) );
            
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
        return "Volume of your Cone is: " + V; 
    }
}