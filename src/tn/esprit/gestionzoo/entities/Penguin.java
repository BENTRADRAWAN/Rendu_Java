package tn.esprit.gestionzoo.entities;

public class Penguin  extends Aquatic{
    protected float swimmingSpeed;

    public Penguin(String family, String name, int age, boolean isMammal,float swimmingSpeed) {
        super(family, name, age, isMammal);
        this.swimmingSpeed = swimmingSpeed;
    }
}
