package com.codingdojo.zookeeper1;

public class Gorilla extends Mammal {
		public Gorilla(int energyLevel) {
		super(energyLevel);
		// TODO Auto-generated constructor stub
	}
		public void throwSomething() {
			System.out.println("The gorilla has thrown a banana peel!");
			energyLevel -= 5;
		}
		public void eatBananas() {
			System.out.println("The gorilla is happy with his snack!");
			energyLevel += 10;
		}
		public void climb() {
			System.out.println("The gorilla has climbed a tree!");
			energyLevel -= 10;
		}
}
