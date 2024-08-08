package in.sp.main;

public class Main {
	public static void main(String[] arge) {
		ApplicationContext cxt = new
				AnnotationConfigApplicationContext(ConfigFile.class);
		
		User u1 = (User) cxt = getBean("User1");
		u1.register();
	}

}
