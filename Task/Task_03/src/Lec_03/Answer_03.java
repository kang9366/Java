package Lec_03;

import java.util.Scanner;

class Member {
	private String id; // ??΄?
	private int month; // ??Ό(?)

	// λ§€κ°λ³??λ‘? λ°μ? κ°μ ??λ‘? μ΄κΈ°? ?? ??±? ?? λ³ΈμΈ??±
	public Member(String id, int month) {
		this.id = id;
		this.month = month;
	}

	// month ??? ??? getter λ©μ? ?? λ³ΈμΈ ??±
	public int getMonth() {
		return month;
	}

	// id ??? ??? getter, setter λ©μ?- λ³ΈμΈ ??±
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	// κ°μ²΄ ?΄?©(id, month)? λ¬Έμ?΄λ‘? λ°ν?? toString() λ©μ? ?? λ³ΈμΈ??±
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
			System.out.println("?΄?Ή ?? ??");
		}
		
	}
	
	public static void findId(Member[] arr, String id) {
		Member idMember = null;
		Scanner in = new Scanner(System.in);
		
		//?? ₯ λ°μ? id?? ?ΌμΉν? ???΄ ??μ§? κ²??
		for (int i = 0; i < arr.length; i++) {
			if (id.equals(arr[i].getId())) {
				idMember = arr[i];
				System.out.println(idMember);
			}
		}
		
		//idκ°? ?ΌμΉν? ???΄ ??Όλ©? ??΄? λ³?κ²½μ ?€?
		if(idMember != null) {
			System.out.print("> λ³?κ²? ? id ?? ₯ : ");
			idMember.setId(in.next());
			System.out.println(idMember);
			System.out.println("?λ‘κ·Έ?¨ μ’λ£");
		}//idκ°? ?ΌμΉν? ???΄ ?? ?
		else {
			System.out.println("?΄?Ή ??΄? ??");
		}
	}
}

public class Answer_03 {
	public static void main(String[] args) {
		Member[] member = new Member[5];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < member.length; i++) {
			System.out.print("> id?? month ?? ₯ : ");
			member[i] = new Member(in.next(), in.nextInt());
		}
		System.out.print("> month ?? ₯ : ");
		MemberControl.findMonth(member, in.nextInt());
		System.out.print("> λ³?κ²? ?  id ?? ₯ : "); 
		MemberControl.findId(member, in.next());
	}
}
