package com.lesseon2.ders17.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayLidtOrnek {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Ankara");
		list.add("Bursa");
		list.add("Antalya");
		list.add("Artvin");
		list.add("Erzurum");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}

	}
}