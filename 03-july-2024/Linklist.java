import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;


public class Linklist {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();  // Linklist ka istance

        linkedList.add("Banana");
        linkedList.add("Apple");
        linkedList.add("Mango");
        linkedList.add("Cheery");
        linkedList.add("Papaya");

        System.out.println("Intail Linklist :-" +linkedList);

        System.out.println("---------Itreating the  list through Interactor---------");

        //---------------------- Create List -----------------//
        Iterator<String> iterator = (Iterator<String>) linkedList.iterator();
        while ((iterator.hasNext())) {
            System.out.println(iterator.next());   
        }
        // ----------- Add fist & Last element create----------//
        linkedList.addFirst("orange");
        linkedList.addLast("pear");

        System.out.println("Update Linkedlist :- "+linkedList);

        //------------------Show Any One elements --------------//
        String polledElement = linkedList.pollFirst();
        System.out.println("polled Element :-"+polledElement);//----Polled means first element delete----//
        System.out.println("Update Linkedlist :-"+linkedList);

            //---------------------------- Alphabatic order ------------------------//
        Collections.sort(linkedList);
        System.out.println("Sorted Linkedlist :-"+ linkedList);

        
        //---------------- Customized sorting -------------------------// 
        Collections.sort(linkedList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                return s2.compareTo(s1);
            }
            
        });
        System.out.println("Reverse Sorted Linkedlist :-"+ linkedList);

        //----------------------------- Add Duplicate values --------------------------------//
        linkedList.add("orange");
        linkedList.add("mango");
        System.out.println("After Duplicacy :-"+linkedList);


        //------------------------------- Remove value -------------------------------//
        linkedList.removeAll(Collections.singleton("Mango"));
        System.out.println("After removing mango"+ linkedList);
        
        //---------------------- Clear all value ------------------------------//
        linkedList.clear();
        System.out.println("After clear "+ linkedList);
    
    
    }

    
}
