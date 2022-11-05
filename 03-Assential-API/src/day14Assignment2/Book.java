package day14Assignment2;

import java.time.LocalDate;

public class Book {
	private int code;
	private String title, category;
	private LocalDate publishDate;
	private Author author;
	
	

	public Book(int code, String title, String category, LocalDate publishDate, Author author) {
		this.setCode(code);
		this.setTitle(title);
		this.setCategory(category);
		this.setPublishDate(publishDate);
		this.setAuthor(author);
	}

	// getter
	public int getCode() {
		return code;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public Author getAuthor() {
		return author;
	}

	// setter
	public void setCode(int code) {
		this.code = code;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

}
