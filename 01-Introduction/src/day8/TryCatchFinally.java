package day8;

public class TryCatchFinally {
	public static void main(String[] args) {
		try {
			String name = null;
			System.out.println("Length" + name.length());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println("Name is Null!");
		} finally {
			System.out.println("Finally block here!");
		}
		System.out.println("Outside of try-catch-finally");
	}
}
