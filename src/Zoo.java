//prosit2 inst4
public class Zoo {

    Animal[] animals = new Animal[25];
    String name;
    String city;
    int nbrCages;
    int animalCount;

    public Zoo(String name, String city, int nbrCages, int animalCount) {
        this.name = name;
        this.city = city;
        animals = new Animal[nbrCages];
        this.nbrCages = nbrCages;
        this.animalCount = animalCount;
    }

    public void displayZoo(Zoo zoo) {
        System.out.println(zoo.name + " " + zoo.city + " " + zoo.nbrCages);

    }

//inst9
    @Override
    public String toString() {
        return "Zoo [Nom: " + name + ", Ville: " + city + ", Nombre de cages: " + nbrCages + "]";

    }
    //prosit3
    public boolean addAnimal(Animal animal) {
        if (animalCount < animals.length) {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        }
        return false; }
    //inst11
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if ( animals[i] != null && animals[i].name == animal.name) {
                return i;
            }
        }
        return -1;
    }


}
