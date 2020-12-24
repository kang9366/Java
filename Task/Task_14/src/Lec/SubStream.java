package Lec;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class SubStream {
	public static void main(String[] args) throws Exception{
		write("문자 변환 스트림 사용");
		String data = read();
		System.out.println(data);
	}
	
	public static void write(String str) throws Exception{
		FileOutputStream fos = new FileOutputStream("test.txt");
		Writer wr = new OutputStreamWriter(fos); //OutputStreamWriter 보조 스트림을 이용해 문자열 입력
		wr.write(str);
		wr.flush();
		wr.close();
	}
	
	public static String read() throws Exception{
		FileInputStream fis = new FileInputStream("test.txt");
		Reader rd = new InputStreamReader(fis);
		char[] buffer = new char[100];
		int readNum = rd.read(buffer); //InputStreamReader 보조 스트림을 이용해 문자입
		rd.close();
		String data = new String(buffer, 0, readNum); //char배열에서 읽은 수 만큼 문자열로 반
		return data;
	}
}
