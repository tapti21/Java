import java.util.ArrayList;
import java.util.List;

public class array {
    public static void main(String[] args) {

        // ------------ Size of Array ------------//
        
        ArrayList <Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("The size of the ArrayList is:- " + numbers.size()); 


        // --------------Add Numbers -------------------//

        System.out.println("------------------------Add (int E)---------------------------------");

        numbers.add(0,50);
        System.out.println("Add numbers :-" + numbers); 


        // ------------------- Remove Numbers -----------------------------------//

        System.out.println("------------------------Remove---------------------------------");

        numbers.remove(0);
        System.out.println("Remove numbers :-" + numbers); 



        
    }
    
}
