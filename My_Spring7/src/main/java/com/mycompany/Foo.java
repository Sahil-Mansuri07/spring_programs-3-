package com.mycompany;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Foo {

	int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("Initttttttttttt");
	}
	@PreDestroy
	public void end()
	{
	
		System.out.println("Destroyyyyyyyyyy");
		
	}

}
