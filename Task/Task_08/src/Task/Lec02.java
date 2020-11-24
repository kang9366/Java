package Task;

class Account{
	int balance;
	int withdraw(int amount) throws Exception {
		if(balance < amount)
			throw new Exception("잔액이 부족합니다."); //인위적인 예외발생
		balance -= amount;
		return amount;
	}
}

public class Lec02 {
	public static void main(String[] args) {
		Account obj = new Account();
		try {
			int amount = obj.withdraw(2); //예외발생 메소드
			System.out.println("인출액 : " + amount);
		}catch (Exception e) { //발생된 예외 처리
			String msg = e.getMessage(); //오류 메세지 출력
			System.out.println(msg);
		}
	}
}
