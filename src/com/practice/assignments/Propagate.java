package com.practice.assignments;

public class Propagate {

	public static void main(String[] args) {
		try {
			System.out.println(reverse("Vellanki"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Closed");
		}
	}

	private static String reverse(String str) throws Exception {
		String reverseStr = "";
		if (str.length() == 0) {
			throw new Exception("Please enter the valid string");
		}
		for (int i = str.length()-1; i >= 0; i=counter(i)) {
			System.out.println(i);
			reverseStr += str.charAt(i);
		}
		return reverseStr;
	}

	private static int counter(int i) {
		System.out.println(i);
		return i--;
	}
	
}
