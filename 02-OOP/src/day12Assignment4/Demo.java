package day12Assignment4;

public class Demo {
	public static void main(String[] args) {
		System.out.println("-------------- Assignment 4 by Bo Bo Aung --------------\n");

		Shape[] shapeArr = new Shape[2];

		shapeArr[0] = new Cube(5);
		shapeArr[1] = new Circle(5);

		for (int i = 0; i < shapeArr.length; i++) {
			double are = shapeArr[i].area();
			double volum = shapeArr[i].volume();

			String area = String.format("%.2f", are);
			String volume = String.format("%.2f", volum);
			System.out.println("Area of " + shapeArr[i].getName() + " is : => " + area);
			System.out.println("volume of " + shapeArr[i].getName() + " is : => " + volume);
		}

	}
}
