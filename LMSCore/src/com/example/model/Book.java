package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class Book {

	private int bookId;
	private String title;
	private int qty;
	private String author;
	private String genre;
	private int issuedQty;
	private List<Issue> issues = new ArrayList<>();
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
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
	public int getIssuedQty() {
		return issuedQty;
	}
	public void setIssuedQty(int issuedQty) {
		this.issuedQty = issuedQty;
	}
	public Book(int bookId, String title, int qty, String author, String genre,int issuedQty) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.qty = qty;
		this.author = author;
		this.genre = genre;
		this.issuedQty=issuedQty;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}


}
