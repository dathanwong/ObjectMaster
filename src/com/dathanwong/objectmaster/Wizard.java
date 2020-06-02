package com.dathanwong.objectmaster;

public class Wizard extends Human{
	
	public Wizard(String name) {
		super(name);
		this.setHealth(50);
		this.setIntelligence(8);
	}
	
	public void heal(Human target) {
		target.changeHealth(this.getIntelligence());
		System.out.println(target.getName() + " was healed to " + target.getHealth() + " health.");
	}
	
	public void fireball(Human target) {
		target.changeHealth(-1*3*this.getIntelligence());
		System.out.println(target.getName() + " was hit with a fireball to " + target.getHealth() + " health.");
	}
}
