package Algorithm;

public class Rank {
	public static void main(String[] args) {
		int[] num = {29, 347, 28, 38};
		for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    int tmep = num[i];
                    num[i] = num[j];
                    num[j] = tmep;
                }
            }
        }
		for (int i = 0; i < num.length; i++) {
			System.out.println((i+1) + " : " + num[i]);
		}
		
		//reverse
		System.out.println("reverse");
		for (int i = num.length-1; i >= 0; i--) {
			System.out.println((i+1) + " : " + num[i]);
		}
	}
}
