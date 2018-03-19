package com.javaex.problem01;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);

		Add add = new Add();
		Div div = new Div();
		Mul mul = new Mul();
		Sub sub = new Sub();
		while (true) {
			String num = sc.nextLine();
			String cal[] = num.split(" ");
			if ("q".equals(cal[0])) {
				System.out.println("끝");
				break;
			} else if ("+".equals(cal[1])) {

				add.setX(Integer.parseInt(cal[0]));
				add.setY(Integer.parseInt(cal[2]));
				System.out.println(cal[0] + "+" + cal[2] + " = " + add.calculate());

			}

			else if ("-".equals(cal[1])) {
				sub.setX(Integer.parseInt(cal[0]));
				sub.setY(Integer.parseInt(cal[2]));
				System.out.println(cal[0] + "-" + cal[2] + " = " + sub.calculate());
			} else if ("*".equals(cal[1])) {
				mul.setX(Integer.parseInt(cal[0]));
				mul.setY(Integer.parseInt(cal[2]));
				System.out.println(cal[0] + "*" + cal[2] + " = " + mul.calculate());
			} else if ("/".equals(cal[1])) {
				div.setX(Integer.parseInt(cal[0]));
				div.setY(Integer.parseInt(cal[2]));
				System.out.println(cal[0] + "/" + cal[2] + " = " + div.calculate());
			}

		}
		sc.close();
	}

}
