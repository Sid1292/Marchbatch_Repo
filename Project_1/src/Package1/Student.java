package Package1;

public class Student {

	int age;
	int rollnumber;
	
	public void Display1()
	
	{
		
		System.out.println("Welcome to all of you");
	}
	
	public void Display2()
	
	{
		
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args)
	
	{
		Student ab= new Student();
		ab.Display1();
		ab.Display2();
		ab.age= 24;
	    System.out.println("Age is "+ ab.age);
	    ab.rollnumber= 100;
	    System.out.println("Rollnumber is "+ 100);
	}
}
