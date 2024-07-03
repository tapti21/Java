import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override toString method
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    // Getters for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


}

public class custom {
    public static void main(String[] args) {
        // Create LinkedList instances
        LinkedList<Person> list1 = new LinkedList<>();
        LinkedList<Person> list2 = new LinkedList<>();

        // Add Person objects to list1
        list1.add(new Person("Anjali", 30));
        list1.add(new Person("Pushpanjali", 25));
        list1.add(new Person("Piyush", 35));

        // Add Person objects to list2
        list2.add(new Person("Trapti", 40));
        list2.add(new Person("Manorama", 28));
        list2.add(new Person("Annapurna", 33));

        //---------------------- Display LinkedLists ----------------------//
        System.out.println("---------List 1------------");
            System.out.println("person"+ list1);
        

        System.out.println("\n----------List 2----------");
            System.out.println("person"+ list2);
        

        //------------------- Merge list2 into list1---------------------//
        list1.addAll(list2);

        // ----------Sort the merged LinkedList by age-------------------------//
        list1.sort(Comparator.comparingInt(Person::getAge));

        // Reverse the sorted LinkedList
        Collections.reverse(list1);
        System.out.println("\nSorted and Reversed List:");

        // Iterate through the LinkedList using an Iterator and print each Person object
   
        Iterator<Person> iterator = list1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Check if the LinkedList contains a Person object with the name "Anjali" and age 30
        Person anjali = new Person("Anjali", 30);
        boolean containsAnjali = list1.contains(anjali);
        System.out.println("\nContains 'Anjali (30)': " + containsAnjali);

        // Remove all Person objects from the LinkedList where the age is less than 30
        list1.removeIf(person -> person.getAge() < 30);

        // Convert the LinkedList to an array of Person objects and print each element in the array
        Person[] personArray = list1.toArray(new Person[0]);
        System.out.println("\nArray of Persons:");
        for (Person person : personArray) {
            System.out.println(person);
        }

        // Clear all elements from the LinkedList
        list1.clear();
        System.out.println("\nList after clearing all elements: " + list1);
    }
}