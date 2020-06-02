package com.dathanwong.objectmaster;

public class Ninja extends Human{
	
	public Ninja(String name) {
		super(name);
		this.setStealth(10);
	}
	
	public void steal(Human target) {
		this.changeHealth(this.getStealth());
		target.changeHealth(this.getStealth()*-1);
		System.out.println(this.getName() + " stole " + this.getStealth() + " health from " + target.getName());
	}
	
	public void runAway() {
		this.changeHealth(-10);
		System.out.println(this.getName() + " ran away");
	}
}
