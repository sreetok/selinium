package programme;

import java.util.Scanner;

public class calc 
{

	public static void main(String[] args)
	{
		float a,b,res;
		char choice,ch;
		Scanner sc=new Scanner(System.in);
		
		do
		{
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.multiplication");
			System.out.println("4.Divison");
			System.out.println("5.Exit");
			System.out.println("enter u r choice");
			
		choice=sc.next().charAt(0);
		switch(choice)
		{
		
		case '1':
		System.out.println("enter two numbers");
		a=sc.nextFloat();
		b=sc.nextFloat();
		res=a+b;
		System.out.println("result"+res);
		break;
		
		case '2':
		System.out.println("enter two numbers");
		a=sc.nextFloat();
		b=sc.nextFloat();
		res=a-b;
		System.out.println("result"+res);
		break;
		
		case '3':
		System.out.println("enter two numbers");
		a=sc.nextFloat();
		b=sc.nextFloat();
		res=a*b;
		System.out.println("multiplication"+res);
		break;
		
		case '4':
		System.out.println("enter two numbers");
		a=sc.nextFloat();
		b=sc.nextFloat();
		res=a/b;
		System.out.println("divison"+res);
		break;
		
		case '5':
			System.exit(0);
			break;
			
			
			default:
				System.out.println("wrong choice");
				break;
		}
		
         System.out.println("\n....................");
		}
		while(choice!=5);
		
		
	}
		
	
}





			
			
			
			
		
				
		
		
		
		
