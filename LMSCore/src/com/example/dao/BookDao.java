package com.example.dao;

import java.util.List;

import com.example.model.Book;

public interface BookDao {

	public List<Book> getallBooks();
	public void save(Book book);
	public Book getBook(int bookId);
	public void updateBook(int bookId);
	public void deleteBook(int bookId);
}
