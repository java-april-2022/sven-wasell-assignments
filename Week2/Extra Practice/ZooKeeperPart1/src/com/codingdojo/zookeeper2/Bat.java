package com.codingdojo.zookeeper2;

import com.codingdojo.zookeeper1.Mammal;

public class Bat extends Mammal {
	
	public Bat() {
		super(300);	
	}

	public void fly() {
		System.out.println("Flap flap flap!");
		energyLevel -= 50;
		displayEnergy();
	}
	public void eatHumans() {
		energyLevel += 25;
		displayEnergy();
	}
	public void attackTown() {
		System.out.println("FIRREEE!");
		energyLevel -= 100;
		displayEnergy();
	}
	

}
