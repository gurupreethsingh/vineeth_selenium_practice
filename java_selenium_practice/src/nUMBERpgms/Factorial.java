package nUMBERpgms;

import java.util.Scanner;     

public class Factorial {

	public static void main(String[] args) {
		System.out.println("enter a number");
		int num;
		Scanner s=new Scanner(System.in);
		num= s.nextInt();
		for(int i=1;i<=num;i++)
		{
			System.out.print(num*i);
			
		}
		System.out.println();

	}

}
