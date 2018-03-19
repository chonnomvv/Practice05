package com.javaex.problem04;

public class Rectangle extends Shape implements Resizeable {

	private double width;
	private double height;

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return (width + height)*2;
	}

	

	public Rectangle(int width, int height) {

		this.width = width;
		this.height = height;
	}

	


	@Override
	public void resize(double s) {
		this.width = (width * s);
		this.height = (height * s);

	}

}
