package Task;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Task_02 {
	public static void main(String[] args) throws IOException{
		DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data.txt")));
		out.writeUTF("기초 자료형을 파일로 출력합니다");
		out.writeUTF("파일에 저장된 기초 자료형을 출력합니다");
		out.writeInt(3);
		out.writeShort(34);
		out.writeLong(3456L);
		out.writeFloat(3.14f);
		out.writeDouble(3.14);
		out.flush();
		out.close();

		DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("data.txt")));
		System.out.println(in.readUTF());
		System.out.println(in.readUTF());
		System.out.println(in.readInt());
		System.out.println(in.readShort());
		System.out.println(in.readLong());
		System.out.println(in.readFloat());
		System.out.println(in.readDouble());
		in.close();
	}
}