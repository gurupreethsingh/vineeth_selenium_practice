package abstraction_programs;

abstract class Calculate
{
	abstract void add();
	
	void subtract()
	{
		int a = 10;
		int b = 5;
		System.out.println(a-b);
	}
}

class Calculator extends Calculate
{
	void add()
	{
		int a = 100;
		int b = 200;
		System.out.println(a+b);
	}
}


public class Laptop {

	public static void main(String[] args) {
//		Calculate c = new Calculate(); this is not allowed 
		Calculator c = new Calculator();
		c.add();
		c.subtract();
	}

}
