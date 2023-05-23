package day12.com.ict.edu;

public class Ex08_Constructor {
	private String name = "물";
	int price = 500;
	
	public Ex08_Constructor(String name, int price) {
		// 생성자가 만들어졌으므로, 기본생성자 못 쓰게 됨
		// super();		// 상속
		this.name = name;
		this.price = price;
		// 생성자 만들어지면, 위에 물, 500원은 의미가 없어짐.
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
