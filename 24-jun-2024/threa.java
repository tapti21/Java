class threa1 extends Thread{
    public void display(){
            for (int i=0; i<=100; i++){
            System.out.println("threa2");
        System.out.println("threa1");
    }}
}


class threa2 extends Thread{
    public void run(){
        for (int i=0; i<=100; i++){
        System.out.println("threa2");
    }}
}



public class threa {
    public static void main(String[] args) {
        threa1 obj = new threa1();
        obj.display();

        threa2 obj1 = new threa2();
        obj.display();


        
    }
    
}
