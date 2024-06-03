
public class NestedIf {
    public static void main(String[] args) {                //Nested if me ek if else ke ek or if else banate hai
        int age =20;
        String gender = "Male";
        if(age>18){
            System.out.println("your are eligible");
            if(gender=="Male"){
                System.out.println("you are invited");

            }else{
                System.out.println("your are not invite");
            }
            }else{
                System.out.println("you are  not eligible");
            }
        
        }
    }
    

