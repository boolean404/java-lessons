package day12Assignment2;

import java.util.Arrays;

public class Person {
	// declare field
	private String name, nrcNo, address, phone;

	public Person() {
	}

	public Person(String name, String nrcNo, String address, String phone) {
		this.name = name;
		this.nrcNo = nrcNo;
		this.address = address;
		this.phone = phone;
	}

	// getter
	public String getName() {
		return name;
	}

	public String getNRCNo() {
		return nrcNo;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setNRCNo(String nrcNo) {
		this.nrcNo = nrcNo;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void showInfo() {
		System.out.println("Name is : => " + name);
		System.out.println("NRC Number is : => " + nrcNo);
		System.out.println("Address is : => " + address);
		System.out.println("Phone is : => " + phone);
	}

	public void showIdentificationInfo() {
		String[] division = { "Kachin State", "Kayah State", "Kayin State", "Chin State", "Sagaing Region",
				"Tanintharyi Region", "Bago Region", "Magway Region", "Mandalay Region", "Mon State", "Rakhine State",
				"Yangon Region", "Shan State", "Ayeyawady Region" };

		int index1 = nrcNo.indexOf("/");
		int index2 = nrcNo.indexOf("(");
		int index3 = nrcNo.indexOf(")");
		int index4 = nrcNo.length();

		String nrcDivision = null;
		int inpDivisionCode = Integer.parseInt(nrcNo.substring(0, index1));

		for (int i = 0; i < division.length; i++) {
			if ((inpDivisionCode - 1) == Arrays.asList(division).indexOf(division[i])) {
				nrcDivision = division[i];
				break;
			}
		}

		String nrcCity = nrcNo.substring(index1 + 1, index2);
		String nrcNumber = nrcNo.substring(index3 + 1, index4);

		System.out.println("Division or State : => " + nrcDivision);
		System.out.println("City : => " + nrcCity);
		System.out.println("NRC Number : => " + nrcNumber);
	}
}
