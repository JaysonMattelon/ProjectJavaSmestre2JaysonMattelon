
public class Pokemon {
	private String Genre;
	private int Niveau;
	private String Surnom;
	private Dresseur dresseurProprio;
	
public String getGenre() {
		return this.Genre;
}
public String getSurnom() {
	return this.Surnom;
}

public int getNiveau() {
	return this.Niveau;
}

public Dresseur getdresseurProprio() {
	return this.dresseurProprio;
}
public void setdresseurProprio(Dresseur a) {
	this.dresseurProprio = a;
	//a.getpokemonCapture().add(this);
}
public void setGenre(String genre) {
		this.Genre = genre;
}

public void setNiveau(int niveau) {
		if (this.getNiveau()<= niveau) {
			this.Niveau = niveau;
		}
		else {
			System.out.print("Le niveau ne peut etre inferieur au précédent \n");
		
		}
}
public void setSurnom(String surnom) {
		this.Surnom = surnom;
}


public String toString () {
	String chaine;
	if (this.getSurnom() == null) {
		chaine = "Le pokemon n'a pas de surnom ";
	}
	else {
			chaine ="Le surnom du pokemon est " + this.getSurnom();
		}
	
	chaine = chaine + " son niveau est de " + this.getNiveau() + " son genre est " + this.getGenre()+ ". ";
	if (this.getdresseurProprio() == null) {
		chaine = chaine + "Le pokemon ne possede plus d'entraineur officiel. " ;
	}
	else {
		chaine = chaine + "Son dresseur est " + this.getdresseurProprio().getPrenom() + " " + this.getdresseurProprio().getNom();	
	}
	return chaine;
}
public void vaAlaPension () {
	if (this.getNiveau()>95) {
		this.setNiveau(100);
	}
		else {
			this.setNiveau(this.getNiveau()+5);
		}
}

public Pokemon (int n,String g, Dresseur a ) {
	this.setGenre(g);
	this.setNiveau(n);
	this.setdresseurProprio(a);
}
public void afficherinfo() {
	System.out.print(this.toString());
}
public void afficherDresseur() {
	System.out.print("Nom :"+ this.getdresseurProprio().getNom()+ " Prenom: " + this.getdresseurProprio().getPrenom()+ "\n");
}
public void afficherNom() {
	System.out.print( this.getClass()+", ") ;
}
}

	
