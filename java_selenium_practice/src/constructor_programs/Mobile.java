// Constructor overloading :- creating multiple constructors in a class , but variation in argument list 
//varation in argument list means 
//1. varabiel in length of the arguments
//2. variation in type of argument
//3. variation in occurance of argument.

package constructor_programs;

class Facebook
{
	Facebook(int a , int b, int c)
	{
		System.out.println("Three message to a friend");
	}
	Facebook(int a)
	{
		System.out.println("One message to a friend");
	}
	
	Facebook(int a , double b)
	{
		System.out.println("Two message to a friend");
	}

}

public class Mobile {
	public static void main(String[] args) {
       // create object of Facebook class. 
		new Facebook(1);
		new Facebook(1, 1.9);
		new Facebook(1, 1,1);
	}
}
