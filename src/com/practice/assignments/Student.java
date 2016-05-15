package com.practice.assignments;
public class Student extends Person {

	private String admissionNum;
	private String zodiacSign;
	private String major;

	public Student(String firstName, String lastName, int age,
			String admissionNum, String zodiacSign, String major) {
		super(firstName, lastName, age);
		this.admissionNum = admissionNum;
		this.zodiacSign = zodiacSign;
		this.major = major;
	}

	@Override
	public void substractPersonAge(int substractAge) {
		this.setAge(this.getAge() - substractAge);

	}

	public String getAdmissionNum() {
		return admissionNum;
	}

	public void setAdmissionNum(String admissionNum) {
		this.admissionNum = admissionNum;
	}

	public String getZodiacSign() {
		return zodiacSign;
	}

	public void setZodiacSign(String zodiacSign) {
		this.zodiacSign = zodiacSign;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}
