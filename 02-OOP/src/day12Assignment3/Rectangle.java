package day12Assignment3;

public class Rectangle extends Shape {
	private int length, width;

	public Rectangle(int length, int width, String color) {
		this.length = length;
		this.width = width;
		setColor(color);
	}

	@Override
	public double area() {
		return (this.length * this.width);

	}

	public void displayArea() {
		String area = String.format("%.2f", this.area());
		System.out.println("Area of the rectangle is : => " + area + " metres square.");
	}

}
