package com.mycompany;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	
	@Value("#{12+13-5}")
	int x;
	
	@Value("#{12*5}")
	int y;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")
	double z;
	
	@Value("#{T(java.lang.Math).E}")
	double e;
	
	@Value("#{new String('Amit')}")
	String s;
	
	boolean b;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}
	
		
}
