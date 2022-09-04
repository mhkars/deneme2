package com.lesseon2.ders17.arraylist;

public class Hasta implements Comparable<Hasta> {

	String isim;
	String sikayet;
	int oncelik;

	public Hasta(String isim, String sikayet) {
		super();
		this.isim = isim;
		this.sikayet = sikayet;
		setOncelik(sikayet);
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSikayet() {
		return sikayet;
	}

	public void setSikayet(String sikayet) {
		this.sikayet = sikayet;
	}

	@Override
	public String toString() {
		return "Hasta [isim=" + isim + ", sikayet=" + sikayet + "]";

	}

	public void setOncelik(String sikayet) {
		if (sikayet.equalsIgnoreCase("apandist")) {
			this.oncelik = 1;
		} else if (sikayet.equalsIgnoreCase("yanik")) {
			this.oncelik = 2;
		} else if (sikayet.equalsIgnoreCase("bas agrisi")) {
			this.oncelik = 3;
		}
	}

	@Override
	public int compareTo(Hasta o) {
		if (this.oncelik > o.oncelik) {
			return 1;
		} else if (this.oncelik < o.oncelik) {
			return -1;
		} else {
			return 0;
		}
	}

}
