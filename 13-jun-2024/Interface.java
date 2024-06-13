class adit{

    String name = "Trapti";
    private int age = 23;
    public int salary = 2000;
    public void patna(){
        // System.out.println("age is"+age);
        System.out.println("age is"+(age*2));
    }

}


public class Interface {
    public static void main(String[]args){
        adit a = new adit();
        System.out.println(a.name);
        a.patna();

    }
    
}
