
/**
 * Circle class for modeling real Circle.
 *
 * @author Upal Roy
 * @version 1.0.0
 */
public class Circle implements GeometricObject
{
    // instance variables - radius represent radius of each Circle
    protected double radius = 1.0;
    
    /**
     * Constructor for objects of class Circle
     */
    public Circle(double radius)
    {
        // initialise instance variables - radius
        this.radius = radius;
    }
    
    /**
     * Get the perimeter of a circle
     *
     * @return double return perimeter of a circle
     */
    public double getPerimeter(){ 
        return 2 * 3.1416 * radius;
    }
    
    /**
     * Get the perimeter of a area
     *
     * @return double return area of a circle
     */
    public double getArea(){
        return 3.1416 * radius * radius;
    }
    
}
