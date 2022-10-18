package day4;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		userCountFilter();
	}

	public static void userCountFilter() {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers do you want to filter : ");
		int filterCount = sc.nextInt();
//		System.out.print(filterCounter);

		int i = 0;
		int[] numsArr;
		numsArr = new int[filterCount];

		while (i < filterCount) {
			System.out.print("Enter any number : ");
			int filterNum = sc.nextInt();
//			System.out.println(filterNum);
			numsArr[i] = filterNum;
//			System.out.println(nums[i]);
			i++;
		}

//		System.out.println(Arrays.toString(numsArr));
		System.out.println("-------------------------");

		int zeroCount = 0;
		int positiveCount = 0;
		int negativeCount = 0;
		for (int j = 0; j < numsArr.length; j++) {
//			System.out.println(numsArr[j]);
			if (numsArr[j] == 0) {
				zeroCount++;
			} else if (numsArr[j] > 0) {
				positiveCount++;
			} else if (numsArr[j] < 0) {
				negativeCount++;
			} else {
				System.out.println("Error");
			}

		}
		System.out.println("Numbers of zero : " + zeroCount);
		System.out.println("Numbers of positive numbers : " + positiveCount);
		System.out.println("Numbers of negative numbers : " + negativeCount);
	}
}
