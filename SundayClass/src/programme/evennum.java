package programme;

import java.util.Scanner;

public class evennum {

	public static void main(String[] args)
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		num=sc.nextInt();
		
		if(num%2==0)
			System.out.println("it is even number");
		
		else
			System.out.println("it is odd number");
		
		

	}

}
