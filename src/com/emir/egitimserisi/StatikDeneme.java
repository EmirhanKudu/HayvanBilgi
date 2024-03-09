package com.emir.egitimserisi;

public class StatikDeneme {

	private Integer sayac = 0;

	private static Integer staticSayac = 0;

	public StatikDeneme() {
	}

	public void sayacArttir() {
		sayac += 1;
	}

	public void staticSayacArttir() {
		staticSayac += 1;
	}

	public Integer getSayac() {
		return sayac;
	}

	public void setSayac(Integer sayac) {
		this.sayac = sayac;
	}

	public static Integer getStaticSayac() {
		return staticSayac;
	}

	public static void setStaticSayac(Integer staticSayac) {
		StatikDeneme.staticSayac = staticSayac;
	}

}
