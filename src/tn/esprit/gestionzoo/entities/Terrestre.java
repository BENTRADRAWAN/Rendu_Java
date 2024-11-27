package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.interfaces.Omnivore;

public  abstract class Terrestre extends Animal implements Omnivore<Food> {
     protected  int nbrLegs ;

    public Terrestre(String family, String name, int age, boolean isMammal,int nbrLegs) throws InvalidAgeException {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }
    @Override
    public String toString() {
        return "Terrestrial Animal: " + name + ", Age: " + age + ", Number of Legs: " + nbrLegs;
    }
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(name + " is eating meat.");
        } else {
            System.out.println(name + " doesn't eat meat .");
        }
    }

}
