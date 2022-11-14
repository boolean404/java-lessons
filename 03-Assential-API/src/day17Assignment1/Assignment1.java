package day17Assignment1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment1 {
	public static void main(String[] args) {
		System.out.println("================= Assignment 1 by Bo Bo Aung ==============");
		SalePeople salePeople1 = new SalePeople("Peel", "London", 0.12);
		SalePeople salePeople2 = new SalePeople("Serres", "San Jose", 0.13);
		SalePeople salePeople3 = new SalePeople("Motika", "London", 0.11);
		SalePeople salePeople4 = new SalePeople("Rifkin", "Barcelona", 0.15);
		SalePeople salePeople5 = new SalePeople("Axelrod", "New York", 0.10);
		List<SalePeople> salePeopleList = List.of(salePeople1, salePeople2, salePeople3, salePeople4, salePeople5);

		// 1
		System.out.println("\n1.======== Names and cities of all salespeople in London ======");
		System.out.println("Name \t City");
		System.out.println("=============");
		salePeopleList.stream()
				.filter(sp -> sp.getCity().equals("London") && sp.getComm() > 0.10)
				.forEach(sp -> System.out.println(sp.getName() + "\t" + sp.getCity()));

		// 2
		System.out.println("\n2.======== Details not having commission 0.10, 0.13 & 0.15 ========");
		System.out.println("Name \t City \t Comm");
		System.out.println("=====================");
		salePeopleList.stream()
				.filter(sp -> sp.getComm() != 0.10 && sp.getComm() != 0.13 && sp.getComm() != 0.15)
				.forEach(sp -> System.out.println(sp.getName() + "\t" + sp.getCity() + "\t" + sp.getComm()));

		// 3
		System.out.println("\n3.======== Different city names ======");
		System.out.println("City");
		System.out.println("====");
		List<String> diffCity = salePeopleList.stream()
				.map(sp -> sp.getCity())
				.distinct()
				.collect(Collectors.toList());
		diffCity.forEach(System.out::println);

		// 4
		System.out.println("\n4.======== Top of 3 salespeople ======");
		System.out.println("Name \t City \t Comm");
		System.out.println("=====================");
		salePeopleList.stream()
				.limit(3)
				.forEach(sp -> System.out.println(sp.getName() + "\t" + sp.getCity() + "\t" + sp.getComm()));

		// 5
		System.out.println("\n5.======= Who live in Rome =======");
		List<String> liveInRome = salePeopleList.stream()
				.filter(sp -> sp.getCity().equals("Rome"))
				.map(sp -> sp.getCity())
				.collect(Collectors.toList());
		if (liveInRome.size() != 0) 
			liveInRome.forEach(System.out::println);
		 else
			System.out.println("=> There is no sale people in 'Rome'");

		// 6
		System.out.println("\n6.======= Numbers of sales people who live in London =======");
		List<String> liveInLondon = salePeopleList.stream()
				.filter(sp -> sp.getCity().equals("London"))
				.map(sp -> sp.getCity())
				.collect(Collectors.toList());
		System.out.println("Numbers of sales people who live in London : => " + liveInLondon.size());

		// 7
		System.out.println("\n7.======= List of sales people in descending order of commission =======");

		List<SalePeople> sortedList = salePeopleList.stream()
				.sorted(Comparator.comparing(SalePeople::getComm).reversed())
				.collect(Collectors.toList());

		// list output of sale people in descending commission
		System.out.println("List of sorted descending by comm : => " + sortedList);

		System.out.println("\nName \t City \t Comm");
		System.out.println("=====================");
		sortedList.forEach(sp -> System.out.println(sp.getName() + "\t" + sp.getCity() + "\t" + sp.getComm()));

	}
}