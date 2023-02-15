package Constructor4;

public class Sample1 
{
	
// default constructor provided by compiler to copy member of class into object
	
	public void Priya()
	{
		System.out.println("Priya");
	}
	
	public void Saket()
	{
		System.out.println("Saket");
	}
	
	public void Adwait()
	{
		System.out.println("Adwait");
	}
	
	public static void main(String[] args) 
	{
	
		Sample1 s1=new Sample1();
		s1.Priya();
		s1.Saket();
		s1.Adwait();
		
		Sample2 s2=new Sample2();
		s2.Priya();
		s2.Saket();
		s2.Adwait();
		
		
		
		
	}

	
	
	
	}


	

