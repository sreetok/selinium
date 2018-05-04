package loops;

import java.util.Scanner;

public class switche {

	public static void main(String[] args) {
		int a=10,b=30,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("select the case....;");
		String var =sc.next();
		System.out.println(var);
		switch(var)
		{
		case "add":
			c=a+b;
			System.out.println("addition"+c);
			break;
		case "sub":
			c=b-a;
			System.out.println("sub"+c);
			break;
		case "mul":
			c=a*b;
			System.out.println("mul"+c);
			break;
		default:
			
			System.out.println("try again...");
			break;
			
			
		
	
			
			
		}
		
		
		
		
		
		
	}

}
