package Task_06;

class OracleDB implements DataAccessObject{
	public void select() {
		System.out.println("Oracle DB���� �˻�");
	}
	public void insert() {
		System.out.println("Oracle DB���� ����");
	}
	public void update() {
		System.out.println("Oracle DB���� ����");
	}
	public void delete() {
		System.out.println("Oracle DB���� ����");
	}
}

class MySqlDB implements DataAccessObject{
	public void select() {
		System.out.println("MySql DB���� �˻�");
	}
	public void insert() {
		System.out.println("MySql DB���� ����");
	}
	public void update() {
		System.out.println("MySql DB���� ����");
	}
	public void delete() {
		System.out.println("MySql DB���� ����");
	}
}

public class Answer_05 {
	public static void dbWork(DataAccessObject db) {
		db.select();
		db.insert();
		db.update();
		db.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDB());
		dbWork(new MySqlDB());
	}
}
