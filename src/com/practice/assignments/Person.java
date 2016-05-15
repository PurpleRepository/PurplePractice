package com.practice.assignments;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	final private String col;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
		col="Vellanki";
	}
	public String getCol() {
		return col;
	}
	/**
	 * Constructor.
	 * 
	 * @param firstName
	 * @param lastName
	 * @param age
	 */
	public Person(String firstName, String lastName, int age) {
		super();
		col = "Veerendra";
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public void method() throws ArithmeticException {

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void addPersonAge(int addAge) throws MyException {
			age = addAge + age;

			if (age >= 120 || age <= 0) {
				age = 1;
				throw new MyException("The Age after Addition is out of Boundry. Please try again.");
			}
	}

	public void substractPersonAge(int substractAge) throws MyException{
			age = age - substractAge;

			if (age >= 120 || age <= 0) {
				age = 1;
				throw new MyException("The Age after Substraction is out of Boundry. Please try again.");
			}
		
	}

}
