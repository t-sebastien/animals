package com.mycompany.classifiaction;

public abstract class Crustaces implements Arthropodes {

	public Crustaces() {
		this.stockerCalcaire();
		this.respirerParBranchie();
		this.agrandirExoSquelette();
		this.mangerConstituantOrganique();
	}

	public void respirerParBranchie() {
		System.out.println("respire à l'aide de Branchie");
	}

	public void stockerCalcaire() {
		System.out.println("stock du calcaire");
	}
}
