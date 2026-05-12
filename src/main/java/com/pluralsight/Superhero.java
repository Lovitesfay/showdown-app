package com.pluralsight;

import java.util.Random;

public class Superhero extends Person{

    public Superhero(String firstName, int health, int powerLevel) {
        super(firstName, health, powerLevel);


    }
    public int getPowerlevel(){
        return this.experiencePoints;
    }
    @Override
    public void fight(Person opponent){
        //Generate a random number to figure out the base damage I'm about to deliver to this opponent
        Random randomNumber = new Random();
        int baseDamage = randomNumber.nextInt(101); // this will give me a number between 0 and 100

        // lets take the base damage plus our experience points for the final damamge
        int damage =   baseDamage + this.getPowerlevel();

        if (baseDamage == 0){
            System.out.println(this.firstName + " Swings heroically... but misses! " + opponent.firstName);
        }else {
            System.out.println(this.firstName + " lands a heroic punch on " + opponent.firstName + "dealing " + damage + "total damage");

            // deal the damage if the base damage wasn't 0
            opponent.takeDamage(damage);
        }


    }
}
