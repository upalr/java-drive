import java.util.Comparator;

/**
 * @(#)PersonComparator.java
 *
 *
 * @author
 * @version 1.00 2018/4/18
 */


public class PersonComparator implements Comparator<Person>{

   // compare by Age, then by Name
    public int compare(Person p1, Person p2) {

        int flag = p1.getAge() - p2.getAge();

        if(flag==0) {
        	flag = p1.getName().compareTo(p2.getName());
        }

        return flag;
    }

}