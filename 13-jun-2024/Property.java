interface maternal{
    void car();
    void savings();
}

interface paternal{
    void house();
    void income();
    void car();
}

class child implements paternal, maternal{

    public void house(){
        System.out.println("House is readyy");
    }

    public void car(){
        System.out.println("car to milegi hi");
    }
}



public class Property {
    public static void main(String[] args) {
        // maternal child
        child c;
        c = new child();
        c.house();
        c.car();
        
    }
    
}
