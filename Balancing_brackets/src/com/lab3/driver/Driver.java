package com.lab3.driver;

import com.lab3.operations.CheckBalance;

public class Driver {

	public static void main(String[] args) {

		boolean check;

		String exp1 = "( [ [ { } ] ] )";
		String exp2 = "( ((([]{{))}}}]]]";

		CheckBalance obj = new CheckBalance();

		System.out.println("( [ [ { } ] ] )");
		check = obj.check(exp1);
		if (check) {
			System.out.println("The entered string has balanced brackets.");

		} else {
			System.out.println("The entered string does not contain balanced brackets.");
		}
		System.out.println("for the expression ( ((([]{{))}}}]]]");
		check = obj.check(exp2);
		if (check) {
			System.out.println("The entered string has balanced brackets.");

		} else {
			System.out.println("The entered string does not contain balanced brackets.");
		}

	}

}
