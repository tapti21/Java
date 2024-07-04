
import java.util.List;
import java.util.Vector;



public class Task3 {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();
        // ------------------------ Add elements 1 through 10  ----------------------------//
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);
        System.out.println(vector);
        for(Integer num:vector){
            System.out.println(num);
        }

        // --------------- Sublist ----------------------------//
        List<Integer> sublist = vector.subList(3,7);
        System.out.println(sublist);


        // --------------------- Modify ----------------------//
        sublist.set(1,50);
        System.out.println(sublist);


        System.out.println("-----sublist and the original Vector to show -------");
        System.out.println(sublist);
        System.out.println(vector);
        
    }
  


    
}
