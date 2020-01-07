import gestionEleves.Eleve;
import gestionEleves.GroupesEleves;

class TestEx4 {
    public static void main(String[] args) {
        Eleve e1 = new Eleve("Ayoub");
        e1.ajouterNote(6);
        e1.ajouterNote(4);
        e1.ajouterNote(12);
        System.out.println(e1);
        Eleve e2 = new Eleve("Saif");
        e2.ajouterNote(16);
        e2.ajouterNote(20);
        e2.ajouterNote(14);
        System.out.println(e2);
        Eleve e3 = new Eleve("Lhcen");
        e3.ajouterNote(13);
        e3.ajouterNote(14);
        e3.ajouterNote(12);
        System.out.println(e3);
        System.out.println(e2.compareTo(e2));
        GroupesEleves groupe = new GroupesEleves();
        groupe.ajouterEleve(e1);
        groupe.ajouterEleve(e2);
        groupe.ajouterEleve(e3);

        System.out.println("Avant trie croissant : ");
        groupe.lister();
        groupe.trierEleves("croissant");
        System.out.println("Apres trie croissant : ");
        groupe.lister();
    }


}