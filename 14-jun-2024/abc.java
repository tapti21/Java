// class adit{
//     final String server = "localhost";
//     String user = "root";
//     String pass = "";
//     String db = "student";
// }
// class newadit extends adit{
//     String server = "192.0.0.1";
// }


class adit{
    String name;
    int age;

    void display(){
        System.out.println(name +" " + age);
    }
}

public class abc {
    public static void main(String[] args) {
        adit student = new adit();
        student.name = "adit";
        student.age = 23;
        student.display();
        // System.out.println(student.name);








        // int age = 14;
        // System.out.println(age);

        // final String name;
        // name = "Trapti";
        // //  name = "Manu";
        // System.out.println(name);
    }
    
}
