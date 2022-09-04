package com.lesseon2.ders17.arraylist;

import java.util.PriorityQueue;
import java.util.Queue;

public class Hastane {

	public static void main(String[] args) {
		Queue<Hasta> listHasta = new PriorityQueue<Hasta>();
		listHasta.offer(new Hasta("halit", "apandist"));
		listHasta.offer(new Hasta("mahmut", "yanik"));
		listHasta.offer(new Hasta("ziya", "apandist"));
		listHasta.offer(new Hasta("halil", "bas agrisi"));
		listHasta.offer(new Hasta("kasim", "yanik"));

		int sira = 1;

		while (!listHasta.isEmpty()) {
			System.out.println(sira + ". hasta" + listHasta.poll());
			sira++;
		}

	}

}
