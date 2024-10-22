//prosit2 inst4
public class Zoo {

    Animal[] animals = new Animal[25];
    String name;
    String city;
    int nbrCages ;
    int animalCount;
public Zoo(String name , String city , int nbrCages , int animalCount) {
    this.name = name;
    this.city = city;
    animals = new Animal[nbrCages];
    this.nbrCages = nbrCages;
}

}
