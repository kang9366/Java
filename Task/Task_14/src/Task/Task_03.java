package Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

class Book implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private String author;
	
	public String getAuthor() {
		return author;
	}
	
	public Book(String name, String author){
		this.name = name;
		this.author = author;
	}
	
	public void disPlay(){
		System.out.print("도서명 : " + name);
		System.out.println(", 저자명 : " + author);
	}
}

public class Task_03 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.dat"));
		List<Book> list = new ArrayList<Book>();
		
		try {
			list = (ArrayList<Book>) in.readObject();
			if(list.size() != 0) {
				System.out.println("---- 파일에 저장된 값을 출력합니다 ----");
				for(Book obj : list)
					obj.disPlay();
				in.close();
			}
		} catch (Exception e) {
			System.out.println("저장된 값이 없습니다.");
		}
		
		System.out.println();
		
		while(true) {
			System.out.print("도서명, 저자명을 입력하세요 : ");
			list.add(new Book(sc.next(), sc.next()));
			System.out.print("리스트에 저장을 원하지 않으면 -1 입력 : ");
			if(sc.nextInt() == -1) {
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.dat"));
				out.writeObject(list);
				System.out.println("리스트를 파일에 저장합니다");
				break;
			}
		}
	}
}