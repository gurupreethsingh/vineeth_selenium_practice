// this(); calling statement or this calling function. 
// Constructor chaining :- when one constructor calls another constructor in the same class we use this() calling or this() function.

package constructor_programs;

class Airtel
{
	Airtel(int a)
	{
		System.out.println("One message sent from airtel number");
	}
	
	Airtel(int a, int b)
	{
		this(1);
		System.out.println("Two message sent from airtel number");
	}
	
	Airtel(int a, int b, int c)
	{
		this(1,1);
		System.out.println("Three message sent from airtel number");
	}
}

public class ThisCalling_Constructor {
	public static void main(String[] args) {
		new Airtel(1,1,1);
	}
}
