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
    
}
