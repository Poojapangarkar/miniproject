package com.book;

public class Book {
	
	private String bookName;
	private String bookAuthor;
	private int bookId;
	private int bookprice;
	private long bookIsbn;
	private String bookDesc;
	
	public int getBookPrice() {
		return bookprice;
	}
	public void setBookPrice(int bookprice) {
		this.bookprice = bookprice;
	}
	
	
	public Book(int bookId,String bookName, String bookAuthor,  int bookprice, String bookDesc,long bookIsbn) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookId = bookId;
		this.bookprice = bookprice;
		this.bookIsbn = bookIsbn;
		this.bookDesc = bookDesc;
	}
	
	


	public Book() {
		// TODO Auto-generated constructor stub
	}


	
	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getBookAuthor() {
		return bookAuthor;
	}


	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public double getBookprice() {
		return bookprice;
	}


	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}


	public long getBookIsbn() {
		return bookIsbn;
	}


	public void setBookIsbn(long bookIsbn) {
		this.bookIsbn = bookIsbn;
	}


	public String getBookDesc() {
		return bookDesc;
	}


	public void setBookDesc(String bookDesc) {
		this.bookDesc = bookDesc;
	}
	
	
	

}
