package com.pluralsight;

public class ShowDownApp {
    public static void main(String[] args) {
        Person somePerson = new Person("eric", 100, 100);
        Superhero someSuperhero = new Superhero("Super eric", 150, 100);
        SuperVillian someSuperVillian = new SuperVillian("Evil Lovi", 500, 1000);
        if (somePerson.isAive()) {
            System.out.println(somePerson.getFirstName() + " is Alive");

        } else {
            {
                System.out.println("Eric is Dead");


            }

            if (someSuperhero.isAive()) {
                System.out.println("Eric lives");
            } else {
                {
                    System.out.println("Eric perishes");
                }
                if (someSuperVillian.isAive()) {
                    System.out.println("Eric is Dead");
                }
                else  {
                    System.out.println(somePerson.getFirstName() + " is Dead");
                }
            }
        }
    }}
