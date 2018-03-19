package com.javaex.problem03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		List<Goods> list = new ArrayList<Goods>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("상품 3개를 입력해주세요");
		int count = 0;
		for (int i = 0; i < 3; i++) {
			String str = sc.nextLine(); 
			String good[] = str.split(" ");
			Goods goods = new Goods(good[0], Integer.parseInt(good[1]), Integer.parseInt(good[2]));
			count += Integer.parseInt(good[2]);
			list.add(goods);

		}

		for( Goods goods : list) {
			goods.showInfo();
			
		}
		System.out.println("모든 갯수의 총합은 총 : " + count);
		
		sc.close();
	}

}
