package day28.com.ict.edu;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Ex04_VO {
	private String name;
	transient private int age;
	transient private String addr;
	transient private boolean gender;
	private double height;
	
	// ★ 기본생성자를 삭제하면 오류 발생!!
	public Ex04_VO() {}
	public Ex04_VO(String name, int age, String addr, boolean gender, double height) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.gender = gender;
		this.height = height;
	}
	
	// 직렬
	public void writeExternal(ObjectOutput out) throws IOException {
		// 제외하고 싶은 멤버는 추가하지 않는다.
		// 아래에서 역직렬도 추가하지 않아줘야 함.
		out.writeObject(name);
//		out.writeObject(age);
		out.writeObject(addr);
		out.writeObject(gender);
		out.writeObject(height);
	}
	// 역직렬
	private void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// 순서도 생략도 직렬과 같게 하자.
		name = (String) in.readObject();
//		age = (int) in.readObject();
		addr = (String) in.readObject();
		gender = (boolean) in.readObject();
		height = (double) in.readObject();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
