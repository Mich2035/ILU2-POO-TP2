package frontiere;

import java.util.Scanner;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;
	private Scanner scan = new Scanner(System.in);

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		if(!controlPrendreEtal.verifierIdentite(nomVendeur)) {
			System.out.println("Je suis désolée "+nomVendeur+" mais il faut être un habitant de notre village pour commercer ici.");
	}
		else {
			System.out.println("Bonjour "+nomVendeur+" ,je vais regarder si je peux vous trouver un étal\n");
			if(!controlPrendreEtal.resteEtals()) {
				System.out.println("Désolé"+nomVendeur+ "je n'ai plus d'étal qui ne soit pas dejà occupé");
			}
			installerVendeur(nomVendeur);
				
			}
			
				
			
	}
	

	private void installerVendeur(String nomVendeur) {
		String produit;int nbproduit;
		System.out.println("C'est parfait,il me reste un étal pour vous !\n");
		System.out.println("Il me faudrait quelques renseignements\n");
		System.out.println("Quel produit souhaitez-vous vendre?\n");
		produit = scan.next();
		
		nbproduit=Clavier.entrerEntier("Combien souhaitez-vous en vendre?");
		int numeroEtal=controlPrendreEtal.prendreEtal(nomVendeur, produit, nbproduit);
		if(numeroEtal!=1) {
			System.out.println("Le vendeur"+nomVendeur+ "s'est installé à l'étal n°"+numeroEtal);
		}
	}
}
	


