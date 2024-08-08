package In.Spring.Spring1Crud;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import In.sp.context.ConfigFile;


public class App 
{
    public static void main( String[] args )
    {
ApplicationContext cxt = new AnnotationConfigApplicationContext(ConfigFile.class);
// -------------------------------- Database Created ----------------------------------------   	
/*
 * String query = "create database Spring"; 
 * JdbcTemplate jT = (JdbcTemplate)cxt.getBean(JdbcTemplate.class); jT.update(query);
 * System.out.println("Database created");
 */
    	
    	
//    	------------------------------------------ Table Created -------------------------------------

//  String query =
//  "create table spring1 (name varchar(200) not null,location varchar(200) not null,email varchar(100) not null,mobile int(9))";
//  JdbcTemplate jT = (JdbcTemplate) cxt.getBean(JdbcTemplate.class);
//  jT.update(query); 
//  System.out.println("Table created");
 
    	
    	
//    	--------------------------------- Table Data Inserted --------------------------------------------
//    	String query = "insert into spring1(name,location,email,mobile) values (?,?,?,?)";
//    	JdbcTemplate jT = (JdbcTemplate) cxt.getBean(JdbcTemplate.class);
//    	jT.update(query, "Trapti","Etawah","t@gmail.com","984744");
//    	System.out.println("Table Data inserted");

    	
//    	------------------------------------- Add Columan -------------------------
//    	String query = "ALTER TABLE spring1 ADD COLUMN gender varchar(10)";
//    	JdbcTemplate jT = (JdbcTemplate) cxt.getBean(JdbcTemplate.class);
//    	jT.update(query);
//    	System.out.println("Column Added");
    	
    	
//    	-------------------------- Inserted Multiple data ---------------------
//    	String query = "insert into spring1(name,location,email,mobile,gender) values (?,?,?,?,?))";
//    	JdbcTemplate jT = (JdbcTemplate) cxt.getBean(JdbcTemplate.class);
//    	Object[][] data = {
//    			{"manu","allahabad","m@gmail.com","764754687","female"},
//    			{"peehu","allahabad","p@gmail.com","76754674","female"},
//    			{"Piyush","allahabad","p@gmail.com","564754674","male"}
//    	};
//    	jT.batchUpdate(query, data);
//    	System.out.println("Data inserted");

//	String query = "insert into spring1 values(?,?,?,?)";
//	String name = "manu";
//	String location = "allahabd";
//	String email = "t@gmail.com";
//	String mobile = "987655";
//	JdbcTemplate jT = (JdbcTemplate) cxt.getBean(JdbcTemplate.class);
//	jT.update(query, name, location, email, mobile);
//	System.out.println("Table Data inserted");



//JdbcTemplate jT = (JdbcTemplate) cxt.getBean(JdbcTemplate.class);
//String query = "update spring1 set name =? where location=?";
//
//
//jT.update(query, "piyush", "Allahabd");
//System.out.println("update");







    }
}
