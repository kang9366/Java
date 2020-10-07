package Task_06;

class OracleDB implements DataAccessObject{
	public void select() {
		System.out.println("Oracle DB에서 검색");
	}
	public void insert() {
		System.out.println("Oracle DB에서 삽입");
	}
	public void update() {
		System.out.println("Oracle DB에서 수정");
	}
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
	}
}

class MySqlDB implements DataAccessObject{
	public void select() {
		System.out.println("MySql DB에서 검색");
	}
	public void insert() {
		System.out.println("MySql DB에서 삽입");
	}
	public void update() {
		System.out.println("MySql DB에서 수정");
	}
	public void delete() {
		System.out.println("MySql DB에서 삭제");
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
