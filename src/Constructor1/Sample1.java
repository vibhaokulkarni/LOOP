package Constructor1;

public class Sample1 
{
	// default constructor provided by compiler to copy of all members of class into object 
	// Syntax Sample1(){}
	
	
	public void m1()
	{
		System.out.println("running method m1");
	}
	
	public static void main(String[] args) 
		{
	Sample1 s1= new Sample1();
	s1.m1();
	
	Sample2 s2=new Sample2();
	s2.m2();
	}
	
	


	
}
