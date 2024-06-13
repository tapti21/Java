abstract class Car{
    abstract void start();

    public void ac(){
        System.out.println("ac is on");
    }
}
class maruti extends Car{
    void start(){
        System.out.println("car is start");
    }
}



public class InterFa {
    public static void main(String[] args) {
        Car c = new maruti();
        c.start();
        c.ac();
    }

    
}
