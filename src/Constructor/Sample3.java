package Constructor;

public class Sample3 
{
// example of user defined w/o parameter
	
	int num1;
	int num2;   // variable declaration
	
	// variable intialization - user defined constructor provided by user to initialize global variable and copy all member of class into object
	
	Sample3() // without zero parameter / zero parameter
	{
		num1=15;
		num2=35;
		
		
	}
	
	public void addition()
	{
		System.out.println(num1+num2);
		System.out.println("-------");
	}
	
	
	
	public static void main(String[] args) 
	{
		Sample3 s3=new Sample3();
		s3.addition();
		
		Sample4 s4=new Sample4();
		s4.mult();
		
	}
	
}
