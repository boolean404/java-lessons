package day4;

public class Looping {
	public static void main(String[] args) {
		allLoop();
	}
	

	public static void allLoop() {
		String names[] = {
				"Aung Aung", "Bo Bo", "Tun Tun"
		};
//		for loop
		System.out.print("--------For Loop------");
		for(int i = 0; i< names.length; i++) {
			System.out.println("Name is " + names[i]);
		}
		
//		while loop
		System.out.println("--------While Loop---------");
		int j=0;
		while(j< names.length) {
		System.out.print(names[j]);
		j++;
		
		}
		
//		for each
	}
}
