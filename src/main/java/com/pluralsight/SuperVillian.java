package com.pluralsight;

public class SuperVillian extends Person{
    public SuperVillian(String firstName, int health, int evilness) {
        super(firstName, health, evilness);
    }
    public int getEvilnessLevel(){
       return this.experiencePoints;
    }
}
