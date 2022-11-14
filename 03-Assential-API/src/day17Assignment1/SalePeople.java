package day17Assignment1;

public class SalePeople {

	private String name, city;
	private double comm;

	public SalePeople(String name, String city, double comm) {
		super();
		this.name = name;
		this.city = city;
		this.comm = comm;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "SalePeople [name=" + name + ", city=" + city + ", comm=" + comm + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}
}
