package Lec_03;

import java.util.Scanner;

class Member {
	private String id; // ?•„?´?””
	private int month; // ?ƒ?¼(?›”)

	// ë§¤ê°œë³??ˆ˜ë¡? ë°›ì? ê°’ì„ ?•„?“œë¡? ì´ˆê¸°?™” ?•˜?Š” ?ƒ?„±? ?? ë³¸ì¸?‘?„±
	public Member(String id, int month) {
		this.id = id;
		this.month = month;
	}

	// month ?•„?“œ?— ???•œ getter ë©”ì†Œ?“œ ?? ë³¸ì¸ ?‘?„±
	public int getMonth() {
		return month;
	}

	// id ?•„?“œ?— ???•œ getter, setter ë©”ì†Œ?“œ- ë³¸ì¸ ?‘?„±
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	// ê°ì²´ ?‚´?š©(id, month)?„ ë¬¸ì?—´ë¡? ë°˜í™˜?•˜?Š” toString() ë©”ì†Œ?“œ ?? ë³¸ì¸?‘?„±
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
			System.out.println("?•´?‹¹ ?šŒ?› ?—†?Œ");
		}
		
	}
	
	public static void findId(Member[] arr, String id) {
		Member idMember = null;
		Scanner in = new Scanner(System.in);
		
		//?…? ¥ ë°›ì? id?? ?¼ì¹˜í•˜?Š” ?šŒ?›?´ ?ˆ?Š”ì§? ê²??ƒ‰
		for (int i = 0; i < arr.length; i++) {
			if (id.equals(arr[i].getId())) {
				idMember = arr[i];
				System.out.println(idMember);
			}
		}
		
		//idê°? ?¼ì¹˜í•˜?Š” ?šŒ?›?´ ?ˆ?œ¼ë©? ?•„?´?”” ë³?ê²½ì„ ?‹¤?–‰
		if(idMember != null) {
			System.out.print("> ë³?ê²? ?›„ id ?…? ¥ : ");
			idMember.setId(in.next());
			System.out.println(idMember);
			System.out.println("?”„ë¡œê·¸?¨ ì¢…ë£Œ");
		}//idê°? ?¼ì¹˜í•˜?Š” ?šŒ?›?´ ?—†?„ ?•Œ
		else {
			System.out.println("?•´?‹¹ ?•„?´?”” ?—†?Œ");
		}
	}
}

public class Answer_03 {
	public static void main(String[] args) {
		Member[] member = new Member[5];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < member.length; i++) {
			System.out.print("> id?? month ?…? ¥ : ");
			member[i] = new Member(in.next(), in.nextInt());
		}
		System.out.print("> month ?…? ¥ : ");
		MemberControl.findMonth(member, in.nextInt());
		System.out.print("> ë³?ê²? ? „ id ?…? ¥ : "); 
		MemberControl.findId(member, in.next());
	}
}
