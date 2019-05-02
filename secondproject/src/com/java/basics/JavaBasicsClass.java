package com.java.basics;

public class JavaBasicsClass {
	int a=10,b=5,c=15,d;
	
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
		
JavaBasicsClass jbc = new JavaBasicsClass();

jbc.add();
jbc.sub();
jbc.mul();

	}

}
