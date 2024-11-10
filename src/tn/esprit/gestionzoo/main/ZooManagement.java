package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    //instruction2 utilisation scanner

    int nbrCages;
    String zooName;

    public static void main(String[] args) {

        ZooManagement zoo = new ZooManagement();


/*
        System.out.println( zoo.zooName +" comporte " + zoo.nbrCages +" Cages ");
         Scanner sc=new Scanner(System.in);
        System.out.print("Entrez le nom du zoo : ");
        zoo.zooName= sc.nextLine();

        System.out.print("Entrez le nombre de cages : ");
        zoo.nbrCages = sc.nextInt();
        System.out.println(zoo.zooName +" comporte " + zoo.nbrCages +" Cages ");
//prosit2 inst4

*/
        //inst6.7
//prosit7inst34
        Zoo myzoo = new Zoo("Zoo National", "Tunisie");
        try {
           Animal lion = new Animal("famille lion", "lion", 8, true);
            Animal   cat = new Animal("famille cat", "cat", -5, true);
            Animal  dog = new Animal("famille dog", "dog", 8, true);
            Animal pig = new Animal("famille pig", "pig", 8, true);
            Animal mouse = new Animal("famille mouse", "mouse", 8, true);

            myzoo.addAnimal(lion);
            myzoo.addAnimal(cat);
            myzoo.addAnimal(dog);
            myzoo.addAnimal(pig);
            myzoo.addAnimal(mouse);

        } catch (InvalidAgeException e) {
            System.out.println("Erreur : " + e.getMessage());
        } catch (ZooFullException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        /*

        int index = myzoo.searchAnimal(pig);


        boolean removed = myzoo.removeAnimal(mouse);
        if (removed) {
            System.out.println("L'animal " + mouse.getName() + " a été retiré avec succès.");
        } else {
            System.out.println("L'animal " + mouse.getName() + " n'a pas pu être retiré car il n'est pas présent.");
        }
        //inst14
        if (myzoo.isFull()) {
            System.out.println("Le zoo est plein.");
        } else {
            System.out.println("Il reste de la place dans le zoo.");
        }
        //inst15
        Zoo myzoo1 = new Zoo("zoo1", "ksa");
        Zoo largerZoo = myzoo.comparer(myzoo1, myzoo);
        System.out.println("Le zoo avec le plus d'animaux est : " + largerZoo.getName());
        ////prosit 5

        //Aquatic aquaticAnimal = new Aquatic ();
        Terrestre terrestrialAnimal = new Terrestre("famterr", "terr", 15, true, 26);
        Dauphin dauphin = new Dauphin("fam5", "dauph", 10, true, 77, "habit");
        Penguin penguin = new Penguin("fam7", "penguin", 4, false, 1, "habit2");




       // System.out.println(aquaticAnimal.toString());
        System.out.println(terrestrialAnimal.toString());
        System.out.println(dauphin.toString());
        System.out.println(penguin.toString());

       // aquaticAnimal.swim();
        dauphin.swim();
        myzoo.addAquaticAnimal(dauphin);
        float maxDepth = myzoo.maxDolphinSwimmingDepth();
        System.out.println("La profondeur maximale des dauphins est: " + maxDepth);



        myzoo.displayNumberOfAquaticsByType();
    }
*/}
    }




