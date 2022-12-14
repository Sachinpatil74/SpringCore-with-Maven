package com.springcore.SPEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Student {
    
	@Value("#{22+55}")
	private int x;
	@Value("#{25+879+2546+25+2*8}")
	
	private int y;
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
	@Override
	public String toString() {
		return "Student [x=" + x + ", y=" + y + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}