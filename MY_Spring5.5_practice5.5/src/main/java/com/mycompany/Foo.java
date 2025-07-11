package com.mycompany;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Foo implements InitializingBean, DisposableBean {

	
	Integer x;
	
	
	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
		
		System.out.println("Setting of X");
		
	}

	@Override
	public void destroy() throws Exception {

		System.out.println("Destroyyyyyyyyyyyyyy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		
		System.out.println("Inittttttttttttttttt");
		
	}

}
