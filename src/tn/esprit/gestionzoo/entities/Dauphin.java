package tn.esprit.gestionzoo.entities;

public class Dauphin  extends Aquatic{
    protected float swimmingDepth;

    public Dauphin(String family, String name, int age, boolean isMammal , float swimmingDepth, String habitat) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
    @Override
    public String toString() {
        return "Dolphin: " + name + ", Age: " + age + ", Habitat: " + habitat + ", Swimming Speed: " + swimmingDepth;
    }

}
