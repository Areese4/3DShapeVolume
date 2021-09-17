package volume;
import java.util.*;

public class Volume {

    public static void main(String[] args) {
        
        Scanner choose = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        
        boolean finished = false;
        
        while (!finished) {
            
        
        System.out.println("What shape do you want to find the volume of? ");
        
        System.out.println("1) Cylinder ");
        System.out.println("2) Cone ");
        System.out.println("3) Rectangular Prism  ");
        System.out.println("4) Pyramid ");
        System.out.println("5) Cube ");
        System.out.println("6) Quit ");
        
        System.out.println();
        System.out.print("You're choosing option: ");
            
        
            int choice = choose.nextInt();
            
            switch(choice) {
                case 1:
                    System.out.println("CYLINDER! \n");
                    System.out.println("Enter Radius: ");
                    System.out.println("Enter Height: ");

                    Cylinder a = new Cylinder(in.nextDouble(), in.nextDouble() );
                    System.out.println(a.toString());
                    break;
                case 2:
                    System.out.println("CONE! \n");
                    System.out.print("Enter Radius: ");
                    System.out.println("Enter Height: ");
                    
                    Cone b = new Cone(in.nextDouble(), in.nextDouble() );
                    System.out.println(b.toString());
                    break;
                    
                case 3:
                    System.out.println("RECTANGULAR PRISM! \n");
                    System.out.println("Enter Height:");
                    System.out.println("Enter Width:");
                    System.out.println("Enter Length:");
                    
                    Prism c = new Prism(in.nextDouble(), in.nextDouble(), in.nextDouble() );
                    System.out.println(c.toString());
                    break;
                
                case 4:
                    System.out.println("PYRAMID! \n");
                    System.out.println("Enter Height:");
                    System.out.println("Enter Width:");
                    System.out.println("Enter Length:");
                    
                    Prism d = new Prism(in.nextDouble(), in.nextDouble(), in.nextDouble() );
                    System.out.println(d.toString());
                    break;
                
                case 5:
                    System.out.println("CUBE! \n");
                    System.out.println("Enter the side size:");
                    
                    Cube e = new Cube(in.nextDouble() );
                    System.out.println(e.toString() );
                    break;
                
                case 6:
                    System.out.println("Ending Program!");
                    finished = true;
                    break;
                    
                default:
                System.out.println("Choose a given option. ");
                    
            }
        
        }
    }
        
    
}
    

