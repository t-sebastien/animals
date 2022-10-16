package com.mycompany.classifiaction;

public interface Animaux extends Eucaryotes {

	default void mangerConstituantOrganique() {
		System.out.println("mange un constituant organique");
	}
}
