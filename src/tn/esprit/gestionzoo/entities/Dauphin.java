package tn.esprit.gestionzoo.entities;

public class Dauphin  extends Aquatic{
    protected float swimmingDepth;

    public Dauphin(String family, String name, int age, boolean isMammal , float swimmingDepth) {
        super(family, name, age, isMammal);
        this.swimmingDepth = swimmingDepth;
    }
}
