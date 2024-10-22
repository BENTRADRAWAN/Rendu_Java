import java.util.Scanner;

public class ZooManagement {

    //instruction2 utilisation scanner

    int nbrCages ;
    String zooName ;
    public static void main(String[] args) {

        ZooManagement zoo = new ZooManagement();


        System.out.println( zoo.zooName +" comporte " + zoo.nbrCages +" Cages ");
         Scanner sc=new Scanner(System.in);
        System.out.print("Entrez le nom du zoo : ");
        zoo.zooName= sc.nextLine();

        System.out.print("Entrez le nombre de cages : ");
        zoo.nbrCages = sc.nextInt();
        System.out.println(zoo.zooName +" comporte " + zoo.nbrCages +" Cages ");
//prosit2 inst4
        Animal lion = new Animal();
        lion.family="famillelion";
        lion.name="Lion";
        lion.age=8;
        lion.isMammal=true;
        Zoo myzoo=new Zoo();
        myzoo.city="tunis";
        myzoo.name="myzoo";
        myzoo.nbrCages=25;

    }
}