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

    public void takeDamage(int amount ){
        this.health -= amount;
       if  (this.health < 0) health = 0;
    }

    public void fight(Person opponent){
        System.out.println(this.firstName + " prepares to fight " + opponent.firstName);
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
