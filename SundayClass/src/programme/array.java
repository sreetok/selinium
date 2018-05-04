package programme;

import java.util.Scanner;

public class array {
	public static void main(String[] args)
	{
		int  asize, sum=0;
		Scanner SC=new Scanner(System.in);
		System.out.println("enter array size");
		asize=SC.nextInt(); 
		
		int[] y=new int[asize];
		System.out.println("values");
		for(int i=0;i<y.length;i++)
		{
			int val=SC.nextInt();
			System.out.println("y["+i+"]="+val);
			sum =sum+val;
			System.out.println("sum of array value is"+sum);
		}
		
		
		
		
		
	}

}
