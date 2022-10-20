package day7;

public class Assignment1 {
	public static void main(String[] args) {
		String paragraph = "NLP techniques are becoming widely popular scientific research areas as well as Information Technology industry. Language technology together with Information Technology can enhance the lives of people with different capabilities. This system implements voice command mobile phone dialer application. The strength of the system is that it can make phone call to the contact name written in either English scripts or Myanmar scripts.";

		System.out.println("------------ Assignment 1 by Bo Bo Aung -------------");

		// find sentences
		int numOfSentences = 0;
		String[] strArr = paragraph.split(" ");
		for (String str : strArr) {
			if (str.endsWith(".")) {
				numOfSentences++;
			}
		}
		System.out.println("\nNumber of sentences are : " + numOfSentences);
		System.out.println("Total Words is : " + paragraph.length());
	}

}
