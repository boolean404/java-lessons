package day8;

public class TryCatch2 {
	public static void main(String[] args) {
		try {
			int[] nums = {100,200,300};
			System.out.println(nums[3]);
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}System.out.println("Outside try catch block");
	}
}
