package Test;

import java.io.Serializable;
import java.util.ArrayList;

class Login  implements Serializable{
	private static final long serialVersioinUID = 1L;
	private String id;
	private int year, month, date;
	
	public Login(String id, int year, int month, int date) {
		this.id = id;
		this.month = month;
		this.year = year;
		this.date = date;
	}
	
	public String getId() {
		return id;
	}
	
	public void disPlay() {
		System.out.println("id" + id);
	}
}



public class Test_07{
	public static void main(String[] args) {
		
	}
}
