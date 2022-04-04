
public class MonBigBang {
	public static void main (String [] args) {
		
		Pokedex Pdx;
		Pdx = new Pokedex ("125AA45");
		Pokedex Pdx0;
		Pdx0 = new Pokedex ("000AA00");
		
		Dresseur D1;
		D1 = new Dresseur("Ketchum", "Sacha",Pdx);
		Dresseur D0;
		D0 = new Dresseur("Samuel", "Chen",Pdx0);
		Ectoplasma PE1;
		PE1 = new Ectoplasma(58,"Femelle",D1);

		Mew PM1;
		PM1 = new Mew (70,"Neutre",D1);
		Tortank PT1 ;
		PT1 = new Tortank(42,"Male",D1);
		Draco PD1;
		PD1 = new Draco (35,"Femelle",D1);
		Etouraptor PEt1;
		PEt1 = new Etouraptor(62,"Male",D1);
		Lucario PL1;
		PL1 = new Lucario(100,"Male", D1);
		Nostenfer PN1;
		PN1 = new Nostenfer(85,"Femelle",D1);
		Mew PM2;
		PM2 = new Mew (5,"Neutre",D1);
		Tortank PT2 ;
		PT2 = new Tortank(42,"Male",D1);
		PM1.setSurnom("Paul");
		
		D1.ajouter(PM1);
		D1.ajouter(PT1);
		D1.ajouter(PD1);
		D1.ajouter(PEt1);
		D1.ajouter(PL1);
		D1.ajouter(PN1);
		D1.ajouter(PM2);
		D1.ajouter(PT2);
		D1.ajouterPC(PT2);

		D1.afficherInfoDresseur();
		PE1.afficherDresseur();


		D1.afficherInfoDresseur();
	}
}
