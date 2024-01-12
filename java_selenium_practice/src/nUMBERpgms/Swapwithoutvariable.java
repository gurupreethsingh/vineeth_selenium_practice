package nUMBERpgms;

public class Swapwithoutvariable {

	public static void main(String[] args) {
		System.out.println("before swapping");
		int a=10;
		int b=20;
		
		System.out.print(a);
		System.out.print(b);
		System.out.println();
		System.out.println("after Swapping");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print(a);
		System.out.print(b);

	}

}
