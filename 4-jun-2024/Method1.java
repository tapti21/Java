class students{
    static String name;
    String a;
    public static void show(students students){
        System.out.println(students.name);
    }
}


public class Method1 {
    public static void main(String[] args) {
        students adit = new students();
        // adit.name="Trapti";

        students cits = new students();
        cits.name="Tanu";

        students cit = new students();
        // cit.name="arya";


        // adit.show();
        cits.show(adit);

        




    }
    
}
