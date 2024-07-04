import java.util.Collections;
import java.util.Iterator;
import java.util.Enumeration;
import java.util.Vector;



public class Task2 {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();
        // ------------------------ Update with indexing ----------------------------//
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add("Date");
        System.out.println(vector);



        // ------------------ Iterator ---------------------//
        Iterator<String> iterator = vector.iterator();
        System.out.println(" After Iterator Elements ");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        // ------------------- Sorted List -----------------//
        Collections.sort(vector);
        System.out.println(vector);


        // ------------------ Enumeration (check all elements then print) ------------------------//
        Enumeration<String> enumeration = vector.elements();
        System.out.println("Element using enumaration");
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }


        
        
    }
    
}
