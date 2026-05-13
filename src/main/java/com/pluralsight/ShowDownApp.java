package com.pluralsight;

import java.util.ArrayList;

public class ShowDownApp {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        Superhero hero = new Superhero("Hero", 100, 50);
        SuperVillian villian = new SuperVillian("Villian ", 300, 15);

        System.out.println("⚔️ Hero Vs Villian! ⚔️\n");

        System.out.println(hero.getFirstName() + " has " + hero.getHealth() + " health");
        System.out.println(villian.getFirstName() + "has " + villian.getHealth() + " health");
        System.out.println();
        while (hero.getHealth() > 0 && villian.getHealth() > 0) {

            //attack
            villian.takeDamage(hero.getPowerlevel());
            System.out.println(hero.getFirstName() + " attacks " +
                    villian.getFirstName() + "for " +
                    hero.getPowerlevel() + " damage.");

            System.out.println(villian.getFirstName() + "has "
                    + villian.getHealth() + " health: ");

            if (villian.getHealth() <= 0) {
                break;
            }

            System.out.println();

            //attack
            hero.takeDamage(villian.getEvilnessLevel());
            System.out.println(villian.getFirstName() + "attacks " +
                    hero.getFirstName() + " for " +
                    villian.getEvilnessLevel() + " damage.");
            System.out.println();
            System.out.println(hero.getFirstName() + " has "
                    + hero.getHealth() + " health: ");

        }
            // winner
            if (hero.getHealth() > 0) {
                System.out.println(hero.getFirstName() + " wins the showdown!");
            } else {
                System.out.println(villian.getFirstName() + " wins the showdown!");
            }
        }
    }





