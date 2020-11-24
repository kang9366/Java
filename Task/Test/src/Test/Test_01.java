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
		System.out.println(super.getType() + "�� �ڸ��ϴ�.");
	}
	@Override
	void dry() {
		System.out.println(super.getType() + "�� �����ϴ�.");
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
		System.out.println(super.getType() + "�� �ڸ��ϴ�.");
	}
	@Override
	void dry() {
		System.out.println(super.getType() + "�� �����ϴ�.");
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
		Tool[] tool = {new Hair("�Ӹ�", "������"), new Paper("����", "A3")};
		run(tool);
		}
}