package com.javaex.ex04;

public class Customer extends User {

	// 필드
	private int Point;

	// 생성자
	public Customer() {

	}

	public Customer(String id, String password, String name, int point) {
		super(id, password, name);
		Point = point;
	}

	// 메소드 g/s
	public int getPoint() {
		return Point;
	}

	public void setPoint(int point) {
		Point = point;
	}

	// 일반메소드
	public String toString() {
		return "Customer [Point=" + Point + "]";
	}

	public void showinfo() {
		System.out.println("#아이디: " + super.getId() + ", #패스워드: " + super.getPassword() + ", #이름: " + super.getName()
				+ ", #포인트: " + Point);
	}

}
