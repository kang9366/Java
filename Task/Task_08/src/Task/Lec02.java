package Task;

class Account{
	int balance;
	int withdraw(int amount) throws Exception {
		if(balance < amount)
			throw new Exception("�ܾ��� �����մϴ�."); //�������� ���ܹ߻�
		balance -= amount;
		return amount;
	}
}

public class Lec02 {
	public static void main(String[] args) {
		Account obj = new Account();
		try {
			int amount = obj.withdraw(2); //���ܹ߻� �޼ҵ�
			System.out.println("����� : " + amount);
		}catch (Exception e) { //�߻��� ���� ó��
			String msg = e.getMessage(); //���� �޼��� ���
			System.out.println(msg);
		}
	}
}
