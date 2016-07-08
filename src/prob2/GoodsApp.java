package prob2;

import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int COUNT_GOODS = 3;
		Goods[] arrayGoods = new Goods[COUNT_GOODS];
		for (int i = 0; i < COUNT_GOODS; i++) {
			String info = scanner.nextLine();
			String[] infos = info.split(" ");
			arrayGoods[i] = new Goods(infos[0], Integer.parseInt(infos[1]), Integer.parseInt(infos[2])); 
		}
		for (int i = 0; i < COUNT_GOODS; i++) {
			arrayGoods[i].showInfo();
		}
		scanner.close();
	}
}
