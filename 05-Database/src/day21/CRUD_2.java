package day21;

import java.util.Scanner;

public class CRUD_2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String data = """
					1. Add
					2. Update
					3. Delete according by id
					4. Delete all
					5. Select
					=> Choose (1,2,3,4,5) : """;
			System.out.print(data);
			int inp = Integer.parseInt(sc.nextLine());
			switch (inp) {
			case 1:
				add(sc);
				break;
			case 2:
				update(sc);
				break;
			case 3:
				DatabaseService.deleteAll();
				break;
			case 4:
				System.out.print("Enter product id to delete : => ");
				int p_id = Integer.parseInt(sc.nextLine());
				DatabaseService.deleteById(p_id);
				break;
			case 5:
				select(sc);
				break;

			default:
				break;
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	private static void add(Scanner sc) {
		try {
			System.out.println("Enter data for new product. ");
			System.out.print("Name : => ");
			String inp_name = sc.nextLine();

			System.out.print("Price : => ");
			float inp_price = Float.parseFloat(sc.nextLine());

			DatabaseService.save(inp_name, inp_price);
			System.out.println("Success added item to database.....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void update(Scanner sc) {
		try {

			System.out.print("Enter product id to update : => ");
			int inp_id = Integer.parseInt(sc.nextLine());
			System.out.println("Insert new product details....");
			System.out.print("Name : => ");
			String inp_name = sc.nextLine();

			System.out.print("Price : => ");
			float inp_price = Float.parseFloat(sc.nextLine());

			DatabaseService.update(inp_id, inp_name, inp_price);
			System.out.println("Updated product.....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void select(Scanner sc) {
		String data = """
				1. All products
				2. Single product
				3. Search with product name
				4. Filter by product price
				5. New arrival
				Choose number : => """;

		System.out.print(data);
		int inp_num = Integer.parseInt(sc.nextLine());
		if (inp_num == 1) {
		}
	}

}
