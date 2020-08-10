package com.org.test;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Mail Id");
		String a = sc.nextLine();

		if (a.contains("@gmail")) {
			System.out.println("Valid Mail Id");
		} else {
			System.out.println("Not Valid");
		}
	}

}
