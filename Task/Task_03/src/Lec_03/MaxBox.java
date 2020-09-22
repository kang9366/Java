package Lec_03;

import java.util.Scanner;

class Box{
	private int ga, se, he;
	private int volume;
	private int num;
	private static int cnt = 1;
	
	public Box() {
		this(0, 0, 0); //오버로딩 된 생성자 호출, 항상 첫 문장에 작성
	}
	
	public Box(int ga, int se, int he) {
		this.ga = ga;
		this.se = se;
		this.he = he;
		volume = ga * se * he;
		num = cnt++;
	}
	
	public int getVolume() {
		return volume;
	}
	
	@Override
	public String toString() {
		String str = "가로 : " + ga + "\t세로 : " + se + "\t높이 : " + he;
		str += "\t부피 : " + volume + "\t생성번호 : " + num;
		return str;
	}
	
	public boolean isSame(Box obj) {
		//객체의 내용을 비교하여 같으면 true, 다르면 false 반환
		if(ga == obj.ga && se == obj.se && he == obj.he) {
			return true;
		}else {
			return false;
		}
	}
}

class BoxControl {
	//매개변수로 받은 객체의 필드 volume을 비교하여 큰 volume값을 갖는 객체를 반환
	public static Box isMax(Box[] dim) {
		Box max = dim[0];
		for (int i = 1; i < dim.length; i++) {
			if(max.getVolume() < dim[i].getVolume()) {
				max = dim[i];
			}
		}
		return max;
	}
	
	public static void write(Box[] dim) {
		System.out.println("\n  >> 객체 내용 출력 <<  ");
		for (Box temp : dim) {
			System.out.println(temp);
		}
	}
}

public class MaxBox {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Box[] obj = new Box[5]; //객체배열
		
		for (int i = 0; i < obj.length; i++) {
			System.out.println((i + 1) + "번) 가로, 세로, 높이를 입력하세요 >> ");
			obj[i] = new Box(in.nextInt(), in.nextInt(), in.nextInt());
		}
		BoxControl.write(obj);
		System.out.println("\n  >> 부피가 가장 큰 박스 <<  \n" + BoxControl.isMax(obj));
		
		if(obj[0].isSame(obj[1])) {
			System.out.println("동일한 객체 입니다");
		}else {
			System.out.println("서로 다른 객체 입니다");
		}
	}
}
