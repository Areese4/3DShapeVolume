
package volume;

public class Prism {
   public double Height;
   public double Width;
   public double Length;
   public double V;
   
   public Prism( double height, double width, double length) {
       this.Height = height;
       this.Width = width;
       this.Length = length;
       this.V = (height * width * length);
   }
   
    public double Volume() {
        return V;
    }
    
    public double getHeight() {
        return Height;
    }
    
    public double getWidth() {
        return Width;
    }
    
    public double getLength() {
        return Length;
    }
    
    @Override
    public String toString() {
        return "Volume of your Retangular Prism is: " + V; 
    }
}

