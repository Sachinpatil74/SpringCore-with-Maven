package com.spring.cons;

public class Person {

	private String personId;
	private int personName;
	private Certi certi;
	public Person(String personId, int personName, Certi certi) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.certi = certi;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + "]";
	}
	
}

