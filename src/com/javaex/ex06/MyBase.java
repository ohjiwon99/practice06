package com.javaex.ex06;

public class MyBase extends Base {

	// 코드작성

	private String state;

	public MyBase() {
	}

	public MyBase(String state) {
		this.state = state;
	}

	// 메소드

	public void service(String state) {
		if (state.equals("낮")) {
			System.out.println("낮에는 열심히 수업듣자");
		} else if (state.equals("밤")) {
			System.out.println("밤에는 숙면");
		} else {
			System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
		}

	}

	public void day() {
		System.out.println("낮에는 열심히 수업듣자");

	}

	public void night() {
		System.out.println("밤에는 숙면");

	}

	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");

	}

}
