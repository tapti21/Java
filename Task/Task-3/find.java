import java.util.Scanner;
public class find {
    public static void main(String[] args) {
            int x1,x2,y1,y2;

	         double dis;
	
	         Scanner a=new Scanner(System.in);

	         System.out.println("enter x1 point");
	   
                 x1=a.nextInt();
	    
                 System.out.println("enter y1 point");
	   
                 y1=a.nextInt();

	         System.out.println("enter x2point");
	   
                 x2=a.nextInt();

	         System.out.println("enter y2 point");
	   
                 y2=a.nextInt();
	  	    
		 dis=Math.sqrt((x2-x1)*2 + (y2-y1)*2);
 	 	    	 	    
  	         System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);


    }
    
}
