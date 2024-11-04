//prosit2 inst4
public class Zoo {
    final int nbrCages = 25;

    private  Animal[] animals = new Animal[nbrCages];
    private  String name;
    private  String city;
    private  int animalCount;

    public Zoo(String name, String city ) {
        this.name = name;
        this.city = city;
        animals = new Animal[nbrCages];
       // this.animalCount = animalCount;

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
