package nUMBERpgms;

import java.util.Scanner;

public class Primenum {

	public static void main(String[] args) {
		int num;
		boolean result=true;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		for(int i=2;i<=num-1;i++)
		{
			if(num%2==0)
			{
				result=false;
				break;
			}
			if(result==true)
			{
				System.out.println("prime number");
			
			}
			else {
				System.out.println("not prime");
			}
					}

	}
}
