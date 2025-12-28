import java.util.ArrayList;

public class Etudiant {
	private int matricule;
	private String nom;
	private ArrayList<Double> notes;
	
	public Etudiant(String nom, int matricule) {
		this.matricule= matricule;
		this.nom = nom;
		this.notes = new ArrayList<>();
	}
	
	public void addNote(Double note) {
		notes.add(note);
	}
	
	public Double calculerM() {
		if(notes.isEmpty()) {
			return 0.0;
		}
		Double somme = 0.0 ;
		for(int i=0; i<notes.size(); i++) {
			somme+= notes.get(i);
		}
		return somme/notes.size();
	}
	
	//--------------------------------------
	public String toString() {
		return "Nom :"+nom +"|| Matricule: "+matricule;
	}

}
