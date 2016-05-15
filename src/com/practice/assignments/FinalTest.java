package com.practice.assignments;

public class FinalTest extends Person {
	String col;
	final Person one = new Person();
	final Integer val = 6;
	private Person myVar = initializeInstanceVariable();

	protected final Person initializeInstanceVariable() {

		// initialization code goes here
		return new Person();
	}

	public FinalTest() {
		// TODO Auto-generated constructor stub
		one.setFirstName("Test1");
	}

	{

	}
	static {

	}

	public static void main(String[] args) {
	}
}
