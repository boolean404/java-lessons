package day5;

public class TwoD_OneD {
	public static void main(String[] args) {
		int[][] marks = { { 40, 50, 20, 30, 80 }, { 30, 80, 90, 60, 20 }, { 70, 60, 30, 70, 70 }, };

		String[] names = { "Aung Aung", "Kyaw Kyaw", "Su Su", };

		for (int i = 0; i < names.length; i++) {
			var total = 0;
			for (int j = 0; j < 5; j++) {
				total += marks[i][j];
			}

			System.out.println("Total marks obtained by Student : " + names[i] + " : " + total + " marks");
			System.out.println("Average : " + total / 5.0f + " marks");
		}

	}
}
