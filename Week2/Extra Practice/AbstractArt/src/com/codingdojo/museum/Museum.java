package com.codingdojo.museum;

import java.util.ArrayList;

public class Museum {

	public static void main(String[] args) {
		
		ArrayList<Art> museum = new ArrayList<Art> ();
		museum.add(new Painting ("Spring Cleaning", "John Charles", "A beautiful freshly cleaned home", "Watercolor"));
		museum.add(new Painting("Black Mamba", "Sir Jacob", "Kobe Bryant game winner", "Acrylic"));
		museum.add(new Painting("Misadventures in Space", "Sean Davis", "A ball of fire and ice collide deep in space", "Watercolor"));
		museum.add(new Sculpture("Tanjrio", "Justin Catch", "A samurai who slays demons", "Marble"));
		museum.add(new Sculpture("Luffy", "Justin Catch", "A famous pirate who befriends all", "Gold"));
	}

}
