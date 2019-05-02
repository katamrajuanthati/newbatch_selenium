package com.java.basics;

public class UseExtensionJava implements JavaBasicsClassInterface  {
	int a=5,b=10,c=20,d;
	
	void add()
	{
		d=a+b+c;
		System.out.println("addition of abc:"+d);
	}
	void sub()
	{
		d=(a+b)-c;
		System.out.println("sub of ab and c:"+d);
	}
	void mul()
	{
		d=a*b*c;
		System.out.println("mul of abc:"+d);
	}
	

	public static void main(String[] args) {
		
		UseExtensionJava jbc = new UseExtensionJava();

jbc.add();
jbc.sub();
jbc.mul();
jbc.test();
jbc.compare();
	}
	public void compare() {
		if (a>b)
		{
			System.out.println("a is higher than b");
		}
		else 
			
		{
			System.out.println("b is higer than a");
		}

	}
	public void test() {
		if (b>c)
		{
			System.out.println("b is higher than c");
			
		}
		else 
		{
			System.out.println("c is higher than b");
		}
	}

}
