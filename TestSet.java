import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//------------------------------creer HashSet----------------
		Set<Personne> setPers = new HashSet<>();
		SortedSet<Personne> SSPers = new TreeSet<>();
		
		Personne p1 = new Personne("Ahmed",21);
		Personne p2 = new Personne("Rym",30);
		Personne p3 = new Personne("Nour",13);
		Personne p4 = new Personne("Kyle",45);
		Personne p5 = new Personne("Ilise",10);
		
		setPers.add(p1);
		setPers.add(p2);
		setPers.add(p3);
		setPers.add(p4);
		setPers.add(p5);
		
		System.out.println("La liste des Personne en utilisant HashSet :\n");
		System.out.println(setPers);     
		//--------------------------------------------------------------
		SSPers.add(p1);
		SSPers.add(p2);
		SSPers.add(p3);
		SSPers.add(p4);
		SSPers.add(p5);
		
		System.out.println("La liste des Personne en utilisant TreeSet :\n");
		System.out.println(SSPers);
		
		

	}

}
