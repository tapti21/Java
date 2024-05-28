class Student{
    // String name;
    // String roll;
    // int[] marks;
    // String mail;
    String name;
    int id;
    String email;

    public void display(){
        System.out.println(name+" "+id+" "+email);
    }
}





public class Classess {
    public static void main(String[] args) {
        // int a,b,c;  
        // System.out.println("Hello");  
        Student a1 = new Student(); 
        Student a2 = new Student();
        Student a3 = new Student();
        Student a4 = new Student();
        
        a1.name="Trapti";
        a1.id=01;
        a1.email="t@abc.com";
        a1.display();

        a2.name="manu";
        a2.id=02;
        a2.email="m@gmail.com";

        a3.name="pratibha";
        a3.id=03;
        a3.email="p@gmail.com";

        a4.name="peehu";
        a4.id=04;
        a4.email="pu@gmail.com";

        a2.display();
        a3.display();
        a4.display();
    }
    }

//     }
//     }
    
// }
