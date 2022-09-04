package com.lesseon2.ders17.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sepet {
	static String[] product = { "Cips", "Kola", "Seker", "Yag", "Un", "Ekmek", "Cay", "Yumurta", "Yogurt", "Sut" };
	static Scanner scanner = new Scanner(System.in);
	static List<String> list = new ArrayList<String>();

	public static void menu() {
		int input;
		do {
			System.out.println("***** MENU *****");
			System.out.println("1- Urun Listesi");
			System.out.println("2- Urun Ekle");
			System.out.println("3- Sepeti Goster");
			input = scanner.nextInt();

			switch (input) {
			case 1: {
				getProductList();
				break;
			}
			case 2: {
				addProduct();
				break;
			}
			case 3: {
				getBasket();
				break;

			}
			}
		} while (input != 0);
	}

	public static void getProductList() {
		int i = 1;
		for (String string : product) {
			System.out.println(i + "-" + string);
			i++;

		}
	}

	public static void addProduct() {
		int komut = 1;
		while (komut != 0) {
			System.out.println("Eklemek istediginiz urunun numarasini giriniz. Eklemek istemiyorsanız 0 giriniz");
			komut = scanner.nextInt();
			list.add(product[komut]);
		}

	}

	public static void getBasket() {
		int t = 1;
		for (String string : list) {
			System.out.println(t + "-" + string);
			t++;

		}
	}

	public static void main(String[] args) {
		menu();

	}

}
