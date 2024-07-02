

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class col{
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(101);
        al1.add(102);
        al1.add(103);
        al1.add(104);
        al1.add(105);
     
        System.out.println("al1 : " + al1);

        for(int i=0; i<=al1.size()-1; i++){
            System.out.println("Index :- " + i + "Value :-" + al1.get(i));
           
        }
        System.out.println("---------------------------------------");
       
        
        Iterator iterator = al1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next() + " ");

        }
        System.out.println("---------------------------------------");


        ListIterator listIterator = al1.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next() + " ");
        }

        System.out.println("----------------In Reserve Order-----------------------");
        while(listIterator.hasPrevious()){
        System.out.println(listIterator.previous() + " ");
        }

        // ------------Creating clone of ArryList -------------------//

        ArrayList ArrayListclone = (ArrayList) al1.clone();
        System.out.println("Original ArrayList" +al1);
        System.out.println("Cloned ArrayList" + ArrayListclone);
    }
}