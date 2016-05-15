package com.practice.assignments;
public class Teacher extends Person {

	private String handedness;
	private String areaOfInterest;
	private double salary;

	public Teacher(String firstName, String lastName, int age,
			String handedness, String areaOfInterest, double salary) {
		super(firstName, lastName, age);
		this.handedness = handedness;
		this.areaOfInterest = areaOfInterest;
		this.salary = salary;
	}

	@Override
	public void addPersonAge(int addAge) {
		this.setAge(this.getAge() + addAge);
	}

	public String getHandedness() {
		return handedness;
	}

	public void setHandedness(String handedness) {
		this.handedness = handedness;
	}

	public String getAreaOfInterest() {
		return areaOfInterest;
	}

	public void setAreaOfInterest(String areaOfInterest) {
		this.areaOfInterest = areaOfInterest;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
