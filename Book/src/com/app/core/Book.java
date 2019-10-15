package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {
	
	private String title;
	private String author;
	private double price;
	private Date publishDate;
	public static SimpleDateFormat sdf;
	
	static
	{
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}
	
	
	
	public Book(String title, String author, double price, Date publishDate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publishDate = publishDate;
	}


	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", publishDate=" + sdf.format(publishDate)
				+ "]";
	}


	public String getTitle() {
		return title;
	}


	public String getAuthor() {
		return author;
	}


	public double getPrice() {
		return price;
	}


	public Date getPublishDate() {
		return publishDate;
	}


	public static SimpleDateFormat getSdf() {
		return sdf;
	}
	
	
	
	
	
	

}
