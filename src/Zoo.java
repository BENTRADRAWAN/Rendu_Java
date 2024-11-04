//prosit2 inst4
public class Zoo {
    final int nbrCages = 25;

    Animal[] animals = new Animal[nbrCages];
    String name;
    String city;
    int animalCount;

    public Zoo(String name, String city ) {
        this.name = name;
        this.city = city;
        animals = new Animal[nbrCages];
       // this.animalCount = animalCount;
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

    public boolean addAnimal(Animal animal) {
        if (isFull()) {
            System.out.println("Le zoo est plein, impossible d'ajouter l'animal: " );
            return false;
        }
        if (searchAnimal(animal) == -1) {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        }
        return false;
    }


    //inst11
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
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
