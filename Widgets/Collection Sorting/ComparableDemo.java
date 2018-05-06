import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/**
 * @(#)ComparableDemo.java
 * Sort based on a natural ordering
 *
 * @author
 * @version 1.00 2018/4/18
 */


public class ComparableDemo {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Umesh Awasthi", 35));
        persons.add(new Person("Robert Hickle", 55));
        persons.add(new Person("John Smith", 40));
        persons.add(new Person("David", 23));

        Collections.sort(persons);


        for (Person person : persons) {
            System.out.println("Person is: " + person.getName() +" age: " + person.getAge() );
        }

    }
}