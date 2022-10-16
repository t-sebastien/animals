package com.mycompany.classifiaction;

public abstract class Mamiferes implements Vertebres {

	public Mamiferes() {
		this.allaiter();
		this.casserUnOs();
		this.mangerConstituantOrganique();
	}

	public void allaiter() {
		System.out.println("allaite son enfant");
	}
}
