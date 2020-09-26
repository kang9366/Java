package Task_04;

class Book{
	// 제목, 페이지수, 저자 – 전용멤버
	private String title;
	private int page;
	private String author;
	
	// 생성자
	public Book(String title, int page, String author) {
		this.title = title;
		this.page = page;
		this.author = author;
	}
	// getter
	public String getTitle() {
		return title;
	}
	public int getPage() {
		return page;
	}
	public String getAuthor(){
		return author;
	}
	
	//setter
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//toString
	@Override
	public String toString() {
		return "책 이름 : " + title + "\n페이지수 : " + page + "\n저자  : " + author;
	}
}

class Magazine extends Book{
	// 발매일 – 전용멤버
	private String date;
	// 생성자
	public Magazine(String title, int page, String author, String date) {
		super(title, page, author);
		this.date = date;
	}
	// getter
	public String getDate() {
		return date;
	}
	// setter
	public void setDate(String date) {
		this.date = date;
	}
	
	// toString()
	@Override
	public String toString() {
		return super.toString() + "\n발매일  : " + date;
	}
}
	
public class Answer_03 {
	public static void main(String[] args) {
		Magazine bookA = new Magazine("잡지A", 10, "기자A", "2010년 2월 25일");
		Magazine bookB = new Magazine("잡지B", 20, "기자B", "2010년 3월 8일");
	    //제시된 결과처럼 출력될 수 있도록 완성 – 본인작성
		System.out.println(bookA);
		System.out.println("\n----bookA 객체 저자 변경 후");
		bookA.setAuthor("기자 변경");
		System.out.println(bookA);
		System.out.println("\n" + bookB);
		System.out.println("\n----bookB 객체 페이지 변경 후----");
		bookB.setPage(50);
		System.out.println(bookB);
		bookB.setDate("2020년 8월 31일");
		System.out.println("\n" + bookB);
	}
}