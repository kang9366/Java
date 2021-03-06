package Lec_03;

import java.util.Scanner;

class Distance{
	private String name;   //?΄λ¦?
	private int dist;        //?΅?κ±°λ¦¬


	//λ§€κ°λ³??λ‘? ??κ°μ μ΄κΈ°??? ??±? ?? λ³ΈμΈ??±
	public Distance(String name, int dist) {
		this.name = name;
		this.dist = dist;
	}
	
	//?΄λ¦κ³Ό ?΅?κ±°λ¦¬ ??? ??? getter, setter λ©μ? ?? λ³ΈμΈ??±
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
	
	//κ°μ²΄ ?΄?©(?΄λ¦κ³Ό ?΅?κ±°λ¦¬)λ₯? λ¬Έμ?΄λ‘? λ°ν?? toString() λ©μ? ?? λ³ΈμΈ??±
	@Override
	public String toString() {
		return "Distance [?΄λ¦? = " + name + ", ?΅?κ±°λ¦¬ = " + dist + "]";
	}
}

class DistanceComp{
//κ°μ²΄ λ°°μ΄? λ§€κ°λ³??λ‘? λ°μ ?΅? κ±°λ¦¬κ°? κ°??₯ κΈ? κ°μ²΄λ₯? λ°ν??  longdistance ? ?  λ©μ? ?? λ³ΈμΈ ??±
	static Distance longdistance(Distance[] arr) {
		Distance max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(max.getDistance() < arr[i].getDistance()) {
				max = arr[i];
			}
		}
		return max;
	}
	
//κ°μ²΄ λ°°μ΄? λ§€κ°λ³??λ‘? λ°μ ?΅? κ±°λ¦¬κ°? κ°??₯ μ§§μ? κ°μ²΄λ₯? λ°ν?? shortdistance() ? ?  λ©μ? ?? λ³ΈμΈ ??±
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
		System.out.println(">> ??±?κ³ μ ?? κ°μ²΄? ?λ₯? ?? ₯??Έ? : ");
		Distance[] arr = new Distance[in.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(">> ?΄λ¦κ³Ό ?΅? κ±°λ¦¬λ₯? ?? ₯??Έ? : ");
			arr[i] = new Distance(in.next(), in.nextInt());
		}
		System.out.println("?΅?κ±°λ¦¬κ°? κ°??₯ κΈ? ?? : " + DistanceComp.longdistance(arr));
		System.out.println("?΅?κ±°λ¦¬κ°? κ°??₯ μ§§μ? ?? : " + DistanceComp.shortdistance(arr));
		System.out.println("?΅?κ±°λ¦¬κ°? κ°??₯ κΈ? ??κ³? μ§§μ? ??? μ°¨μ΄? " + (DistanceComp.longdistance(arr).getDistance() - DistanceComp.shortdistance(arr).getDistance()) + "???€");
	}
}

