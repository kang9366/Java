package Lec;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class fileInputOutput {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("out.dat");
		byte a = 3;
		os.write(a);
		byte[] array = {4, 5, 6};
		os.write(array);
		
		byte[] dim = {10, 11, 12, 13, 14, 15};
		os.write(dim, 1, 3);
		os.flush();
		os.close();
		System.out.println("program stop");
	}
}
