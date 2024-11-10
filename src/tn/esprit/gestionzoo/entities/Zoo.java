package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.entities.Animal;


//prosit2 inst4
public class Zoo {
    final int nbrCages = 25;

    protected Animal[] animals = new Animal[nbrCages];
    protected String name;
    protected   String city;
    protected   int animalCount;
    protected Aquatic[] aquaticAnimals;
    protected int aquaticCount;




    public Zoo(String name, String city ) {
        this.name = name;
        this.city = city;
        animals = new Animal[nbrCages];
        this.aquaticAnimals = new Aquatic[10];
        this.aquaticCount = 0;

    }
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    public int getAnimalCount() {
        return animalCount;
    }
    //prosit4inst18
    public void setName(String name) {
        if (name == null ) {
            System.out.println("Le nom du zoo ne doit pas être vide");
        }
        this.name = name;
    }
    public void setCity( String city ) {
        this.city = city;
    }

//prosit6

    public float maxDolphinSwimmingDepth() {
        float maxDepth = 0;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Dauphin) {
                Dauphin dolphin = (Dauphin) aquatic;
                if (dolphin.swimmingDepth > maxDepth) {
                    maxDepth = dolphin.swimmingDepth;
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Dauphin) {
                dolphinCount++;
            } else if (aquatic instanceof Penguin) { // Assurez-vous d'avoir une classe Pingouin
                penguinCount++;
            }
        }

        System.out.println("Nombre de dauphins: " + dolphinCount);
        System.out.println("Nombre de pingouins: " + penguinCount);
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount < aquaticAnimals.length) {
            aquaticAnimals[aquaticCount] = aquatic;
            aquaticCount++;
            System.out.println("L'animal aquatique " + aquatic.getName() + " a été ajouté au zoo.");
        } else {
            System.out.println("Le zoo ne peut pas accueillir plus d'animaux aquatiques.");
        }
    }

    public void displayZoo(Zoo zoo) {
        System.out.println(zoo.name + " " + zoo.city + " " + zoo.nbrCages);

    }

    //inst9
    @Override
    public String toString() {
        return "Zoo [Nom: " + name + ", Ville: " + city + ", Nombre de cages: " + nbrCages + "]";

    }
    //prosit4
    //inst17
/////prosit7 instruction32
    public void addAnimal(Animal animal) {

        if (searchAnimal(animal) == -1) {
            animals[animalCount] = animal;
            animalCount++;
            System.out.println("animal " +animal.getName() +"ajouté");
        }
        System.out.println("échec d'ajout ");;
    }


    //inst11
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }


    //inst13
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {
            for (int i = index; i < animalCount - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[animalCount - 1] = null;
            animalCount--;
            return true;
        }
        return false;
    }
    //inst14

    public boolean isFull() {
        return animalCount >= animals.length;
    }
    //inst15
    public Zoo comparer(Zoo z1, Zoo z2) {
        if (z1.animalCount < z2.animalCount) {
            return z2;
        } else {
            return z1;
        }
    }

}
