package com.mycompany;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Foo implements InitializingBean,DisposableBean 
{
 int x;

 public int getX() {
	return x;
 }

 public void setX(int x) {
	this.x = x;
 }

 @Override
 public void destroy() throws Exception {
	System.out.println("Destroyyyyyyyyyyy");
 }

 @Override
 public void afterPropertiesSet() throws Exception {
	System.out.println("Inittttttttttttttt");
	
 }
 
	
}
