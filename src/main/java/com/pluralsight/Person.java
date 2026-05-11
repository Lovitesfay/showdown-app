package com.pluralsight;

public class Person {

    // things that describe a person for this application
    protected String firstName;
    protected int health;
    protected int experiencePoints;


    public Person(String firstName, int health, int experiencePoints) {
        this.firstName = firstName;
        this.health = health;
        this.experiencePoints = experiencePoints;


    }


    public boolean isAive(){

        return health > 0;



    }


    public String getStatus(){
        return this.firstName + " has " + this.health + " health ";
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }
}
