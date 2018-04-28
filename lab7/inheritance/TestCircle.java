
/**
 * TestCircle is for testing the geometric object circle
 *
 * @author Upal Roy
 * @version 1.0.0
 */
public class TestCircle
{
    public static void main(String[] args){
        //instance object - to referance a Circle.
        Circle c1 = new Circle(4.0);
        
        System.out.println();
        System.out.println("Perimeter of circle one (when radius of the circle one is 4.0): ");
        System.out.println(c1.getPerimeter());
        
        System.out.println("Area of circle one (when radius of the circle one is 4.0): ");
        System.out.println(c1.getArea());       
        
    }
}
