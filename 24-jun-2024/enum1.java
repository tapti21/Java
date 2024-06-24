// class trapti{
//     int age = 21;
//     String name = "trapti";
//     public void display(){
//         System.out.println(name + " " +age);
//     }


enum patna{
    trapti, manu, pratibha, peehu
}

enum ddn implements patna{
    trapti;
}

// private void  patna(){
//     System.out.println("constructor called");
// }
public class enum1 {
    public static void main(String[] args) {
        // trapti obj = new trapti();
        // obj.display();

        patna obj = patna.trapti;
        // System.out.println(patna.trapti.toString());

        // patna[] obj = patna.values();
        // System.out.println(obj[2]);


        // for (int i = 0; i<=obj.length; i++){
        //     System.out.println(obj[i]);
        // }


    }
    
}
