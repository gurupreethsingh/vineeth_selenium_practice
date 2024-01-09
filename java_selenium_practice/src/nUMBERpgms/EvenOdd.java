package nUMBERpgms;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int num;
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		if(num%2==0)
		{ 
			System.out.println("the number is even");
		}
		else
		{
			System.out.println("the number is odd");
		}
	}
}