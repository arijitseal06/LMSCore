package com.example.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.example.model.Book;

public class BookDaoImpl implements BookDao{

	public List<Book> books = new ArrayList<>();
	public Map<Integer, Book> bookMap = new HashMap<>();
	@Override
	public List<Book> getallBooks() {
		// TODO Auto-generated method stub
		return books;
	}

	@Override
	public void save(Book book) {
		// TODO Auto-generated method stub
		books.add(book);
		bookMap.put(book.getBookId(), book);
	}

	@Override
	public Book getBook(int bookId) {
		// TODO Auto-generated method stub
		return bookMap.get(bookId);
	}

	@Override
	public void updateBook(int bookId) {
		// TODO Auto-generated method stub
		 Book book = bookMap.get(bookId);
		 System.out.println("Enter the field u wnat to update");
		 System.out.println("1:\tBook qty ---> Press 1\n2:\tBook issuedQty ---> Press 2");
		 Scanner scanner = new Scanner(System.in);
		 int choice = Integer.parseInt(scanner.nextLine());
		 if(choice==1)
		 {
			 System.out.println("Enter new quantity: ");
			 int newQty = Integer.parseInt(scanner.nextLine());
			 if(newQty<=book.getIssuedQty())
			 {
				 book.setQty(newQty);
			 }
			 else {
				System.out.println("Invalid input");
			}
		 }
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		books.remove(bookMap.get(bookId));
		bookMap.remove(bookId);
	}

}
