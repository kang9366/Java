package Task;

import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Task_04 {
	public static void main(String[] args) throws ScriptException {
		// (1)
		String number = "082-2-777-5566";
		StringTokenizer token = new StringTokenizer(number, "-");
		String arr[] = new String[token.countTokens()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = token.nextToken();
		}
		System.out.println("���� ��ȣ  : " + arr[0]);
		System.out.println("���ýĺ���ȣ : " + arr[1]);
		System.out.println("������ ��ȣ : " + arr[2] + " " + arr[3]);
		
		// (2)
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR) + "�� " + cal.get(Calendar.MONTH) + "�� " + cal.get(Calendar.DATE) + "��");

		// (3)
		Scanner sc = new Scanner(System.in);
		char alphabet[] = new char[3];
		for(int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char)((int)(Math.random()*26) + 97);
			while(true) {
				System.out.print(Character.toUpperCase(alphabet[i]) + "�� �����ϴ� �ܾ� >> ");
				if(sc.next().charAt(0) == alphabet[i]) {
					break;
				}
			}
		}
		
		// (4)
		String str = "34 + 56 - 12 * 2 = 156";
		StringTokenizer equation = new StringTokenizer(str, "=");
		ScriptEngineManager manager = new ScriptEngineManager();

		String m = equation.nextToken();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		Object result = engine.eval(m);

		System.out.println(m + "= " + result);
		
		System.out.println("���α׷� ����");
		System.exit(0);
	}
}