package Task;

class Container<T>{
	private T name;
	public void set(T name) {
		this.name = name;
	}
	public T get() {
		return name;
	}
}

public class Task_02 {
	public static void main(String[] args) {
		Container<String> con1 = new Container<>();
		con1.set("ȫ�浿");
		String str = con1.get();
		System.out.println(str);
		
		Container<Integer> con2 = new Container<>();
		con2.set(6);
		Integer ig = con2.get();
		System.out.println(ig);
	}
}
