package com.sj.model;

import java.util.Objects;

public class Book implements Comparable<Book> {
	private int id;
	private String title;
	private String author;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Book(int id, String title, String author, int price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		/*if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return id == other.id;*/
		Book b = (Book) obj;
		if(this.id==b.id && this.title == b.title && this.author==b.author && this.price==b.price) {
			return true;
		}
		return false;
	}
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		if(this.id<o.id) {
		return -1;
		}
		if(this.id>o.id) {
			return 1;
		}
		return 0;
	}
	
	
}
