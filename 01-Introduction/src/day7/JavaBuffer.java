package day7;

public class JavaBuffer {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("Java Programming");
		buffer.append("language");
		System.out.println(buffer);
		
		buffer.insert(0, "Hello");
		System.out.println(buffer);
		
		buffer.replace(0, 0, "Dart");
		System.out.println(buffer);
		
		buffer.replace(0, 0, "Hi");
		System.out.println(buffer);

		buffer.delete(0, buffer.length());
		System.out.println(buffer);
	}
}
