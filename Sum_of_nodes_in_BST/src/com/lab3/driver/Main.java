package com.lab3.driver;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	static class Node {
		int data;
		Node left, right;
	};

	static Node NewNode(int data) {
		Node temp = new Node();
		temp.data = data;
		temp.left = null;
		temp.right = null;
		return temp;
	}

	static Node insert(Node root, int key) {
		if (root == null)
			return NewNode(key);
		if (key < root.data)
			root.left = insert(root.left, key);
		else
			root.right = insert(root.right, key);
		return root;
	}

	static boolean findpairUtil(Node root, int sum, HashSet<Integer> set) {
		if (root == null)
			return false;

		if (findpairUtil(root.left, sum, set))
			return true;

		if (set.contains(sum - root.data)) {
			System.out.println("Pair is (" + (sum - root.data) + ", " + root.data + ")");
			return true;
		} else
			set.add(root.data);

		return findpairUtil(root.right, sum, set);
	}

	static void findPair(Node root, int sum) {
		HashSet<Integer> set = new HashSet<Integer>();
		if (!findpairUtil(root, sum, set))
			System.out.print("Nodes are not found!" + "\n");
	}

	// Driver
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Node root = null;
		root = insert(root, 40);
		root = insert(root, 20);
		root = insert(root, 60);
		root = insert(root, 10);
		root = insert(root, 30);
		root = insert(root, 50);
		root = insert(root, 70);
		int sum;
		boolean choice = false;
		char input = ' ';
		do {
			System.out.println("Sum= ");
			sum = sc.nextInt();
			findPair(root, sum);
			System.out.println("would you like to find another pair(y/n) ?");
			input = sc.next().charAt(0);
			if (input == 'y') {
				choice = true;
			} else
				choice = false;

		} while (choice);
		sc.close();
	}
}
