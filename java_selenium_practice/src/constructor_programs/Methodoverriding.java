package constructor_programs;
class Kaspersky1
{
	void removevirus()
	{
		System.out.println("1 virus removed");
	}
}
class Kaspersky2 extends Kaspersky1
{
	void removevirus()
	{
	super.removevirus();
		System.out.println(" 100 virus removed");
	}
}

public class Methodoverriding {

	public static void main(String[] args) {
		Kaspersky2 k2=new Kaspersky2();
		k2.removevirus();
		

	}

}
