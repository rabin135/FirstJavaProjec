package com.git;

public class Calculator {
	public int add(int i, int j) {
		return i + j;
	}

	public static void main(String[] args) {
		System.out.println(new Calculator().add(4, 6));
	}
}
