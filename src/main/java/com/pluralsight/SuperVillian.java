package com.pluralsight;

import java.util.Random;

public class SuperVillian extends Person{
    public SuperVillian(String firstName, int health, int evilness) {
        super(firstName, health, evilness);
    }
    public int getEvilnessLevel(){
       return this.experiencePoints;
    }

    @Override
    public void fight(Person opponent) {
        //Generate a random number to figure out the base damage I'm about to deliver to this opponent
        Random randomNumber = new Random();
        int baseDamage = randomNumber.nextInt(101); // this will give me a number between 0 and 100

        // lets take the base damage plus our experience points for the final damamge
        int damage = baseDamage + this.getEvilnessLevel();

        if (baseDamage == 0) {
            System.out.println(this.firstName + " Fires a sneaky blast... but misses! " + opponent.firstName);
        } else {
            System.out.println(this.firstName + " hits " + opponent.firstName + "with a sneaky blast for " + damage + "total damage");

            // deal the damage if the base damage wasn't 0
            opponent.takeDamage(damage);
        }
    }
}
