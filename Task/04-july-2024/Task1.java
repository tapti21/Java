
import java.util.Vector;

public class Task1 {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();
        // ------------------------ Update with indexing ----------------------------//
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(2, 25);
        System.out.println(vector);

        //--------------- Remove Elements -------------//
        vector.remove(3);
        System.out.println(vector);



        //---------------Retrieve---------------------//
      int get = vector.get(1);
        System.out.println(get);


        // ---------------size and capacity-----------------//
        int size = vector.size();
        System.out.println(size);





        
    }
    
}
