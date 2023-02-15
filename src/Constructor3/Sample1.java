package Constructor3;

public class Sample1 
{
	
// default constructor provided by compiler to copy members of class into object
	//syntax classname() {} ie Sample1() {}
	
	public void m1()
	{
		System.out.println(" Priya running method m1");
		
	}
	
	public void m2()
	{
		System.out.println(" Priya running method m2");
		
	}
	public void m3()
	{
		System.out.println(" Priya running method m3");
		
	}
	
	public static void main(String[] args) 
	{
		Sample1 s1=new
				Sample1();
		s1.m1();
		
	
		s1.m2();
		
		s1.m3();
		
		Sample2 s2=new Sample2();
				s2.m4();
		
				s2.m5();
		
				s2.m6();
	}
	}


	

