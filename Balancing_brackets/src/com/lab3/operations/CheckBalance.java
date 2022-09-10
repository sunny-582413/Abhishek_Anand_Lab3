package com.lab3.operations;

import java.util.*;

public class CheckBalance {

	public boolean check(String exp) {
		char c = ' ';
		Stack<Character> stack = new Stack<Character>();
		int len = exp.length();
		for (int i = 0; i < len; i++) {
			c = exp.charAt(i);

			switch (c) {
			case '(':
				stack.push('(');
				break;

			case '[':
				stack.push('[');
				break;

			case '{':
				stack.push('{');
				break;

			case ')':
				if (stack.isEmpty()) {
					return false;
				}
				stack.pop();
				break;

			case ']':
				if (stack.isEmpty()) {
					return false;
				}
				stack.pop();
				break;

			case '}':
				if (stack.isEmpty()) {
					return false;
				}
				stack.pop();
				break;
			}
		}
		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}

}
