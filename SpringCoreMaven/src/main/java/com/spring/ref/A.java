package com.spring.ref;

public class A {

	private int x;
	private Sita ob;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public Sita getOb() {
		return ob;
	}
	public void setOb(Sita ob) {
		this.ob = ob;
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", ob=" + ob + "]";
	}
	
}
