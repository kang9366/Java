package Lec;

import java.io.*;
import java.util.*;

class Pet implements Serializable {
	private String name; // 이름
	private int age; // 나이
	private double weight;// 몸무게

	public Pet(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public String toString() {
		return "Name = " + name + "  " + "Age = " + age + "  " + "Weight = " + weight;
	}
}

public class Lec08 {
	public static void main(String[] args) throws Exception {
		writeList();
		List<Pet> list = readList();
		for(Pet obj : list)
			System.out.println(obj);
	}

	public static List<Pet> readList() throws Exception{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.dat"));
		@SuppressWarnings("unchecked")
		List<Pet> list = (List<Pet>)in.readObject();
		in.close();
		return list;
	}

	public static void writeList() throws Exception {
		List<Pet> list = new ArrayList<>();
		ObjectOutputStream out = null;
		list.add(new Pet("해바라기", 7, 10.2));
		list.add(new Pet("금강초롱", 4, 4.2));

		// FileOutputStream 객체를 생성하여 사용: 데이터를 파일에 저장하는 기능이 없기 때문
		out = new ObjectOutputStream(new FileOutputStream("object.dat"));
		out.writeObject(list);
		out.flush();
		out.close();
	}
}
