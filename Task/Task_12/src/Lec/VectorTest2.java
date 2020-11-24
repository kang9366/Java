package Lec;

import java.util.List;
import java.util.Vector;

class Board{
	private String writer;
	private String title;
	public Board(String writer, String title) {
		this.writer = writer;
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Board [writer = " + writer + ", title = " + title + "]";
	}
}

public class VectorTest2 {
	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		list.add(new Board("java", "List"));
		list.add(new Board("js", "Event"));
		list.add(new Board("C++", "Virtual"));
		System.out.println("----삭제 전----");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		list.remove(1);
		System.out.println("----삭제 후----");
		for(Board b : list)
			System.out.println(b.toString());
	}
}
