package Package1;

public class ArthmaticNew {
	
	public void display()
	{
		
		System.out.println("Assignment ((((10*2)-2)+2)-2)/2) Result is Below:");
	}
	
	public int Sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum result is =" +c);
		return c;
		
	}
     
	public int Sub(int a1, int b1)
	
	{
		int c1;
		c1=a1-b1;
	    System.out.println("Sub result is =" +c1);
		return c1;
				
	}
	
	public int Mul(int a2, int b2)
	
	{
		int c2;
		c2=a2*b2;
		System.out.println("Multiplication result is =" +c2);
		return c2;
		
	}
	
	public float Div(int a3, int b3)
	
	{
		int c3;
		c3=a3/b3;
		System.out.println("Division Result is =" +c3);
		return c3;
	
	}
	public static void main(String[] args)
	{
	
		ArthmaticNew sid=new ArthmaticNew();
		sid.display();
		int Mulresult = sid.Mul(10, 2);
		int Subresult = sid.Sub(Mulresult, 2);
		int Sumresult = sid.Sum(Subresult, 2);
		int Subresult1 = sid.Sub(Sumresult, 2);
		float Divresult = sid.Div(Subresult1, 2);
				
	}
	
	
	
}
