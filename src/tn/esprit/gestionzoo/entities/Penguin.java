package tn.esprit.gestionzoo.entities;

public class Penguin  extends Aquatic{
    protected float swimmingSpeed;

    public Penguin(String family, String name, int age, boolean isMammal,float swimmingSpeed , String habitat ) {
        super(family, name, age, isMammal ,habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    @Override
    public String toString() {
        return "Penguin: " + name + ", Age: " + age + ", Habitat: " + habitat + ", Swimming Depth: " + swimmingSpeed;
    }

}
