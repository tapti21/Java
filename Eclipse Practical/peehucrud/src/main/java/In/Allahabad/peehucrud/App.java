package In.Allahabad.peehucrud;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import In.sp.context.ConfigFile;

public class App {
    public static void main( String[] args )
    {
//    				---------------------- Create Databse -----------------------------------------//
    	ApplicationContext cxt = new AnnotationConfigApplicationContext(ConfigFile.class);
    	
    	/*String query = "create database Tanu";
    	JdbcTemplate jT = (JdbcTemplate) cxt.getBean(JdbcTemplate.class);
    	jT.update(query);
    	System.out.println("created");*/
    	
    	
//    	------------------------------------ Create Table ---------------------------------//
    	
    	String query = "create table spring (name varchar(200) not null,location varchar(200) not null,email varchar(100) not null)";
    	JdbcTemplate jT = (JdbcTemplate) cxt.getBean(JdbcTemplate.class);
    	jT.update(query);
    	System.out.println("Table created");

    	
    	
    	
        }
    }


