package programme;

import java.util.Scanner;

public class grade {
	public static void main(String[] args) {
		
		int mark []=new int [5];
		int i;
		float sum=0,avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks obtained in 5 subjects");
		for( i=0;i<5;i++) 
		{
			mark[i]=sc.nextInt();
			sum=sum+mark[i];
		}
		avg=sum/5;
		
		if(avg>90)
			System.out.println("A grade");
		else if(avg<=90 && avg>60)
			System.out.println("B grade");
		else if(avg<=60 && avg>40)
			System.out.println("C grade");
		else
			System.out.println("D grade");
		
						
		System.out.println();
		}
		
	}


