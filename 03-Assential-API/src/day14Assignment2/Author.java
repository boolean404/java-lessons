package day14Assignment2;

public class Author {
	private String name, country;

	public Author() {

	}

	public Author(String name, String country) {
		this.name = name;
		this.country = country;
	}

	// getter
	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
