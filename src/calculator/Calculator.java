package calculator;
//using multilevel inheritance

class Addition
{
	void addition()
	{
		int a=12;
		int b=12;
		int c=a+b;
		System.out.println("Addition is:" + c);
	}
}

class Subtraction extends Addition
{
	void subtraction()
	{

		int a=12;
		int b=12;
		int c=a-b;
		System.out.println("Subtraction  is:" + c);
		
	}
}


class Multiplication extends Subtraction
{
	void multiplication() {

		int a=12;
		int b=12;
		int c=a*b;
		System.out.println("Multiplication  is:" + c);
	}
}














public class Calculator {
	
	public static void main(String[] args) 
	{
		Multiplication m1=new Multiplication();
		m1.multiplication();
		m1.subtraction();
		m1.addition();
		
	}
	
	

}














