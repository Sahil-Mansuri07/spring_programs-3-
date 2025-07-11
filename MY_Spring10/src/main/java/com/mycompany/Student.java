package com.mycompany;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {

	Integer roll;
	String name;
	
	@Value("15.5")
	Double percent;

	public Integer getRoll() {
		return roll;
	}

	
	@Value("101")
	public void setRoll(Integer roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	
	@Value("James")
	public void setName(String name) {
		this.name = name;
	}

	public Double getPercent() {
		return percent;
	}

	public void setPercent(Double percent) {
		this.percent = percent;
	}
	
	
	
}
