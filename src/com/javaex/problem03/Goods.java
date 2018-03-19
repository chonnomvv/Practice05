package com.javaex.problem03;

public class Goods {

	private String name;
	private int price;
	private int count;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Goods(String name, int price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}

	public Goods() {
		super();
	}

	public void showInfo() {
		System.out.println("상품:" + name + " 가격:" + price + " 개수:" + count);
	}

}
