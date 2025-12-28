import java.util.HashMap;
import java.util.Map;


public class Groupe {
	private String nomGroupe;
	
	private HashMap<Integer,Etudiant> myMap;
	//---------------------------------------------
	public Groupe(String nom) {
        this.nomGroupe = nom;
        this.myMap= new HashMap<>();
    }
	//-----------------Ajouter un étudiant------------
    public void ajouterEtudiant(Etudiant e) {
        myMap.put(e.getMatricule(), e);
    }
    
    // Rechercher un étudiant par matricule
    public Etudiant rechercherEtudiant(int matricule) {
        return myMap.get(matricule); // null si absent
    }
    

    // Supprimer un étudiant par matricule
    public void supprimerEtudiant(int matricule) {
        myMap.remove(matricule);
    }


	/// moyenne générale du groupe
    public double moyenneGroupe() {
        if (myMap.isEmpty()) return 0;

        double somme = 0;
        for (Etudiant e : myMap.values()) {
            somme += e.calculerM();
        }
        return somme / myMap.size();
    }

	//  nombre d'étudiants
    public int nombreEtudiants() {
        return myMap.size();
    }
    
    // --------get le nom de groupe -----------------
    public String getNom() {
        return this.nomGroupe;
    }
    ///===========================================================
    public static Etudiant rechercherDansTousLesGroupes(
        Map<String, Groupe> groupes, int matricule) {

        for (Groupe g : groupes.values()) {   // 1️- parcourir chaque groupe
             Etudiant e = g.rechercherEtudiant(matricule); // 2️-chercher l'etudiant
             if (e != null) {                  // 3-s'il existe
                  return e;                     // 4️- on le retourne
             }
        }
        return null;                          // 5️- non trouve
    }
    
}

