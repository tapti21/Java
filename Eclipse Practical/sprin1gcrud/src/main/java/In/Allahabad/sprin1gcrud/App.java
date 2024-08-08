package In.Allahabad.sprin1gcrud;




import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import In.sp.context.ConfigFile;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(ConfigFile.class);
    	String query = "create database Spring";
    	JdbcTemplate jT = (JdbcTemplate) cxt.getBean(JdbcTemplate.class);
    	jT.update(query);
    	System.out.println("created");
    }
}
