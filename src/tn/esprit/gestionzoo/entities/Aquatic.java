package tn.esprit.gestionzoo.entities;

public  abstract class Aquatic extends Animal {
    String habitat ;

    public Aquatic(String family, String name, int age, boolean isMammal , String habitat) throws InvalidAgeException {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    @Override
    public String toString() {
        return "Aquatic Animal: " + name + ", Age: " + age + ", Habitat: " + habitat;
    }
    public  abstract void swim() ;
}
