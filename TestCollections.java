import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class TestCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList<Etudiant> etudiants = new LinkedList<>();
		
		Etudiant e1 = new Etudiant("ray",001);
		Etudiant e2 = new Etudiant("BOb",022);
		Etudiant e3 = new Etudiant("Roubi",003);
		Etudiant e4 = new Etudiant("Sara",9);
		Etudiant e5 = new Etudiant("Alex",030);
		
		etudiants.addLast(e1);
		etudiants.addLast(e2);
		etudiants.addLast(e3);
		etudiants.addLast(e4);
		etudiants.addLast(e5);
		
		Set<Etudiant> etuds= new HashSet<>(etudiants);
		
		///-------------------- afficher linked list------------
		System.out.println(etudiants);
		///-------------------- afficher HashSet-----------
		System.out.println(etuds);
		

	}

}
