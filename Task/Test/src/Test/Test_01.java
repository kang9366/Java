package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.plaf.synth.SynthToolTipUI;

class Student{
	String name;
	String major;
	int id;
	double score;
	
	Student(String name, String major, int id, double score){
		this.name = name;
		this.major = major;
		this.id = id;
		this.score = score;
	}
	
	public void write() {
		System.out.println(name + ", " + major + ", " + id + ", " + score);
	}
}

public class Test_01{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>();
		int cnt = 0;
		while(true) {
			list.add(new Student(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble()));
			cnt++;
			if(cnt==3)
				break;
		}
		for(int i=0; i<list.size(); i++) {
			System.out.println("-----------------------");
			System.out.println("이름 : " + list.get(i).name);
			System.out.println("학과 : " + list.get(i).major);
			System.out.println("학번 : " + list.get(i).id);
			System.out.println("학점 : " + list.get(i).score);
		}
		System.out.println("-----------------------");
		
		while(true) {
			String temp = sc.next();
			if(temp=="그만")
				break;
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).name.equals(temp)) {
					list.get(i).write();
				}
			}
		}
	}
}