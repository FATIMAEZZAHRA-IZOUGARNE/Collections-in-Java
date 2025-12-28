import java.util.Objects;

public class Personne implements Comparable<Personne> {
	private String nom;
	private int age;
	
	public Personne(String nom, int age) {
		this.nom= nom;
		this.age= age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nom,age);
	}
	
	 @Override
     public boolean equals(Object obj) {
        if (this == obj)
        	return true;
	    if (obj instanceof Personne autre)
	        return age == autre.age && nom.equals(autre.nom);
	    return false;
	 }
	 
	 //methode compareTo
	 public int compareTo(Personne p) {
		 return this.nom.compareTo(p.nom);
	 }
	 
	 //methode toString
	 public String toString() {
		 return "Nom :"+this.nom+" ||Age :"+this.age+"(ans)";
	 }


   
}
