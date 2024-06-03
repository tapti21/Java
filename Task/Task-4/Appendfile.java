import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Appendfile {
    

    public static void main(String[] args) {

                        // /...... QUESTION NO:-1  ........//
        // Write a java program to Append text or string in a file 


        // Specify the file path
        // String filePath = "C:\\Users\\dell\\Documents\\GitHub\\Java\\Task\\Task-4\\file.txt"; 

        // // Text to append
        // String textToAppend = "I am belong to etawah.";

        // try {
        //     // Create a FileWriter in append mode
        //     FileWriter fileWriter = new FileWriter(filePath, true);

        //     // Append the text
        //     fileWriter.write(textToAppend);
        //     // fileWriter.write(System.lineSeparator()); // Add a new line

        //     // Close the FileWriter
        //     fileWriter.close();

        //     System.out.println("Text appended successfully!");
        // } catch (IOException e) {
        //     System.err.println("Error while appending text: " + e.getMessage());




                                    // ..........  QUESTION NO:- 2    ........//
    //  Write a java program to Read content from file using BufferedReader 

    //     String path = "file.txt"; // Specify the path to your file

    //     try (BufferedReader br = new BufferedReader(new FileReader(path))) {
    //         String line;
    //     while ((line = br.readLine()) != null) {
    //         System.out.println(line);
    //      }
    //     } catch (IOException e) {
    //         e.printStackTrace();
    // }




                        // .......  QUESTION NO:- 3 ..........//
    // 3. Write a java program to Get the size of give file in bytes, kilobytes and megabytes 


        // Specify the file path
        // String filePath = "file.txt"; 

        // // Create a File object
        // File file = new File(filePath);

        // if (file.exists()) {
        //     long fileSizeBytes = file.length();
        //     double fileSizeKB = fileSizeBytes / 1024.0;
        //     double fileSizeMB = fileSizeKB / 1024.0;

        //     System.out.println("File Size:");
        //     System.out.println("File is Bytes: " + fileSizeBytes);
        //     System.out.println("Fiel is Kilobytes: " + fileSizeKB);
        //     System.out.println("File is Megabytes: " + fileSizeMB);
        // } else {
        //     System.err.println("File does not exist.");
        // }



                        // ..........  QUESTION NO:-4  ............//
    // 4. Write a java program to Delete a file
    
        // File filepath = new File("abc.txt");
        // if(filepath.exists()){
        //     filepath.delete();
        //     System.out.println("file delete successfull");
        // }else{
        //     System.out.println("file not found");
        // }


                            // .......... QUESTION NO:-5  ............//
        // 5. Write a java program to Read a file line by line 


        // try{
        //         File a = new File("file.txt");
        //         Scanner b = new Scanner(a);
        //         // String data = b.nextLine();
        //         // System.out.println(data);
        //         while(b.hasNextLine()){
        //         String data = b.nextLine();
        //         System.out.println(data);
        //         }
        //     }catch(Exception e){
        //         System.out.println("not found");
        //     }





                                         // .......... QUESTION NO:-6  ............//
        // 6. Write a Java program that initializes an array of integers and prompts the user to enter an index to access. Use exception handling to catch any ArrayIndexOutOfBoundsException. 



        // int[] a= {3,5,7,9};
        //      Scanner sc = new Scanner(System.in);
        //  System.out.print("Enter an index to access (0 to " + (a.length - 1) + "): ");
        // int b = sc.nextInt();
    
        // try {
        //      int value = a[b];
        //      System.out.println("Value at index " + b + ": " + value);
        // } catch (ArrayIndexOutOfBoundsException e) {
        //      System.out.println("Error: Please enter a valid index.");
        //  } finally {
        //      sc.close();
        //  }


                                         // .......... QUESTION NO:-7  ............//
    // 7. Write a Java program that reads a file specified by the user. Use exception handling to catch any FileNotFoundException and IOException.

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the path to the file: ");
        // String path = sc.nextLine();

        // try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
        //     String line;
        //     while ((line = reader.readLine()) != null) {
        //         System.out.println(line);
        //     }
        // } catch (FileNotFoundException e) {
        //     System.out.println("File not found: " + e.getMessage());
        // } catch (IOException e) {
        //     System.out.println("Error reading the file: " + e.getMessage());
        // } finally {
        //     sc.close();
        // }                          
             
     }
     }
                                
                                
    
    

    


        

    
    




            
        
    
// }


    

