package com.lesseon2.ders17;

import java.util.Random;

public class MenuManager {

	public static void main(String[] args) {
		MenuManager menuManager = new MenuManager();
		for (Gun gun : Gun.values()) {
			System.out.println(gun.ordinal() + 1 + "-" + gun);
			Menu menu = new Menu();
			menu.setCorba((Corba) menuManager.menuBelirle(Corba.values()));
			menu.setIcecek((Icecek) menuManager.menuBelirle(Icecek.values()));
			menu.setTatli((Tatli) menuManager.menuBelirle(Tatli.values()));
			menu.setYemek((Yemek) menuManager.menuBelirle(Yemek.values()));
			System.out.println(menu);

		}

	}

	public Enum menuBelirle(Enum[] dizi) {
		int uzunluk = dizi.length;
		int index = randomIndex(uzunluk);

		return dizi[index];
	}

	public int randomIndex(int uzunluk) {
		Random random = new Random();
		return random.nextInt(uzunluk);
	}

}
