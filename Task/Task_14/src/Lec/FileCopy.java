package Lec;

import java.util.*;
import java.io.*;

public class FileCopy {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.print("원본 파일 이름을 입력하시오: ");
		String inFileName = scan.next();
		System.out.print("복사 파일 이름을 입력하시오: ");
		String outFileName = scan.next();
		InputStream inStream = new FileInputStream(inFileName);
		OutputStream outStream = new FileOutputStream(outFileName);
		int c;
		while ((c = inStream.read()) != -1) {
			outStream.write(c);
		}

		System.out.println(inFileName + "을 " + outFileName + "로 복사하였습니다. ");
		inStream.close();
		outStream.close();
	}
}
