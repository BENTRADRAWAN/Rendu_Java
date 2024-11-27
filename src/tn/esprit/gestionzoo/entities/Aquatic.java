package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.interfaces.Carnivore;

public abstract class Aquatic extends Animal implements Carnivore<Food> {
    String habitat ;

    public Aquatic(String family, String name, int age, boolean isMammal , String habitat) throws InvalidAgeException {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println(name + " is eating meat.");
        } else {
            System.out.println(name + "  eats meat, not " + meat + ".");
        }
    }
    @Override
    public String toString() {
        return "Aquatic Animal: " + name + ", Age: " + age + ", Habitat: " + habitat;
    }
    public  abstract void swim() ;
}
