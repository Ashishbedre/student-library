package com.example.entities;
//Book Entity
@Entity
public class Book {

	@Id
	private Long id;
	private String name;
	private String author;
	private String genre;
	private String publisher;
	private int quantity;
	private String description;
	
	public Book() {
		
	}

	public Book(Long id, String name, String author, String genre, String publisher, int quantity,
			String description) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.genre = genre;
		this.publisher = publisher;
		this.quantity = quantity;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", genre=" + genre + ", publisher="
				+ publisher + ", quantity=" + quantity + ", description=" + description + "]";
	}
	
	
}

