package com.emir.egitimserisi;

public class Inek extends Hayvan {

	private Boolean sutVerir;

	public Inek(Boolean sutVerir) {
		super(4, "MÖ", true);
		this.sutVerir = sutVerir;

	}

	public Boolean getSutVerir() {
		return sutVerir;
	}

	public void setSutVerir(Boolean sutVerir) {
		this.sutVerir = sutVerir;
	}

	@Override
	public String toString() {
		return String.format("Inek [SutVerir = %s ] Hayvan [ %s ]", sutVerir,
				super.toString());
	}

}
