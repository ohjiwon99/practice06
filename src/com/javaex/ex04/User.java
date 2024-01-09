package com.javaex.ex04;

public class User {

	// 필드
	private String id;
	private String password;
	private String name;

	// 생성자
	public User() {

	}

	public User(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}

	// 메소드 g/s
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 일반메소드
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", name=" + name + "]";
	}

	public void showinfo() {
		System.out.println("#아이디: " + id + ", #패스워드: " + password + ", #이름: " + name);
	}

}
