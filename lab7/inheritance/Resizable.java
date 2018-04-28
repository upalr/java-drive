
/**
 * Interface for representing resizeable geometric object
 *
 * @author Upal Roy
 * @version 1.0.0
 */
public interface Resizable
{
    /**
     * method signeture - resize method can increase or decrease the radius of a circle
     *
     * @param  percent  first paramter of resize method. Represents the percent by which the radius should be changed
     */
    void resize(int percent);
}
