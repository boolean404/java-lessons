package day14Assignment2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Assignment2 {
	static List<String> categoryList = new ArrayList<String>();
	static List<Author> authorList = new ArrayList<Author>();
	static List<Book> bookList = new ArrayList<Book>();

	public static void main(String[] args) {
		System.out.println("----------- Collection Assignment 2 by Bo Bo Aung -----------");

		// add category
		String cat1 = "Programming";
		String cat2 = "Fashional";
		String cat3 = "Business";
		String cat4 = "Love Story";
		categoryList.add(cat1);
		categoryList.add(cat2);
		categoryList.add(cat3);
		categoryList.add(cat4);

		// add author
		Author auth1 = new Author("Bo Bo Aung", "Japan");
		Author auth2 = new Author("Zin Htet Aung", "Myanmar");
		Author auth3 = new Author("Naing Htet Lin", "America");
		authorList.add(auth1);
		authorList.add(auth2);
		authorList.add(auth3);

		// add book
		LocalDate dateNow = LocalDate.now();
		LocalDate date1 = LocalDate.of(2000, 10, 22);
		LocalDate date2 = LocalDate.of(1999, 7, 19);
		LocalDate date3 = LocalDate.of(2012, 2, 6);
		Book book1 = new Book(100_1, "HTML Basic", cat1, date1, auth1);
		Book book2 = new Book(100_2, "Living Smart", cat2, date2, auth2);
		Book book3 = new Book(100_3, "Love Yourself", cat4, date3, auth1);
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);

		Scanner sc = new Scanner(System.in);
		boolean restartStatus = true;

		try {
			while (restartStatus) {
				System.out.println("\n--------- Main Menu of Our MMITC Book Shop -----------");
				System.out.println("=> 1. View all books.");
				System.out.println("=> 2. View all authors.");
				System.out.println("=> 3. View all categories.");
				System.out.println("=> 4. Add a new book (Need all book information).");
				System.out.println("=> 5. Exit from shop.");

				System.out.print("\nEnter a process number(1-5) : => ");
				int inpProcNum = sc.nextInt();

				while (inpProcNum <= 0 || inpProcNum > 5) {
					System.err.print("Enter a number between (1,5), try again : ");
					inpProcNum = sc.nextInt();
				}
				System.out.println("");
				switch (inpProcNum) {

				case 1: {
					System.out.println("--------- Choose Type Of View Books -----------");
					System.out.println("=> 1. View all books with their information.");
					System.out.println("=> 2. View all books by author name.");
					System.out.println("=> 3. View all books by categories.");
					System.out.println("=> 4. Exit from shop.");

					System.out.print("\nEnter a view type number(1-4) : => ");
					int inpViewNum = sc.nextInt();
					
					while (inpViewNum <= 0 || inpViewNum > 4) {
						System.err.print("Enter a number between (1,4), try again : ");
						inpViewNum = sc.nextInt();
					}
					
					switch (inpViewNum) {
					case 1: {
						System.out.println("---------------- All books Information -----------------");
						System.out.println("Code No.  Title \t Category \t Author \t Publish Date");
						System.out.println("----------------------------------------------------------------------");
						bookList.forEach(book -> {
							System.out.println(book.getCode() + "\t" + book.getTitle() + "\t" + book.getCategory()
									+ "\t" + book.getAuthor().getName() + "\t" + book.getPublishDate());
						});
						break;
					}
					case 2: {
						System.out.println("----------------- View Book by Author Name ----------------");
						System.out.print("Enter author name : => ");
						sc.nextLine();
						String inpAuthName = sc.nextLine();
						ArrayList<String> auths = new ArrayList<String>();
						ArrayList<String> authNameInBook = new ArrayList<String>();

						authorList.forEach(auth -> {
							auths.add(auth.getName());
						});

						if (auths.contains(inpAuthName)) {
							bookList.forEach(book -> {
								if (book.getAuthor().getName().equals(inpAuthName)) {
									authNameInBook.add(book.getAuthor().getName());
								}
							});
							if (authNameInBook.contains(inpAuthName)) {
								System.out.println(
										"\n=> The following books are written by author '" + inpAuthName + "'.");
								System.out.println("Code No.  Title \t Category \t Author \t Publish Date");
								System.out.println(
										"----------------------------------------------------------------------");

								bookList.forEach(book -> {

									if (book.getAuthor().getName().equals(inpAuthName)) {
										System.out.println(book.getCode() + "\t" + book.getTitle() + "\t"
												+ book.getCategory() + "\t" + book.getAuthor().getName() + "\t"
												+ book.getPublishDate());
									}
								});

							} else {
								System.out.println("=> There is no book written by author '" + inpAuthName + "'.");
							}

						} else {
							System.out.println("=> There is no author '" + inpAuthName + "'.");
						}
						break;
					}
					case 3: {
						System.out.println("----------------- View Book by Category ----------------");
						System.out.print("Enter category name : => ");
						sc.nextLine();
						String inpCatName = sc.nextLine();
						Collections.sort(categoryList);
						ArrayList<String> cats = new ArrayList<String>();

						if (categoryList.contains(inpCatName)) {
							bookList.forEach(book -> {
								if (book.getCategory().equals(inpCatName)) {
									cats.add(book.getCategory());
								}
							});

							if (cats.contains(inpCatName)) {
								System.out.println(
										"\n=> The following books are listed by '" + inpCatName + "' category.");
								System.out.println("Code No.  Title \t Category \t Author \t Publish Date");
								System.out.println(
										"----------------------------------------------------------------------");
								bookList.forEach(book -> {
									if (inpCatName.equals(book.getCategory())) {
										System.out.println(book.getCode() + "\t" + book.getTitle() + "\t"
												+ book.getCategory() + "\t" + book.getAuthor().getName() + "\t"
												+ book.getPublishDate());
									}
								});
							} else {
								System.out.println("There is no book with '" + inpCatName + "' category.");
							}
						} else {
							System.out.println("There is no '" + inpCatName + "' category.");
						}
						break;
					}
					case 4: {
						return;
					}
					}
					break;
				}
				case 2: {
					System.out.println("---------------- All Authors Information -----------------");
					System.out.println("Author Name \t Country");
					System.out.println("--------------------------");
					authorList.forEach(auth -> {
						System.out.println(auth.getName() + "\t" + auth.getCountry());
					});
					break;
				}
				case 3: {
					System.out.println("----------------- All Books Category ----------------");
					System.out.println("Category Name");
					System.out.println("-------------");
					categoryList.forEach(cat -> {
						System.out.println(cat);
					});
					break;
				}
				case 4: {
					System.out.println("----------------- Add Book Process ----------------");
					System.out.print("Enter book code number : => ");
					int addBookCode = sc.nextInt();
					boolean createCatStatus = true;
					boolean createBookStatus = true;

					System.out.print("Enter book title : => ");
					sc.nextLine();
					String addBookTitle = sc.nextLine();

					System.out.print("Enter book category : => ");
					String addBookCategory = sc.nextLine();
					if (!categoryList.contains(addBookCategory)) {
						categoryList.add(addBookCategory);
						createCatStatus = false;
					}

					ArrayList<String> authCountry = new ArrayList<String>();
					Author newAuth = new Author();

					System.out.print("Enter book author name : => ");
					String addBookAuthorName = sc.nextLine();
					authorList.forEach(auth -> {
						if (auth.getName().equals(addBookAuthorName)) {
							authCountry.add(auth.getCountry());
						}
					});

					// add author
					if (authCountry.size() == 0) {
						System.out.print("Enter country for a new author : => ");
						String newAuthCountry = sc.nextLine();
						newAuth = new Author(addBookAuthorName, newAuthCountry);
						authorList.add(newAuth);
						createBookStatus = false;
					} 
					
					// add book
					bookList.add(new Book(addBookCode, addBookTitle, addBookCategory, dateNow, newAuth));
					System.out.println("");
					if (!createCatStatus) {
						System.out.println("=> Successful create a new category");
					}
					if (!createBookStatus) {
						System.out.println("=> Successful create a new author");
					}
					System.out.println("=> Successful added book.");
					break;
				}
				case 5: {
					restartStatus = false;
					return;
				}

				}
				if (restartStatus) {
					System.out.print("\nPress 'y' to Main Menu and 'e' for Exit! : ");
					String inpVal = sc.next();
					String yOeValue = inpVal.toLowerCase();

					while (!yOeValue.equals("y") && !yOeValue.equals("e")) {
						System.err.print("Press 'y' or 'e' only, try again : ");
						yOeValue = sc.next();
					}
					if (yOeValue.equals("y")) {
						restartStatus = true;
					} else {
						restartStatus = false;
					}
				}
			}
		} catch (InputMismatchException e) {
			System.err.println("Input number must be a number!");
		} finally {
			sc.close();
			System.out.println("=> Exited from the shop");
			System.out.println("=> Bye! ;)");
		}

	}
}
