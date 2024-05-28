import java.io.*;

public class BufferIn {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        java.io.BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name: ");
        String name = a.readLine();
        System.out.println("your name is: "+name);


        // System.out.println("Enter your age: ");
        // String age = a.readLine();
        // System.out.println("your name is: "+age);

        // String age = a.readLine();
        int age1 = Integer.parseInt(a.readLine());
        System.out.println(2*age1);


    }
    
}
