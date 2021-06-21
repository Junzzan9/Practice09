package com.javaex.ex03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) throws IOException {

		List<Goods> gList = new ArrayList<Goods>();
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		try {
			while (true) {
				String key = sc.nextLine();
				if (key.equals("q")) {
					for (int i = 0; i < gList.size(); i++) {
						gList.get(i).showInfo();
						System.out.println("[입력완료]");
						System.out.println("======================");
					}
					System.out.println("모든상품의 갯수는" + sum + "개 입니다.");
					break;
				}

				String[] gInfo =key.split(",");
				int prc = Integer.parseInt(gInfo[1]);
				int cnt = Integer.parseInt(gInfo[2]);
				Goods g = new Goods(gInfo[0],prc,cnt);
				gList.add(g);
				sum = sum + cnt;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("입력 오류");
		}
		sc.close();
	}

}
