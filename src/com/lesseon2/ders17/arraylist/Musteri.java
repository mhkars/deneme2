package com.lesseon2.ders17.arraylist;

public class Musteri implements Comparable<Musteri> {
	String isim;
	int yas;

	public Musteri() {
		super();
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public Musteri(String isim, int yas) {
		super();
		this.isim = isim;
		this.yas = yas;
	}

	@Override
	public String toString() {
		return "Musteri [isim=" + isim + ", yas=" + yas + "]";
	}

	@Override
	public int compareTo(Musteri o) {
		if (this.yas > o.yas) {
			return -1;
		} else if (this.yas < o.yas) {
			return 1;
		} else {
			return 0;
		}
	}

}
