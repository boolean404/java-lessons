package day11;

import java.util.Arrays;

public class MethodOverloading {
	public static void main(String[] args) {
		System.out.println("100 + 200" + Additon.add(100, 200));
		System.out.println("100.0 + 200.0" + Additon.add(100.0f, 200.0f));
		System.out.println("Hello + Java" + Additon.add("Hello", "Java I'll kill you"));
		System.out.println("sum of array 100 + 200 + 300" + Additon.add(new int[] { 100, 200, 300 }));
	}
}

class Additon {
	static int add(int a, int b) {
		return (a + b);

	}

	static float add(float a, float b) {
		return (a + b);

	}

	static String add(String a, String b) {
		return (a + b);

	}

	static int add(int[] input) {
		return Arrays.stream(input).sum();

	}
}