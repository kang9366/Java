package Test;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Test_04{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> name = new Vector<String>();
		List<Integer> kor = new Vector<Integer>();
		List<Integer> eng = new Vector<Integer>();
		List<Integer> math = new Vector<Integer>();
		
		while(true) {
			System.out.print("이름 : ");
			String n = sc.next();
			if(n.equals("그만")) {
				System.out.println("입력을 종료합니다.----------");
				System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t학점\t석차");
				for (int i = 0; i < name.size(); i++) {
					int sum = kor.get(i) + eng.get(i) + math.get(i);
					double avg = sum/3;
					char grade;
					int rank;
					if(avg > 90) {
						grade = 'A';
					}else if(avg > 80){
						grade = 'B';
					}else if(avg > 70) {
						grade = 'C';
					}else if(avg > 60) {
						grade = 'D';
					}else {
						grade = 'F';
					}
					if(avg > 99) {
						rank = 1;
					}else if(avg > 95) {
						rank = 2;
					}else if(avg > 83) {
						rank = 3;
					}else {
						rank=4;
					}
					System.out.println(name.get(i) + "\t" + kor.get(i) + "\t" + eng.get(i) + "\t" + math.get(i) + "\t" + sum + "\t" + avg + "\t" + grade + "\t" + rank);
				}
				break;
			}else {
				name.add(n);
				System.out.print("국어 : ");
				kor.add(sc.nextInt());
				System.out.print("영어 : ");
				eng.add(sc.nextInt());
				System.out.print("수학 : ");
				math.add(sc.nextInt());
			}
		}
	}
}