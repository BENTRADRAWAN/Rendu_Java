package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
    String habitat ;

    public Aquatic(String family, String name, int age, boolean isMammal , String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    @Override
    public String toString() {
        return "Aquatic Animal: " + name + ", Age: " + age + ", Habitat: " + habitat;
    }
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

}
