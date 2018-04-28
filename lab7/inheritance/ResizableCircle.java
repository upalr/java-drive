
/**
 *  ResizableCircle is a real circle object which radius can be changed dynamically.
 *
 * @author Upal Roy
 * @version 1.0.0)
 */
public class ResizableCircle extends Circle implements Resizable
{
    /**
     * Constructor for objects of class ResizableCircle
     */
    public ResizableCircle(double radius)
    {
        // initialise instance variables
        super(radius); 
    }

    /**
     * resize method can increase the radius of a circle
     *
     * @param  percent  first paramter of resize method. Represents the percent by which the radius should be changed
     */
    public void resize(int percent)
    {
        // put your code here
        super.radius = super.radius + (super.radius * ((double)percent/100));
    }
}
