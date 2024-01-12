
public class Vineethbook {
	class Manufacture
	{
		void sellbooks()
		{
			System.out.println("sell all books");
		}
	}
	class Papergrid extends Manufacture
	{
		void sellbooks()
		{
			System.out.println("sells papergrid books");
			
		}
	}
	class Classmate extends Manufacture
	{
		void sellbooks();
		{
			System.out.println("sells classmate books");
		}
	}
class Amazon
{
	void sellallbooks(Manufacure m)
	{
		m.sellbooks();
	}
}
	public static void main(String[] args) {
		Papergrid p=new Papergrid();
		Classmate c=new Classmate();
		Amazon a=new Amazon();
		a.sellallbooks(p);
		a.sellallbooks(c);
		
		

	}

}
