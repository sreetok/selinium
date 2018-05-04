package programme;

public class method {
	public void m1(int i)
	{
	System.out.println("hi i am m1 mehod in class mehod:"+i);
	
	}
	public void m1(float f)
	{
		System.out.println("hi i am m4 method in class method:"+f);
		
		
	}
	public static void main(String[] args) {
		method m=new method();
		m.m1(10);
		m.m1(55.77f);
		
		
		
	}
}
