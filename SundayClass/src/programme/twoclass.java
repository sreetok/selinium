package programme;

import Programe2.threeclass;

public class twoclass extends Oneclass {
	public void m2()
	{
		System.out.println("i am m2 method in class two");
		
	}
	public static void main(String[] args) {
		twoclass o2=new twoclass();
		o2.m2();
		o2.m1();
		Oneclass o1=new Oneclass();
		o1.m1();
		threeclass o3=new threeclass();
		o3.m3();
		
		
		
		
		
		
		
		
		
	}

}
