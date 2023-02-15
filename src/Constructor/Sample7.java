package Constructor;

public class Sample7 


{
int num1;
int num2;
String name;

   Sample7(String s1) //user defined string parameter constructor
{
	name=s1;

}
   Sample7() //user defined constructor without parameter
{

	num1=20;
	num2=30;
}
	Sample7(int a,int b)
	{
		num1=a;
		num2=b;
			}
	
	public void sname()
	{System.out.println(name);}
	
	public void add()
		{System.out.println(num1+num2);}
	
	public static void main(String[] args) 
	{
	Sample7 s7=new Sample7();
	s7.add();
	
	Sample7 s8=new Sample7(5,6);
	s8.add();
	
	Sample7 s9=new 
			Sample7("Rahul");
	s9.sname();
		
		
		
	}
	
}
