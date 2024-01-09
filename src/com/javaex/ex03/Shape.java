package com.javaex.ex03;

public class Shape {

	// private String fillColor;
	// private String lineColor;

	// private->protected 수정
	protected String fillColor;
	protected String lineColor;

	// 기본 생성자 만들어줌
	public Shape() {

	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

}
