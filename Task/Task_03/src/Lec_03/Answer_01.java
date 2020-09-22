package Lec_03;

import java.util.Scanner;

class Distance{
	private String name;   //?´ë¦?
	private int dist;        //?†µ?•™ê±°ë¦¬


	//ë§¤ê°œë³??ˆ˜ë¡? ?•„?“œê°’ì„ ì´ˆê¸°?™”?•˜?Š” ?ƒ?„±? ?? ë³¸ì¸?‘?„±
	public Distance(String name, int dist) {
		this.name = name;
		this.dist = dist;
	}
	
	//?´ë¦„ê³¼ ?†µ?•™ê±°ë¦¬ ?•„?“œ?— ???•œ getter, setter ë©”ì†Œ?“œ ?? ë³¸ì¸?‘?„±
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
	
	//ê°ì²´ ?‚´?š©(?´ë¦„ê³¼ ?†µ?•™ê±°ë¦¬)ë¥? ë¬¸ì?—´ë¡? ë°˜í™˜?•˜?Š” toString() ë©”ì†Œ?“œ ?? ë³¸ì¸?‘?„±
	@Override
	public String toString() {
		return "Distance [?´ë¦? = " + name + ", ?†µ?•™ê±°ë¦¬ = " + dist + "]";
	}
}

class DistanceComp{
//ê°ì²´ ë°°ì—´?„ ë§¤ê°œë³??ˆ˜ë¡? ë°›ì•„ ?†µ?•™ ê±°ë¦¬ê°? ê°??¥ ê¸? ê°ì²´ë¥? ë°˜í™˜?•˜?Š”  longdistance ? •?  ë©”ì†Œ?“œ ?? ë³¸ì¸ ?‘?„±
	static Distance longdistance(Distance[] arr) {
		Distance max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(max.getDistance() < arr[i].getDistance()) {
				max = arr[i];
			}
		}
		return max;
	}
	
//ê°ì²´ ë°°ì—´?„ ë§¤ê°œë³??ˆ˜ë¡? ë°›ì•„ ?†µ?•™ ê±°ë¦¬ê°? ê°??¥ ì§§ì? ê°ì²´ë¥? ë°˜í™˜?•˜?Š” shortdistance() ? •?  ë©”ì†Œ?“œ ?? ë³¸ì¸ ?‘?„±
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
		System.out.println(">> ?ƒ?„±?•˜ê³ ì ?•˜?Š” ê°ì²´?˜ ?ˆ˜ë¥? ?…? ¥?•˜?„¸?š” : ");
		Distance[] arr = new Distance[in.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(">> ?´ë¦„ê³¼ ?†µ?•™ ê±°ë¦¬ë¥? ?…? ¥?•˜?„¸?š” : ");
			arr[i] = new Distance(in.next(), in.nextInt());
		}
		System.out.println("?†µ?•™ê±°ë¦¬ê°? ê°??¥ ê¸? ?•™?ƒ : " + DistanceComp.longdistance(arr));
		System.out.println("?†µ?•™ê±°ë¦¬ê°? ê°??¥ ì§§ì? ?•™?ƒ : " + DistanceComp.shortdistance(arr));
		System.out.println("?†µ?•™ê±°ë¦¬ê°? ê°??¥ ê¸? ?•™?ƒê³? ì§§ì? ?•™?ƒ?˜ ì°¨ì´?Š” " + (DistanceComp.longdistance(arr).getDistance() - DistanceComp.shortdistance(arr).getDistance()) + "?…?‹ˆ?‹¤");
	}
}

