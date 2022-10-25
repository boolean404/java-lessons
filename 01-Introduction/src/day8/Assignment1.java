package day8;

import java.util.Arrays;

public class Assignment1 {
	public static void main(String[] args) {
		System.out.println("---------- Assignment 1 by Bo Bo Aung -----------\n");
		try {
			// be careful, only one line uncomment under arrays

			// uncomment under line to test ArithmeticException
//			String[] strArr = {};

			// uncomment under line to test ArrayIndexOutOfBoundsException
//			String[] strArr = { "1", "2", "3", "4", "5", "6" };

			// uncomment under line code to test IllegalArgumentException
//			String[] strArr = { "maung", "bo", "4", "0", "4" };

			// uncomment under line code for output
			String[] strArr = { "1", "2", "3", "4", "5" };

			StringToNum nums = new StringToNum(strArr);
			int[] numsArr = nums.nums;
			int total = 0;
			for (int num : nums.nums) {
				total += num;
			}

			// start ArithmeticException
			int avg = total / numsArr.length;
			if (avg == 0) {
				throw new ArithmeticException("You inputted empty array.");
			}
			// end ArithmeticException

			int min = Arrays.stream(numsArr).min().getAsInt();
			int max = Arrays.stream(numsArr).max().getAsInt();

			// output
			System.out.println("----------- Output ------------");
			System.out.println("Minimun value is = " + min);
			System.out.println("Maximum value is = " + max);
			System.out.println("Average value is = " + avg);

		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());

		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());

		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());

		} finally {
			System.out.println("----------- Bye ------------");
		}
	}
}

class StringToNum {
	int[] nums = new int[5];

	public StringToNum(String[] data) {

		// start ArrayIndexOutOfBoundsException
		if (data.length > 5) {
			throw new ArrayIndexOutOfBoundsException("Only need 5 value! You inputed " + data.length + ".");
		}
		// end ArrayIndexOutOfBoundsException

		for (int i = 0; i < data.length; i++) {
			this.nums[i] = Integer.parseInt(data[i]);
		}
	}
}