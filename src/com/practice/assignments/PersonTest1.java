package com.practice.assignments;
import java.util.Scanner;

public class PersonTest1 {

	public static void main(String[] args) throws MyException {

		// Person[] p = new Person[10];
		Person person1 = new Person("Ram", "V", 56);
		Person person2 = new Person("sai", "k", 0);

	

		System.out.println("person1:- First Name :" + person1.getFirstName() + ", last name  :" + person1.getLastName()
				+ ", age :" + person1.getAge());
		System.out.println("person2:- First Name :" + person2.getFirstName() + ", last name  :" + person2.getLastName()
				+ ", age :" + person2.getAge());

		System.out.println("Add Person1's Age With:");
		Scanner input = new Scanner(System.in);
		int addAge = input.nextInt();
		try {
			person1.addPersonAge(addAge);
			System.out.println("Person1's Age after addition is :" + person1.getAge());

			System.out.println("Substract Person2's Age with:");
			Scanner input2 = new Scanner(System.in);
			int substractAge = input.nextInt();

			person2.substractPersonAge(substractAge);
			System.out.println("Person2's Age after substraction is :" + person2.getAge());

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}
}
