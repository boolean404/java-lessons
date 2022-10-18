package day5;

import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {
		pcModelPriceCheck();
	}

	private static void pcModelPriceCheck() {
		String selectedBrand;
		String selectedCPU;
		double brandPriceArr[] = new double[4];
		double selectedProductPrice = 0;
		double exchangedProductPrice = 0;

		// brand name
		String[][] brandNames = { { "lenovo", "hp", "samsung", "acer", "dell", "asus" } };

		// cpu name
		String[] cpuNames = { "core i3", "core i5", "core i7", "core i9", };

		// price
		double[][] pcPrice = { { 230.21, 400.21, 294.2, 693.33, 340.44, 691.99 },
				{ 529.483, 920.483, 676.66, 159.659, 783.012, 1591.577 },
				{ 552.504, 960.504, 706.08, 1663.992, 617.056, 1660.776 },
				{ 690.63, 1200.63, 882.6, 2079.99, 1021.32, 2075.97 } };

		// row and column of pcPrice
		int row = pcPrice.length;
		int col = pcPrice[0].length;

		// user input start
		Scanner sc = new Scanner(System.in);
		System.out.println("--------Welcome to our Computer Store-------");

		// brand section
		System.out.println("\n--------Brands Categories---------");
		System.out.print("Enter brand name : ");
		String inpBrand = sc.nextLine();
		boolean brandStatus = true;

		for (int r = 0; r < brandNames.length; r++) {
			for (int c = 0; c < brandNames[0].length; c++) {
				if (inpBrand.equals(brandNames[r][c])) {
					System.out.println(inpBrand + " brand is available & selected.");

					// start brand detail
					selectedBrand = inpBrand;

					// start price
					for (int i = 0; i < row; i++) {
						for (int j = 0; j < col; j++) {
							double singleProcutPrice = pcPrice[i][j];
							if (selectedBrand.equals(brandNames[0][j])) {
								brandPriceArr[i] = singleProcutPrice;
							}
						}
					}
//					System.out.println(Arrays.toString(brandPriceArr));
					// end price
					// end brand detail

					// start cpu section
					System.out.println("\n--------CPU Categories---------");
					System.out.print("Enter CPU name : ");
					String inpCPU = sc.nextLine();
					boolean cpuStatus = true;

					for (int i = 0; i < cpuNames.length; i++) {
						// System.out.println(cpuNames[i]);

						if (inpCPU.equals(cpuNames[i])) {
							System.out.println(inpCPU + " CPU is available and selected.");

							// cpu detail
							selectedCPU = inpCPU;

							// start price
							for (int x = 0; x < brandPriceArr.length; x++) {
								if (selectedCPU.equals(cpuNames[x])) {
									selectedProductPrice = brandPriceArr[x];
								}
							}
//							System.out.println(selectedProductPrice);
							// end price

							// start currency section
							System.out.println("\n--------Currency Exchange Rate---------");
							System.out.println("Product price is $" + selectedProductPrice);
							System.out.print("Enter currency rate(MMK) to exchange : ");
							double inpCurrencyRate = sc.nextInt();
							// System.out.println(inpCurrencyRate);
							exchangedProductPrice = selectedProductPrice * inpCurrencyRate;
							// end currency section

							System.out.println("\n--------Product Details---------");
							System.out.println("Brand : " + selectedBrand);
							System.out.println("CPU : " + selectedCPU);
							System.out.println("Price(USD) : " + "$" + selectedProductPrice);
							System.out.println("Price(MMK) : " + exchangedProductPrice + " MMK");
							System.out.println("---------------------------------");

							// cpu detail

							cpuStatus = true;
							break;
						} else {
							cpuStatus = false;
						}
					}
					if (!cpuStatus) {
						System.out.println("Sorry!, " + inpCPU + " CPU is'nt available.");
						System.out.println("---------------------------------");

					}
					// end cpu section
					brandStatus = true;
					break;
				} else {
					brandStatus = false;
				}
			}
			if (!brandStatus) {
				System.out.println("Sorry!, " + inpBrand + " brand is'nt available.");
				System.out.println("---------------------------------");

			}
		}
	}
}
