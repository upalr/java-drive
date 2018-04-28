

/**
 * TestResizableCircle is for testing the geometric object circle
 *
 * @author Upal Roy
 * @version 1.0.0
 */
public class TestResizableCircle
{
    public static void main(String[] args){
        //instance object - to referance a ResizableCircle.
        ResizableCircle rc1 = new ResizableCircle(4.0);
        
        System.out.println();
        System.out.println("The Area of the circle (when radius of the circle one is 4.0): ");
        System.out.println(rc1.getArea());
        
        System.out.println("Increased the percent of radious by 20%.");
        
        rc1.resize(20);
        
        System.out.println("The Area of the circle: (After increasing the percent of radious by 20%): ");
        System.out.println(rc1.getArea());
               
        
    }
}
