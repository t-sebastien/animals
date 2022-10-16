package com.mycompany.classifiaction;

public interface Vertebres extends Animaux {

	default void casserUnOs() {
		System.out.println("peut se casser un os");
	}
}
