package Test;

abstract class Tool{
	private String type;
	Tool(String type){
		this.type = type;
	}
	
	String getType() {
		return type;
	}
	
	void write() {
		System.out.println("type >> " + type);
	}
	abstract void cut();
	abstract void dry();
}

class Hair extends Tool{
	private String color;
	
	public Hair(String color, String type) {
		super(type);
		this.color = color;
	}
	
	@Override
	void write() {
		super.write();
		System.out.println("color >> " + color);
	}
	@Override
	void cut() {
		System.out.println(super.getType() + "을 자릅니다.");
	}
	@Override
	void dry() {
		System.out.println(super.getType() + "을 말립니다.");
	}
	
}

class Paper extends Tool{
	private String size;
	
	public Paper(String size, String type) {
		super(type);
		this.size = size;
	}
	
	@Override
	void write() {
		super.write();
		System.out.println("size >> " + size);
	}
	@Override
	void cut() {
		System.out.println(super.getType() + "을 자릅니다.");
	}
	@Override
	void dry() {
		System.out.println(super.getType() + "을 말립니다.");
	}
}
public class Test_01{
	public static void run(Tool[] tool) {
		for(int i = 0; i < tool.length; i++) {
			if(tool[i] instanceof Hair) {
				tool[i].cut();
			}
		}
	}
	public static void main(String[] args) {
		Tool[] tool = {new Hair("머리", "검은색"), new Paper("종이", "A3")};
		run(tool);
		}
}