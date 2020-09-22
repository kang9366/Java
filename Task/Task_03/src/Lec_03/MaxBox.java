package Lec_03;

import java.util.Scanner;

class Box{
	private int ga, se, he;
	private int volume;
	private int num;
	private static int cnt = 1;
	
	public Box() {
		this(0, 0, 0); //�����ε� �� ������ ȣ��, �׻� ù ���忡 �ۼ�
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
		String str = "���� : " + ga + "\t���� : " + se + "\t���� : " + he;
		str += "\t���� : " + volume + "\t������ȣ : " + num;
		return str;
	}
	
	public boolean isSame(Box obj) {
		//��ü�� ������ ���Ͽ� ������ true, �ٸ��� false ��ȯ
		if(ga == obj.ga && se == obj.se && he == obj.he) {
			return true;
		}else {
			return false;
		}
	}
}

class BoxControl {
	//�Ű������� ���� ��ü�� �ʵ� volume�� ���Ͽ� ū volume���� ���� ��ü�� ��ȯ
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
		System.out.println("\n  >> ��ü ���� ��� <<  ");
		for (Box temp : dim) {
			System.out.println(temp);
		}
	}
}

public class MaxBox {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Box[] obj = new Box[5]; //��ü�迭
		
		for (int i = 0; i < obj.length; i++) {
			System.out.println((i + 1) + "��) ����, ����, ���̸� �Է��ϼ��� >> ");
			obj[i] = new Box(in.nextInt(), in.nextInt(), in.nextInt());
		}
		BoxControl.write(obj);
		System.out.println("\n  >> ���ǰ� ���� ū �ڽ� <<  \n" + BoxControl.isMax(obj));
		
		if(obj[0].isSame(obj[1])) {
			System.out.println("������ ��ü �Դϴ�");
		}else {
			System.out.println("���� �ٸ� ��ü �Դϴ�");
		}
	}
}
