package Lec_03;

import java.util.Scanner;

class Distance{
	private String name;   //?���?
	private int dist;        //?��?��거리


	//매개�??���? ?��?��값을 초기?��?��?�� ?��?��?�� ?? 본인?��?��
	public Distance(String name, int dist) {
		this.name = name;
		this.dist = dist;
	}
	
	//?��름과 ?��?��거리 ?��?��?�� ???�� getter, setter 메소?�� ?? 본인?��?��
	public void setDistance(int dist) {
		this.dist = dist;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDistance() {
		return dist;
	}
	public String getName(String name) {
		return name;
	}
	
	//객체 ?��?��(?��름과 ?��?��거리)�? 문자?���? 반환?��?�� toString() 메소?�� ?? 본인?��?��
	@Override
	public String toString() {
		return "Distance [?���? = " + name + ", ?��?��거리 = " + dist + "]";
	}
}

class DistanceComp{
//객체 배열?�� 매개�??���? 받아 ?��?�� 거리�? �??�� �? 객체�? 반환?��?��  longdistance ?��?�� 메소?�� ?? 본인 ?��?��
	static Distance longdistance(Distance[] arr) {
		Distance max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(max.getDistance() < arr[i].getDistance()) {
				max = arr[i];
			}
		}
		return max;
	}
	
//객체 배열?�� 매개�??���? 받아 ?��?�� 거리�? �??�� 짧�? 객체�? 반환?��?�� shortdistance() ?��?�� 메소?�� ?? 본인 ?��?��
	static Distance shortdistance(Distance[] arr){
		Distance min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(min.getDistance() > arr[i].getDistance()) {
				min = arr[i];
			}
		}
		return min;
	}
}

public class Answer_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(">> ?��?��?��고자 ?��?�� 객체?�� ?���? ?��?��?��?��?�� : ");
		Distance[] arr = new Distance[in.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(">> ?��름과 ?��?�� 거리�? ?��?��?��?��?�� : ");
			arr[i] = new Distance(in.next(), in.nextInt());
		}
		System.out.println("?��?��거리�? �??�� �? ?��?�� : " + DistanceComp.longdistance(arr));
		System.out.println("?��?��거리�? �??�� 짧�? ?��?�� : " + DistanceComp.shortdistance(arr));
		System.out.println("?��?��거리�? �??�� �? ?��?���? 짧�? ?��?��?�� 차이?�� " + (DistanceComp.longdistance(arr).getDistance() - DistanceComp.shortdistance(arr).getDistance()) + "?��?��?��");
	}
}

