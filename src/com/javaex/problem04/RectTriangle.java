package com.javaex.problem04;

public class RectTriangle extends Shape{

	private int width;
	private int height;
	

	@Override
	public double getArea() {
		return 0.5 * width * height;
	}

	@Override
	public double getPerimeter() {
		return width + height + Math.sqrt(height*height + width*width);
	}

	public RectTriangle( int width, int height) {
		
		this.width = width;
		this.height = height;
	}

	public RectTriangle(int countSides) {
		super(countSides);
	}
	
}
