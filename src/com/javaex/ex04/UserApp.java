package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {

		User[] uArray = new User[3];

		User I1 = new Customer("jws", "j1234", "정우성", 1000);
		User I2 = new Customer("yjs", "y2345", "이효리", 2000);
		User E1 = new Employee("master", "m7788", "운영자", 500);

		uArray[0] = I1;
		uArray[1] = I2;
		uArray[2] = E1;

		for (int i = 0; i < uArray.length; i++) {
			uArray[i].showinfo();
		}

		System.out.println("운영자 월급은 5000000원 입니다.");
	}

}
