import java.util.Scanner;
public class ZooManagement {
    int nbrCages;
    String zooName;

    ZooManagement() {}
    
    void message() {
        System.out.println("Zoo:" + zooName);
    }

    void saisirInfos() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter number of cages:");
            nbrCages = sc.nextInt();
            sc.nextLine(); 
            System.out.println("Enter zoo name: ");
            zooName = sc.nextLine();
        } while ((zooName.length() < 0) || (nbrCages < 0));
        sc.close();
    }

    void afficherInfos() {
        System.out.println(zooName + " comporte " + nbrCages + " cages ");
    }
    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();
        zoo.saisirInfos();
        zoo.afficherInfos();
    }
}