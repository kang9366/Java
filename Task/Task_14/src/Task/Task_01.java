package Task;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class Task_01{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("/Users/kangseunggu/Desktop/text.txt"));
		int cnt = 0;
		
		while(true) {
			String data = br.readLine();
			cnt++;
			if(data == null) {
				break;
			}
			System.out.println(cnt + ") " + data);
		}
		br.close();
	}
}