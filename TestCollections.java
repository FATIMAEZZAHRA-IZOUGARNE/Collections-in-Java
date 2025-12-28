import java.util.Map;
import java.util.TreeMap;
import java.util.SortedMap;

public class TestCollections {

    public static void main(String[] args) {

        // ===== Création des étudiants =====
        Etudiant e1 = new Etudiant("Ahmed", 12);
        Etudiant e2 = new Etudiant("Sara", 5);
        Etudiant e3 = new Etudiant("Yassine", 20);
        Etudiant e4 = new Etudiant("Nour", 8);

        // ===== Affectation des notes =====
        e1.addNote(15.0);
        e1.addNote(17.0);

        e2.addNote(14.00);
        e2.addNote(16.0);

        e3.addNote(10.5);
        e3.addNote(12.75);

        e4.addNote(18.5);
        e4.addNote(19.00);

        // ===== TreeMap trié par matricule =====
        Map<Integer, Etudiant> mapEtudiants = new TreeMap<>();
        mapEtudiants.put(e1.getMatricule(), e1);
        mapEtudiants.put(e2.getMatricule(), e2);
        mapEtudiants.put(e3.getMatricule(), e3);
        mapEtudiants.put(e4.getMatricule(), e4);

        System.out.println("Liste des étudiants triée par matricule :");
        for (Map.Entry<Integer, Etudiant> entry : mapEtudiants.entrySet()) {
            System.out.println(entry.getValue());
        }

        // ===== Gestion des groupes =====
        SortedMap<String, Groupe> groupes = new TreeMap<>();

        Groupe g1 = new Groupe("A");
        Groupe g2 = new Groupe("B");

        g1.ajouterEtudiant(e1);
        g1.ajouterEtudiant(e2);

        g2.ajouterEtudiant(e3);
        g2.ajouterEtudiant(e4);

        groupes.put(g1.getNom(), g1);
        groupes.put(g2.getNom(), g2);

        // ===== Affichage =====
        for (Groupe g : groupes.values()) {
            //System.out.println(g);
            System.out.println("Moyenne du groupe: " + g.moyenneGroupe());
            System.out.println("------------------------");
        }
    }
}
