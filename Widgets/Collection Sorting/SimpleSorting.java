
import java.util.*;


/**
 * @(#)SimpleSorting.java
 * Collections API’s utility class Collections provide a handy way to sort an ArrayList in natural ordering provided all elements in the 
 * list must implement the Comparable interface.
 * However, this class does not need to implement Comparable. It works perfectly with Collections.Sort() as List defined in example was List<String> 
 * and java.lang.String implements the Comparable interface.
 *
 *
 * @author
 * @version 1.00 2018/4/18
 */


public class SimpleSorting {

    public static void main(String[] args) {

        List<String> locationList = new ArrayList<String>();
        locationList.add("California");
        locationList.add("Texas");
        locationList.add("Seattle");
        locationList.add("New Delhi");

        Collections.sort(locationList);

        for (String location : locationList) {
            System.out.println("Location is: " + location);
        }
    }
}