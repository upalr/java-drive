/**
 * @(#)Person.java
 * This class must implement Comparable to be sorted
 *
 * @author
 * @version 1.00 2018/4/18
 */


public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int compareTo(Person person) {
        return this.age > person.age ? 1 : this.age < person.age ? -1 : 0;
    }
}