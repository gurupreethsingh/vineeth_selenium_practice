// constructor - are used to initialize data members
// constructor name is same as class name
// constructors do not have any return type.

package constructor_programs;

public class Whastapp 
{
	// constructors are always non static members 
   Whastapp()
	{
		System.out.println("Hello from the constructor");
	}

	
	public static void main(String[] args) 
	{
		// to access non static member inside the main function. we have to create an object of that class. 
		Whastapp w = new Whastapp();
	}
}
