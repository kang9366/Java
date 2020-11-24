package Lec_03;

import java.util.Scanner;

class Member {
	private String id; // ?��?��?��
	private int month; // ?��?��(?��)

	// 매개�??���? 받�? 값을 ?��?���? 초기?�� ?��?�� ?��?��?�� ?? 본인?��?��
	public Member(String id, int month) {
		this.id = id;
		this.month = month;
	}

	// month ?��?��?�� ???�� getter 메소?�� ?? 본인 ?��?��
	public int getMonth() {
		return month;
	}

	// id ?��?��?�� ???�� getter, setter 메소?��- 본인 ?��?��
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	// 객체 ?��?��(id, month)?�� 문자?���? 반환?��?�� toString() 메소?�� ?? 본인?��?��
	@Override
	public String toString() {
		return "Member [id = " + id + ", month = " + month + "]";
	}
}

class MemberControl {
	public static void findMonth(Member[] arr, int month) {
		Member monthMember = null;
		for (int i = 0; i < arr.length; i++) {
			if (month == arr[i].getMonth()) {
				monthMember = arr[i];
				System.out.println(monthMember);
			}
		}
		if (monthMember == null) {
			System.out.println("?��?�� ?��?�� ?��?��");
		}
		
	}
	
	public static void findId(Member[] arr, String id) {
		Member idMember = null;
		Scanner in = new Scanner(System.in);
		
		//?��?�� 받�? id?? ?��치하?�� ?��?��?�� ?��?���? �??��
		for (int i = 0; i < arr.length; i++) {
			if (id.equals(arr[i].getId())) {
				idMember = arr[i];
				System.out.println(idMember);
			}
		}
		
		//id�? ?��치하?�� ?��?��?�� ?��?���? ?��?��?�� �?경을 ?��?��
		if(idMember != null) {
			System.out.print("> �?�? ?�� id ?��?�� : ");
			idMember.setId(in.next());
			System.out.println(idMember);
			System.out.println("?��로그?�� 종료");
		}//id�? ?��치하?�� ?��?��?�� ?��?�� ?��
		else {
			System.out.println("?��?�� ?��?��?�� ?��?��");
		}
	}
}

public class Answer_03 {
	public static void main(String[] args) {
		Member[] member = new Member[5];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < member.length; i++) {
			System.out.print("> id?? month ?��?�� : ");
			member[i] = new Member(in.next(), in.nextInt());
		}
		System.out.print("> month ?��?�� : ");
		MemberControl.findMonth(member, in.nextInt());
		System.out.print("> �?�? ?�� id ?��?�� : "); 
		MemberControl.findId(member, in.next());
	}
}
