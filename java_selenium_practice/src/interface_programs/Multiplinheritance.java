package interface_programs;

interface Suresh
{
	int a = 100;
}

interface Ramesh
{
	int b = 200;
}

interface Mahesh 
{
	int c = 300;
}

interface Vineeth extends Suresh , Ramesh, Mahesh
{
	
}

class Sample implements Vineeth{
	
}


public class Multiplinheritance {

	public static void main(String[] args) 
	{
		Sample s = new Sample();
		System.out.println(s.a);
		System.out.println(s.b);
		System.out.println(s.c);
	}
}
