package com.emir.egitimserisi;

public class Tavuk extends Hayvan {

	private Boolean yumurtlar;

	public Tavuk() {
		super(2, "Gıdak", false);
	}

	public Boolean getYumurtlar() {
		return yumurtlar;
	}

	public void setYumurtlar(Boolean yumurtlar) {
		this.yumurtlar = yumurtlar;
	}

}
