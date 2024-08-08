import java.util.Iterator;
import java.util.Stack;
import java.util.ListIterator;




public class stack {
    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(101);
        stack.push("Annu");
        System.out.println("2 node push"+ stack);
        stack.push("Trapti");
        stack.push(102);
        System.out.println(stack);

        //--------------- Remove Last elements ---------------------//
        // stack.pop();
        // System.out.println(stack);


            // ------------ Iterator -----------------//
        Iterator iterator = stack.iterator();
        while ((iterator.hasNext())) {
            System.out.println(iterator.next()+ " ");

            // ----------------- LIST Iterator --------------------//
            ListIterator listIterator = stack.listIterator();
            System.out.println("list iterator uses");
            while(listIterator.hasNext()){
                System.out.println(listIterator.next());
            }

            System.out.println("Reverse Order");
            //------------------- Reverse Order ----------------//
            while(listIterator.hasPrevious()){
                System.out.println(listIterator.previous());
            }
            
        }

        
    }
    
}
