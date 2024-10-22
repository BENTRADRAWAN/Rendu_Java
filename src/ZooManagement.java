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


        //inst6.7
        Animal lion = new Animal("famille lion","lion",8,true);

        Zoo myzoo=new Zoo("myzoo","tunis",25,25);

    }
}