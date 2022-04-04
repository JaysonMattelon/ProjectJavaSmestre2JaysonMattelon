
public class Pokedex {
	private String Reference;
	private Dresseur ProprietairePokedex;
	
	public void setProprietairePokedex(Dresseur a) {
		this.ProprietairePokedex = a;
	}
	public void setReference (String a) {
		this.Reference = a;
	}
	public String getReference () {
		return this.Reference;
	}
	public Dresseur getProprietairePokedex () {
		return this.ProprietairePokedex;
	}
	public Pokedex (String a) {
		this.setReference(a);
	}
	
}
