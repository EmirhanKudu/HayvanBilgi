package com.emir.egitimserisi;

public abstract class Hayvan {

	private Integer ayakSayisi;
	private String cikardigiSes;
	private Boolean kuyruk;

	public Hayvan(Integer ayakSayisi, String cikardigiSes, Boolean kuyruk) {
		this.ayakSayisi = ayakSayisi;
		this.cikardigiSes = cikardigiSes;
		this.kuyruk = kuyruk;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hayvan [ayakSayisi=");
		builder.append(ayakSayisi);
		builder.append(", cikardigiSes=");
		builder.append(cikardigiSes);
		builder.append(", kuyruk=");
		builder.append(kuyruk);
		builder.append("]");
		return builder.toString();
	}

	public Integer getAyakSayisi() {
		return ayakSayisi;
	}

	public void setAyakSayisi(Integer ayakSayisi) {
		this.ayakSayisi = ayakSayisi;
	}

	public String getCikardigiSes() {
		return cikardigiSes;
	}

	public void setCikardigiSes(String cikardigiSes) {
		this.cikardigiSes = cikardigiSes;
	}

	public Boolean getKuyruk() {
		return kuyruk;
	}

	public void setKuyruk(Boolean kuyruk) {
		this.kuyruk = kuyruk;
	}

	public void sesCikart() {
		System.out.println("Cikaracagim Ses " + cikardigiSes);
	}

//	@Override
//	public String toString() {
//
//		return String.format(
//				"Hayvan [ayakSayisi= + %d + , cikardigiSes= + %s + , kuyruk= + %s + ]",
//				ayakSayisi, cikardigiSes, kuyruk);
//
//	}

}
