package com.mycompany;

public class Foo {

	int x,y;
	
	public Foo(int x,int y)
	{
		this.x=x;
		this.y=y;
	System.out.println("Contineu int int "+x+"=>"+y);	
		
	}
	
	
	/*public Foo(String x,String y)
	{
		this.x=Integer.parseInt(x);
		this.y=Integer.parseInt(y);
		
	System.out.println("Continue String String "+x+"=>"+y);
		
	}
	*/
	
	public Foo(double x,double y)
	{
		this.x=(int)x;
		this.y=(int)y;
		
	System.out.println("Contineu Double Double "+x+"=>=>"+y);
		
	}
	
	
	
	
	
	public void add()
	{
		
		int z=x+y;
		System.out.println("Value=>"+z);
		//z=x*y;
		//System.out.println("The Multiplication Value is::=>"+z);
	}
	
	
}
