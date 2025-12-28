import java.util.Map;
import java.util.TreeMap;

public class TestCollections {

    public static void main(String[] args) {

        // TreeMap trié par matricule
        Map<Integer, Etudiant> mapEtudiants = new TreeMap<>();

        Etudiant e1 = new Etudiant("Ahmed", 12);
        Etudiant e2 = new Etudiant("Sara", 5);
        Etudiant e3 = new Etudiant("Yassine", 20);
        Etudiant e4 = new Etudiant("Nour", 8);

        // Ajout (clé = matricule)
        mapEtudiants.put(e1.getMatricule(), e1);
        mapEtudiants.put(e2.getMatricule(), e2);
        mapEtudiants.put(e3.getMatricule(), e3);
        mapEtudiants.put(e4.getMatricule(), e4);

        // Parcours et affichage
        System.out.println("Liste des étudiants triée par matricule :");
        for (Map.Entry<Integer, Etudiant> entry : mapEtudiants.entrySet()) {
            System.out.println(
                "Matricule: " + entry.getKey() +
                " | Etudiant: " + entry.getValue()
            );
        }
    }
}
