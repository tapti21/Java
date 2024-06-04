

public class Methods {
    public static void main(String[] args) throws ClassNotFoundException {
        // Class p1 = Class.forName("all");
        // System.out.println(p1);
        all p1 = new all();
        p1.a = 10;
        p1.b = 20;
        p1.add();
        // all p2 = new all();
        // p2.a=30;
        
    }
    
}

public void add(){
    int c = a+b;
    System.out.println("a+b="+c);
}


class all{
    int a;
    int b;
     public void add(){
         System.out.println("a+b = "+(a+b));
    }
}
