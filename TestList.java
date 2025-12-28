import java.util.ArrayList;
import java.util.Collections;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Personne> pers = new ArrayList<>();
		
		Personne p1 = new Personne("Ahmed",21);
		Personne p2 = new Personne("Rym",30);
		Personne p3 = new Personne("Nour",13);
		Personne p4 = new Personne("Kyle",45);
		Personne p5 = new Personne("Ilise",10);
		
		pers.add(p1);
		pers.add(p2);
		pers.add(p3);
		pers.add(p4);
		pers.add(p5);
		
		System.out.println("La liste non Triee des Personne :");
		for(int i=0; i< pers.size();i++) {
			Personne p= pers.get(i);
			System.out.println(p);
		}
		
		//System.out.println("\n"+pers); afficher la liste a l'aide de toString()
		
		//---------------------Sorted list----------------------------
		Collections.sort(pers);
		
		System.out.println("\nLa liste des Personne Triee Par Age  :\n");
		for(int i=0; i< pers.size();i++) {
			Personne p= pers.get(i);
			System.out.println(p);
		}
		
		//------------------chercher une personne----------------
		System.out.println(pers.contains(p5));
		System.out.println(pers.contains(p1));
		
		//------------------Supprimer une personne----------------
		pers.remove(p2);
		System.out.println("\nLa liste des Personne Apres la supression :\n");
		for(int i=0; i< pers.size();i++) {
			Personne p= pers.get(i);
			System.out.println(p);
		}
		
		
	}

}
