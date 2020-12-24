package Lec;

class IndexExchangeTest{
	public static <T> void swap(T[] a, int i, int j) {
		T tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}

public class IndexExchange {
	public static void main(String[] args) {
		String[] language = {"JAVA", "C#", "C++", "PYTHON"};
		IndexExchangeTest ie = new IndexExchangeTest();
		ie.swap(language, 3, 2);
		for(String value : language)
			System.out.println(value);
	}
}
