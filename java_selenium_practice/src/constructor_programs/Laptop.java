// super() calling statement or super() function , when one class constructor calls or invokes constructor its super class. 

package constructor_programs;

class Gmail   // base, parent, super
{
	Gmail()
	{
		System.out.println("Email confirmation message , that indigo ticket is booked succssfully");
	}
}


class Indigo extends Gmail  // sub, child
{
	Indigo(int a)
	{
		super();
		System.out.println("Booked one indigo ticket");
	}
	
	Indigo(int a , int b)
	{
		super();
		System.out.println("Booked Two indigo ticket");
	}
	
	Indigo(int a , int b, int c)
	{
		super();
		System.out.println("Booked Three indigo ticket");
	}
}

public class Laptop {
	public static void main(String[] args) {
        new Indigo(1);
	}
}