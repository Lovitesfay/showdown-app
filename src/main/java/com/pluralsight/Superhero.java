package com.pluralsight;

public class Superhero extends Person{

    public Superhero(String firstName, int health, int powerLevel) {
        super(firstName, health, powerLevel);


    }
    public int getPowerlevel(){
        return this.experiencePoints;
    }
}
