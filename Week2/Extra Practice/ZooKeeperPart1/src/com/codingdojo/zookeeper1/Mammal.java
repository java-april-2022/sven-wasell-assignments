package com.codingdojo.zookeeper1;

public class Mammal {
	protected int energyLevel = 100;
	
	public Mammal (int energyLevel) {
		this.energyLevel = energyLevel;
	}
	public int displayEnergy() {
		System.out.printf("Energy level is %s\n", energyLevel);
		return energyLevel;
	}
}
