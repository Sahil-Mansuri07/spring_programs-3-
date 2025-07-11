package com.mycompany;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Foo {

	
	
	Integer x;

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
		
		System.out.println("setting of x");
		
	}
	
	
	@PostConstruct
	public void start()
	{
	
		System.out.println("initttttttttttttttt");

	}

	@PreDestroy
	public void end()
	{
	
		System.out.println("destroyyyyyyyyyyyyyyy");
	
	}
	

	
}
