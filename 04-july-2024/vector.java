import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Enumeration;
import java.util.Vector;


public class vector {
    public static void main(String[] args) {
        
        Vector<String> vector = new Vector<>();
        // ------------------------ Update with indexing ----------------------------//
        vector.add("Trapti");
        vector.add("Peehu");
        vector.add("Piyush");
        vector.add(1, "trapti");
        System.out.println(vector);

        String firstElement = vector.firstElement();
        String lastElement = vector.lastElement();
        String elementtotalindex = vector.get(2);
        System.out.println("first Element"+ firstElement);
        System.out.println("Second Element"+ lastElement);
        System.out.println("Index Element"+elementtotalindex);

        // --------------------- Remove Elements ----------------------//
        vector.remove("Piyush");
        System.out.println(vector);
        vector.remove(1);
        System.out.println(vector);

        // -------------- Add new Elements ------------------------//
        vector.add("manu");
        vector.add("Annu");

        // ------------------ Enumeration (check all elements then print) ------------------------//
        Enumeration<String> enumeration = vector.elements();
        System.out.println("Element using enumaration");
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }


        // ------------------ Iterator ---------------------//
        Iterator<String> iterator = vector.iterator();
        System.out.println(" After Iterator Elements ");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // -------------------- ListIterator ----------------//
        ListIterator<String> listIterator = vector.listIterator();
        System.out.println("List iteration Elements");
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        
        }


        // ----------- Boolean Types -------------------//
        boolean elementhai = vector.contains("Vaishnavi");
        System.out.println("Vector me hai kay ?"+elementhai);

        // ---------------- Elements Size-------------------//
        int size = vector.size();
        System.out.println(size);

        // ------------------- Sorted List -----------------//
        Collections.sort(vector);
        System.out.println(vector);

        // ------------------ Copy All Elements -------------------//
        Vector <String> vectorcopy = new Vector<>(vector);
        System.out.println("Copy vector"+vectorcopy);

        // --------------- Clear All Elements --------------------//
        vector.clear();
        System.out.println("Clear Elements"+vector);



    }
    
}
