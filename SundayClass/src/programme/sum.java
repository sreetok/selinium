package programme;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
	
		int a,b,c;
		int sum=0,eve=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		sum=a+b+c;
		System.out.println("sum ot three numbers="+sum);
		eve=sum/3;
		//System.out.println("everage of three numbers"+eve);
		
		

	}

}
