import java.util.Scanner;

public class ZooManagement {

    //instruction2 utilisation scanner

    int nbrCages ;
    String zooName ;
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
        Animal lion = new Animal("famille lion","lion",8,true);
        Animal cat = new Animal("famille cat","cat",8,true);
        Animal dog = new Animal("famille dog","dog",8,true);
        Animal pig = new Animal("famille pig","pig",8,true);
        Animal mouse = new Animal("famille mouse","mouse",8,true);


        Zoo myzoo=new Zoo("myzoo","tunis",25,11);
        //inst8
       // myzoo.displayZoo(myzoo);
        //inst9
        //System.out.println(myzoo.toString());
        myzoo.addAnimal(lion);

        myzoo.addAnimal(cat);
        myzoo.addAnimal(dog);
        myzoo.addAnimal(pig);
        myzoo.addAnimal(lion);
        myzoo.addAnimal(mouse);
        //inst12
        boolean added = myzoo.addAnimal(lion);
        if (!added) {
            System.out.println("L'animal " + lion.name + " n'a pas pu être ajouté car il est déjà présent.");
        }
        int index = myzoo.searchAnimal(pig);

        /*

        if (index != -1) {
            System.out.println("L'animal " + lion.name + " se trouve à l'index " + index);
        } else {
            System.out.println("L'animal " + lion.name + " n'a pas été trouvé.");
        }*/
        //inst13
        boolean removed = myzoo.removeAnimal(mouse);
        if (removed) {
            System.out.println("L'animal " + mouse.name + " a été retiré avec succès.");
        } else {
            System.out.println("L'animal " + mouse.name + " n'a pas pu être retiré car il n'est pas présent.");
        }
    }
}