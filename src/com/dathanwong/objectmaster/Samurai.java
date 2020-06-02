package com.dathanwong.objectmaster;

public class Samurai extends Human{

	static int count = 0;
	
	public Samurai(String name) {
		super(name);
		this.setHealth(200);
		count++;
	}
	
	public void deathBlow(Human target) {
		target.setHealth(0);
		this.setHealth(this.getHealth()/2);
		System.out.println(target.getName() + " was killed " + this.getName() + " health at " + this.getHealth());
	}
	
	public void meditate() {
		this.setHealth(this.getHealth()/2 + this.getHealth());
		System.out.println(this.getName() + " meditated and healed to " + this.getHealth() + " health");
	}
	
	static int howMany() {
		return count;
	}
}
