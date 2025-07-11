package com.mycompany;

public class Foo {

 int a,b;	
	
 

 public Foo(Double a,Double b) 
 {
	 
	 this.a=a.intValue();
	 this.b=b.intValue();
	 
	 System.out.println("Contineu double double==>>"+a+"<👉👉👉>"+b);
	 
 }
 
 

 public Foo(int a,int b) 
 {
	 
	this.a=a;
	this.b=b;
	
	System.out.println("Contineu int int==>>"+a+"<👉👉👉>"+b);
	 
 }
		
	
	
 public Foo(String a,String b) 
 {

	 this.a=Integer.parseInt(a);
	 this.b=Integer.parseInt(b);
	 
	 System.out.println("Contineu strng strng==>>"+a+"<👉👉👉>"+b);
	 
	
 }	
	
 
	
 public  void add()
 {
	 
	 int c=a+b;
	 
	System.out.println("The Value is:=>👉👉👉👉👉👉👉"+c);
	 
 }
	
	
}
