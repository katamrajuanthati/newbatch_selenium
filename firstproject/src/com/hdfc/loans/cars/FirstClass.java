package com.hdfc.loans.cars;

public class FirstClass implements Rbc{

	
	int a=10,b=20,c;
	void add()
	{
		c=a+b;
		System.out.println("addition of two variables:"+c );
	}
	void sub()
	{
		c=a-b;
		System.out.println("sub of two variables:"+c );
	}
	public static void main(String[] args) {
		FirstClass fc = new FirstClass();
		fc.add();
		fc.sub();
		fc.balance();
		fc.withdraw();

	}
	public void balance() {
		if (a>b){
			
			System.out.println("a is greater than b");
		}
		
		else 
		{
		System.out.println("b is greater than a");
		}
	}
	public void withdraw() {
		if (a==b)
		{
			System.out.println("both values are same");
		}
		else {
			System.out.println("both are diff values");
		}
	}

}
