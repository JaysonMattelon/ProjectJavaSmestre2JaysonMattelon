import java.util.ArrayList;
public class Dresseur {
	
	private String prenom; // En mininuscule, afin de ne pas confondre avec les classes (bonne pratique)
	private String nom;
	private int age;
	private Pokedex numPokedex;
	private String sexe;
	private Pokemon [] pokemonPC = new Pokemon [30];
	private Pokemon [] equipeDresseur = new Pokemon [6];

public void setPrenom ( String a) {
	this.prenom = a;
}
public void setNom (String b) {
	this.nom = b;
}
public  void setAge (int c) {
	this.age = c;
}
public void setNumPokedex (Pokedex d) {
	this.numPokedex = d ;
	d.setProprietairePokedex(this);
}
public void setSexe (String e) {
	this.sexe = e;
}
public String getPrenom () {
	return this.prenom;
}
public String getNom () {
	return this.nom;
}
public int getAge () {
	return this.age;
}

public Pokedex getNumPokedex () {
	return this.numPokedex;
}
public String getSexe () {
	return this.sexe;
}
public Dresseur (String a, String b,Pokedex c ) {
	this.setNom(a);
	this.setPrenom(b);
	this.setNumPokedex(c);
	
}



public String toString() {
	String chaine;
	chaine = "Il se nomme " + this.getNom() + " et se prénome " + this.getPrenom();
			if (this.getAge()== 0) {
				chaine = chaine + ", son age n'a pas été communiqué.";
			}
			else {
				chaine = chaine + ", il est agé de " + this.getAge() + ".";
			}
			if (this.getNumPokedex()== null) {
				chaine = chaine + " Le dresseur a refusé le pokédex";
			}
			else {
				chaine  = chaine + " La référence de son pokédex est " + this.getNumPokedex().getReference();
			}
			if (this.getSexe()==null) {
				chaine = chaine + " et le dresseur n'a pas désiré nous communiqué son sexe. \n";
			}
			else {
				chaine = chaine + " le dresseur est de sexe " + this.getSexe()+ "\n";
			}
			
	return chaine;
	
}
public void afficherInfoDresseur () {
	System.out.print(this.toString());
}


public Pokemon [] getPlace() {
	return this.equipeDresseur;
}
public void ajouter (Pokemon z) {
	 boolean trouve = false;
	 int i =0;
	 if (this.estPresent(z))
			 System.out.println("Il y a deja un Pokemon");
	 else {		 
	 while (trouve == false && i<this.equipeDresseur.length) {
		 if (this.equipeDresseur [i]!= null)
			 System.out.println ("Il y a deja un Pokemon");
		 else {
			 this.equipeDresseur[i]=z;
			trouve = true;}
		 i++;
		 }
	 }
	 }

public boolean estPresent (Pokemon f) {
	boolean present = false ;
	int i = 0;
	while (present == false && i <this.equipeDresseur.length) {
		if (this.equipeDresseur [i]==f)
			present = true;
		i++;
	}
	return present;
}
	public void afficherArray() {
		for (int index = 0; index < equipeDresseur.length; index++) {
			System.out.println("Element " + index + " = " + equipeDresseur[index]);
		}
	}

	public Pokemon [] getPlacePC() {
		return this.pokemonPC;
	}
	public void ajouterPC (Pokemon z) {
		 boolean trouve = false;
		 int i =0;
		 if (this.estPresent2(z))
				 System.out.println("Il y a deja un Pokemon");
		 else {		 
		 while (trouve == false && i<this.pokemonPC.length) {
			 if (this.pokemonPC [i]!= null)
				 System.out.println ("Il y a deja un Pokemon");
			 else {
				 this.pokemonPC[i]=z;
				trouve = true;}
			 i++;
			 }
		 }
		 }

	public boolean estPresent2 (Pokemon f) {
		boolean present = false ;
		int i = 0;
		while (present == false && i <this.pokemonPC.length) {
			if (this.pokemonPC [i]==f)
				present = true;
			i++;
		}
		return present;
	}
		public void afficherArray2() {
			for (int index = 0; index < pokemonPC.length; index++) {
				System.out.println("Element " + index + " = " + pokemonPC[index]);
			}
		}
			
}

