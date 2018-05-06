import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/**
 * @(#)ComparatorDemo.java
 * Sort based on more than one field
 *
 * @author
 * @version 1.00 2018/4/18
 */


public class ComparatorDemo {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Umesh Awasthi", 55));
        persons.add(new Person("Robert Hickle", 55));
        persons.add(new Person("John Smith", 40));
        persons.add(new Person("David", 23));
        persons.add(new Person("David", 63));

        Collections.sort(persons, new PersonComparator());

        for (Person person : persons) {
            System.out.println("Person is: " + person.getName() + " and age is: " + person.getAge());
        }
    }
}