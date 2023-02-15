package Constructor1;

public class Sample3 
{
int num1;
int num2;

Sample3()
{
num1=1111;
num2=2222;

}
public void addsub()
{
System.out.println(num1+num2);	

System.out.println("------");	

System.out.println(num2-num1);	

System.out.println("------");

}
	public static void main(String[] args) 
	
	{
		Sample3 s3=new Sample3();
		s3.addsub();
		
		
		Sample4 s4=new Sample4();
		s4.multdiv();
	}
	
	
}
