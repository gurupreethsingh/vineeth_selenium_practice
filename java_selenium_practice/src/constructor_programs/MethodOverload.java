package constructor_programs;

class Whatsup
{

	void send(int a)
	{
		System.out.println(" msg1");
	}
	void send(int a, int b)
	{
		System.out.println("mgs2");
	}
	void send(int a, int b, int c)
	{
		System.out.println("msg3");
	}
}

 public class MethodOverload {

	public static void main(String[] args) {
		Whatsup w=new Whatsup();
		w.send(1);
	    }	
	}