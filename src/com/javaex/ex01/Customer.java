package com.javaex.ex01;

public class Customer extends Person {

	// 필드
	private int cNo;
	private int Point;

	// 생성자
	public Customer() {

	}

	public Customer(String name, String hp, int cNo, int point) {
		super(name, hp);
		this.cNo = cNo;
		this.Point = point;
	}

	// 메소드 g/s
	public int getcNo() {
		return cNo;
	}

	public void setcNo(int cNo) {
		this.cNo = cNo;
	}

	public int getPoint() {
		return Point;
	}

	public void setPoint(int point) {
		this.Point = point;
	}

	// 일반메소드
	public String toString() {
		return "Customer [name=" + getName() + ", hp=" + getHp() + ", cNo=" + cNo + ", Point=" + Point + "]";
	}

	public void showInfo() {
		System.out.println("#이름: "+super.getName()+", #핸드폰: "+ super.getHp()+", #고객번호: "+cNo+", #포인트점수: "+Point);

	}

}
