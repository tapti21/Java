abstract class Computer{


    public abstract void code();
        
    }
class Desktop implements Computer{

    public void code(){

        System.out.println("coding");
    }
}

class Laptop implements Computer{

    public void code(){
        System.out.println("coding at ease");
    }
}

class dev{
    public void appD(Computer com){

        com.code();
    }
}


public class Interface2 {
    public static void main(String[] args) {
        // Computer c = new Computer();

        Computer lap = new Laptop();
        Computer desk = new Desktop();

    }
    
}
