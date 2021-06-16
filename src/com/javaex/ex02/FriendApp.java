package com.javaex.ex02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		List<Friend> fList = new ArrayList<Friend>();

		System.out.println("친구 3명을 등록해주세요.");
		try {
			for (int i = 0; i < 3; i++) {
				String info = sc.nextLine();
				String[] infoArr = new String[3];
				infoArr = info.split(" ");
				Friend f = new Friend();
				f.setName(infoArr[0]);
				f.setHp(infoArr[1]);
				f.setSchool(infoArr[2]);
				fList.add(f);

			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("정보를 정확하게 입력해주세요.");
		}
		sc.close();

		for (int i = 0; i < fList.size(); i++) {
			fList.get(i).showInfo();
		}

	}

}
