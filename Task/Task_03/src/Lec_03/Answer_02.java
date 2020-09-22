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
		return "���� : " + name + "\t������ ��  : " + page + "\t���ǳ⵵ : " + year; 
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
		Book[] book = {new Book("�ڹ�", 150, 2016), new Book("���̽�", 100, 2019), new Book("�ڹٽ�ũ��Ʈ", 200, 2018)};
		Scanner in = new Scanner(System.in);
		System.out.println("�˻��ϰ��� �ϴ� ������ �Է��ϼ��� >> ");
		String title = in.nextLine();
		if(BookControl.findBook(title, book) == null) {
			System.out.println("�ش� ������ �����ϴ�.");
		}else {
			System.out.println(BookControl.findBook(title, book));
		}
	}
}