
public class Draco extends Pokemon {
	private String Talent = "Mue" ;
	private String Type = "Dragon";
	private String Type2;
	
	public Draco (int n,String g, Dresseur a) {
		super(n,g,a);
	}
	public String toString () {
		String chaine; 
		chaine = super.toString();
		chaine = chaine +	" et son talent est " + this.getTalent() + 
				" son type est " + this.getType()  ;
		if (this.getType2() != null) {
			chaine = chaine + " et son second type est " + this.getType2() + "\n";
					}
		else {
			chaine = chaine + " et il ne poss�de pas de second type \n";
		}
		return chaine;
	}
	public String getType() {
		return this.Type;
	}
	public String getType2() {
	return this.Type2;
	}
	public String getTalent() {
		return this.Talent;
	}

}
