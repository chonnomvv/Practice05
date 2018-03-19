package com.javaex.problem02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Friend> list = new ArrayList<Friend>();

		for (int i = 0; i < 3; i++) {

			String str = sc.nextLine();
			String fri[] = str.split(" ");
			Friend friend = new Friend(fri[0], fri[1], fri[2]);
			list.add(friend);
		}

		for( Friend friend : list) {
			friend.showInfo();
		}
		sc.close();
	}

}
