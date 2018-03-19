package com.javaex.problem01;

public class Mul {

	private int x;
	private int y;
	
	
	public Mul() {}
	public Mul(int x, int y) {
	
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x; 
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int calculate() {
		return x*y;
	}
	public void setValue(int a, int b) {
		this.x = a;
		this.y= b;
	}

}
