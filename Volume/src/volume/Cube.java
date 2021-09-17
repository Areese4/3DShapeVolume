package volume;

public class Cube {
    
    public double Side;
    public double V;
    
    public Cube (double side) {
        this.Side = side;
        this.V = (side * side * side);
         
    }
    
    public double volume() {
        return V;
        
    }
    
    public double getSide() {
        return Side;
    }
    
    @Override
    public String toString() {
        return "Volume of your Cube is: " + V; 
    }

}

