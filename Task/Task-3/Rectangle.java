import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        java.util.Scanner a = new java.util.Scanner(System.in);
        
        int height, width, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter height of rectangle:");
        height = s.nextInt();

        System.out.print("Enter width of rectangle:");
        width = s.nextInt();

        area = height * width;
        System.out.println("Area of rectangle:"+area);
    }
}
        
    
    

