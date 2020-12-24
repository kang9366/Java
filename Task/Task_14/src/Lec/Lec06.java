package Lec;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Lec06 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("/Users/kangseunggu/Desktop/대학교.txt"));	
		while(true) {
			String data = br.readLine();
			if(data == null) {
				break;
			}
			System.out.println(data);
		}
		br.close();
		
		File f1 = new File("/Users/kangseunggu/Desktop/대학교.txt");
	}
}
