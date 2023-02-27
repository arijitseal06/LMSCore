package com.example.model;

import java.time.LocalDate;

public class Issue {

	private int issueId;
	private LocalDate issueDate;
	private Book book;
	private String status;
	private User user;
	public int getIssueId() {
		return issueId;
	}
	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}
	public LocalDate getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Issue(int issueId, LocalDate issueDate, Book book, String status, User user) {
		super();
		this.issueId = issueId;
		this.issueDate = issueDate;
		this.book = book;
		this.status = status;
		this.user = user;
	}
	public Issue() {
		super();
		// TODO Auto-generated constructor stub
	}

}
