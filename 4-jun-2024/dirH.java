                // ...... Local Variable .........//

// class students{
    
//     String name;
//     public void show(){
//         System.out.println(name);
//     } 
// }



                // ...... Static Variable........//
class students{
    static String name;
    static int age;
    public void show(){
        System.out.println(name+ ":"+age);
    } 
}


// public class dirH {
//     public static void main(String[] args) {
//         int age = 20;
//         String name = "Trapti";
//         System.out.println(name +":"+age);
//     }
    
// }


public class dirH {
    public static void main(String[] args) {
       students s1 = new students();
       s1.name="Trapti";
      
       students s2 = new students();
       students s3 = new students();
       students s4 = new students();
       s4.name="peter";
    //    s2.name="pratibha";
    //    s3.name="manu";
    //    s4.name="anuu";
       s1.show();
    //    s2.show();
    //    s3.show();
    //    s4.show();

    }
    
}

