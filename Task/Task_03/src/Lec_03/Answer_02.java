package Lec_03;

import java.util.Scanner;

class Book{
	String name;
	int page;
	int year;
	
	public Book(String name, int page, int year) {
		this.name = name;
		this.page = page;
		this.year = year;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getName() {
		return name;
	}
	public int getPage() {
		return page;
	}
	public int getYear() {
		return year;
	}
	@Override
	public String toString() {
		return "제목 : " + name + "\t페이지 수  : " + page + "\t출판년도 : " + year; 
	}
}

class BookControl{
	static Book findBook(String title, Book[] arr) {
		Book book = null;
		for (int i = 0; i < arr.length; i++) {
			if (title.equals(arr[i].name)) {
				book = arr[i];
				break;
			}
		}
		return book;
	}
}

public class Answer_02 {
	public static void main(String[] args) {
		Book[] book = {new Book("자바", 150, 2016), new Book("파이썬", 100, 2019), new Book("자바스크립트", 200, 2018)};
		Scanner in = new Scanner(System.in);
		System.out.println("검색하고자 하는 제목을 입력하세요 >> ");
		String title = in.nextLine();
		if(BookControl.findBook(title, book) == null) {
			System.out.println("해당 도서가 없습니다.");
		}else {
			System.out.println(BookControl.findBook(title, book));
		}
	}
}