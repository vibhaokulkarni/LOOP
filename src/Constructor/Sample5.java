package Constructor;

public class Sample5 

{
// user defined variable with parameter
	
	int num1;
	int num2;
	
// user defined parameter with two integer 
	// to intialise global parameter using local variable
	// copy all the data into object
	
	
Sample5(int a, int b)
{
	num1=a;
	num2=b;  
	
	// assigning local variable info into global variable

}

public void add()
{
	
System.out.println(num1+num2);

}
	public static void main(String[] args)
	
	{
		Sample5 s5=new Sample5(4,6);
		s5.add();
		
		
		Sample6 s6=new Sample6(6,4);
		s6.mult();
		
	}
	
	
}
