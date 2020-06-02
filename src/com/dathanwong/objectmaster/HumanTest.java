package com.dathanwong.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human john = new Human("John");
		Human bob = new Human("Bob");
		john.attack(bob);
		Wizard gandalf = new Wizard("Gandalf");
		gandalf.heal(john);
		gandalf.fireball(john);
		Ninja joe = new Ninja("Joe");
		joe.steal(gandalf);
		joe.runAway();
		Samurai jack = new Samurai("Jack");
		jack.deathBlow(bob);
		jack.meditate();
		System.out.println("There are " + Samurai.howMany() + " Samurai");
	}

}
