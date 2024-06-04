
class alld{
    String name;
    int age;
    private String city;

    public String getAge(){
        return name;
    }
    public void setAge(int age){
       this.age = age;
    }
}
public class getter {
    public static void main(String[] args) {
        alld p1 = new alld();
        p1.name = "Trapti";
        p1.setAge(21);
        // System.out.println(p1.name);
        // System.out.println(p1.age);
        System.out.println(p1.getAge());
    }
    
}
