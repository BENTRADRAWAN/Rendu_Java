package tn.esprit.gestionzoo.entities;//prosit2 inst4

public class Animal {
 protected    String family;
    protected String name;
    protected    int age;
    protected boolean isMammal;
    private Aquatic[] aquaticAnimals;

    //inst6.7
public Animal(String family, String name, int age, boolean isMammal) {
    this.family = family;
    this.name = name;
    this.age = age;
    this.isMammal = isMammal;
    this.aquaticAnimals = new Aquatic[10]; 


}
public String getFamily() {
    return family;
}
public void setFamily(String family) {
    this.family = family;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getAge() {
    return age;
}
//prosit4inst18
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("L'âge ne peut pas être négatif");
        }
        this.age = age;
    }
public boolean isMammal() {
    return isMammal;
}
public void setMammal(boolean mammal) {
    isMammal = mammal;
}


}
