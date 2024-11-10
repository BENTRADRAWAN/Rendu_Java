package tn.esprit.gestionzoo.entities;

public class Penguin  extends Aquatic{
    protected float swimmingSpeed;

    public Penguin(String family, String name, int age, boolean isMammal,float swimmingSpeed , String habitat )  throws InvalidAgeException {
        super(family, name, age, isMammal ,habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }

}
