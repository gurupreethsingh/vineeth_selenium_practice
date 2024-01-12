package interface_programs;


interface Calculations 
{
	void add(); void subtract(); void multiply();
}

class Calculator implements Calculations
{
	public void add() {
        int a = 10; int b = 20; System.out.println(a+b);
	}

	public void subtract() {
		 int a = 10; int b = 20; System.out.println(a-b);
		
	}

	public void multiply() {
		 int a = 10; int b = 20; System.out.println(a*b);
	}
}


public class Demo {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add();
		c.subtract();
		c.multiply();

	}

}
