package com.pluralsight;

public class ShowDownApp {
    public static void main(String[] args) {
        Person somePerson = new Person("eric", 0, 100);
        Superhero someSuperhero = new Superhero("Super eric", 150, 200);
        SuperVillian someSuperVillian = new SuperVillian("Evil Lovi", 500, 1000);


                System.out.println(somePerson.getStatus());
                System.out.println(someSuperhero.getStatus());
                System.out.println(someSuperVillian.getStatus());

        System.out.println(someSuperVillian.getFirstName());


                someSuperhero.fight(someSuperVillian);
            }
        }

